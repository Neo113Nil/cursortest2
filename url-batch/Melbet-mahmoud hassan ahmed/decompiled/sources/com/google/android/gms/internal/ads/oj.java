package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oj extends sj {
    public static final Parcelable.Creator<oj> CREATOR = new nj();

    /* renamed from: g, reason: collision with root package name */
    public final String f9684g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9685h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9686i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f9687j;

    oj(Parcel parcel) {
        super("APIC");
        this.f9684g = parcel.readString();
        this.f9685h = parcel.readString();
        this.f9686i = parcel.readInt();
        this.f9687j = parcel.createByteArray();
    }

    public oj(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f9684g = str;
        this.f9685h = null;
        this.f9686i = 3;
        this.f9687j = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oj.class == obj.getClass()) {
            oj ojVar = (oj) obj;
            if (this.f9686i == ojVar.f9686i && zm.o(this.f9684g, ojVar.f9684g) && zm.o(this.f9685h, ojVar.f9685h) && Arrays.equals(this.f9687j, ojVar.f9687j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (this.f9686i + 527) * 31;
        String str = this.f9684g;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9685h;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9687j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9684g);
        parcel.writeString(this.f9685h);
        parcel.writeInt(this.f9686i);
        parcel.writeByteArray(this.f9687j);
    }
}
