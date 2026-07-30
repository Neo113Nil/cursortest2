package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import defpackage.ey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareContentValidation {
    public static final ShareContentValidation INSTANCE = new ShareContentValidation();
    private static final Validator webShareValidator = new WebShareValidator();
    private static final Validator defaultValidator = new Validator();
    private static final Validator apiValidator = new ApiValidator();
    private static final Validator storyValidator = new StoryShareValidator();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class StoryShareValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareStoryContent shareStoryContent) {
            ShareContentValidation.INSTANCE.validateStoryContent(shareStoryContent, this);
        }
    }

    private ShareContentValidation() {
    }

    private final void validate(ShareContent<?, ?> shareContent, Validator validator) {
        if (shareContent == null) {
            ey.i("Must provide non-null content to share");
            return;
        }
        if (shareContent instanceof ShareLinkContent) {
            validator.validate((ShareLinkContent) shareContent);
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            validator.validate((SharePhotoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareVideoContent) {
            validator.validate((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareMediaContent) {
            validator.validate((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            validator.validate((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            validator.validate((ShareStoryContent) shareContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateCameraEffectContent(ShareCameraEffectContent shareCameraEffectContent) {
        if (Utility.isNullOrEmpty(shareCameraEffectContent.getEffectId())) {
            ey.i("Must specify a non-empty effectId");
        }
    }

    public static final void validateForApiShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, apiValidator);
    }

    public static final void validateForMessage(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, defaultValidator);
    }

    public static final void validateForNativeShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, defaultValidator);
    }

    public static final void validateForStoryShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, storyValidator);
    }

    public static final void validateForWebShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, webShareValidator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateLinkContent(ShareLinkContent shareLinkContent, Validator validator) {
        Uri contentUrl = shareLinkContent.getContentUrl();
        if (contentUrl == null || Utility.isWebUri(contentUrl)) {
            return;
        }
        ey.i("Content Url must be an http:// or https:// url");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateMediaContent(ShareMediaContent shareMediaContent, Validator validator) {
        List<ShareMedia<?, ?>> media = shareMediaContent.getMedia();
        if (media == null || media.isEmpty()) {
            ey.i("Must specify at least one medium in ShareMediaContent.");
        } else {
            if (media.size() > 6) {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1)));
            }
            Iterator<ShareMedia<?, ?>> it = media.iterator();
            while (it.hasNext()) {
                validator.validate(it.next());
            }
        }
    }

    public static final void validateMedium(ShareMedia<?, ?> shareMedia, Validator validator) {
        shareMedia.getClass();
        validator.getClass();
        if (shareMedia instanceof SharePhoto) {
            validator.validate((SharePhoto) shareMedia);
        } else {
            if (!(shareMedia instanceof ShareVideo)) {
                throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{shareMedia.getClass().getSimpleName()}, 1)));
            }
            validator.validate((ShareVideo) shareMedia);
        }
    }

    private final void validatePhoto(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            ey.i("Cannot share a null SharePhoto");
            return;
        }
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null && imageUrl == null) {
            ey.i("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoContent(SharePhotoContent sharePhotoContent, Validator validator) {
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null || photos.isEmpty()) {
            ey.i("Must specify at least one Photo in SharePhotoContent.");
        } else {
            if (photos.size() > 6) {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1)));
            }
            Iterator<SharePhoto> it = photos.iterator();
            while (it.hasNext()) {
                validator.validate(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForApi(SharePhoto sharePhoto, Validator validator) {
        validatePhoto(sharePhoto);
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null && Utility.isWebUri(imageUrl)) {
            ey.i("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForNativeDialog(SharePhoto sharePhoto, Validator validator) {
        validatePhotoForApi(sharePhoto, validator);
        if (sharePhoto.getBitmap() == null && Utility.isWebUri(sharePhoto.getImageUrl())) {
            return;
        }
        Validate.hasContentProvider(FacebookSdk.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForWebDialog(SharePhoto sharePhoto, Validator validator) {
        validatePhoto(sharePhoto);
    }

    private final void validateShareMessengerActionButton(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton == null) {
            return;
        }
        if (Utility.isNullOrEmpty(shareMessengerActionButton.getTitle())) {
            ey.i("Must specify title for ShareMessengerActionButton");
        } else if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
            validateShareMessengerURLActionButton((ShareMessengerURLActionButton) shareMessengerActionButton);
        }
    }

    private final void validateShareMessengerURLActionButton(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.getUrl() != null) {
            return;
        }
        ey.i("Must specify url for ShareMessengerURLActionButton");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateStoryContent(ShareStoryContent shareStoryContent, Validator validator) {
        if (shareStoryContent == null || (shareStoryContent.getBackgroundAsset() == null && shareStoryContent.getStickerAsset() == null)) {
            ey.i("Must pass the Facebook app a background asset, a sticker asset, or both");
            return;
        }
        if (shareStoryContent.getBackgroundAsset() != null) {
            validator.validate(shareStoryContent.getBackgroundAsset());
        }
        if (shareStoryContent.getStickerAsset() != null) {
            validator.validate(shareStoryContent.getStickerAsset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateVideo(ShareVideo shareVideo, Validator validator) {
        if (shareVideo == null) {
            ey.i("Cannot share a null ShareVideo");
            return;
        }
        Uri localUrl = shareVideo.getLocalUrl();
        if (localUrl == null) {
            ey.i("ShareVideo does not have a LocalUrl specified");
        } else {
            if (Utility.isContentUri(localUrl) || Utility.isFileUri(localUrl)) {
                return;
            }
            ey.i("ShareVideo must reference a video that is on the device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateVideoContent(ShareVideoContent shareVideoContent, Validator validator) {
        validator.validate(shareVideoContent.getVideo());
        SharePhoto previewPhoto = shareVideoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            validator.validate(previewPhoto);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class Validator {
        public void validate(ShareLinkContent shareLinkContent) {
            shareLinkContent.getClass();
            ShareContentValidation.INSTANCE.validateLinkContent(shareLinkContent, this);
        }

        public void validate(SharePhotoContent sharePhotoContent) {
            sharePhotoContent.getClass();
            ShareContentValidation.INSTANCE.validatePhotoContent(sharePhotoContent, this);
        }

        public void validate(ShareVideoContent shareVideoContent) {
            shareVideoContent.getClass();
            ShareContentValidation.INSTANCE.validateVideoContent(shareVideoContent, this);
        }

        public void validate(ShareMediaContent shareMediaContent) {
            shareMediaContent.getClass();
            ShareContentValidation.INSTANCE.validateMediaContent(shareMediaContent, this);
        }

        public void validate(ShareCameraEffectContent shareCameraEffectContent) {
            shareCameraEffectContent.getClass();
            ShareContentValidation.INSTANCE.validateCameraEffectContent(shareCameraEffectContent);
        }

        public void validate(SharePhoto sharePhoto) {
            sharePhoto.getClass();
            ShareContentValidation.INSTANCE.validatePhotoForNativeDialog(sharePhoto, this);
        }

        public void validate(ShareVideo shareVideo) {
            ShareContentValidation.INSTANCE.validateVideo(shareVideo, this);
        }

        public void validate(ShareMedia<?, ?> shareMedia) {
            shareMedia.getClass();
            ShareContentValidation.validateMedium(shareMedia, this);
        }

        public void validate(ShareStoryContent shareStoryContent) {
            ShareContentValidation.INSTANCE.validateStoryContent(shareStoryContent, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class WebShareValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareVideoContent shareVideoContent) {
            shareVideoContent.getClass();
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareMediaContent shareMediaContent) {
            shareMediaContent.getClass();
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(SharePhoto sharePhoto) {
            sharePhoto.getClass();
            ShareContentValidation.INSTANCE.validatePhotoForWebDialog(sharePhoto, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class ApiValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareVideoContent shareVideoContent) {
            shareVideoContent.getClass();
            if (!Utility.isNullOrEmpty(shareVideoContent.getPlaceId())) {
                ey.i("Cannot share video content with place IDs using the share api");
            } else if (!Utility.isNullOrEmpty(shareVideoContent.getPeopleIds())) {
                ey.i("Cannot share video content with people IDs using the share api");
            } else {
                if (Utility.isNullOrEmpty(shareVideoContent.getRef())) {
                    return;
                }
                ey.i("Cannot share video content with referrer URL using the share api");
            }
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(SharePhoto sharePhoto) {
            sharePhoto.getClass();
            ShareContentValidation.INSTANCE.validatePhotoForApi(sharePhoto, this);
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareMediaContent shareMediaContent) {
            shareMediaContent.getClass();
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareLinkContent shareLinkContent) {
            shareLinkContent.getClass();
            if (Utility.isNullOrEmpty(shareLinkContent.getQuote())) {
                return;
            }
            ey.i("Cannot share link content with quote using the share api");
        }
    }
}
