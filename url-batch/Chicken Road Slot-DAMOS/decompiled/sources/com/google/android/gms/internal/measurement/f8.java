package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f8 extends k1 {
    private static final f8 zzj;
    private static volatile j2 zzk;
    private int zzb;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        f8 f8Var = new f8();
        zzj = f8Var;
        k1.o(f8.class, f8Var);
    }

    public static f8 v() {
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
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new f8();
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
        synchronized (f8.class) {
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

    public final int t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzi;
    }
}
