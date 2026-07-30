package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r01 {
    public final Context a;
    public final Object b;
    public final at2 c;
    public final Bitmap.Config d;
    public final s32 e;
    public final List f;
    public final ts1 g;
    public final mx0 h;
    public final ns2 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final kr n;
    public final kr o;
    public final kr p;
    public final t40 q;
    public final t40 r;
    public final t40 s;
    public final t40 t;
    public final ad1 u;
    public final sl2 v;
    public final me2 w;
    public final gz1 x;
    public final l90 y;
    public final r80 z;

    public r01(Context context, Object obj, at2 at2Var, Bitmap.Config config, s32 s32Var, List list, ts1 ts1Var, mx0 mx0Var, ns2 ns2Var, boolean z, boolean z2, boolean z3, boolean z4, kr krVar, kr krVar2, kr krVar3, t40 t40Var, t40 t40Var2, t40 t40Var3, t40 t40Var4, ad1 ad1Var, sl2 sl2Var, me2 me2Var, gz1 gz1Var, l90 l90Var, r80 r80Var) {
        this.a = context;
        this.b = obj;
        this.c = at2Var;
        this.d = config;
        this.e = s32Var;
        this.f = list;
        this.g = ts1Var;
        this.h = mx0Var;
        this.i = ns2Var;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = krVar;
        this.o = krVar2;
        this.p = krVar3;
        this.q = t40Var;
        this.r = t40Var2;
        this.s = t40Var3;
        this.t = t40Var4;
        this.u = ad1Var;
        this.v = sl2Var;
        this.w = me2Var;
        this.x = gz1Var;
        this.y = l90Var;
        this.z = r80Var;
    }

    public static q01 a(r01 r01Var) {
        Context context = r01Var.a;
        r01Var.getClass();
        return new q01(r01Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01)) {
            return false;
        }
        r01 r01Var = (r01) obj;
        return Intrinsics.b(this.a, r01Var.a) && this.b.equals(r01Var.b) && Intrinsics.b(this.c, r01Var.c) && this.d == r01Var.d && this.e == r01Var.e && Intrinsics.b(this.f, r01Var.f) && Intrinsics.b(this.g, r01Var.g) && Intrinsics.b(this.h, r01Var.h) && Intrinsics.b(this.i, r01Var.i) && this.j == r01Var.j && this.k == r01Var.k && this.l == r01Var.l && this.m == r01Var.m && this.n == r01Var.n && this.o == r01Var.o && this.p == r01Var.p && Intrinsics.b(this.q, r01Var.q) && Intrinsics.b(this.r, r01Var.r) && Intrinsics.b(this.s, r01Var.s) && Intrinsics.b(this.t, r01Var.t) && Intrinsics.b(this.u, r01Var.u) && this.v.equals(r01Var.v) && this.w == r01Var.w && Intrinsics.b(this.x, r01Var.x) && this.y.equals(r01Var.y) && Intrinsics.b(this.z, r01Var.z);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        at2 at2Var = this.c;
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (at2Var != null ? at2Var.hashCode() : 0)) * 923521)) * 961)) * 29791)) * 31;
        this.g.getClass();
        return this.z.hashCode() + ((this.y.hashCode() + ((this.x.m.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + in1.i(in1.i(in1.i(in1.i((this.i.a.hashCode() + ((((ts1.class.hashCode() + hashCode2) * 31) + Arrays.hashCode(this.h.m)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
