package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class af4 implements b81 {
    public static final Parcelable.Creator<af4> CREATOR = new ze4();

    /* renamed from: f, reason: collision with root package name */
    public final int f2749f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2750g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2751h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2752i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2753j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2754k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2755l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f2756m;

    public af4(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f2749f = i7;
        this.f2750g = str;
        this.f2751h = str2;
        this.f2752i = i8;
        this.f2753j = i9;
        this.f2754k = i10;
        this.f2755l = i11;
        this.f2756m = bArr;
    }

    af4(Parcel parcel) {
        this.f2749f = parcel.readInt();
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f2750g = readString;
        this.f2751h = parcel.readString();
        this.f2752i = parcel.readInt();
        this.f2753j = parcel.readInt();
        this.f2754k = parcel.readInt();
        this.f2755l = parcel.readInt();
        this.f2756m = (byte[]) n13.c(parcel.createByteArray());
    }

    @Override // com.google.android.gms.internal.ads.b81
    public final void b(ds dsVar) {
        dsVar.k(this.f2756m, this.f2749f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af4.class == obj.getClass()) {
            af4 af4Var = (af4) obj;
            if (this.f2749f == af4Var.f2749f && this.f2750g.equals(af4Var.f2750g) && this.f2751h.equals(af4Var.f2751h) && this.f2752i == af4Var.f2752i && this.f2753j == af4Var.f2753j && this.f2754k == af4Var.f2754k && this.f2755l == af4Var.f2755l && Arrays.equals(this.f2756m, af4Var.f2756m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f2749f + 527) * 31) + this.f2750g.hashCode()) * 31) + this.f2751h.hashCode()) * 31) + this.f2752i) * 31) + this.f2753j) * 31) + this.f2754k) * 31) + this.f2755l) * 31) + Arrays.hashCode(this.f2756m);
    }

    public final String toString() {
        String str = this.f2750g;
        String str2 = this.f2751h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f2749f);
        parcel.writeString(this.f2750g);
        parcel.writeString(this.f2751h);
        parcel.writeInt(this.f2752i);
        parcel.writeInt(this.f2753j);
        parcel.writeInt(this.f2754k);
        parcel.writeInt(this.f2755l);
        parcel.writeByteArray(this.f2756m);
    }
}
