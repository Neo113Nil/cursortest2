package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j9 extends k1 {
    private static final j9 zzg;
    private static volatile j2 zzh;
    private int zzb;
    private int zze;
    private s1 zzf = z1.f3030s;

    static {
        j9 j9Var = new j9();
        zzg = j9Var;
        k1.o(j9.class, j9Var);
    }

    public static i9 y() {
        return (i9) zzg.j();
    }

    public final void A(List list) {
        RandomAccess randomAccess = this.zzf;
        if (!((p0) randomAccess).f2659d) {
            z1 z1Var = (z1) randomAccess;
            int i3 = z1Var.f3032i;
            this.zzf = z1Var.j(i3 + i3);
        }
        o0.d(list, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new j9();
        }
        if (i10 == 4) {
            return new i9(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzh;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (j9.class) {
            try {
                j2Var = zzh;
                if (j2Var == null) {
                    j2Var = new j1(zzg);
                    zzh = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final int u() {
        return this.zze;
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return ((z1) this.zzf).size();
    }

    public final long x(int i3) {
        return ((z1) this.zzf).c(i3);
    }

    public final /* synthetic */ void z(int i3) {
        this.zzb |= 1;
        this.zze = i3;
    }
}
