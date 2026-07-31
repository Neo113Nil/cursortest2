package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lr extends aq3<lr, kr> implements lr3 {
    private static final lr zzb;
    private int zze;
    private int zzf;
    private bs zzh;
    private es zzi;
    private gs zzk;
    private rt zzl;
    private ht zzm;
    private us zzn;
    private ws zzo;
    private int zzg = 1000;
    private jq3<zr> zzj = aq3.r();
    private jq3<du> zzp = aq3.r();

    static {
        lr lrVar = new lr();
        zzb = lrVar;
        aq3.v(lr.class, lrVar);
    }

    private lr() {
    }

    public static lr G() {
        return zzb;
    }

    static /* synthetic */ void I(lr lrVar, jr jrVar) {
        lrVar.zzf = jrVar.zza();
        lrVar.zze |= 1;
    }

    static /* synthetic */ void J(lr lrVar, es esVar) {
        esVar.getClass();
        lrVar.zzi = esVar;
        lrVar.zze |= 8;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", jr.d(), "zzg", ns.f9273a, "zzh", "zzi", "zzj", zr.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", du.class});
        }
        if (i8 == 3) {
            return new lr();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new kr(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final es H() {
        es esVar = this.zzi;
        return esVar == null ? es.G() : esVar;
    }
}
