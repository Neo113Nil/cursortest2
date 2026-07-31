package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ag4 extends wf4 {
    public static final Parcelable.Creator<ag4> CREATOR = new zf4();

    /* renamed from: g, reason: collision with root package name */
    public final int f2762g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2763h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2764i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2765j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f2766k;

    public ag4(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f2762g = i7;
        this.f2763h = i8;
        this.f2764i = i9;
        this.f2765j = iArr;
        this.f2766k = iArr2;
    }

    ag4(Parcel parcel) {
        super("MLLT");
        this.f2762g = parcel.readInt();
        this.f2763h = parcel.readInt();
        this.f2764i = parcel.readInt();
        this.f2765j = (int[]) n13.c(parcel.createIntArray());
        this.f2766k = (int[]) n13.c(parcel.createIntArray());
    }

    @Override // com.google.android.gms.internal.ads.wf4, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ag4.class == obj.getClass()) {
            ag4 ag4Var = (ag4) obj;
            if (this.f2762g == ag4Var.f2762g && this.f2763h == ag4Var.f2763h && this.f2764i == ag4Var.f2764i && Arrays.equals(this.f2765j, ag4Var.f2765j) && Arrays.equals(this.f2766k, ag4Var.f2766k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f2762g + 527) * 31) + this.f2763h) * 31) + this.f2764i) * 31) + Arrays.hashCode(this.f2765j)) * 31) + Arrays.hashCode(this.f2766k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f2762g);
        parcel.writeInt(this.f2763h);
        parcel.writeInt(this.f2764i);
        parcel.writeIntArray(this.f2765j);
        parcel.writeIntArray(this.f2766k);
    }
}
