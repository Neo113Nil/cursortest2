package com.realsil.sdk.dfu.gatt;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class GattConfig implements Parcelable {
    public static final Parcelable.Creator<GattConfig> CREATOR = new Parcelable.Creator<GattConfig>() { // from class: com.realsil.sdk.dfu.gatt.GattConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GattConfig createFromParcel(Parcel parcel) {
            return new GattConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GattConfig[] newArray(int i8) {
            return new GattConfig[i8];
        }
    };
    public static final int MAX_MTU_SIZE = 256;
    public static final int PHY_HIGH_SPEED = 1;
    public static final int PHY_LONG_RANGE_X2 = 2;
    public static final int PHY_LONG_RANGE_X4 = 3;
    public static final int PHY_NORMAL = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15757a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15758b;

    /* renamed from: c, reason: collision with root package name */
    public int f15759c;

    /* renamed from: d, reason: collision with root package name */
    public String f15760d;

    /* renamed from: e, reason: collision with root package name */
    public String f15761e;

    /* renamed from: f, reason: collision with root package name */
    public String f15762f;

    /* renamed from: g, reason: collision with root package name */
    public String f15763g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15764h;

    /* renamed from: i, reason: collision with root package name */
    public int f15765i;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15766a = true;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15767b = false;

        /* renamed from: c, reason: collision with root package name */
        public int f15768c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f15769d = "0000d0ff-3c17-d293-8e48-14fe2e4da212";

        /* renamed from: e, reason: collision with root package name */
        public String f15770e = "00006287-3c17-d293-8e48-14fe2e4da212";

        /* renamed from: f, reason: collision with root package name */
        public String f15771f = "00006387-3c17-d293-8e48-14fe2e4da212";

        /* renamed from: g, reason: collision with root package name */
        public String f15772g = "00006487-3c17-d293-8e48-14fe2e4da212";

        /* renamed from: h, reason: collision with root package name */
        public boolean f15773h = false;

        /* renamed from: i, reason: collision with root package name */
        public int f15774i = 2;

        public GattConfig build() {
            return new GattConfig(this.f15766a, this.f15767b, this.f15768c, this.f15769d, this.f15770e, this.f15771f, this.f15772g, this.f15773h, this.f15774i);
        }

        public Builder characteristicCacheValueEnabled(boolean z7) {
            this.f15767b = z7;
            return this;
        }

        public Builder connectionTransport(int i8) {
            this.f15774i = i8;
            return this;
        }

        public Builder dfuControlPointUuid(String str) {
            this.f15772g = str;
            return this;
        }

        public Builder dfuDataUuid(String str) {
            this.f15771f = str;
            return this;
        }

        public Builder dfuServiceUuid(String str) {
            this.f15770e = str;
            return this;
        }

        public Builder ignoreWriteResult(boolean z7) {
            this.f15773h = z7;
            return this;
        }

        public Builder otaServiceUuid(String str) {
            this.f15769d = str;
            return this;
        }

        public Builder phy(int i8) {
            this.f15768c = i8;
            return this;
        }

        public Builder refreshCache(boolean z7) {
            this.f15766a = z7;
            return this;
        }
    }

    public GattConfig(Parcel parcel) {
        this.f15759c = 0;
        this.f15760d = "0000d0ff-3c17-d293-8e48-14fe2e4da212";
        this.f15761e = "00006287-3c17-d293-8e48-14fe2e4da212";
        this.f15762f = "00006387-3c17-d293-8e48-14fe2e4da212";
        this.f15763g = "00006487-3c17-d293-8e48-14fe2e4da212";
        this.f15764h = false;
        this.f15765i = 2;
        this.f15757a = parcel.readByte() != 0;
        this.f15758b = parcel.readByte() != 0;
        this.f15759c = parcel.readInt();
        this.f15760d = parcel.readString();
        this.f15761e = parcel.readString();
        this.f15762f = parcel.readString();
        this.f15763g = parcel.readString();
        this.f15764h = parcel.readByte() != 0;
        this.f15765i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConnectionTransport() {
        return this.f15765i;
    }

    public String getDfuControlPointUuid() {
        return this.f15763g;
    }

    public String getDfuDataUuid() {
        return this.f15762f;
    }

    public String getDfuServiceUuid() {
        return this.f15761e;
    }

    public String getOtaServiceUuid() {
        return this.f15760d;
    }

    public int getPhy() {
        return this.f15759c;
    }

    public boolean isGattCharacteristicCacheValueEnabled() {
        return this.f15758b;
    }

    public boolean isIgnoreWriteResult() {
        return this.f15764h;
    }

    public boolean isRefreshCacheEnabled() {
        return this.f15757a;
    }

    @Deprecated
    public void setDfuControlPointUuid(String str) {
        this.f15763g = str;
    }

    @Deprecated
    public void setDfuDataUuid(String str) {
        this.f15762f = str;
    }

    @Deprecated
    public void setDfuServiceUuid(String str) {
        this.f15761e = str;
    }

    @Deprecated
    public void setOtaServiceUuid(String str) {
        this.f15760d = str;
    }

    public String toString() {
        return "GattConfig {\n" + String.format(Locale.US, "\trefreshCache=%b,characteristicCacheValue=%b,ignoreWriteResult=%b\n", Boolean.valueOf(this.f15757a), Boolean.valueOf(this.f15758b), Boolean.valueOf(this.f15764h)) + String.format("\tOtaService=%s\n", this.f15760d) + String.format("\tDfuService=%s\n", this.f15761e) + String.format("\tDfuData==%s\n", this.f15762f) + String.format("\tDfuControlPoint=%s\n", this.f15763g) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeByte(this.f15757a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15758b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f15759c);
        parcel.writeString(this.f15760d);
        parcel.writeString(this.f15761e);
        parcel.writeString(this.f15762f);
        parcel.writeString(this.f15763g);
        parcel.writeByte(this.f15764h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f15765i);
    }

    public GattConfig(boolean z7, boolean z8, int i8, String str, String str2, String str3, String str4, boolean z9, int i9) {
        this.f15757a = z7;
        this.f15758b = z8;
        this.f15759c = i8;
        this.f15760d = str;
        this.f15761e = str2;
        this.f15762f = str3;
        this.f15763g = str4;
        this.f15764h = z9;
        this.f15765i = i9;
    }
}
