package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h2 implements o2 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f2362a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f2363b;

    public h2(h1 h1Var, o0 o0Var) {
        h1 h1Var2 = d1.f2211a;
        this.f2363b = h1Var;
        this.f2362a = o0Var;
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final k1 a() {
        o0 o0Var = this.f2362a;
        if (o0Var instanceof k1) {
            return ((k1) o0Var).i();
        }
        i1 i1Var = (i1) ((k1) o0Var).s(5);
        boolean g = i1Var.f2389e.g();
        k1 k1Var = i1Var.f2389e;
        if (!g) {
            return k1Var;
        }
        k1Var.getClass();
        l2.f2493c.a(k1Var.getClass()).h(k1Var);
        k1Var.h();
        return i1Var.f2389e;
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final int b(o0 o0Var) {
        u2 u2Var = ((k1) o0Var).zzc;
        int i3 = u2Var.f2841d;
        if (i3 != -1) {
            return i3;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < u2Var.f2838a; i11++) {
            int i12 = u2Var.f2839b[i11] >>> 3;
            v0 v0Var = (v0) u2Var.f2840c[i11];
            int a9 = b1.a(8);
            int a10 = b1.a(i12) + b1.a(16);
            int a11 = b1.a(24);
            int c10 = v0Var.c();
            i10 += a9 + a9 + a10 + v4.a.d(c10, c10, a11);
        }
        u2Var.f2841d = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void c(Object obj, byte[] bArr, int i3, int i10, r0 r0Var) {
        k1 k1Var = (k1) obj;
        if (k1Var.zzc == u2.f2837f) {
            k1Var.zzc = u2.a();
        }
        throw n0.l.e(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void d(Object obj, Object obj2) {
        p2.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void e(Object obj, v5 v5Var) {
        throw n0.l.e(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void f(Object obj, androidx.datastore.preferences.protobuf.j jVar, c1 c1Var) {
        this.f2363b.getClass();
        h1.g(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final boolean g(Object obj) {
        throw n0.l.e(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void h(Object obj) {
        this.f2363b.getClass();
        u2 u2Var = ((k1) obj).zzc;
        if (u2Var.f2842e) {
            u2Var.f2842e = false;
        }
        h1 h1Var = d1.f2211a;
        throw n0.l.e(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final boolean i(k1 k1Var, k1 k1Var2) {
        return k1Var.zzc.equals(k1Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final int j(k1 k1Var) {
        return k1Var.zzc.hashCode();
    }
}
