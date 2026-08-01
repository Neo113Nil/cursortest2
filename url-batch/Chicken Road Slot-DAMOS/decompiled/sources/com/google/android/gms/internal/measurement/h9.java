package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h9 extends k1 {
    private static final h9 zzh;
    private static volatile j2 zzi;
    private s1 zzb;
    private s1 zze;
    private t1 zzf;
    private t1 zzg;

    static {
        h9 h9Var = new h9();
        zzh = h9Var;
        k1.o(h9.class, h9Var);
    }

    public h9() {
        z1 z1Var = z1.f3030s;
        this.zzb = z1Var;
        this.zze = z1Var;
        m2 m2Var = m2.f2524s;
        this.zzf = m2Var;
        this.zzg = m2Var;
    }

    public static g9 B() {
        return (g9) zzh.j();
    }

    public static h9 C() {
        return zzh;
    }

    public final int A() {
        return this.zzg.size();
    }

    public final void D(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((p0) randomAccess).f2659d) {
            z1 z1Var = (z1) randomAccess;
            int i3 = z1Var.f3032i;
            this.zzb = z1Var.j(i3 + i3);
        }
        o0.d(iterable, this.zzb);
    }

    public final void E() {
        this.zzb = z1.f3030s;
    }

    public final void F(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((p0) randomAccess).f2659d) {
            z1 z1Var = (z1) randomAccess;
            int i3 = z1Var.f3032i;
            this.zze = z1Var.j(i3 + i3);
        }
        o0.d(list, this.zze);
    }

    public final void G() {
        this.zze = z1.f3030s;
    }

    public final void H(ArrayList arrayList) {
        t1 t1Var = this.zzf;
        if (!((p0) t1Var).f2659d) {
            this.zzf = v4.a.g(t1Var);
        }
        o0.d(arrayList, this.zzf);
    }

    public final void I() {
        this.zzf = m2.f2524s;
    }

    public final void J(Iterable iterable) {
        t1 t1Var = this.zzg;
        if (!((p0) t1Var).f2659d) {
            this.zzg = v4.a.g(t1Var);
        }
        o0.d(iterable, this.zzg);
    }

    public final void K() {
        this.zzg = m2.f2524s;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", u8.class, "zzg", j9.class});
        }
        if (i10 == 3) {
            return new h9();
        }
        if (i10 == 4) {
            return new g9(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzi;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (h9.class) {
            try {
                j2Var = zzi;
                if (j2Var == null) {
                    j2Var = new j1(zzh);
                    zzi = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final List t() {
        return this.zzb;
    }

    public final int u() {
        return ((z1) this.zzb).size();
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return ((z1) this.zze).size();
    }

    public final t1 x() {
        return this.zzf;
    }

    public final int y() {
        return this.zzf.size();
    }

    public final t1 z() {
        return this.zzg;
    }
}
