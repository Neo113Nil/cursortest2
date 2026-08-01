package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o9 extends k1 {
    private static final o9 zze;
    private static volatile j2 zzf;
    private t1 zzb = m2.f2524s;

    static {
        o9 o9Var = new o9();
        zze = o9Var;
        k1.o(o9.class, o9Var);
    }

    public static o9 v() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", p9.class});
        }
        if (i10 == 3) {
            return new o9();
        }
        if (i10 == 4) {
            return new n7(zze);
        }
        if (i10 == 5) {
            return zze;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzf;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (o9.class) {
            try {
                j2Var = zzf;
                if (j2Var == null) {
                    j2Var = new j1(zze);
                    zzf = j2Var;
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
        return this.zzb.size();
    }
}
