package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yb3 extends i1 {
    public static final Parcelable.Creator<yb3> CREATOR = new va3(6);
    public String m;
    public String n;
    public tq3 o;
    public long p;
    public boolean q;
    public String r;
    public final kd3 s;
    public long t;
    public kd3 u;
    public final long v;
    public final kd3 w;

    public yb3(yb3 yb3Var) {
        ll3.v(yb3Var);
        this.m = yb3Var.m;
        this.n = yb3Var.n;
        this.o = yb3Var.o;
        this.p = yb3Var.p;
        this.q = yb3Var.q;
        this.r = yb3Var.r;
        this.s = yb3Var.s;
        this.t = yb3Var.t;
        this.u = yb3Var.u;
        this.v = yb3Var.v;
        this.w = yb3Var.w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.W(parcel, 2, this.m);
        yk3.W(parcel, 3, this.n);
        yk3.V(parcel, 4, this.o, i);
        long j = this.p;
        yk3.d0(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.q;
        yk3.d0(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        yk3.W(parcel, 7, this.r);
        yk3.V(parcel, 8, this.s, i);
        long j2 = this.t;
        yk3.d0(parcel, 9, 8);
        parcel.writeLong(j2);
        yk3.V(parcel, 10, this.u, i);
        yk3.d0(parcel, 11, 8);
        parcel.writeLong(this.v);
        yk3.V(parcel, 12, this.w, i);
        yk3.c0(parcel, b0);
    }

    public yb3(String str, String str2, tq3 tq3Var, long j, boolean z, String str3, kd3 kd3Var, long j2, kd3 kd3Var2, long j3, kd3 kd3Var3) {
        this.m = str;
        this.n = str2;
        this.o = tq3Var;
        this.p = j;
        this.q = z;
        this.r = str3;
        this.s = kd3Var;
        this.t = j2;
        this.u = kd3Var2;
        this.v = j3;
        this.w = kd3Var3;
    }
}
