package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cn implements Parcelable {
    public static final Parcelable.Creator<cn> CREATOR = new bn();

    /* renamed from: f, reason: collision with root package name */
    public final int f3874f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3875g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3876h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f3877i;

    /* renamed from: j, reason: collision with root package name */
    private int f3878j;

    public cn(int i7, int i8, int i9, byte[] bArr) {
        this.f3874f = i7;
        this.f3875g = i8;
        this.f3876h = i9;
        this.f3877i = bArr;
    }

    cn(Parcel parcel) {
        this.f3874f = parcel.readInt();
        this.f3875g = parcel.readInt();
        this.f3876h = parcel.readInt();
        this.f3877i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cn.class == obj.getClass()) {
            cn cnVar = (cn) obj;
            if (this.f3874f == cnVar.f3874f && this.f3875g == cnVar.f3875g && this.f3876h == cnVar.f3876h && Arrays.equals(this.f3877i, cnVar.f3877i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f3878j;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = ((((((this.f3874f + 527) * 31) + this.f3875g) * 31) + this.f3876h) * 31) + Arrays.hashCode(this.f3877i);
        this.f3878j = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i7 = this.f3874f;
        int i8 = this.f3875g;
        int i9 = this.f3876h;
        boolean z6 = this.f3877i != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i7);
        sb.append(", ");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f3874f);
        parcel.writeInt(this.f3875g);
        parcel.writeInt(this.f3876h);
        parcel.writeInt(this.f3877i != null ? 1 : 0);
        byte[] bArr = this.f3877i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
