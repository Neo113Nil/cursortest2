package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r9 extends k1 {
    private static final r9 zzk;
    private static volatile j2 zzl;
    private int zzb;
    private int zze;
    private t1 zzf = m2.f2524s;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        r9 r9Var = new r9();
        zzk = r9Var;
        k1.o(r9.class, r9Var);
    }

    public final double A() {
        return this.zzj;
    }

    public final int B() {
        int i3;
        int i10 = this.zze;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i3 = 4;
                    if (i10 != 3) {
                        i3 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i3 = 3;
                }
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", l0.f2487p, "zzf", r9.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new r9();
        }
        if (i10 == 4) {
            return new n7(zzk);
        }
        if (i10 == 5) {
            return zzk;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzl;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (r9.class) {
            try {
                j2Var = zzl;
                if (j2Var == null) {
                    j2Var = new j1(zzk);
                    zzl = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final List t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final String w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zzb & 16) != 0;
    }
}
