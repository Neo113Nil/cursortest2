package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class DfuQcConfig implements Parcelable {
    public static final Parcelable.Creator<DfuQcConfig> CREATOR = new Parcelable.Creator<DfuQcConfig>() { // from class: com.realsil.sdk.dfu.model.DfuQcConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuQcConfig createFromParcel(Parcel parcel) {
            return new DfuQcConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DfuQcConfig[] newArray(int i8) {
            return new DfuQcConfig[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f16217a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f16218a;

        public Builder aes(boolean z7) {
            this.f16218a = z7 ? this.f16218a | 1 : this.f16218a & (-2);
            return this;
        }

        public Builder buffercheck(boolean z7) {
            this.f16218a = z7 ? this.f16218a & (-17) : this.f16218a | 16;
            return this;
        }

        public DfuQcConfig build() {
            return new DfuQcConfig(this.f16218a);
        }

        public Builder copyFail(boolean z7) {
            this.f16218a = z7 ? this.f16218a | 4 : this.f16218a & (-5);
            return this;
        }

        public Builder skipFail(boolean z7) {
            this.f16218a = z7 ? this.f16218a | 8 : this.f16218a & (-9);
            return this;
        }

        public Builder stress(boolean z7) {
            this.f16218a = z7 ? this.f16218a | 2 : this.f16218a & (-3);
            return this;
        }
    }

    public DfuQcConfig(int i8) {
        this.f16217a = i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getIndicator() {
        return this.f16217a;
    }

    public String toString() {
        return "Qc{" + String.format("indicator=%b", Integer.valueOf(this.f16217a)) + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f16217a);
    }

    public DfuQcConfig(Parcel parcel) {
        this.f16217a = parcel.readInt();
    }
}
