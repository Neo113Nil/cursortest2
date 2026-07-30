package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Builder> {
    private final String link;
    private final String linkCaption;
    private final String linkDescription;
    private final String linkName;
    private final String mediaSource;
    private final String picture;
    private final String toId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new Parcelable.Creator<ShareFeedContent>() { // from class: com.facebook.share.internal.ShareFeedContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareFeedContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ShareFeedContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    };

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder extends ShareContent.Builder<ShareFeedContent, Builder> {
        private String link;
        private String linkCaption;
        private String linkDescription;
        private String linkName;
        private String mediaSource;
        private String picture;
        private String toId;

        @Override // com.facebook.share.ShareBuilder
        public ShareFeedContent build() {
            return new ShareFeedContent(this, null);
        }

        public final String getLink$facebook_common_release() {
            return this.link;
        }

        public final String getLinkCaption$facebook_common_release() {
            return this.linkCaption;
        }

        public final String getLinkDescription$facebook_common_release() {
            return this.linkDescription;
        }

        public final String getLinkName$facebook_common_release() {
            return this.linkName;
        }

        public final String getMediaSource$facebook_common_release() {
            return this.mediaSource;
        }

        public final String getPicture$facebook_common_release() {
            return this.picture;
        }

        public final String getToId$facebook_common_release() {
            return this.toId;
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareFeedContent shareFeedContent) {
            return shareFeedContent == null ? this : ((Builder) super.readFrom((Builder) shareFeedContent)).setToId(shareFeedContent.getToId()).setLink(shareFeedContent.getLink()).setLinkName(shareFeedContent.getLinkName()).setLinkCaption(shareFeedContent.getLinkCaption()).setLinkDescription(shareFeedContent.getLinkDescription()).setPicture(shareFeedContent.getPicture()).setMediaSource(shareFeedContent.getMediaSource());
        }

        public final Builder setLink(String str) {
            this.link = str;
            return this;
        }

        public final void setLink$facebook_common_release(String str) {
            this.link = str;
        }

        public final Builder setLinkCaption(String str) {
            this.linkCaption = str;
            return this;
        }

        public final void setLinkCaption$facebook_common_release(String str) {
            this.linkCaption = str;
        }

        public final Builder setLinkDescription(String str) {
            this.linkDescription = str;
            return this;
        }

        public final void setLinkDescription$facebook_common_release(String str) {
            this.linkDescription = str;
        }

        public final Builder setLinkName(String str) {
            this.linkName = str;
            return this;
        }

        public final void setLinkName$facebook_common_release(String str) {
            this.linkName = str;
        }

        public final Builder setMediaSource(String str) {
            this.mediaSource = str;
            return this;
        }

        public final void setMediaSource$facebook_common_release(String str) {
            this.mediaSource = str;
        }

        public final Builder setPicture(String str) {
            this.picture = str;
            return this;
        }

        public final void setPicture$facebook_common_release(String str) {
            this.picture = str;
        }

        public final Builder setToId(String str) {
            this.toId = str;
            return this;
        }

        public final void setToId$facebook_common_release(String str) {
            this.toId = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.toId = parcel.readString();
        this.link = parcel.readString();
        this.linkName = parcel.readString();
        this.linkCaption = parcel.readString();
        this.linkDescription = parcel.readString();
        this.picture = parcel.readString();
        this.mediaSource = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLinkCaption() {
        return this.linkCaption;
    }

    public final String getLinkDescription() {
        return this.linkDescription;
    }

    public final String getLinkName() {
        return this.linkName;
    }

    public final String getMediaSource() {
        return this.mediaSource;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getToId() {
        return this.toId;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.toId);
        parcel.writeString(this.link);
        parcel.writeString(this.linkName);
        parcel.writeString(this.linkCaption);
        parcel.writeString(this.linkDescription);
        parcel.writeString(this.picture);
        parcel.writeString(this.mediaSource);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ShareFeedContent(Builder builder) {
        super(builder);
        this.toId = builder.getToId$facebook_common_release();
        this.link = builder.getLink$facebook_common_release();
        this.linkName = builder.getLinkName$facebook_common_release();
        this.linkCaption = builder.getLinkCaption$facebook_common_release();
        this.linkDescription = builder.getLinkDescription$facebook_common_release();
        this.picture = builder.getPicture$facebook_common_release();
        this.mediaSource = builder.getMediaSource$facebook_common_release();
    }

    public /* synthetic */ ShareFeedContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
