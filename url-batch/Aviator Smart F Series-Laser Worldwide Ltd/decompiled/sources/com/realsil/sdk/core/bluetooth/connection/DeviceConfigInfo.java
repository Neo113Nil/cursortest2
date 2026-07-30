package com.realsil.sdk.core.bluetooth.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes4.dex */
public class DeviceConfigInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceConfigInfo> CREATOR = new Parcelable.Creator<DeviceConfigInfo>() { // from class: com.realsil.sdk.core.bluetooth.connection.DeviceConfigInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceConfigInfo createFromParcel(Parcel parcel) {
            return new DeviceConfigInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceConfigInfo[] newArray(int i8) {
            return new DeviceConfigInfo[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f15461a;

    /* renamed from: b, reason: collision with root package name */
    public int f15462b;

    /* renamed from: c, reason: collision with root package name */
    public int f15463c;

    public DeviceConfigInfo() {
        this.f15461a = 0;
        this.f15462b = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getRxPhy() {
        return this.f15462b;
    }

    public int getTxMtu() {
        return this.f15463c;
    }

    public int getTxPhy() {
        return this.f15461a;
    }

    public void setPhy(int i8, int i9) {
        this.f15461a = i8;
        this.f15462b = i9;
    }

    public void setTxMtu(int i8) {
        this.f15463c = i8;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "PHY: txPhy=0x%02X, rxPhy=0x%02X, txMtu=%d\n", Integer.valueOf(this.f15461a), Integer.valueOf(this.f15462b), Integer.valueOf(this.f15463c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15461a);
        parcel.writeInt(this.f15462b);
        parcel.writeInt(this.f15463c);
    }

    public DeviceConfigInfo(Parcel parcel) {
        this.f15461a = 0;
        this.f15462b = 0;
        this.f15461a = parcel.readInt();
        this.f15462b = parcel.readInt();
        this.f15463c = parcel.readInt();
    }
}
