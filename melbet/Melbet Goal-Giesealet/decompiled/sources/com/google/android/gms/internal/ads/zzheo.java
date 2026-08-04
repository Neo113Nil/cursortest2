package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzheo extends zzhih implements zzhjt {
    private static final zzheo zzd;
    private static volatile zzhka zze;
    private int zza;
    private String zzb = "";
    private zzhdw zzc;

    static {
        zzheo zzheoVar = new zzheo();
        zzd = zzheoVar;
        zzhih.zzbu(zzheo.class, zzheoVar);
    }

    private zzheo() {
    }

    public static zzheo zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzheo) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhen zzd() {
        return (zzhen) zzd.zzbn();
    }

    public static zzheo zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhdw zzb() {
        zzhdw zzhdwVar = this.zzc;
        return zzhdwVar == null ? zzhdw.zzh() : zzhdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzheo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhen(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zze;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzheo.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzh(zzhdw zzhdwVar) {
        zzhdwVar.getClass();
        this.zzc = zzhdwVar;
        this.zza |= 1;
    }
}
