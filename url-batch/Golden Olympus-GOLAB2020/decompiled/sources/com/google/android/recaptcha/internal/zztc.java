package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zztc extends zznd implements zzoj {
    private static final zztc zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zznd.zzI(zztc.class, zztcVar);
    }

    private zztc() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i4, Object obj, Object obj2) {
        zzoq zzoqVar;
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new zztc();
        }
        zztj zztjVar = null;
        if (i5 == 4) {
            return new zztb(zztjVar);
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
        synchronized (zztc.class) {
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
