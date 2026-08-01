package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfkr extends zzgwm implements zzgxx {
    private static final zzfkr zzb;
    private int zzd;
    private zzfkn zze;

    static {
        zzfkr zzfkrVar = new zzfkr();
        zzb = zzfkrVar;
        zzgwm.zzaU(zzfkr.class, zzfkrVar);
    }

    private zzfkr() {
    }

    public static zzfkq zza() {
        return (zzfkq) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfkr zzfkrVar, zzfkn zzfknVar) {
        zzfknVar.getClass();
        zzfkrVar.zze = zzfknVar;
        zzfkrVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzfkr();
        }
        zzfko zzfkoVar = null;
        if (i2 == 4) {
            return new zzfkq(zzfkoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
