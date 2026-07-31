package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bs extends aq3<bs, as> implements lr3 {
    private static final bs zzb;
    private int zze;
    private String zzf = "";
    private jq3<zr> zzg = aq3.r();
    private int zzh;

    static {
        bs bsVar = new bs();
        zzb = bsVar;
        aq3.v(bs.class, bsVar);
    }

    private bs() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zr.class, "zzh", ns.f9273a});
        }
        if (i8 == 3) {
            return new bs();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new as(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
