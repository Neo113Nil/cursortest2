package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import defpackage.zv;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Builder> {
    private final String attributionLink;
    private final ShareMedia<?, ?> backgroundAsset;
    private final List<String> backgroundColorList;
    private final SharePhoto stickerAsset;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new Parcelable.Creator<ShareStoryContent>() { // from class: com.facebook.share.model.ShareStoryContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareStoryContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ShareStoryContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    };

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder extends ShareContent.Builder<ShareStoryContent, Builder> {
        private String attributionLink;
        private ShareMedia<?, ?> backgroundAsset;
        private List<String> backgroundColorList;
        private SharePhoto stickerAsset;

        @Override // com.facebook.share.ShareBuilder
        public ShareStoryContent build() {
            return new ShareStoryContent(this, null);
        }

        public final String getAttributionLink$facebook_common_release() {
            return this.attributionLink;
        }

        public final ShareMedia<?, ?> getBackgroundAsset$facebook_common_release() {
            return this.backgroundAsset;
        }

        public final List<String> getBackgroundColorList$facebook_common_release() {
            return this.backgroundColorList;
        }

        public final SharePhoto getStickerAsset$facebook_common_release() {
            return this.stickerAsset;
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareStoryContent shareStoryContent) {
            return shareStoryContent == null ? this : ((Builder) super.readFrom((Builder) shareStoryContent)).setBackgroundAsset(shareStoryContent.getBackgroundAsset()).setStickerAsset(shareStoryContent.getStickerAsset()).setBackgroundColorList(shareStoryContent.getBackgroundColorList()).setAttributionLink(shareStoryContent.getAttributionLink());
        }

        public final Builder setAttributionLink(String str) {
            this.attributionLink = str;
            return this;
        }

        public final void setAttributionLink$facebook_common_release(String str) {
            this.attributionLink = str;
        }

        public final Builder setBackgroundAsset(ShareMedia<?, ?> shareMedia) {
            this.backgroundAsset = shareMedia;
            return this;
        }

        public final void setBackgroundAsset$facebook_common_release(ShareMedia<?, ?> shareMedia) {
            this.backgroundAsset = shareMedia;
        }

        public final Builder setBackgroundColorList(List<String> list) {
            this.backgroundColorList = list != null ? zv.M(list) : null;
            return this;
        }

        public final void setBackgroundColorList$facebook_common_release(List<String> list) {
            this.backgroundColorList = list;
        }

        public final Builder setStickerAsset(SharePhoto sharePhoto) {
            this.stickerAsset = sharePhoto;
            return this;
        }

        public final void setStickerAsset$facebook_common_release(SharePhoto sharePhoto) {
            this.stickerAsset = sharePhoto;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.backgroundAsset = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.stickerAsset = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.backgroundColorList = readUnmodifiableStringList(parcel);
        this.attributionLink = parcel.readString();
    }

    private final List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return zv.M(arrayList);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAttributionLink() {
        return this.attributionLink;
    }

    public final ShareMedia<?, ?> getBackgroundAsset() {
        return this.backgroundAsset;
    }

    public final List<String> getBackgroundColorList() {
        List<String> list = this.backgroundColorList;
        if (list != null) {
            return zv.M(list);
        }
        return null;
    }

    public final SharePhoto getStickerAsset() {
        return this.stickerAsset;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.backgroundAsset, 0);
        parcel.writeParcelable(this.stickerAsset, 0);
        parcel.writeStringList(getBackgroundColorList());
        parcel.writeString(this.attributionLink);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ShareStoryContent(Builder builder) {
        super(builder);
        this.backgroundAsset = builder.getBackgroundAsset$facebook_common_release();
        this.stickerAsset = builder.getStickerAsset$facebook_common_release();
        this.backgroundColorList = builder.getBackgroundColorList$facebook_common_release();
        this.attributionLink = builder.getAttributionLink$facebook_common_release();
    }

    public /* synthetic */ ShareStoryContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
