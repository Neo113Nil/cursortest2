package com.baidu.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class PoiRegion implements Parcelable {
    public static final Parcelable.Creator<PoiRegion> CREATOR = new a();
    private final String mBid;
    private final String mDirectionDesc;
    private final String mName;
    private final String mTag;
    private final String mUid;

    class a implements Parcelable.Creator<PoiRegion> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PoiRegion createFromParcel(Parcel parcel) {
            return new PoiRegion(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PoiRegion[] newArray(int i8) {
            return new PoiRegion[i8];
        }
    }

    public PoiRegion(PoiRegion poiRegion) {
        this.mName = poiRegion.getName();
        this.mDirectionDesc = poiRegion.getDerectionDesc();
        this.mTag = poiRegion.getTags();
        this.mUid = poiRegion.getUid();
        this.mBid = poiRegion.getBid();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBid() {
        return this.mBid;
    }

    public String getDerectionDesc() {
        return this.mDirectionDesc;
    }

    public String getName() {
        return this.mName;
    }

    public String getTags() {
        return this.mTag;
    }

    public String getUid() {
        return this.mUid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.mName);
        parcel.writeString(this.mDirectionDesc);
        parcel.writeString(this.mTag);
        parcel.writeString(this.mUid);
        parcel.writeString(this.mBid);
    }

    public PoiRegion(String str, String str2, String str3, String str4, String str5) {
        this.mName = str2;
        this.mDirectionDesc = str;
        this.mTag = str3;
        this.mUid = str4;
        this.mBid = str5;
    }
}
