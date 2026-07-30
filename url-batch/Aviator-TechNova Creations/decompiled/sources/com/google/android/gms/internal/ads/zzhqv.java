package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhqv extends zzibr implements zzidd {
    private static final zzhqv zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhqx zzc;

    static {
        zzhqv zzhqvVar = new zzhqv();
        zzd = zzhqvVar;
        zzibr.zzbu(zzhqv.class, zzhqvVar);
    }

    private zzhqv() {
    }

    public static zzhqv zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqv) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqu zzd() {
        return (zzhqu) zzd.zzbn();
    }

    public static zzidk zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqx zzb() {
        zzhqx zzhqxVar = this.zzc;
        return zzhqxVar == null ? zzhqx.zze() : zzhqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhqv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqu(bArr);
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
        synchronized (zzhqv.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzg(zzhqx zzhqxVar) {
        zzhqxVar.getClass();
        this.zzc = zzhqxVar;
        this.zza |= 1;
    }
}
