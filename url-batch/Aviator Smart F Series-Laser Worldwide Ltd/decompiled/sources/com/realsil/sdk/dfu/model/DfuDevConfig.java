package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class DfuDevConfig implements Parcelable {
    public static final Parcelable.Creator<DfuDevConfig> CREATOR = new Parcelable.Creator<DfuDevConfig>() { // from class: com.realsil.sdk.dfu.model.DfuDevConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuDevConfig createFromParcel(Parcel parcel) {
            return new DfuDevConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuDevConfig[] newArray(int i8) {
            return new DfuDevConfig[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public boolean f16195a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16196a = false;

        public DfuDevConfig build() {
            return new DfuDevConfig(this.f16196a);
        }

        public Builder gattCharacteristicCacheValueEnabled(boolean z7) {
            this.f16196a = z7;
            return this;
        }
    }

    public DfuDevConfig(Parcel parcel) {
        this.f16195a = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isGattCharacteristicCacheValueEnabled() {
        return this.f16195a;
    }

    public String toString() {
        return "Dev{" + String.format("\n\tgattCharacteristicCacheValueEnabled=%b", Boolean.valueOf(this.f16195a)) + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeByte(this.f16195a ? (byte) 1 : (byte) 0);
    }

    public DfuDevConfig(boolean z7) {
        this.f16195a = z7;
    }
}
