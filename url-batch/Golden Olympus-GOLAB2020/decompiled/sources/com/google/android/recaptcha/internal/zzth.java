package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzth extends zznd implements zzoj {
    private static final zzth zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzth zzthVar = new zzth();
        zzb = zzthVar;
        zznd.zzI(zzth.class, zzthVar);
    }

    private zzth() {
    }

    static /* synthetic */ void zzM(zzth zzthVar, float f4) {
        zzthVar.zze = 9;
        zzthVar.zzf = Float.valueOf(f4);
    }

    static /* synthetic */ void zzN(zzth zzthVar, int i4) {
        zzthVar.zze = 4;
        zzthVar.zzf = Integer.valueOf(i4);
    }

    static /* synthetic */ void zzO(zzth zzthVar, int i4) {
        zzthVar.zze = 5;
        zzthVar.zzf = Integer.valueOf(i4);
    }

    static /* synthetic */ void zzP(zzth zzthVar, long j4) {
        zzthVar.zze = 7;
        zzthVar.zzf = Long.valueOf(j4);
    }

    static /* synthetic */ void zzQ(zzth zzthVar, String str) {
        str.getClass();
        zzthVar.zze = 11;
        zzthVar.zzf = str;
    }

    public static zztg zzf() {
        return (zztg) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzth zzthVar, boolean z4) {
        zzthVar.zze = 1;
        zzthVar.zzf = Boolean.valueOf(z4);
    }

    static /* synthetic */ void zzj(zzth zzthVar, zzle zzleVar) {
        zzthVar.zze = 2;
        zzthVar.zzf = zzleVar;
    }

    static /* synthetic */ void zzk(zzth zzthVar, String str) {
        str.getClass();
        zzthVar.zze = 3;
        zzthVar.zzf = str;
    }

    static /* synthetic */ void zzl(zzth zzthVar, double d4) {
        zzthVar.zze = 10;
        zzthVar.zzf = Double.valueOf(d4);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i4, Object obj, Object obj2) {
        zzoq zzoqVar;
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        }
        if (i5 == 3) {
            return new zzth();
        }
        zztj zztjVar = null;
        if (i5 == 4) {
            return new zztg(zztjVar);
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
        synchronized (zzth.class) {
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
