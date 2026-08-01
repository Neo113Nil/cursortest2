package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b8 extends k1 {
    private static final b8 zze;
    private static volatile j2 zzf;
    private t1 zzb = m2.f2524s;

    static {
        b8 b8Var = new b8();
        zze = b8Var;
        k1.o(b8.class, b8Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i10 == 3) {
            return new b8();
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
        synchronized (b8.class) {
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
}
