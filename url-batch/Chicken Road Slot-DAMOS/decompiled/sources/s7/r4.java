package s7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r4 extends d7.a {
    public static final Parcelable.Creator<r4> CREATOR = new c7.p(22);
    public final int A;
    public final boolean B;
    public final boolean C;
    public final Boolean D;
    public final long E;
    public final List F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final long K;
    public final int L;
    public final String M;
    public final int N;
    public final long O;
    public final String P;
    public final String Q;
    public final long R;
    public final int S;
    public final long T;

    /* renamed from: d, reason: collision with root package name */
    public final String f8976d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8977e;

    /* renamed from: i, reason: collision with root package name */
    public final String f8978i;

    /* renamed from: r, reason: collision with root package name */
    public final String f8979r;

    /* renamed from: s, reason: collision with root package name */
    public final long f8980s;

    /* renamed from: t, reason: collision with root package name */
    public final long f8981t;

    /* renamed from: u, reason: collision with root package name */
    public final String f8982u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8983v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f8984w;

    /* renamed from: x, reason: collision with root package name */
    public final long f8985x;

    /* renamed from: y, reason: collision with root package name */
    public final String f8986y;

    /* renamed from: z, reason: collision with root package name */
    public final long f8987z;

    public r4(String str, String str2, String str3, long j, String str4, long j3, long j10, String str5, boolean z10, boolean z11, String str6, long j11, int i3, boolean z12, boolean z13, Boolean bool, long j12, List list, String str7, String str8, String str9, boolean z14, long j13, int i10, String str10, int i11, long j14, String str11, String str12, long j15, int i12, long j16) {
        c7.c0.d(str);
        this.f8976d = str;
        this.f8977e = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f8978i = str3;
        this.f8985x = j;
        this.f8979r = str4;
        this.f8980s = j3;
        this.f8981t = j10;
        this.f8982u = str5;
        this.f8983v = z10;
        this.f8984w = z11;
        this.f8986y = str6;
        this.f8987z = j11;
        this.A = i3;
        this.B = z12;
        this.C = z13;
        this.D = bool;
        this.E = j12;
        this.F = list;
        this.G = str7;
        this.H = str8;
        this.I = str9;
        this.J = z14;
        this.K = j13;
        this.L = i10;
        this.M = str10;
        this.N = i11;
        this.O = j14;
        this.P = str11;
        this.Q = str12;
        this.R = j15;
        this.S = i12;
        this.T = j16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 2, this.f8976d);
        cf.c.V(parcel, 3, this.f8977e);
        cf.c.V(parcel, 4, this.f8978i);
        cf.c.V(parcel, 5, this.f8979r);
        cf.c.Y(parcel, 6, 8);
        parcel.writeLong(this.f8980s);
        cf.c.Y(parcel, 7, 8);
        parcel.writeLong(this.f8981t);
        cf.c.V(parcel, 8, this.f8982u);
        cf.c.Y(parcel, 9, 4);
        parcel.writeInt(this.f8983v ? 1 : 0);
        cf.c.Y(parcel, 10, 4);
        parcel.writeInt(this.f8984w ? 1 : 0);
        cf.c.Y(parcel, 11, 8);
        parcel.writeLong(this.f8985x);
        cf.c.V(parcel, 12, this.f8986y);
        cf.c.Y(parcel, 14, 8);
        parcel.writeLong(this.f8987z);
        cf.c.Y(parcel, 15, 4);
        parcel.writeInt(this.A);
        cf.c.Y(parcel, 16, 4);
        parcel.writeInt(this.B ? 1 : 0);
        cf.c.Y(parcel, 18, 4);
        parcel.writeInt(this.C ? 1 : 0);
        Boolean bool = this.D;
        if (bool != null) {
            cf.c.Y(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        cf.c.Y(parcel, 22, 8);
        parcel.writeLong(this.E);
        List<String> list = this.F;
        if (list != null) {
            int Z2 = cf.c.Z(parcel, 23);
            parcel.writeStringList(list);
            cf.c.a0(parcel, Z2);
        }
        cf.c.V(parcel, 25, this.G);
        cf.c.V(parcel, 26, this.H);
        cf.c.V(parcel, 27, this.I);
        cf.c.Y(parcel, 28, 4);
        parcel.writeInt(this.J ? 1 : 0);
        cf.c.Y(parcel, 29, 8);
        parcel.writeLong(this.K);
        cf.c.Y(parcel, 30, 4);
        parcel.writeInt(this.L);
        cf.c.V(parcel, 31, this.M);
        cf.c.Y(parcel, 32, 4);
        parcel.writeInt(this.N);
        cf.c.Y(parcel, 34, 8);
        parcel.writeLong(this.O);
        cf.c.V(parcel, 35, this.P);
        cf.c.V(parcel, 36, this.Q);
        cf.c.Y(parcel, 37, 8);
        parcel.writeLong(this.R);
        cf.c.Y(parcel, 38, 4);
        parcel.writeInt(this.S);
        cf.c.Y(parcel, 39, 8);
        parcel.writeLong(this.T);
        cf.c.a0(parcel, Z);
    }

    public r4(String str, String str2, String str3, String str4, long j, long j3, String str5, boolean z10, boolean z11, long j10, String str6, long j11, int i3, boolean z12, boolean z13, Boolean bool, long j12, ArrayList arrayList, String str7, String str8, String str9, boolean z14, long j13, int i10, String str10, int i11, long j14, String str11, String str12, long j15, int i12, long j16) {
        this.f8976d = str;
        this.f8977e = str2;
        this.f8978i = str3;
        this.f8985x = j10;
        this.f8979r = str4;
        this.f8980s = j;
        this.f8981t = j3;
        this.f8982u = str5;
        this.f8983v = z10;
        this.f8984w = z11;
        this.f8986y = str6;
        this.f8987z = j11;
        this.A = i3;
        this.B = z12;
        this.C = z13;
        this.D = bool;
        this.E = j12;
        this.F = arrayList;
        this.G = str7;
        this.H = str8;
        this.I = str9;
        this.J = z14;
        this.K = j13;
        this.L = i10;
        this.M = str10;
        this.N = i11;
        this.O = j14;
        this.P = str11;
        this.Q = str12;
        this.R = j15;
        this.S = i12;
        this.T = j16;
    }
}
