package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfpa extends zzhih implements zzhjt {
    private static final zzfpa zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhip zzb = zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfpa zzfpaVar = new zzfpa();
        zzf = zzfpaVar;
        zzhih.zzbu(zzfpa.class, zzfpaVar);
    }

    private zzfpa() {
    }

    public static zzfoz zza() {
        return (zzfoz) zzf.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(int i) {
        zzhip zzhipVar = this.zzb;
        if (!zzhipVar.zza()) {
            this.zzb = zzhih.zzbD(zzhipVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfoy.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfpa();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfoz(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzg;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzfpa.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
