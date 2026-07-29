package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new Parcelable.Creator<ShareHashtag>() { // from class: com.facebook.share.model.ShareHashtag.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    };
    private final String hashtag;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ShareHashtag(a aVar) {
        this.hashtag = aVar.f6397a;
    }

    ShareHashtag(Parcel parcel) {
        this.hashtag = parcel.readString();
    }

    public String getHashtag() {
        return this.hashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hashtag);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f6397a;

        public a a(String str) {
            this.f6397a = str;
            return this;
        }

        public a a(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : a(shareHashtag.getHashtag());
        }

        a a(Parcel parcel) {
            return a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        public ShareHashtag a() {
            return new ShareHashtag(this);
        }
    }
}
