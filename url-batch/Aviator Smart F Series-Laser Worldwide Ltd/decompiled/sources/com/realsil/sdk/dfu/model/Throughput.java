package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes4.dex */
public class Throughput implements Parcelable {
    public static final Parcelable.Creator<Throughput> CREATOR = new Parcelable.Creator<Throughput>() { // from class: com.realsil.sdk.dfu.model.Throughput.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Throughput createFromParcel(Parcel parcel) {
            return new Throughput(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Throughput[] newArray(int i8) {
            return new Throughput[i8];
        }
    };
    public long dataSize;
    public long deltaTime;
    public long packetSize;
    public float realSpeed;
    public float speed;

    public Throughput(long j8, long j9) {
        this(j8, j9, 0L, 0.0f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "packetSize=%d, deltaTime=%d ms, speed=%f, realSpeed=%f", Long.valueOf(this.packetSize), Long.valueOf(this.deltaTime), Float.valueOf(this.speed), Float.valueOf(this.realSpeed));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.packetSize);
        parcel.writeLong(this.dataSize);
        parcel.writeLong(this.deltaTime);
        parcel.writeFloat(this.speed);
        parcel.writeFloat(this.realSpeed);
    }

    public Throughput(long j8, long j9, long j10, float f8) {
        this(j8, j9, j10, f8, 0.0f);
    }

    public Throughput(long j8, long j9, long j10, float f8, float f9) {
        this.packetSize = j8;
        this.dataSize = j9;
        this.deltaTime = j10;
        this.speed = f8;
        this.realSpeed = f9;
    }

    public Throughput(Parcel parcel) {
        this.packetSize = parcel.readLong();
        this.dataSize = parcel.readLong();
        this.deltaTime = parcel.readLong();
        this.speed = parcel.readFloat();
        this.realSpeed = parcel.readFloat();
    }
}
