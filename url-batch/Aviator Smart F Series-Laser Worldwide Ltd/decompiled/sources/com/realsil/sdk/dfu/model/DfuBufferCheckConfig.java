package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class DfuBufferCheckConfig implements Parcelable {
    public static final int BUFFER_CHECK_MTU_UPDATE_MECHANISM_CUSTOMIZED = 3;
    public static final int BUFFER_CHECK_MTU_UPDATE_MECHANISM_V1 = 1;
    public static final int BUFFER_CHECK_MTU_UPDATE_MECHANISM_V2 = 2;
    public static final Parcelable.Creator<DfuBufferCheckConfig> CREATOR = new Parcelable.Creator<DfuBufferCheckConfig>() { // from class: com.realsil.sdk.dfu.model.DfuBufferCheckConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuBufferCheckConfig createFromParcel(Parcel parcel) {
            return new DfuBufferCheckConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuBufferCheckConfig[] newArray(int i8) {
            return new DfuBufferCheckConfig[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f16163a;

    /* renamed from: b, reason: collision with root package name */
    public int f16164b;

    /* renamed from: c, reason: collision with root package name */
    public long f16165c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f16166a = 2;

        /* renamed from: b, reason: collision with root package name */
        public int f16167b = 20;

        /* renamed from: c, reason: collision with root package name */
        public long f16168c = 0;

        public DfuBufferCheckConfig build() {
            return new DfuBufferCheckConfig(this.f16166a, this.f16167b, this.f16168c);
        }

        public Builder mtuUpdateMechanism(int i8) {
            this.f16166a = i8;
            return this;
        }

        public Builder packetInterval(long j8) {
            this.f16168c = j8;
            return this;
        }

        public Builder preferredMtuSize(int i8) {
            this.f16167b = i8;
            return this;
        }
    }

    public DfuBufferCheckConfig(int i8, int i9, long j8) {
        this.f16163a = i8;
        this.f16164b = i9;
        this.f16165c = j8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getMtuUpdateMechanism() {
        return this.f16163a;
    }

    public long getPacketInterval() {
        return this.f16165c;
    }

    public int getPreferredMtuSize() {
        return this.f16164b;
    }

    public String toString() {
        return "DfuBufferCheckConfig {" + String.format(Locale.US, "mtuUpdateMechanism=%b, preferredMtuSize=%d, packetInterval=%d", Integer.valueOf(this.f16163a), Integer.valueOf(this.f16164b), Long.valueOf(this.f16165c)) + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f16163a);
        parcel.writeInt(this.f16164b);
        parcel.writeLong(this.f16165c);
    }

    public DfuBufferCheckConfig(Parcel parcel) {
        this.f16163a = 2;
        this.f16164b = 20;
        this.f16165c = 0L;
        this.f16163a = parcel.readInt();
        this.f16164b = parcel.readInt();
        this.f16165c = parcel.readLong();
    }
}
