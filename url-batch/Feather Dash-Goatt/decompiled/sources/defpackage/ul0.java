package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ul0 extends t0 {
    public static final Parcelable.Creator<ul0> CREATOR = new g2(13);
    public final int d;
    public final int e;
    public final int g;
    public final long h;
    public final long i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;

    public ul0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.d = i;
        this.e = i2;
        this.g = i3;
        this.h = j;
        this.i = j2;
        this.j = str;
        this.k = str2;
        this.l = i4;
        this.m = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.R(parcel, 2, 4);
        parcel.writeInt(this.e);
        y90.R(parcel, 3, 4);
        parcel.writeInt(this.g);
        y90.R(parcel, 4, 8);
        parcel.writeLong(this.h);
        y90.R(parcel, 5, 8);
        parcel.writeLong(this.i);
        y90.M(parcel, 6, this.j);
        y90.M(parcel, 7, this.k);
        y90.R(parcel, 8, 4);
        parcel.writeInt(this.l);
        y90.R(parcel, 9, 4);
        parcel.writeInt(this.m);
        y90.Q(parcel, P);
    }
}
