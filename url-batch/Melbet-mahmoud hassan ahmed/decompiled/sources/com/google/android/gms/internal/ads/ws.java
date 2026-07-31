package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ws extends aq3<ws, vs> implements lr3 {
    private static final ws zzb;
    private int zze;
    private ss zzf;
    private jq3<xt> zzg = aq3.r();
    private int zzh;
    private zt zzi;

    static {
        ws wsVar = new ws();
        zzb = wsVar;
        aq3.v(ws.class, wsVar);
    }

    private ws() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", xt.class, "zzh", ns.f9273a, "zzi"});
        }
        if (i8 == 3) {
            return new ws();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new vs(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
