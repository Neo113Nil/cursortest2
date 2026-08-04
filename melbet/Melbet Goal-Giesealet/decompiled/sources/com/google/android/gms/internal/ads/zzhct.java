package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhct extends zzhih implements zzhjt {
    private static final zzhct zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhcx zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhct zzhctVar = new zzhct();
        zze = zzhctVar;
        zzhih.zzbu(zzhct.class, zzhctVar);
    }

    private zzhct() {
    }

    public static zzhct zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhct) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhcs zze() {
        return (zzhcs) zze.zzbn();
    }

    public static zzhka zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhcx zzb() {
        zzhcx zzhcxVar = this.zzc;
        return zzhcxVar == null ? zzhcx.zzc() : zzhcxVar;
    }

    public final zzhhb zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhct();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhcs(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzf;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhct.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzh(zzhcx zzhcxVar) {
        zzhcxVar.getClass();
        this.zzc = zzhcxVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzhhb zzhhbVar) {
        this.zzd = zzhhbVar;
    }
}
