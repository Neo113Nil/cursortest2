package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;

/* loaded from: classes.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> implements ShareModel {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new Parcelable.Creator<ShareVideoContent>() { // from class: com.facebook.share.model.ShareVideoContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    };
    private final String contentDescription;
    private final String contentTitle;
    private final SharePhoto previewPhoto;
    private final ShareVideo video;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        SharePhoto.a b2 = new SharePhoto.a().b(parcel);
        if (b2.a() != null || b2.b() != null) {
            this.previewPhoto = b2.c();
        } else {
            this.previewPhoto = null;
        }
        this.video = new ShareVideo.a().b(parcel).a();
    }

    public String getContentDescription() {
        return this.contentDescription;
    }

    public String getContentTitle() {
        return this.contentTitle;
    }

    public SharePhoto getPreviewPhoto() {
        return this.previewPhoto;
    }

    public ShareVideo getVideo() {
        return this.video;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.previewPhoto, 0);
        parcel.writeParcelable(this.video, 0);
    }
}
