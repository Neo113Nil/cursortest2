package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nr extends aq3<nr, mr> implements lr3 {
    private static final nr zzb;
    private int zze;
    private int zzf;
    private rr zzg;
    private tr zzh;

    static {
        nr nrVar = new nr();
        zzb = nrVar;
        aq3.v(nr.class, nrVar);
    }

    private nr() {
    }

    public static mr F() {
        return zzb.x();
    }

    static /* synthetic */ void H(nr nrVar, rr rrVar) {
        rrVar.getClass();
        nrVar.zzg = rrVar;
        nrVar.zze |= 2;
    }

    static /* synthetic */ void I(nr nrVar, tr trVar) {
        trVar.getClass();
        nrVar.zzh = trVar;
        nrVar.zze |= 4;
    }

    static /* synthetic */ void J(nr nrVar, int i7) {
        nrVar.zzf = 1;
        nrVar.zze = 1 | nrVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", pr.f10335a, "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new nr();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new mr(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
