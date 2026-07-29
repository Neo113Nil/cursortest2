package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;

/* loaded from: classes.dex */
public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new Parcelable.Creator<ShareVideo>() { // from class: com.facebook.share.model.ShareVideo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    };
    private final Uri localUrl;

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ShareVideo(a aVar) {
        super(aVar);
        this.localUrl = aVar.f6412a;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public Uri getLocalUrl() {
        return this.localUrl;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.localUrl, 0);
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.b getMediaType() {
        return ShareMedia.b.VIDEO;
    }

    public static final class a extends ShareMedia.a<ShareVideo, a> {

        /* renamed from: a, reason: collision with root package name */
        private Uri f6412a;

        public a a(Uri uri) {
            this.f6412a = uri;
            return this;
        }

        public ShareVideo a() {
            return new ShareVideo(this);
        }

        @Override // com.facebook.share.model.ShareMedia.a
        public a a(ShareVideo shareVideo) {
            return shareVideo == null ? this : ((a) super.a((a) shareVideo)).a(shareVideo.getLocalUrl());
        }

        a b(Parcel parcel) {
            return a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }
}
