package q2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class d1 extends P2.a {
    public static final Parcelable.Creator<d1> CREATOR = new C4894i0(8);

    /* renamed from: A, reason: collision with root package name */
    public final boolean f40008A;

    /* renamed from: B, reason: collision with root package name */
    public final String f40009B;

    /* renamed from: C, reason: collision with root package name */
    public final Y0 f40010C;

    /* renamed from: D, reason: collision with root package name */
    public final Location f40011D;

    /* renamed from: E, reason: collision with root package name */
    public final String f40012E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f40013F;

    /* renamed from: G, reason: collision with root package name */
    public final Bundle f40014G;

    /* renamed from: H, reason: collision with root package name */
    public final List f40015H;

    /* renamed from: I, reason: collision with root package name */
    public final String f40016I;
    public final String J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f40017K;

    /* renamed from: L, reason: collision with root package name */
    public final O f40018L;

    /* renamed from: M, reason: collision with root package name */
    public final int f40019M;

    /* renamed from: N, reason: collision with root package name */
    public final String f40020N;

    /* renamed from: O, reason: collision with root package name */
    public final List f40021O;

    /* renamed from: P, reason: collision with root package name */
    public final int f40022P;

    /* renamed from: Q, reason: collision with root package name */
    public final String f40023Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f40024R;

    /* renamed from: S, reason: collision with root package name */
    public final long f40025S;

    /* renamed from: T, reason: collision with root package name */
    public final long f40026T;

    /* renamed from: U, reason: collision with root package name */
    public final int f40027U;

    /* renamed from: V, reason: collision with root package name */
    public final Bundle f40028V = new Bundle();

    /* renamed from: n, reason: collision with root package name */
    public final int f40029n;

    /* renamed from: u, reason: collision with root package name */
    public final long f40030u;

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f40031v;

    /* renamed from: w, reason: collision with root package name */
    public final int f40032w;

    /* renamed from: x, reason: collision with root package name */
    public final List f40033x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f40034y;

    /* renamed from: z, reason: collision with root package name */
    public final int f40035z;

    public d1(int i, long j9, Bundle bundle, int i4, List list, boolean z8, int i9, boolean z9, String str, Y0 y02, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z10, O o9, int i10, String str5, List list3, int i11, String str6, int i12, long j10, long j11, int i13) {
        this.f40029n = i;
        this.f40030u = j9;
        this.f40031v = bundle == null ? new Bundle() : bundle;
        this.f40032w = i4;
        this.f40033x = list;
        this.f40034y = z8;
        this.f40035z = i9;
        this.f40008A = z9;
        this.f40009B = str;
        this.f40010C = y02;
        this.f40011D = location;
        this.f40012E = str2;
        this.f40013F = bundle2 == null ? new Bundle() : bundle2;
        this.f40014G = bundle3;
        this.f40015H = list2;
        this.f40016I = str3;
        this.J = str4;
        this.f40017K = z10;
        this.f40018L = o9;
        this.f40019M = i10;
        this.f40020N = str5;
        this.f40021O = list3 == null ? new ArrayList() : list3;
        this.f40022P = i11;
        this.f40023Q = str6;
        this.f40024R = i12;
        this.f40025S = j10;
        this.f40026T = j11;
        this.f40027U = i13;
    }

    public final boolean a(d1 d1Var) {
        if (d1Var == null) {
            return false;
        }
        return this.f40029n == d1Var.f40029n && this.f40030u == d1Var.f40030u && Z5.c.q(this.f40031v, d1Var.f40031v) && this.f40032w == d1Var.f40032w && O2.w.l(this.f40033x, d1Var.f40033x) && this.f40034y == d1Var.f40034y && this.f40035z == d1Var.f40035z && this.f40008A == d1Var.f40008A && O2.w.l(this.f40009B, d1Var.f40009B) && O2.w.l(this.f40010C, d1Var.f40010C) && O2.w.l(this.f40011D, d1Var.f40011D) && O2.w.l(this.f40012E, d1Var.f40012E) && Z5.c.q(this.f40013F, d1Var.f40013F) && Z5.c.q(this.f40014G, d1Var.f40014G) && O2.w.l(this.f40015H, d1Var.f40015H) && O2.w.l(this.f40016I, d1Var.f40016I) && O2.w.l(this.J, d1Var.J) && this.f40017K == d1Var.f40017K && this.f40019M == d1Var.f40019M && O2.w.l(this.f40020N, d1Var.f40020N) && O2.w.l(this.f40021O, d1Var.f40021O) && this.f40022P == d1Var.f40022P && O2.w.l(this.f40023Q, d1Var.f40023Q) && this.f40024R == d1Var.f40024R && this.f40027U == d1Var.f40027U;
    }

    public final boolean b() {
        Bundle bundle = this.f40031v;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d1) {
            return a((d1) obj) && this.f40025S == ((d1) obj).f40025S;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f40029n), Long.valueOf(this.f40030u), this.f40031v, Integer.valueOf(this.f40032w), this.f40033x, Boolean.valueOf(this.f40034y), Integer.valueOf(this.f40035z), Boolean.valueOf(this.f40008A), this.f40009B, this.f40010C, this.f40011D, this.f40012E, this.f40013F, this.f40014G, this.f40015H, this.f40016I, this.J, Boolean.valueOf(this.f40017K), Integer.valueOf(this.f40019M), this.f40020N, this.f40021O, Integer.valueOf(this.f40022P), this.f40023Q, Integer.valueOf(this.f40024R), Long.valueOf(this.f40025S), Long.valueOf(this.f40026T), Integer.valueOf(this.f40027U)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f40029n);
        S0.f.A(parcel, 2, 8);
        parcel.writeLong(this.f40030u);
        S0.f.q(parcel, 3, this.f40031v);
        S0.f.A(parcel, 4, 4);
        parcel.writeInt(this.f40032w);
        S0.f.w(parcel, 5, this.f40033x);
        S0.f.A(parcel, 6, 4);
        parcel.writeInt(this.f40034y ? 1 : 0);
        S0.f.A(parcel, 7, 4);
        parcel.writeInt(this.f40035z);
        S0.f.A(parcel, 8, 4);
        parcel.writeInt(this.f40008A ? 1 : 0);
        S0.f.u(parcel, 9, this.f40009B);
        S0.f.t(parcel, 10, this.f40010C, i);
        S0.f.t(parcel, 11, this.f40011D, i);
        S0.f.u(parcel, 12, this.f40012E);
        S0.f.q(parcel, 13, this.f40013F);
        S0.f.q(parcel, 14, this.f40014G);
        S0.f.w(parcel, 15, this.f40015H);
        S0.f.u(parcel, 16, this.f40016I);
        S0.f.u(parcel, 17, this.J);
        S0.f.A(parcel, 18, 4);
        parcel.writeInt(this.f40017K ? 1 : 0);
        S0.f.t(parcel, 19, this.f40018L, i);
        S0.f.A(parcel, 20, 4);
        parcel.writeInt(this.f40019M);
        S0.f.u(parcel, 21, this.f40020N);
        S0.f.w(parcel, 22, this.f40021O);
        S0.f.A(parcel, 23, 4);
        parcel.writeInt(this.f40022P);
        S0.f.u(parcel, 24, this.f40023Q);
        S0.f.A(parcel, 25, 4);
        parcel.writeInt(this.f40024R);
        S0.f.A(parcel, 26, 8);
        parcel.writeLong(this.f40025S);
        S0.f.A(parcel, 27, 8);
        parcel.writeLong(this.f40026T);
        S0.f.A(parcel, 28, 4);
        parcel.writeInt(this.f40027U);
        S0.f.C(parcel, B8);
    }
}
