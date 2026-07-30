package com.realsil.sdk.dfu.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.k.a;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BinParameters implements Parcelable {
    public static final Parcelable.Creator<BinParameters> CREATOR;
    public static final byte[] FILTER_INDICATOR_ALL = new byte[16];
    public static final int[] SORT_REFERENCE_ALL;
    public static final int STORAGE_TYPE_ASSETS = 1;
    public static final int STORAGE_TYPE_SDCARD = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f16114a;

    /* renamed from: b, reason: collision with root package name */
    public String f16115b;

    /* renamed from: c, reason: collision with root package name */
    public String f16116c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16117d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f16118e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16119f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f16120g;

    public static final class Builder {

        /* renamed from: b, reason: collision with root package name */
        public String f16122b;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f16125e;

        /* renamed from: g, reason: collision with root package name */
        public int[] f16127g;

        /* renamed from: a, reason: collision with root package name */
        public int f16121a = 0;

        /* renamed from: c, reason: collision with root package name */
        public String f16123c = a.FILE_SUFFIX;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16124d = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16126f = false;

        public BinParameters build() {
            return new BinParameters(this.f16121a, this.f16122b, this.f16123c, this.f16124d, this.f16125e, this.f16126f, this.f16127g);
        }

        public Builder filePath(String str) {
            this.f16122b = str;
            return this;
        }

        public Builder filter(boolean z7, byte[] bArr) {
            this.f16124d = z7;
            this.f16125e = bArr;
            return this;
        }

        public Builder sort(boolean z7, int[] iArr) {
            this.f16126f = z7;
            this.f16127g = iArr;
            return this;
        }

        public Builder storageType(int i8) {
            this.f16121a = i8;
            return this;
        }

        public Builder suffix(String str) {
            this.f16123c = str;
            return this;
        }
    }

    static {
        for (int i8 = 0; i8 < 16; i8++) {
            FILTER_INDICATOR_ALL[i8] = -1;
        }
        SORT_REFERENCE_ALL = new int[128];
        for (int i9 = 0; i9 < 128; i9++) {
            SORT_REFERENCE_ALL[i9] = (byte) (i9 & 255);
        }
        CREATOR = new Parcelable.Creator<BinParameters>() { // from class: com.realsil.sdk.dfu.model.BinParameters.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BinParameters createFromParcel(Parcel parcel) {
                return new BinParameters(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BinParameters[] newArray(int i10) {
                return new BinParameters[i10];
            }
        };
    }

    public BinParameters(int i8, String str, String str2, boolean z7, byte[] bArr, boolean z8, int[] iArr) {
        this.f16114a = i8;
        this.f16115b = str;
        this.f16116c = str2;
        this.f16117d = z7;
        this.f16118e = bArr;
        this.f16119f = z8;
        this.f16120g = iArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFilePath() {
        return this.f16115b;
    }

    public byte[] getFilterIndicator() {
        return this.f16118e;
    }

    public int[] getSortReference() {
        return this.f16120g;
    }

    public int getStorageType() {
        return this.f16114a;
    }

    public String getSuffix() {
        return this.f16116c;
    }

    public boolean isFilterEnabled() {
        return this.f16117d;
    }

    public boolean isSortEnabled() {
        return this.f16119f;
    }

    public void setFilePath(String str) {
        this.f16115b = str;
    }

    public void setSuffix(String str) {
        this.f16116c = str;
    }

    public String toString() {
        return "BinParameters {" + String.format(Locale.US, "\n\tstorageType=%d,path=%s,suffix=%s\n", Integer.valueOf(this.f16114a), this.f16115b, this.f16116c) + String.format("\n\tfilterEnabled=%b,filterIndicator=%s", Boolean.valueOf(this.f16117d), DataConverter.bytes2Hex(this.f16118e)) + String.format("\n\tsortEnabled=%b,sortReference=%s", Boolean.valueOf(this.f16119f), Arrays.toString(this.f16120g)) + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f16114a);
        parcel.writeString(this.f16115b);
        parcel.writeString(this.f16116c);
        parcel.writeByte(this.f16117d ? (byte) 1 : (byte) 0);
        parcel.writeByteArray(this.f16118e);
        parcel.writeByte(this.f16119f ? (byte) 1 : (byte) 0);
        parcel.writeIntArray(this.f16120g);
    }

    public BinParameters(Parcel parcel) {
        this.f16114a = 0;
        this.f16116c = a.FILE_SUFFIX;
        this.f16117d = false;
        this.f16119f = false;
        this.f16114a = parcel.readInt();
        this.f16115b = parcel.readString();
        this.f16116c = parcel.readString();
        this.f16117d = parcel.readByte() != 0;
        this.f16118e = parcel.createByteArray();
        this.f16119f = parcel.readByte() != 0;
        this.f16120g = parcel.createIntArray();
    }
}
