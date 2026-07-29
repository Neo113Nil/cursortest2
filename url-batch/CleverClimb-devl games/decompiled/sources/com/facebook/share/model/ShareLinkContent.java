package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

/* loaded from: classes.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, a> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new Parcelable.Creator<ShareLinkContent>() { // from class: com.facebook.share.model.ShareLinkContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    };
    private final String contentDescription;
    private final String contentTitle;
    private final Uri imageUrl;
    private final String quote;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ShareLinkContent(a aVar) {
        super(aVar);
        this.contentDescription = aVar.f6398a;
        this.contentTitle = aVar.f6399b;
        this.imageUrl = aVar.f6400c;
        this.quote = aVar.f6401d;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.quote = parcel.readString();
    }

    public String getContentDescription() {
        return this.contentDescription;
    }

    public String getContentTitle() {
        return this.contentTitle;
    }

    public Uri getImageUrl() {
        return this.imageUrl;
    }

    public String getQuote() {
        return this.quote;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeString(this.quote);
    }

    public static final class a extends ShareContent.a<ShareLinkContent, a> {

        /* renamed from: a, reason: collision with root package name */
        private String f6398a;

        /* renamed from: b, reason: collision with root package name */
        private String f6399b;

        /* renamed from: c, reason: collision with root package name */
        private Uri f6400c;

        /* renamed from: d, reason: collision with root package name */
        private String f6401d;

        public a a(String str) {
            this.f6398a = str;
            return this;
        }

        public a b(String str) {
            this.f6399b = str;
            return this;
        }

        public a b(Uri uri) {
            this.f6400c = uri;
            return this;
        }

        public ShareLinkContent a() {
            return new ShareLinkContent(this);
        }
    }
}
