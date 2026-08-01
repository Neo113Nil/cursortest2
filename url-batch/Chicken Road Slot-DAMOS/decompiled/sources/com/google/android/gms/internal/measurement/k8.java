package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k8 extends k1 {
    private static final k8 zzl;
    private static volatile j2 zzm;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        k8 k8Var = new k8();
        zzl = k8Var;
        k1.o(k8.class, k8Var);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new k8();
        }
        if (i10 == 4) {
            return new n7(zzl);
        }
        if (i10 == 5) {
            return zzl;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzm;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (k8.class) {
            try {
                j2Var = zzm;
                if (j2Var == null) {
                    j2Var = new j1(zzl);
                    zzm = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }
}
