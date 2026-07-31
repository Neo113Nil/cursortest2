package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends wf4 {
    public static final Parcelable.Creator<c> CREATOR = new bg4();

    /* renamed from: g, reason: collision with root package name */
    public final String f3647g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f3648h;

    c(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f3647g = readString;
        this.f3648h = (byte[]) n13.c(parcel.createByteArray());
    }

    public c(String str, byte[] bArr) {
        super("PRIV");
        this.f3647g = str;
        this.f3648h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (n13.p(this.f3647g, cVar.f3647g) && Arrays.equals(this.f3648h, cVar.f3648h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3647g;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f3648h);
    }

    @Override // com.google.android.gms.internal.ads.wf4
    public final String toString() {
        String str = this.f13818f;
        String str2 = this.f3647g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f3647g);
        parcel.writeByteArray(this.f3648h);
    }
}
