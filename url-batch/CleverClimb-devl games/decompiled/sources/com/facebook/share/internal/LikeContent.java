package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;

/* loaded from: classes.dex */
public class LikeContent implements ShareModel {
    public static final Parcelable.Creator<LikeContent> CREATOR = new Parcelable.Creator<LikeContent>() { // from class: com.facebook.share.internal.LikeContent.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LikeContent createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LikeContent[] newArray(int i) {
            return new LikeContent[i];
        }
    };
    private final String objectId;
    private final String objectType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    LikeContent(Parcel parcel) {
        this.objectId = parcel.readString();
        this.objectType = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.objectId);
        parcel.writeString(this.objectType);
    }
}
