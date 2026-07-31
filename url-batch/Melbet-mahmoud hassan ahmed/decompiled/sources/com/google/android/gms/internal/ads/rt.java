package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rt extends aq3<rt, qt> implements lr3 {
    private static final rt zzb;
    private int zze;
    private int zzf = 1000;
    private int zzg = 1000;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private tt zzp;

    static {
        rt rtVar = new rt();
        zzb = rtVar;
        aq3.v(rt.class, rtVar);
    }

    private rt() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            eq3 eq3Var = ns.f9273a;
            return aq3.u(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zze", "zzf", eq3Var, "zzg", eq3Var, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i8 == 3) {
            return new rt();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new qt(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
