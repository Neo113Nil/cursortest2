package com.realsil.sdk.dfu.spp;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.realsil.sdk.bbpro.core.spp.SppTransportConnParams;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class SppConfig implements Parcelable {
    public static final Parcelable.Creator<SppConfig> CREATOR = new Parcelable.Creator<SppConfig>() { // from class: com.realsil.sdk.dfu.spp.SppConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SppConfig createFromParcel(Parcel parcel) {
            return new SppConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SppConfig[] newArray(int i8) {
            return new SppConfig[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public ParcelUuid f16300a;

    /* renamed from: b, reason: collision with root package name */
    public int f16301b;

    /* renamed from: c, reason: collision with root package name */
    public int f16302c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public ParcelUuid f16303a = new ParcelUuid(SppTransportConnParams.RTK_VENDOR_SPP_UUID);

        /* renamed from: b, reason: collision with root package name */
        public int f16304b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f16305c = 2;

        public SppConfig build() {
            return new SppConfig(this.f16303a, this.f16304b, this.f16305c);
        }

        public Builder data(int i8) {
            this.f16305c = i8;
            return this;
        }

        public Builder uuid(ParcelUuid parcelUuid, int i8) {
            this.f16303a = parcelUuid;
            this.f16304b = i8;
            return this;
        }
    }

    public SppConfig(Parcel parcel) {
        this.f16302c = 2;
        this.f16300a = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
        this.f16301b = parcel.readInt();
        this.f16302c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDataWriteType() {
        return this.f16302c;
    }

    public int getTransport() {
        return this.f16301b;
    }

    public ParcelUuid getUuid() {
        return this.f16300a;
    }

    public String toString() {
        return "SppConfig {\n" + String.format(Locale.US, "\tuuid=%s,transport=%d,dataWriteType=%d\n", this.f16300a, Integer.valueOf(this.f16301b), Integer.valueOf(this.f16302c)) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f16300a, i8);
        parcel.writeInt(this.f16301b);
        parcel.writeInt(this.f16302c);
    }

    public SppConfig(ParcelUuid parcelUuid, int i8, int i9) {
        this.f16300a = parcelUuid;
        this.f16301b = i8;
        this.f16302c = i9;
    }
}
