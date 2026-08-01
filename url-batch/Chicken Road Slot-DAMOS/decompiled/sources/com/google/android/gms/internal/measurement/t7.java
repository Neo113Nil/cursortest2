package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t7 extends k1 {
    private static final t7 zzg;
    private static volatile j2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        t7 t7Var = new t7();
        zzg = t7Var;
        k1.o(t7.class, t7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            l0 l0Var = l0.f2479f;
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", l0Var, "zzf", l0Var});
        }
        if (i10 == 3) {
            return new t7();
        }
        if (i10 == 4) {
            return new n7(zzg);
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
        synchronized (t7.class) {
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

    public final int t() {
        int a9 = g1.a(this.zze);
        if (a9 == 0) {
            return 1;
        }
        return a9;
    }

    public final int u() {
        int a9 = g1.a(this.zzf);
        if (a9 == 0) {
            return 1;
        }
        return a9;
    }
}
