package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, Builder> {
    private final String quote;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new Parcelable.Creator<ShareLinkContent>() { // from class: com.facebook.share.model.ShareLinkContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareLinkContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ShareLinkContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    };

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder extends ShareContent.Builder<ShareLinkContent, Builder> {
        private String quote;

        @Override // com.facebook.share.ShareBuilder
        public ShareLinkContent build() {
            return new ShareLinkContent(this, null);
        }

        public final String getQuote$facebook_common_release() {
            return this.quote;
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareLinkContent shareLinkContent) {
            return shareLinkContent == null ? this : ((Builder) super.readFrom((Builder) shareLinkContent)).setQuote(shareLinkContent.getQuote());
        }

        public final Builder setQuote(String str) {
            this.quote = str;
            return this;
        }

        public final void setQuote$facebook_common_release(String str) {
            this.quote = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.quote = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getQuote() {
        return this.quote;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.quote);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ShareLinkContent(Builder builder) {
        super(builder);
        this.quote = builder.getQuote$facebook_common_release();
    }

    public /* synthetic */ ShareLinkContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
