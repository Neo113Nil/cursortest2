package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new Parcelable.Creator<ShareMediaContent>() { // from class: com.facebook.share.model.ShareMediaContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMediaContent createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    };
    private final List<ShareMedia> media;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.media = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    public List<ShareMedia> getMedia() {
        return this.media;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.media.toArray(), i);
    }
}
