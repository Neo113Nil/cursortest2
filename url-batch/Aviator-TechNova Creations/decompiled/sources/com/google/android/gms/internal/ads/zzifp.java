package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzifp extends zzibr implements zzidd {
    private static final zzifp zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zzian zzd = zzian.zza;

    static {
        zzifp zzifpVar = new zzifp();
        zze = zzifpVar;
        zzibr.zzbu(zzifp.class, zzifpVar);
    }

    private zzifp() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzifo.zza, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzifp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzifn(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzf;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzifp.class) {
            zzidkVar = zzf;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zze);
                zzf = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
