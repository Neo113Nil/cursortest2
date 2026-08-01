package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgsv extends zzgwm implements zzgxx {
    private static final zzgsv zzb;
    private String zzd = "";
    private zzgwv zze = zzaN();

    static {
        zzgsv zzgsvVar = new zzgsv();
        zzb = zzgsvVar;
        zzgwm.zzaU(zzgsv.class, zzgsvVar);
    }

    private zzgsv() {
    }

    public static zzgsv zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgru.class});
        }
        if (i2 == 3) {
            return new zzgsv();
        }
        zzgst zzgstVar = null;
        if (i2 == 4) {
            return new zzgsu(zzgstVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
