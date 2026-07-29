package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, a> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new Parcelable.Creator<SharePhotoContent>() { // from class: com.facebook.share.model.SharePhotoContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    };
    private final List<SharePhoto> photos;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SharePhotoContent(a aVar) {
        super(aVar);
        this.photos = Collections.unmodifiableList(aVar.f6411a);
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        this.photos = Collections.unmodifiableList(SharePhoto.a.c(parcel));
    }

    public List<SharePhoto> getPhotos() {
        return this.photos;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SharePhoto.a.a(parcel, i, this.photos);
    }

    public static class a extends ShareContent.a<SharePhotoContent, a> {

        /* renamed from: a, reason: collision with root package name */
        private final List<SharePhoto> f6411a = new ArrayList();

        public a a(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f6411a.add(new SharePhoto.a().a(sharePhoto).c());
            }
            return this;
        }

        public SharePhotoContent a() {
            return new SharePhotoContent(this);
        }
    }
}
