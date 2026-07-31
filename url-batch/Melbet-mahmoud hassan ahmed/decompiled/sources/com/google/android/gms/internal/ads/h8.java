package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class h8 extends aq3<h8, g8> implements lr3 {
    private static final h8 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        h8 h8Var = new h8();
        zzb = h8Var;
        aq3.v(h8.class, h8Var);
    }

    private h8() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new h8();
        }
        a8 a8Var = null;
        if (i8 == 4) {
            return new g8(a8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
