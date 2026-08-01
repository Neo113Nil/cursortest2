package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class tb extends k1 {
    private static final tb zzf;
    private static volatile j2 zzg;
    private int zzb;
    private boolean zze;

    static {
        tb tbVar = new tb();
        zzf = tbVar;
        k1.o(tb.class, tbVar);
    }

    public static tb u() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i10 == 3) {
            return new tb();
        }
        if (i10 == 4) {
            return new n7(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzg;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (tb.class) {
            try {
                j2Var = zzg;
                if (j2Var == null) {
                    j2Var = new j1(zzf);
                    zzg = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final boolean t() {
        return this.zze;
    }
}
