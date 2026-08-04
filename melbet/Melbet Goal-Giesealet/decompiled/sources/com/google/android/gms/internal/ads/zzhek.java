package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhek extends zzhih implements zzhjt {
    private static final zzhek zzb;
    private static volatile zzhka zzc;
    private String zza = "";

    static {
        zzhek zzhekVar = new zzhek();
        zzb = zzhekVar;
        zzhih.zzbu(zzhek.class, zzhekVar);
    }

    private zzhek() {
    }

    public static zzhek zzb(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhek) zzhih.zzbT(zzb, zzhhbVar, zzhhrVar);
    }

    public static zzhej zzc() {
        return (zzhej) zzb.zzbn();
    }

    public static zzhek zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhek();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhej(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzc;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhek.class) {
            zzhkaVar = zzc;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzb);
                zzc = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
