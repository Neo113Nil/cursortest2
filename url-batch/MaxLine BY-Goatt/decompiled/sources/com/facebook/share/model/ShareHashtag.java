package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareHashtag implements ShareModel {
    private final String hashtag;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new Parcelable.Creator<ShareHashtag>() { // from class: com.facebook.share.model.ShareHashtag$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareHashtag createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ShareHashtag(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    };

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder implements ShareModelBuilder<ShareHashtag, Builder> {
        private String hashtag;

        @Override // com.facebook.share.ShareBuilder
        public ShareHashtag build() {
            return new ShareHashtag(this, null);
        }

        public final String getHashtag() {
            return this.hashtag;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : setHashtag(shareHashtag.getHashtag());
        }

        public final Builder readFrom$facebook_common_release(Parcel parcel) {
            parcel.getClass();
            return readFrom((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        public final Builder setHashtag(String str) {
            this.hashtag = str;
            return this;
        }
    }

    public ShareHashtag(Parcel parcel) {
        parcel.getClass();
        this.hashtag = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getHashtag() {
        return this.hashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.hashtag);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ShareHashtag(Builder builder) {
        this.hashtag = builder.getHashtag();
    }

    public /* synthetic */ ShareHashtag(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
