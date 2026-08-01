package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s7 extends k1 {
    private static final s7 zzh;
    private static volatile j2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        s7 s7Var = new s7();
        zzh = s7Var;
        k1.o(s7.class, s7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", l0.f2479f, "zzf", l0.f2478e, "zzg", l0.g});
        }
        if (i10 == 3) {
            return new s7();
        }
        if (i10 == 4) {
            return new n7(zzh);
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
        synchronized (s7.class) {
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

    public final int t() {
        int a9 = g1.a(this.zze);
        if (a9 == 0) {
            return 1;
        }
        return a9;
    }

    public final int u() {
        int i3;
        int i10 = this.zzf;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                i3 = i10 != 2 ? 0 : 3;
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int v() {
        int i3;
        int i10 = this.zzg;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                i3 = i10 != 2 ? 0 : 3;
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
