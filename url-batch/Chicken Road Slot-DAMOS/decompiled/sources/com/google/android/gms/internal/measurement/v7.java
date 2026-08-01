package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v7 extends k1 {
    private static final v7 zzj;
    private static volatile j2 zzk;
    private int zzb;
    private t1 zze;
    private t1 zzf;
    private t1 zzg;
    private boolean zzh;
    private t1 zzi;

    static {
        v7 v7Var = new v7();
        zzj = v7Var;
        k1.o(v7.class, v7Var);
    }

    public v7() {
        m2 m2Var = m2.f2524s;
        this.zze = m2Var;
        this.zzf = m2Var;
        this.zzg = m2Var;
        this.zzi = m2Var;
    }

    public static v7 z() {
        return zzj;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", s7.class, "zzf", t7.class, "zzg", u7.class, "zzh", "zzi", s7.class});
        }
        if (i10 == 3) {
            return new v7();
        }
        if (i10 == 4) {
            return new n7(zzj);
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
        synchronized (v7.class) {
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

    public final List t() {
        return this.zze;
    }

    public final List u() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 1) != 0;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final t1 y() {
        return this.zzi;
    }
}
