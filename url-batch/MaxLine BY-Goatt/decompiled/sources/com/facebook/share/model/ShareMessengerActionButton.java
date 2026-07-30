package com.facebook.share.model;

import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ShareMessengerActionButton implements ShareModel {
    private final String title;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static abstract class Builder<M extends ShareMessengerActionButton, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        private String title;

        public final String getTitle$facebook_common_release() {
            return this.title;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public B readFrom(M m) {
            return m == null ? this : setTitle(m.getTitle());
        }

        public final B setTitle(String str) {
            this.title = str;
            return this;
        }

        public final void setTitle$facebook_common_release(String str) {
            this.title = str;
        }
    }

    public ShareMessengerActionButton(Builder<?, ?> builder) {
        builder.getClass();
        this.title = builder.getTitle$facebook_common_release();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
    }

    public ShareMessengerActionButton(Parcel parcel) {
        parcel.getClass();
        this.title = parcel.readString();
    }
}
