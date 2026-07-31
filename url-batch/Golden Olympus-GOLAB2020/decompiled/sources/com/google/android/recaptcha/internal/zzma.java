package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzma extends zzna implements zzoj {
    private static final zzma zzd;
    private static volatile zzoq zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private byte zzm = 2;

    static {
        zzma zzmaVar = new zzma();
        zzd = zzmaVar;
        zznd.zzI(zzma.class, zzmaVar);
    }

    private zzma() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i4, Object obj, Object obj2) {
        zzoq zzoqVar;
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i5 == 2) {
            return new zzou(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zzf", "zzg", zzlv.zza, "zzh", zzlu.zza, "zzi", zzly.zza, "zzj", zzlz.zza, "zzk", zzlx.zza, "zzl", zzlw.zza});
        }
        if (i5 == 3) {
            return new zzma();
        }
        zzmh zzmhVar = null;
        if (i5 == 4) {
            return new zzlt(zzmhVar);
        }
        if (i5 == 5) {
            return zzd;
        }
        if (i5 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzoqVar2 = zze;
        if (zzoqVar2 != null) {
            return zzoqVar2;
        }
        synchronized (zzma.class) {
            try {
                zzoqVar = zze;
                if (zzoqVar == null) {
                    zzoqVar = new zzmy(zzd);
                    zze = zzoqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzoqVar;
    }
}
