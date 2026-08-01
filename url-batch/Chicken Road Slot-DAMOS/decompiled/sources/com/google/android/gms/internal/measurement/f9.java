package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f9 extends k1 {
    private static final f9 zzg;
    private static volatile j2 zzh;
    private int zzb;
    private int zze = 1;
    private t1 zzf = m2.f2524s;

    static {
        f9 f9Var = new f9();
        zzg = f9Var;
        k1.o(f9.class, f9Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", l0.f2483l, "zzf", x8.class});
        }
        if (i10 == 3) {
            return new f9();
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
        synchronized (f9.class) {
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
}
