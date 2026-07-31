package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class es extends aq3<es, cs> implements lr3 {
    private static final es zzb;
    private int zze;
    private String zzf = "";
    private jq3<zr> zzg = aq3.r();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        es esVar = new es();
        zzb = esVar;
        aq3.v(es.class, esVar);
    }

    private es() {
    }

    public static es G() {
        return zzb;
    }

    static /* synthetic */ void H(es esVar, String str) {
        str.getClass();
        esVar.zze |= 1;
        esVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            eq3 eq3Var = ns.f9273a;
            return aq3.u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", zr.class, "zzh", eq3Var, "zzi", eq3Var, "zzj", eq3Var});
        }
        if (i8 == 3) {
            return new es();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new cs(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
