package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, Builder> {
    private final Uri localUrl;
    private final ShareMedia.Type mediaType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareVideo> CREATOR = new Parcelable.Creator<ShareVideo>() { // from class: com.facebook.share.model.ShareVideo$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareVideo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ShareVideo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    };

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder extends ShareMedia.Builder<ShareVideo, Builder> {
        private Uri localUrl;

        @Override // com.facebook.share.ShareBuilder
        public ShareVideo build() {
            return new ShareVideo(this, null);
        }

        public final Uri getLocalUrl$facebook_common_release() {
            return this.localUrl;
        }

        @Override // com.facebook.share.model.ShareMedia.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareVideo shareVideo) {
            return shareVideo == null ? this : setLocalUrl(shareVideo.getLocalUrl());
        }

        public final Builder readFrom$facebook_common_release(Parcel parcel) {
            parcel.getClass();
            return readFrom((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        public final Builder setLocalUrl(Uri uri) {
            this.localUrl = uri;
            return this;
        }

        public final void setLocalUrl$facebook_common_release(Uri uri) {
            this.localUrl = uri;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Uri getLocalUrl() {
        return this.localUrl;
    }

    @Override // com.facebook.share.model.ShareMedia
    public ShareMedia.Type getMediaType() {
        return this.mediaType;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.localUrl, 0);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ShareVideo(Builder builder) {
        super(builder);
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = builder.getLocalUrl$facebook_common_release();
    }

    public /* synthetic */ ShareVideo(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
