package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c9 extends k1 {
    private static final c9 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private t1 zze = m2.f2524s;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        c9 c9Var = new c9();
        zzi = c9Var;
        k1.o(c9.class, c9Var);
    }

    public static b9 A() {
        return (b9) zzi.j();
    }

    public static b9 B(c9 c9Var) {
        i1 j = zzi.j();
        j.e(c9Var);
        return (b9) j;
    }

    public final /* synthetic */ void C(int i3, e9 e9Var) {
        I();
        this.zze.set(i3, e9Var);
    }

    public final /* synthetic */ void D(e9 e9Var) {
        I();
        this.zze.add(e9Var);
    }

    public final /* synthetic */ void E(ArrayList arrayList) {
        I();
        o0.d(arrayList, this.zze);
    }

    public final void F() {
        this.zze = m2.f2524s;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void I() {
        t1 t1Var = this.zze;
        if (((p0) t1Var).f2659d) {
            return;
        }
        this.zze = v4.a.g(t1Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", e9.class, "zzf", "zzg", "zzh", l0.f2482k});
        }
        if (i10 == 3) {
            return new c9();
        }
        if (i10 == 4) {
            return new b9(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzj;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (c9.class) {
            try {
                j2Var = zzj;
                if (j2Var == null) {
                    j2Var = new j1(zzi);
                    zzj = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final e9 v(int i3) {
        return (e9) this.zze.get(i3);
    }

    public final boolean w() {
        return (this.zzb & 1) != 0;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zzb & 2) != 0;
    }

    public final String z() {
        return this.zzg;
    }
}
