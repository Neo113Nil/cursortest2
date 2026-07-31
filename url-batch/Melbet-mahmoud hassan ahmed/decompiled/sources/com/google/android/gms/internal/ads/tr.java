package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tr extends aq3<tr, sr> implements lr3 {
    private static final tr zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        tr trVar = new tr();
        zzb = trVar;
        aq3.v(tr.class, trVar);
    }

    private tr() {
    }

    public static sr F() {
        return zzb.x();
    }

    static /* synthetic */ void H(tr trVar, boolean z6) {
        trVar.zze |= 1;
        trVar.zzf = z6;
    }

    static /* synthetic */ void I(tr trVar, boolean z6) {
        trVar.zze |= 2;
        trVar.zzg = z6;
    }

    static /* synthetic */ void J(tr trVar, int i7) {
        trVar.zze |= 4;
        trVar.zzh = i7;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new tr();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new sr(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
