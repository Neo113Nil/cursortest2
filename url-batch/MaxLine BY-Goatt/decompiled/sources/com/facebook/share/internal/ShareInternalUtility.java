package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import defpackage.ey;
import defpackage.pv;
import defpackage.rv;
import defpackage.up2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareInternalUtility {
    public static final ShareInternalUtility INSTANCE = new ShareInternalUtility();
    public static final String MY_STAGING_RESOURCES = "me/staging_resources";
    public static final String STAGING_PARAM = "file";

    private ShareInternalUtility() {
    }

    private final AppCall getAppCallFromActivityResult(int i, int i2, Intent intent) {
        UUID callIdFromIntent = NativeProtocol.getCallIdFromIntent(intent);
        if (callIdFromIntent == null) {
            return null;
        }
        return AppCall.Companion.finishPendingCall(callIdFromIntent, i);
    }

    private final NativeAppCallAttachmentStore.Attachment getAttachment(UUID uuid, ShareMedia<?, ?> shareMedia) {
        Uri uri;
        Bitmap bitmap;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.getBitmap();
            uri = sharePhoto.getImageUrl();
        } else if (shareMedia instanceof ShareVideo) {
            uri = ((ShareVideo) shareMedia).getLocalUrl();
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        return getAttachment(uuid, uri, bitmap);
    }

    public static final Bundle getBackgroundAssetMediaInfo(ShareStoryContent shareStoryContent, UUID uuid) {
        uuid.getClass();
        Bundle bundle = null;
        if (shareStoryContent != null && shareStoryContent.getBackgroundAsset() != null) {
            ShareMedia<?, ?> backgroundAsset = shareStoryContent.getBackgroundAsset();
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, backgroundAsset);
            if (attachment == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString("type", backgroundAsset.getMediaType().name());
            bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
            String uriExtension = getUriExtension(attachment.getOriginalUri());
            if (uriExtension != null) {
                Utility.putNonEmptyString(bundle, ShareConstants.MEDIA_EXTENSION, uriExtension);
            }
            NativeAppCallAttachmentStore.addAttachments(pv.c(attachment));
        }
        return bundle;
    }

    public static final Pair<String, String> getFieldNameAndNamespaceFromFullName(String str) {
        String str2;
        int i;
        str.getClass();
        int v = up2.v(str, ':', 0, 6);
        if (v == -1 || str.length() <= (i = v + 1)) {
            str2 = null;
        } else {
            str2 = str.substring(0, v);
            str = str.substring(i);
        }
        return new Pair<>(str2, str);
    }

    public static final List<Bundle> getMediaInfos(ShareMediaContent shareMediaContent, UUID uuid) {
        List<ShareMedia<?, ?>> media;
        Bundle bundle;
        uuid.getClass();
        if (shareMediaContent == null || (media = shareMediaContent.getMedia()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia<?, ?> shareMedia : media) {
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, shareMedia);
            if (attachment == null) {
                bundle = null;
            } else {
                arrayList.add(attachment);
                bundle = new Bundle();
                bundle.putString("type", shareMedia.getMediaType().name());
                bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return arrayList2;
    }

    public static final String getNativeDialogCompletionGesture(Bundle bundle) {
        bundle.getClass();
        return bundle.containsKey(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY) ? bundle.getString(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY) : bundle.getString(NativeProtocol.EXTRA_DIALOG_COMPLETION_GESTURE_KEY);
    }

    public static final List<String> getPhotoUrls(SharePhotoContent sharePhotoContent, UUID uuid) {
        List<SharePhoto> photos;
        uuid.getClass();
        if (sharePhotoContent == null || (photos = sharePhotoContent.getPhotos()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = photos.iterator();
        while (it.hasNext()) {
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, (SharePhoto) it.next());
            if (attachment != null) {
                arrayList.add(attachment);
            }
        }
        ArrayList arrayList2 = new ArrayList(rv.l(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((NativeAppCallAttachmentStore.Attachment) obj).getAttachmentUrl());
        }
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return arrayList2;
    }

    public static final String getShareDialogPostId(Bundle bundle) {
        bundle.getClass();
        return bundle.containsKey(ShareConstants.RESULT_POST_ID) ? bundle.getString(ShareConstants.RESULT_POST_ID) : bundle.containsKey(ShareConstants.EXTRA_RESULT_POST_ID) ? bundle.getString(ShareConstants.EXTRA_RESULT_POST_ID) : bundle.getString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
    }

    public static final ResultProcessor getShareResultProcessor(final FacebookCallback<Sharer.Result> facebookCallback) {
        return new ResultProcessor(facebookCallback) { // from class: com.facebook.share.internal.ShareInternalUtility$getShareResultProcessor$1
            final /* synthetic */ FacebookCallback<Sharer.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(facebookCallback);
                this.$callback = facebookCallback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onCancel(AppCall appCall) {
                appCall.getClass();
                ShareInternalUtility.invokeOnCancelCallback(this.$callback);
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onError(AppCall appCall, FacebookException facebookException) {
                appCall.getClass();
                facebookException.getClass();
                ShareInternalUtility.invokeOnErrorCallback(this.$callback, facebookException);
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(AppCall appCall, Bundle bundle) {
                appCall.getClass();
                if (bundle != null) {
                    String nativeDialogCompletionGesture = ShareInternalUtility.getNativeDialogCompletionGesture(bundle);
                    if (nativeDialogCompletionGesture == null || "post".equalsIgnoreCase(nativeDialogCompletionGesture)) {
                        ShareInternalUtility.invokeOnSuccessCallback(this.$callback, ShareInternalUtility.getShareDialogPostId(bundle));
                        return;
                    }
                    boolean equalsIgnoreCase = "cancel".equalsIgnoreCase(nativeDialogCompletionGesture);
                    FacebookCallback<Sharer.Result> facebookCallback2 = this.$callback;
                    if (equalsIgnoreCase) {
                        ShareInternalUtility.invokeOnCancelCallback(facebookCallback2);
                    } else {
                        ShareInternalUtility.invokeOnErrorCallback(facebookCallback2, new FacebookException(NativeProtocol.ERROR_UNKNOWN_ERROR));
                    }
                }
            }
        };
    }

    public static final Bundle getStickerUrl(ShareStoryContent shareStoryContent, UUID uuid) {
        uuid.getClass();
        if (shareStoryContent == null || shareStoryContent.getStickerAsset() == null) {
            return null;
        }
        new ArrayList().add(shareStoryContent.getStickerAsset());
        NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, shareStoryContent.getStickerAsset());
        if (attachment == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
        String uriExtension = getUriExtension(attachment.getOriginalUri());
        if (uriExtension != null) {
            Utility.putNonEmptyString(bundle, ShareConstants.MEDIA_EXTENSION, uriExtension);
        }
        NativeAppCallAttachmentStore.addAttachments(pv.c(attachment));
        return bundle;
    }

    public static final Bundle getTextureUrlBundle(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        CameraEffectTextures textures;
        uuid.getClass();
        if (shareCameraEffectContent == null || (textures = shareCameraEffectContent.getTextures()) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String str : textures.keySet()) {
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, textures.getTextureUri(str), textures.getTextureBitmap(str));
            if (attachment != null) {
                arrayList.add(attachment);
                bundle.putString(str, attachment.getAttachmentUrl());
            }
        }
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return bundle;
    }

    public static final String getUriExtension(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        uri2.getClass();
        int z = up2.z(uri2, '.', 0, 6);
        if (z == -1) {
            return null;
        }
        return uri2.substring(z);
    }

    public static final String getVideoUrl(ShareVideoContent shareVideoContent, UUID uuid) {
        ShareVideo video;
        Uri localUrl;
        uuid.getClass();
        if (shareVideoContent == null || (video = shareVideoContent.getVideo()) == null || (localUrl = video.getLocalUrl()) == null) {
            return null;
        }
        NativeAppCallAttachmentStore.Attachment createAttachment = NativeAppCallAttachmentStore.createAttachment(uuid, localUrl);
        NativeAppCallAttachmentStore.addAttachments(pv.c(createAttachment));
        return createAttachment.getAttachmentUrl();
    }

    public static final boolean handleActivityResult(int i, int i2, Intent intent, ResultProcessor resultProcessor) {
        AppCall appCallFromActivityResult = INSTANCE.getAppCallFromActivityResult(i, i2, intent);
        if (appCallFromActivityResult == null) {
            return false;
        }
        NativeAppCallAttachmentStore.cleanupAttachmentsForCall(appCallFromActivityResult.getCallId());
        if (resultProcessor == null) {
            return true;
        }
        FacebookException exceptionFromErrorData = intent != null ? NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(intent)) : null;
        if (exceptionFromErrorData == null) {
            resultProcessor.onSuccess(appCallFromActivityResult, intent != null ? NativeProtocol.getSuccessResultsFromIntent(intent) : null);
        } else if (exceptionFromErrorData instanceof FacebookOperationCanceledException) {
            resultProcessor.onCancel(appCallFromActivityResult);
        } else {
            resultProcessor.onError(appCallFromActivityResult, exceptionFromErrorData);
        }
        return true;
    }

    public static final void invokeCallbackWithError(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        invokeOnErrorCallback(facebookCallback, str);
    }

    public static final void invokeCallbackWithException(FacebookCallback<Sharer.Result> facebookCallback, Exception exc) {
        exc.getClass();
        if (exc instanceof FacebookException) {
            invokeOnErrorCallback(facebookCallback, (FacebookException) exc);
            return;
        }
        invokeCallbackWithError(facebookCallback, "Error preparing share content: " + exc.getLocalizedMessage());
    }

    public static final void invokeCallbackWithResults(FacebookCallback<Sharer.Result> facebookCallback, String str, GraphResponse graphResponse) {
        graphResponse.getClass();
        FacebookRequestError error = graphResponse.getError();
        if (error == null) {
            invokeOnSuccessCallback(facebookCallback, str);
            return;
        }
        String errorMessage = error.getErrorMessage();
        if (Utility.isNullOrEmpty(errorMessage)) {
            errorMessage = "Unexpected error sharing.";
        }
        invokeOnErrorCallback(facebookCallback, graphResponse, errorMessage);
    }

    public static final void invokeOnCancelCallback(FacebookCallback<Sharer.Result> facebookCallback) {
        INSTANCE.logShareResult(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, null);
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, FacebookException facebookException) {
        facebookException.getClass();
        INSTANCE.logShareResult("error", facebookException.getMessage());
        if (facebookCallback != null) {
            facebookCallback.onError(facebookException);
        }
    }

    public static final void invokeOnSuccessCallback(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        INSTANCE.logShareResult(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED, null);
        if (facebookCallback != null) {
            facebookCallback.onSuccess(new Sharer.Result(str));
        }
    }

    private final void logShareResult(String str, String str2) {
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_OUTCOME, str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_SHARE_RESULT, bundle);
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, Uri uri, GraphRequest.Callback callback) {
        uri.getClass();
        String path = uri.getPath();
        if (Utility.isFileUri(uri) && path != null) {
            return newUploadStagingResourceWithImageRequest(accessToken, new File(path), callback);
        }
        if (!Utility.isContentUri(uri)) {
            ey.i("The image Uri must be either a file:// or content:// Uri");
            return null;
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(STAGING_PARAM, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, null, 32, null);
    }

    public static final void registerSharerCallback(final int i, CallbackManager callbackManager, final FacebookCallback<Sharer.Result> facebookCallback) {
        if (callbackManager instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) callbackManager).registerCallback(i, new CallbackManagerImpl.Callback() { // from class: lk2
                @Override // com.facebook.internal.CallbackManagerImpl.Callback
                public final boolean onActivityResult(int i2, Intent intent) {
                    boolean registerSharerCallback$lambda$1;
                    registerSharerCallback$lambda$1 = ShareInternalUtility.registerSharerCallback$lambda$1(i, facebookCallback, i2, intent);
                    return registerSharerCallback$lambda$1;
                }
            });
        } else {
            ey.i("Unexpected CallbackManager, please use the provided Factory.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerSharerCallback$lambda$1(int i, FacebookCallback facebookCallback, int i2, Intent intent) {
        return handleActivityResult(i, i2, intent, getShareResultProcessor(facebookCallback));
    }

    public static final void registerStaticShareCallback(final int i) {
        CallbackManagerImpl.Companion.registerStaticCallback(i, new CallbackManagerImpl.Callback() { // from class: mk2
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i2, Intent intent) {
                boolean registerStaticShareCallback$lambda$0;
                registerStaticShareCallback$lambda$0 = ShareInternalUtility.registerStaticShareCallback$lambda$0(i, i2, intent);
                return registerStaticShareCallback$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerStaticShareCallback$lambda$0(int i, int i2, Intent intent) {
        return handleActivityResult(i, i2, intent, getShareResultProcessor(null));
    }

    public static final JSONArray removeNamespacesFromOGJsonArray(JSONArray jSONArray, boolean z) {
        jSONArray.getClass();
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = removeNamespacesFromOGJsonArray((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = removeNamespacesFromOGJsonObject((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    public static final JSONObject removeNamespacesFromOGJsonObject(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            if (names == null) {
                return null;
            }
            int length = names.length();
            for (int i = 0; i < length; i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = removeNamespacesFromOGJsonObject((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = removeNamespacesFromOGJsonArray((JSONArray) obj, true);
                }
                string.getClass();
                Pair<String, String> fieldNameAndNamespaceFromFullName = getFieldNameAndNamespaceFromFullName(string);
                String str = (String) fieldNameAndNamespaceFromFullName.first;
                String str2 = (String) fieldNameAndNamespaceFromFullName.second;
                if (z) {
                    if (str == null || !str.equals(DeviceRequestsHelper.SDK_HEADER)) {
                        if (str != null && !str.equals("og")) {
                            jSONObject3.put(str2, obj);
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            ey.i("Failed to create json object from share content");
            return null;
        }
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        INSTANCE.logShareResult("error", str);
        if (facebookCallback != null) {
            facebookCallback.onError(new FacebookException(str));
        }
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, GraphResponse graphResponse, String str) {
        INSTANCE.logShareResult("error", str);
        if (facebookCallback != null) {
            facebookCallback.onError(new FacebookGraphResponseException(graphResponse, str));
        }
    }

    private final NativeAppCallAttachmentStore.Attachment getAttachment(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
        }
        if (uri != null) {
            return NativeAppCallAttachmentStore.createAttachment(uuid, uri);
        }
        return null;
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, File file, GraphRequest.Callback callback) {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(STAGING_PARAM, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, null, 32, null);
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, Bitmap bitmap, GraphRequest.Callback callback) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(STAGING_PARAM, bitmap);
        return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, null, 32, null);
    }
}
