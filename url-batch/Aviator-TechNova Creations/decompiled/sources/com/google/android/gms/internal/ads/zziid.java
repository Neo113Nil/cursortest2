package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zziid extends zzibr implements zzidd {
    private static final zziid zzh;
    private static volatile zzidk zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zzibz zzd = zzbC();
    private zzicd zzf = zzbM();
    private zzian zzg = zzian.zza;

    static {
        zziid zziidVar = new zziid();
        zzh = zziidVar;
        zzibr.zzbu(zziid.class, zziidVar);
    }

    private zziid() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zziib.class, "zzg"});
        }
        if (ordinal == 3) {
            return new zziid();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziic(bArr);
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
        synchronized (zziid.class) {
            zzidkVar = zzi;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzh);
                zzi = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
