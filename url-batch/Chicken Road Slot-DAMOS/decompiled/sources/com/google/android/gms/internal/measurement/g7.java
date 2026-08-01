package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g7 extends k1 {
    private static final g7 zzi;
    private static volatile j2 zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        g7 g7Var = new g7();
        zzi = g7Var;
        k1.o(g7.class, g7Var);
    }

    public static f7 t() {
        return (f7) zzi.j();
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new g7();
        }
        if (i10 == 4) {
            return new f7(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzj;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (g7.class) {
            try {
                j2Var = zzj;
                if (j2Var == null) {
                    j2Var = new j1(zzi);
                    zzj = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final /* synthetic */ void u(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void v() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
