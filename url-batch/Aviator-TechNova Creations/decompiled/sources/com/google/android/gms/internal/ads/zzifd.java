package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzifd extends zzibr implements zzidd {
    private static final zzifd zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = "";
    private zzibz zzc = zzbC();

    static {
        zzifd zzifdVar = new zzifd();
        zzd = zzifdVar;
        zzibr.zzbu(zzifd.class, zzifdVar);
    }

    private zzifd() {
    }

    public static zzifc zzc() {
        return (zzifc) zzd.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzifd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzifc(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zze;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzifd.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = 15;
    }
}
