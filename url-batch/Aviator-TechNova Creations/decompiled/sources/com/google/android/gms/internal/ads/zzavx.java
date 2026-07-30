package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzavx extends zzibr implements zzidd {
    private static final zzavx zzh;
    private static volatile zzidk zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzavx zzavxVar = new zzavx();
        zzh = zzavxVar;
        zzibr.zzbu(zzavx.class, zzavxVar);
    }

    private zzavx() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzavx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzavw(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzi;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzavx.class) {
            zzidkVar = zzi;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzh);
                zzi = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
