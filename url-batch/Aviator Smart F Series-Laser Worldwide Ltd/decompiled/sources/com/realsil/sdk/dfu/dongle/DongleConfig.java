package com.realsil.sdk.dfu.dongle;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class DongleConfig implements Parcelable {
    public static final Parcelable.Creator<DongleConfig> CREATOR = new Parcelable.Creator<DongleConfig>() { // from class: com.realsil.sdk.dfu.dongle.DongleConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DongleConfig createFromParcel(Parcel parcel) {
            return new DongleConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DongleConfig[] newArray(int i8) {
            return new DongleConfig[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f15735a;

    /* renamed from: b, reason: collision with root package name */
    public int f15736b;

    /* renamed from: c, reason: collision with root package name */
    public int f15737c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f15738a = 130;

        /* renamed from: b, reason: collision with root package name */
        public int f15739b = 2;

        /* renamed from: c, reason: collision with root package name */
        public int f15740c = 2;

        public DongleConfig build() {
            return new DongleConfig(this.f15738a, this.f15739b, this.f15740c);
        }

        public Builder endPointInAddr(int i8) {
            this.f15738a = i8;
            return this;
        }

        public Builder endPointOutAddr(int i8) {
            this.f15739b = i8;
            return this;
        }

        public Builder rxEndPointType(int i8) {
            this.f15740c = i8;
            return this;
        }
    }

    public DongleConfig(int i8, int i9, int i10) {
        this.f15735a = i8;
        this.f15736b = i9;
        this.f15737c = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEndPointInAddr() {
        return this.f15735a;
    }

    public int getEndPointOutAddr() {
        return this.f15736b;
    }

    public String toString() {
        return String.format("\tEndPointInAddr=0x%02X, EndPointOutAddr=0x%02X\n", Integer.valueOf(this.f15735a), Integer.valueOf(this.f15736b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15735a);
        parcel.writeInt(this.f15736b);
        parcel.writeInt(this.f15737c);
    }

    public DongleConfig(Parcel parcel) {
        this.f15735a = 130;
        this.f15736b = 2;
        this.f15737c = 2;
        this.f15735a = parcel.readInt();
        this.f15736b = parcel.readInt();
        this.f15737c = parcel.readInt();
    }
}
