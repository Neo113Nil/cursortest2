package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xe4 implements b81 {
    public static final Parcelable.Creator<xe4> CREATOR;

    /* renamed from: l, reason: collision with root package name */
    private static final c0 f14184l;

    /* renamed from: m, reason: collision with root package name */
    private static final c0 f14185m;

    /* renamed from: f, reason: collision with root package name */
    public final String f14186f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14187g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14188h;

    /* renamed from: i, reason: collision with root package name */
    public final long f14189i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f14190j;

    /* renamed from: k, reason: collision with root package name */
    private int f14191k;

    static {
        bf4 bf4Var = new bf4();
        bf4Var.s("application/id3");
        f14184l = bf4Var.y();
        bf4 bf4Var2 = new bf4();
        bf4Var2.s("application/x-scte35");
        f14185m = bf4Var2.y();
        CREATOR = new we4();
    }

    xe4(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f14186f = readString;
        this.f14187g = parcel.readString();
        this.f14188h = parcel.readLong();
        this.f14189i = parcel.readLong();
        this.f14190j = (byte[]) n13.c(parcel.createByteArray());
    }

    public xe4(String str, String str2, long j7, long j8, byte[] bArr) {
        this.f14186f = str;
        this.f14187g = str2;
        this.f14188h = j7;
        this.f14189i = j8;
        this.f14190j = bArr;
    }

    @Override // com.google.android.gms.internal.ads.b81
    public final /* synthetic */ void b(ds dsVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xe4.class == obj.getClass()) {
            xe4 xe4Var = (xe4) obj;
            if (this.f14188h == xe4Var.f14188h && this.f14189i == xe4Var.f14189i && n13.p(this.f14186f, xe4Var.f14186f) && n13.p(this.f14187g, xe4Var.f14187g) && Arrays.equals(this.f14190j, xe4Var.f14190j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f14191k;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f14186f;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f14187g;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j7 = this.f14188h;
        long j8 = this.f14189i;
        int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31) + Arrays.hashCode(this.f14190j);
        this.f14191k = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        String str = this.f14186f;
        long j7 = this.f14189i;
        long j8 = this.f14188h;
        String str2 = this.f14187g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j7);
        sb.append(", durationMs=");
        sb.append(j8);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14186f);
        parcel.writeString(this.f14187g);
        parcel.writeLong(this.f14188h);
        parcel.writeLong(this.f14189i);
        parcel.writeByteArray(this.f14190j);
    }
}
