package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: ShareContentValidation.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static a f6359a;

    /* renamed from: b, reason: collision with root package name */
    private static a f6360b;

    public static void a(ShareContent shareContent) {
        a(shareContent, a());
    }

    public static void b(ShareContent shareContent) {
        a(shareContent, a());
    }

    public static void c(ShareContent shareContent) {
        a(shareContent, b());
    }

    private static a a() {
        if (f6360b == null) {
            f6360b = new a();
        }
        return f6360b;
    }

    private static a b() {
        if (f6359a == null) {
            f6359a = new b();
        }
        return f6359a;
    }

    private static void a(ShareContent shareContent, a aVar) throws com.facebook.j {
        if (shareContent == null) {
            throw new com.facebook.j("Must provide non-null content to share");
        }
        if (shareContent instanceof ShareLinkContent) {
            aVar.a((ShareLinkContent) shareContent);
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            aVar.a((SharePhotoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareVideoContent) {
            aVar.a((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            aVar.a((ShareOpenGraphContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            aVar.a((ShareMediaContent) shareContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ShareLinkContent shareLinkContent, a aVar) {
        Uri imageUrl = shareLinkContent.getImageUrl();
        if (imageUrl != null && !ab.b(imageUrl)) {
            throw new com.facebook.j("Image Url must be an http:// or https:// url");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(SharePhotoContent sharePhotoContent, a aVar) {
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null || photos.isEmpty()) {
            throw new com.facebook.j("Must specify at least one Photo in SharePhotoContent.");
        }
        if (photos.size() > 6) {
            throw new com.facebook.j(String.format(Locale.ROOT, "Cannot add more than %d photos.", 6));
        }
        Iterator<SharePhoto> it = photos.iterator();
        while (it.hasNext()) {
            aVar.a(it.next());
        }
    }

    private static void c(SharePhoto sharePhoto, a aVar) {
        if (sharePhoto == null) {
            throw new com.facebook.j("Cannot share a null SharePhoto");
        }
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null) {
            if (imageUrl == null) {
                throw new com.facebook.j("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            if (ab.b(imageUrl) && !aVar.a()) {
                throw new com.facebook.j("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(SharePhoto sharePhoto, a aVar) {
        c(sharePhoto, aVar);
        if (sharePhoto.getBitmap() == null && ab.b(sharePhoto.getImageUrl())) {
            return;
        }
        ac.d(com.facebook.l.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(SharePhoto sharePhoto, a aVar) {
        if (sharePhoto == null) {
            throw new com.facebook.j("Cannot share a null SharePhoto");
        }
        Uri imageUrl = sharePhoto.getImageUrl();
        if (imageUrl == null || !ab.b(imageUrl)) {
            throw new com.facebook.j("SharePhoto must have a non-null imageUrl set to the Uri of an image on the web");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ShareVideoContent shareVideoContent, a aVar) {
        aVar.a(shareVideoContent.getVideo());
        SharePhoto previewPhoto = shareVideoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            aVar.a(previewPhoto);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ShareVideo shareVideo, a aVar) {
        if (shareVideo == null) {
            throw new com.facebook.j("Cannot share a null ShareVideo");
        }
        Uri localUrl = shareVideo.getLocalUrl();
        if (localUrl == null) {
            throw new com.facebook.j("ShareVideo does not have a LocalUrl specified");
        }
        if (!ab.c(localUrl) && !ab.d(localUrl)) {
            throw new com.facebook.j("ShareVideo must reference a video that is on the device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ShareMediaContent shareMediaContent, a aVar) {
        List<ShareMedia> media = shareMediaContent.getMedia();
        if (media == null || media.isEmpty()) {
            throw new com.facebook.j("Must specify at least one medium in ShareMediaContent.");
        }
        if (media.size() > 6) {
            throw new com.facebook.j(String.format(Locale.ROOT, "Cannot add more than %d media.", 6));
        }
        Iterator<ShareMedia> it = media.iterator();
        while (it.hasNext()) {
            aVar.a(it.next());
        }
    }

    public static void a(ShareMedia shareMedia, a aVar) {
        if (shareMedia instanceof SharePhoto) {
            aVar.a((SharePhoto) shareMedia);
        } else {
            if (shareMedia instanceof ShareVideo) {
                aVar.a((ShareVideo) shareMedia);
                return;
            }
            throw new com.facebook.j(String.format(Locale.ROOT, "Invalid media type: %s", shareMedia.getClass().getSimpleName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ShareOpenGraphContent shareOpenGraphContent, a aVar) {
        aVar.a(shareOpenGraphContent.getAction());
        String previewPropertyName = shareOpenGraphContent.getPreviewPropertyName();
        if (ab.a(previewPropertyName)) {
            throw new com.facebook.j("Must specify a previewPropertyName.");
        }
        if (shareOpenGraphContent.getAction().get(previewPropertyName) != null) {
            return;
        }
        throw new com.facebook.j("Property \"" + previewPropertyName + "\" was not found on the action. The name of the preview property must match the name of an action property.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ShareOpenGraphAction shareOpenGraphAction, a aVar) {
        if (shareOpenGraphAction == null) {
            throw new com.facebook.j("Must specify a non-null ShareOpenGraphAction");
        }
        if (ab.a(shareOpenGraphAction.getActionType())) {
            throw new com.facebook.j("ShareOpenGraphAction must have a non-empty actionType");
        }
        aVar.a(shareOpenGraphAction, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ShareOpenGraphObject shareOpenGraphObject, a aVar) {
        if (shareOpenGraphObject == null) {
            throw new com.facebook.j("Cannot share a null ShareOpenGraphObject");
        }
        aVar.a(shareOpenGraphObject, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ShareOpenGraphValueContainer shareOpenGraphValueContainer, a aVar, boolean z) {
        for (String str : shareOpenGraphValueContainer.keySet()) {
            a(str, z);
            Object obj = shareOpenGraphValueContainer.get(str);
            if (obj instanceof List) {
                for (Object obj2 : (List) obj) {
                    if (obj2 == null) {
                        throw new com.facebook.j("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                    a(obj2, aVar);
                }
            } else {
                a(obj, aVar);
            }
        }
    }

    private static void a(String str, boolean z) {
        if (z) {
            String[] split = str.split(":");
            if (split.length < 2) {
                throw new com.facebook.j("Open Graph keys must be namespaced: %s", str);
            }
            for (String str2 : split) {
                if (str2.isEmpty()) {
                    throw new com.facebook.j("Invalid key found in Open Graph dictionary: %s", str);
                }
            }
        }
    }

    private static void a(Object obj, a aVar) {
        if (obj instanceof ShareOpenGraphObject) {
            aVar.a((ShareOpenGraphObject) obj);
        } else if (obj instanceof SharePhoto) {
            aVar.a((SharePhoto) obj);
        }
    }

    /* compiled from: ShareContentValidation.java */
    private static class b extends a {
        private b() {
            super();
        }

        @Override // com.facebook.share.internal.j.a
        public void a(SharePhotoContent sharePhotoContent) {
            throw new com.facebook.j("Cannot share SharePhotoContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.j.a
        public void a(ShareVideoContent shareVideoContent) {
            throw new com.facebook.j("Cannot share ShareVideoContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.j.a
        public void a(ShareMediaContent shareMediaContent) {
            throw new com.facebook.j("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.j.a
        public void a(SharePhoto sharePhoto) {
            j.e(sharePhoto, this);
        }
    }

    /* compiled from: ShareContentValidation.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6361a;

        private a() {
            this.f6361a = false;
        }

        public void a(ShareLinkContent shareLinkContent) {
            j.b(shareLinkContent, this);
        }

        public void a(SharePhotoContent sharePhotoContent) {
            j.b(sharePhotoContent, this);
        }

        public void a(ShareVideoContent shareVideoContent) {
            j.b(shareVideoContent, this);
        }

        public void a(ShareMediaContent shareMediaContent) {
            j.b(shareMediaContent, this);
        }

        public void a(ShareOpenGraphContent shareOpenGraphContent) {
            this.f6361a = true;
            j.b(shareOpenGraphContent, this);
        }

        public void a(ShareOpenGraphAction shareOpenGraphAction) {
            j.b(shareOpenGraphAction, this);
        }

        public void a(ShareOpenGraphObject shareOpenGraphObject) {
            j.b(shareOpenGraphObject, this);
        }

        public void a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z) {
            j.b(shareOpenGraphValueContainer, this, z);
        }

        public void a(SharePhoto sharePhoto) {
            j.d(sharePhoto, this);
        }

        public void a(ShareVideo shareVideo) {
            j.b(shareVideo, this);
        }

        public void a(ShareMedia shareMedia) {
            j.a(shareMedia, this);
        }

        public boolean a() {
            return this.f6361a;
        }
    }
}
