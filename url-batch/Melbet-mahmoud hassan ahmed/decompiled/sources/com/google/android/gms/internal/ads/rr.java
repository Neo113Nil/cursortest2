package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rr extends aq3<rr, qr> implements lr3 {
    private static final rr zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        rr rrVar = new rr();
        zzb = rrVar;
        aq3.v(rr.class, rrVar);
    }

    private rr() {
    }

    public static qr F() {
        return zzb.x();
    }

    public static rr H() {
        return zzb;
    }

    static /* synthetic */ void I(rr rrVar, boolean z6) {
        rrVar.zze |= 1;
        rrVar.zzf = z6;
    }

    static /* synthetic */ void J(rr rrVar, int i7) {
        rrVar.zze |= 2;
        rrVar.zzg = i7;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new rr();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new qr(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
