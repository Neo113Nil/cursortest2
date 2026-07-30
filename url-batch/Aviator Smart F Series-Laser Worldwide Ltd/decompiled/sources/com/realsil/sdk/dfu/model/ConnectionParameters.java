package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ConnectionParameters implements Parcelable {
    public static final Parcelable.Creator<ConnectionParameters> CREATOR = new Parcelable.Creator<ConnectionParameters>() { // from class: com.realsil.sdk.dfu.model.ConnectionParameters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnectionParameters createFromParcel(Parcel parcel) {
            return new ConnectionParameters(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnectionParameters[] newArray(int i8) {
            return new ConnectionParameters[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f16128a;

    /* renamed from: b, reason: collision with root package name */
    public int f16129b;

    /* renamed from: c, reason: collision with root package name */
    public int f16130c;

    /* renamed from: d, reason: collision with root package name */
    public int f16131d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f16132a = 17;

        /* renamed from: b, reason: collision with root package name */
        public int f16133b = 6;

        /* renamed from: c, reason: collision with root package name */
        public int f16134c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f16135d = 500;

        public ConnectionParameters build() {
            ZLogger.v(String.format(Locale.US, "\tmaxInterval=%d(0x%04X),minInterval=%d(0x%04X),latency=%d(0x%04X),timeout=%d(0x%04X),\n", Integer.valueOf(this.f16132a), Integer.valueOf(this.f16132a), Integer.valueOf(this.f16133b), Integer.valueOf(this.f16133b), Integer.valueOf(this.f16134c), Integer.valueOf(this.f16134c), Integer.valueOf(this.f16135d), Integer.valueOf(this.f16135d)));
            return new ConnectionParameters(this.f16132a, this.f16133b, this.f16134c, this.f16135d);
        }

        public Builder latency(int i8) {
            this.f16134c = i8;
            return this;
        }

        public Builder maxInterval(int i8) {
            this.f16132a = i8;
            return this;
        }

        public Builder minInterval(int i8) {
            this.f16133b = i8;
            return this;
        }

        public Builder timeout(int i8) {
            this.f16135d = i8;
            return this;
        }
    }

    public ConnectionParameters(int i8, int i9, int i10, int i11) {
        this.f16128a = i8;
        this.f16129b = i9;
        this.f16130c = i10;
        this.f16131d = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getLatency() {
        return this.f16130c;
    }

    public int getMaxInterval() {
        return this.f16128a;
    }

    public int getMinInterval() {
        return this.f16129b;
    }

    public int getTimeout() {
        return this.f16131d;
    }

    public void setLatency(int i8) {
        this.f16130c = i8;
    }

    public void setMaxInterval(int i8) {
        this.f16128a = i8;
    }

    public void setMinInterval(int i8) {
        this.f16129b = i8;
    }

    public void setTimeout(int i8) {
        this.f16131d = i8;
    }

    public String toString() {
        return "ConnectionParameters{\n" + String.format(Locale.US, "\tmaxInterval=%d(0x%04X),minInterval=%d(0x%04X),latency=%d(0x%04X),timeout=%d(0x%04X),\n", Integer.valueOf(this.f16128a), Integer.valueOf(this.f16128a), Integer.valueOf(this.f16129b), Integer.valueOf(this.f16129b), Integer.valueOf(this.f16130c), Integer.valueOf(this.f16130c), Integer.valueOf(this.f16131d), Integer.valueOf(this.f16131d)) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f16128a);
        parcel.writeInt(this.f16129b);
        parcel.writeInt(this.f16130c);
        parcel.writeInt(this.f16131d);
    }

    public ConnectionParameters(Parcel parcel) {
        this.f16128a = 17;
        this.f16129b = 6;
        this.f16130c = 0;
        this.f16131d = 500;
        this.f16128a = parcel.readInt();
        this.f16129b = parcel.readInt();
        this.f16130c = parcel.readInt();
        this.f16131d = parcel.readInt();
    }
}
