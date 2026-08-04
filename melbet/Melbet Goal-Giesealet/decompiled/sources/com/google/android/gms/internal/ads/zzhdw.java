package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhdw extends zzhih implements zzhjt {
    private static final zzhdw zzd;
    private static volatile zzhka zze;
    private String zza = "";
    private zzhhb zzb = zzhhb.zzb;
    private int zzc;

    static {
        zzhdw zzhdwVar = new zzhdw();
        zzd = zzhdwVar;
        zzhih.zzbu(zzhdw.class, zzhdwVar);
    }

    private zzhdw() {
    }

    public static zzhdw zzd(byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        return (zzhdw) zzhih.zzbV(zzd, bArr, zzhhrVar);
    }

    public static zzhdv zze() {
        return (zzhdv) zzd.zzbn();
    }

    public static zzhdv zzg(zzhdw zzhdwVar) {
        return (zzhdv) zzd.zzbo(zzhdwVar);
    }

    public static zzhdw zzh() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhhb zzb() {
        return this.zzb;
    }

    public final zzhep zzc() {
        zzhep zzb = zzhep.zzb(this.zzc);
        return zzb == null ? zzhep.UNRECOGNIZED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhdw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhdv(bArr);
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
        synchronized (zzhdw.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzj(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zzb = zzhhbVar;
    }

    final /* synthetic */ void zzk(zzhep zzhepVar) {
        this.zzc = zzhepVar.zza();
    }
}
