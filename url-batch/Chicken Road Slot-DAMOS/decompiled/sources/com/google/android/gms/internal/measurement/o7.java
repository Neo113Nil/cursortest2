package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o7 extends k1 {
    private static final o7 zzj;
    private static volatile j2 zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        o7 o7Var = new o7();
        zzj = o7Var;
        k1.o(o7.class, o7Var);
    }

    public static o7 C() {
        return zzj;
    }

    public final boolean A() {
        return (this.zzb & 16) != 0;
    }

    public final String B() {
        return this.zzi;
    }

    public final int D() {
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
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", l0.f2476c, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new o7();
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
        synchronized (o7.class) {
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

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final String x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final String z() {
        return this.zzh;
    }
}
