package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.realsil.sdk.dfu.i.a;
import java.util.Locale;

/* loaded from: classes4.dex */
public class ImageVersionInfo implements Parcelable {
    public static final Parcelable.Creator<ImageVersionInfo> CREATOR = new Parcelable.Creator<ImageVersionInfo>() { // from class: com.realsil.sdk.dfu.model.ImageVersionInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageVersionInfo createFromParcel(Parcel parcel) {
            return new ImageVersionInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ImageVersionInfo[] newArray(int i8) {
            return new ImageVersionInfo[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public int f16222a;

    /* renamed from: b, reason: collision with root package name */
    public int f16223b;

    /* renamed from: c, reason: collision with root package name */
    public int f16224c;

    /* renamed from: d, reason: collision with root package name */
    public long f16225d;

    /* renamed from: e, reason: collision with root package name */
    public int f16226e;

    public ImageVersionInfo(int i8, int i9, long j8, int i10) {
        this.f16222a = i8;
        this.f16224c = i9;
        this.f16225d = j8;
        this.f16226e = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBitNumber() {
        return this.f16222a;
    }

    public int getImageId() {
        return this.f16223b;
    }

    public int getIndication() {
        return this.f16224c;
    }

    public int getSectionSize() {
        return this.f16226e;
    }

    public long getVersion() {
        return this.f16225d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(String.format(locale, "bitNumber=%d, imageId=0x%04X", Integer.valueOf(this.f16222a), Integer.valueOf(this.f16223b)));
        sb.append(String.format(",indication=0x%02X", Integer.valueOf(this.f16224c)));
        sb.append(String.format(locale, ", version=0x%08X(%d), sectionSize=0x%08X(%d)", Long.valueOf(this.f16225d), Long.valueOf(this.f16225d), Integer.valueOf(this.f16226e), Integer.valueOf(this.f16226e)));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f16222a);
        parcel.writeInt(this.f16223b);
        parcel.writeInt(this.f16224c);
        parcel.writeLong(this.f16225d);
        parcel.writeInt(this.f16226e);
    }

    public ImageVersionInfo(int i8, int i9, long j8, int i10, int i11) {
        this.f16222a = i8;
        this.f16224c = i9;
        this.f16225d = j8;
        this.f16226e = i10;
        this.f16223b = i11;
    }

    public ImageVersionInfo(Parcel parcel) {
        this.f16225d = a.INVALID_VERSION_32;
        this.f16226e = 0;
        this.f16222a = parcel.readInt();
        this.f16223b = parcel.readInt();
        this.f16224c = parcel.readInt();
        this.f16225d = parcel.readLong();
        this.f16226e = parcel.readInt();
    }
}
