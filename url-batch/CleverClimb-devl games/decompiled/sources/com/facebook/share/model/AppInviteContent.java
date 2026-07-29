package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class AppInviteContent implements ShareModel {
    public static final Parcelable.Creator<AppInviteContent> CREATOR = new Parcelable.Creator<AppInviteContent>() { // from class: com.facebook.share.model.AppInviteContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppInviteContent createFromParcel(Parcel parcel) {
            return new AppInviteContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppInviteContent[] newArray(int i) {
            return new AppInviteContent[i];
        }
    };
    private final String applinkUrl;
    private final String previewImageUrl;
    private final String promoCode;
    private final String promoText;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AppInviteContent(a aVar) {
        this.applinkUrl = aVar.f6378a;
        this.previewImageUrl = aVar.f6379b;
        this.promoCode = aVar.f6380c;
        this.promoText = aVar.f6381d;
    }

    AppInviteContent(Parcel parcel) {
        this.applinkUrl = parcel.readString();
        this.previewImageUrl = parcel.readString();
        this.promoText = parcel.readString();
        this.promoCode = parcel.readString();
    }

    public String getApplinkUrl() {
        return this.applinkUrl;
    }

    public String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public String getPromotionCode() {
        return this.promoCode;
    }

    public String getPromotionText() {
        return this.promoText;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.applinkUrl);
        parcel.writeString(this.previewImageUrl);
        parcel.writeString(this.promoText);
        parcel.writeString(this.promoCode);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f6378a;

        /* renamed from: b, reason: collision with root package name */
        private String f6379b;

        /* renamed from: c, reason: collision with root package name */
        private String f6380c;

        /* renamed from: d, reason: collision with root package name */
        private String f6381d;

        public a a(String str) {
            this.f6378a = str;
            return this;
        }

        public a b(String str) {
            this.f6379b = str;
            return this;
        }

        public AppInviteContent a() {
            return new AppInviteContent(this);
        }
    }
}
