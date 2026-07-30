package com.crrepa.x1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes3.dex */
public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final String f14031e = "watchfaceFile";

    /* renamed from: a, reason: collision with root package name */
    private String f14032a;

    /* renamed from: b, reason: collision with root package name */
    private String f14033b;

    /* renamed from: c, reason: collision with root package name */
    private String f14034c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f14035d;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i8) {
            return new i[i8];
        }
    }

    protected i(Parcel parcel) {
        this.f14032a = parcel.readString();
        this.f14035d = parcel.createByteArray();
        this.f14033b = parcel.readString();
        this.f14034c = parcel.readString();
    }

    public void a() {
        int a8 = com.crrepa.x1.a.a(this.f14035d);
        byte[] bArr = this.f14035d;
        byte[] bArr2 = new byte[bArr.length + 4];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        j.a(a8, bArr2, this.f14035d.length);
        this.f14035d = bArr2;
    }

    public byte[] b() {
        return this.f14035d;
    }

    public String c() {
        return this.f14034c;
    }

    public String d() {
        return this.f14032a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
        int length = this.f14035d.length;
        int i8 = length % 4;
        if (i8 == 0) {
            return;
        }
        int i9 = 4 - i8;
        byte[] bArr = new byte[length + i9];
        byte[] bArr2 = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr2[i10] = 0;
        }
        System.arraycopy(this.f14035d, 0, bArr, 0, length);
        System.arraycopy(bArr2, 0, bArr, length, i9);
        this.f14035d = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f14032a);
        parcel.writeByteArray(this.f14035d);
        parcel.writeString(this.f14033b);
        parcel.writeString(this.f14034c);
    }

    public i(String str, byte[] bArr) {
        this.f14032a = str;
        this.f14035d = bArr;
    }

    public void a(int i8) {
        byte b8;
        int length = this.f14035d.length;
        int i9 = length % 4;
        if (i8 == 5) {
            Log.d(f14031e, "align with 0x20");
            b8 = 32;
        } else {
            b8 = 0;
        }
        if (i9 == 0) {
            return;
        }
        int i10 = 4 - i9;
        byte[] bArr = new byte[length + i10];
        byte[] bArr2 = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr2[i11] = b8;
        }
        System.arraycopy(this.f14035d, 0, bArr, 0, length);
        System.arraycopy(bArr2, 0, bArr, length, i10);
        this.f14035d = bArr;
    }

    public i(String str, byte[] bArr, String str2) {
        this.f14032a = str;
        this.f14035d = bArr;
        this.f14033b = str2;
        int indexOf = str2.indexOf(".");
        if (indexOf == -1) {
            this.f14034c = "any";
            return;
        }
        String substring = str2.substring(indexOf + 1);
        this.f14034c = substring;
        substring.toLowerCase();
    }

    public void a(byte[] bArr) {
        this.f14035d = bArr;
    }
}
