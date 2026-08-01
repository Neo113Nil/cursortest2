package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w7 extends k1 {
    private static final w7 zzh;
    private static volatile j2 zzi;
    private int zzb;
    private String zze = "";
    private t1 zzf = m2.f2524s;
    private boolean zzg;

    static {
        w7 w7Var = new w7();
        zzh = w7Var;
        k1.o(w7.class, w7Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", d8.class, "zzg"});
        }
        if (i10 == 3) {
            return new w7();
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
        synchronized (w7.class) {
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

    public final String t() {
        return this.zze;
    }
}
