package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nl1 extends i1 {
    public static final Parcelable.Creator<nl1> CREATOR = new va3(1);
    public final int m;
    public final int n;
    public final int o;
    public final long p;
    public final long q;
    public final String r;
    public final String s;
    public final int t;
    public final int u;

    public nl1(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = j;
        this.q = j2;
        this.r = str;
        this.s = str2;
        this.t = i4;
        this.u = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.d0(parcel, 2, 4);
        parcel.writeInt(this.n);
        yk3.d0(parcel, 3, 4);
        parcel.writeInt(this.o);
        yk3.d0(parcel, 4, 8);
        parcel.writeLong(this.p);
        yk3.d0(parcel, 5, 8);
        parcel.writeLong(this.q);
        yk3.W(parcel, 6, this.r);
        yk3.W(parcel, 7, this.s);
        yk3.d0(parcel, 8, 4);
        parcel.writeInt(this.t);
        yk3.d0(parcel, 9, 4);
        parcel.writeInt(this.u);
        yk3.c0(parcel, b0);
    }
}
