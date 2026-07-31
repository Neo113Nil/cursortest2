package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzti extends zznd implements zzoj {
    private static final zzti zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();
    private int zzf;

    static {
        zzti zztiVar = new zzti();
        zzb = zztiVar;
        zznd.zzI(zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zztf zzf() {
        return (zztf) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzti zztiVar, Iterable iterable) {
        zztiVar.zzl();
        zzko.zzc(iterable, zztiVar.zze);
    }

    static /* synthetic */ void zzj(zzti zztiVar, zzth zzthVar) {
        zzthVar.getClass();
        zztiVar.zzl();
        zztiVar.zze.add(zzthVar);
    }

    private final void zzl() {
        zznk zznkVar = this.zze;
        if (zznkVar.zzc()) {
            return;
        }
        this.zze = zznd.zzC(zznkVar);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i4, Object obj, Object obj2) {
        zzoq zzoqVar;
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzth.class, "zzf"});
        }
        if (i5 == 3) {
            return new zzti();
        }
        zztj zztjVar = null;
        if (i5 == 4) {
            return new zztf(zztjVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        if (i5 != 6) {
            return null;
        }
        zzoq zzoqVar2 = zzd;
        if (zzoqVar2 != null) {
            return zzoqVar2;
        }
        synchronized (zzti.class) {
            try {
                zzoqVar = zzd;
                if (zzoqVar == null) {
                    zzoqVar = new zzmy(zzb);
                    zzd = zzoqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzoqVar;
    }
}
