package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class is extends aq3<is, hs> implements lr3 {
    private static final is zzb;
    private int zze;
    private zt zzg;
    private int zzh;
    private bu zzi;
    private int zzj;
    private String zzf = "";
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        is isVar = new is();
        zzb = isVar;
        aq3.v(is.class, isVar);
    }

    private is() {
    }

    public static is G() {
        return zzb;
    }

    static /* synthetic */ void H(is isVar, String str) {
        isVar.zze |= 1;
        isVar.zzf = str;
    }

    static /* synthetic */ void I(is isVar, bu buVar) {
        buVar.getClass();
        isVar.zzi = buVar;
        isVar.zze |= 8;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            eq3 eq3Var = ns.f9273a;
            return aq3.u(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", eq3Var, "zzl", eq3Var, "zzm", eq3Var});
        }
        if (i8 == 3) {
            return new is();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new hs(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
