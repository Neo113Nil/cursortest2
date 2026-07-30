package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cs3 extends i1 {
    public static final Parcelable.Creator<cs3> CREATOR = new va3(27);
    public final boolean A;
    public final Boolean B;
    public final long C;
    public final List D;
    public final String E;
    public final String F;
    public final String G;
    public final boolean H;
    public final long I;
    public final int J;
    public final String K;
    public final int L;
    public final long M;
    public final String N;
    public final String O;
    public final long P;
    public final int Q;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final long q;
    public final long r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final long v;
    public final String w;
    public final long x;
    public final int y;
    public final boolean z;

    public cs3(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        ll3.s(str);
        this.m = str;
        this.n = true == TextUtils.isEmpty(str2) ? null : str2;
        this.o = str3;
        this.v = j;
        this.p = str4;
        this.q = j2;
        this.r = j3;
        this.s = str5;
        this.t = z;
        this.u = z2;
        this.w = str6;
        this.x = j4;
        this.y = i;
        this.z = z3;
        this.A = z4;
        this.B = bool;
        this.C = j5;
        this.D = list;
        this.E = str7;
        this.F = str8;
        this.G = str9;
        this.H = z5;
        this.I = j6;
        this.J = i2;
        this.K = str10;
        this.L = i3;
        this.M = j7;
        this.N = str11;
        this.O = str12;
        this.P = j8;
        this.Q = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.W(parcel, 2, this.m);
        yk3.W(parcel, 3, this.n);
        yk3.W(parcel, 4, this.o);
        yk3.W(parcel, 5, this.p);
        yk3.d0(parcel, 6, 8);
        parcel.writeLong(this.q);
        yk3.d0(parcel, 7, 8);
        parcel.writeLong(this.r);
        yk3.W(parcel, 8, this.s);
        yk3.d0(parcel, 9, 4);
        parcel.writeInt(this.t ? 1 : 0);
        yk3.d0(parcel, 10, 4);
        parcel.writeInt(this.u ? 1 : 0);
        yk3.d0(parcel, 11, 8);
        parcel.writeLong(this.v);
        yk3.W(parcel, 12, this.w);
        yk3.d0(parcel, 14, 8);
        parcel.writeLong(this.x);
        yk3.d0(parcel, 15, 4);
        parcel.writeInt(this.y);
        yk3.d0(parcel, 16, 4);
        parcel.writeInt(this.z ? 1 : 0);
        yk3.d0(parcel, 18, 4);
        parcel.writeInt(this.A ? 1 : 0);
        Boolean bool = this.B;
        if (bool != null) {
            yk3.d0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        yk3.d0(parcel, 22, 8);
        parcel.writeLong(this.C);
        List<String> list = this.D;
        if (list != null) {
            int b02 = yk3.b0(parcel, 23);
            parcel.writeStringList(list);
            yk3.c0(parcel, b02);
        }
        yk3.W(parcel, 25, this.E);
        yk3.W(parcel, 26, this.F);
        yk3.W(parcel, 27, this.G);
        yk3.d0(parcel, 28, 4);
        parcel.writeInt(this.H ? 1 : 0);
        yk3.d0(parcel, 29, 8);
        parcel.writeLong(this.I);
        yk3.d0(parcel, 30, 4);
        parcel.writeInt(this.J);
        yk3.W(parcel, 31, this.K);
        yk3.d0(parcel, 32, 4);
        parcel.writeInt(this.L);
        yk3.d0(parcel, 34, 8);
        parcel.writeLong(this.M);
        yk3.W(parcel, 35, this.N);
        yk3.W(parcel, 36, this.O);
        yk3.d0(parcel, 37, 8);
        parcel.writeLong(this.P);
        yk3.d0(parcel, 38, 4);
        parcel.writeInt(this.Q);
        yk3.c0(parcel, b0);
    }

    public cs3(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.v = j3;
        this.p = str4;
        this.q = j;
        this.r = j2;
        this.s = str5;
        this.t = z;
        this.u = z2;
        this.w = str6;
        this.x = j4;
        this.y = i;
        this.z = z3;
        this.A = z4;
        this.B = bool;
        this.C = j5;
        this.D = arrayList;
        this.E = str7;
        this.F = str8;
        this.G = str9;
        this.H = z5;
        this.I = j6;
        this.J = i2;
        this.K = str10;
        this.L = i3;
        this.M = j7;
        this.N = str11;
        this.O = str12;
        this.P = j8;
        this.Q = i4;
    }
}
