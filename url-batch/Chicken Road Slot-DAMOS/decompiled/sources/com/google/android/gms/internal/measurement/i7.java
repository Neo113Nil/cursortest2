package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i7 extends k1 {
    private static final i7 zzj;
    private static volatile j2 zzk;
    private int zzb;
    private int zze;
    private t1 zzf;
    private t1 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        i7 i7Var = new i7();
        zzj = i7Var;
        k1.o(i7.class, i7Var);
    }

    public i7() {
        m2 m2Var = m2.f2524s;
        this.zzf = m2Var;
        this.zzg = m2Var;
    }

    public final k7 A(int i3) {
        return (k7) this.zzg.get(i3);
    }

    public final void B(int i3, q7 q7Var) {
        t1 t1Var = this.zzf;
        if (!((p0) t1Var).f2659d) {
            this.zzf = v4.a.g(t1Var);
        }
        this.zzf.set(i3, q7Var);
    }

    public final void C(int i3, k7 k7Var) {
        t1 t1Var = this.zzg;
        if (!((p0) t1Var).f2659d) {
            this.zzg = v4.a.g(t1Var);
        }
        this.zzg.set(i3, k7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", q7.class, "zzg", k7.class, "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new i7();
        }
        if (i10 == 4) {
            return new h7(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzk;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (i7.class) {
            try {
                j2Var = zzk;
                if (j2Var == null) {
                    j2Var = new j1(zzj);
                    zzk = j2Var;
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
        return this.zzf.size();
    }

    public final q7 x(int i3) {
        return (q7) this.zzf.get(i3);
    }

    public final t1 y() {
        return this.zzg;
    }

    public final int z() {
        return this.zzg.size();
    }
}
