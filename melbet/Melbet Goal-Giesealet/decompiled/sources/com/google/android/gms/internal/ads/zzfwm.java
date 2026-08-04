package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfwm extends zzhih implements zzhjt {
    private static final zzfwm zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        zzfwm zzfwmVar = new zzfwm();
        zze = zzfwmVar;
        zzhih.zzbu(zzfwm.class, zzfwmVar);
    }

    private zzfwm() {
    }

    public static zzfwl zzc() {
        return (zzfwl) zze.zzbn();
    }

    public static zzfwm zzd() {
        return zze;
    }

    public final zzaxw zza() {
        return this.zzb == 1 ? (zzaxw) this.zzc : zzaxw.zzj();
    }

    public final zzaxq zzb() {
        zzaxq zzb = zzaxq.zzb(this.zzd);
        return zzb == null ? zzaxq.UNSUPPORTED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", zzaxw.class, zzaxu.class, "zzd", zzaxq.zzc()});
        }
        if (ordinal == 3) {
            return new zzfwm();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfwl(bArr);
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
        synchronized (zzfwm.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(zzaxw zzaxwVar) {
        zzaxwVar.getClass();
        this.zzc = zzaxwVar;
        this.zzb = 1;
    }

    final /* synthetic */ void zzg(zzaxq zzaxqVar) {
        this.zzd = zzaxqVar.zza();
        this.zza |= 1;
    }
}
