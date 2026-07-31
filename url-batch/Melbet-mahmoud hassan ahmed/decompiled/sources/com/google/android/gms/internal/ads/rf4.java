package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rf4 extends wf4 {
    public static final Parcelable.Creator<rf4> CREATOR = new qf4();

    /* renamed from: g, reason: collision with root package name */
    public final String f11141g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11142h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11143i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f11144j;

    rf4(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f11141g = readString;
        this.f11142h = parcel.readString();
        this.f11143i = parcel.readString();
        this.f11144j = (byte[]) n13.c(parcel.createByteArray());
    }

    public rf4(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f11141g = str;
        this.f11142h = str2;
        this.f11143i = str3;
        this.f11144j = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rf4.class == obj.getClass()) {
            rf4 rf4Var = (rf4) obj;
            if (n13.p(this.f11141g, rf4Var.f11141g) && n13.p(this.f11142h, rf4Var.f11142h) && n13.p(this.f11143i, rf4Var.f11143i) && Arrays.equals(this.f11144j, rf4Var.f11144j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11141g;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11142h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11143i;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f11144j);
    }

    @Override // com.google.android.gms.internal.ads.wf4
    public final String toString() {
        String str = this.f13818f;
        String str2 = this.f11141g;
        String str3 = this.f11142h;
        String str4 = this.f11143i;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11141g);
        parcel.writeString(this.f11142h);
        parcel.writeString(this.f11143i);
        parcel.writeByteArray(this.f11144j);
    }
}
