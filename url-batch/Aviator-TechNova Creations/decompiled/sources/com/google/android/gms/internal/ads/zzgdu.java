package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgdu extends zzibr implements zzidd {
    private static final zzgdu zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        zzgdu zzgduVar = new zzgdu();
        zze = zzgduVar;
        zzibr.zzbu(zzgdu.class, zzgduVar);
    }

    private zzgdu() {
    }

    public static zzgdu zzd(zzian zzianVar) throws zzicg {
        return (zzgdu) zzibr.zzbS(zze, zzianVar);
    }

    public static zzgdt zze() {
        return (zzgdt) zze.zzbn();
    }

    public static zzgdu zzg() {
        return zze;
    }

    public final zzbcp zza() {
        return this.zzb == 1 ? (zzbcp) this.zzc : zzbcp.zzj();
    }

    public final zzbcn zzb() {
        return this.zzb == 2 ? (zzbcn) this.zzc : zzbcn.zzd();
    }

    public final zzbch zzc() {
        zzbch zzb = zzbch.zzb(this.zzd);
        return zzb == null ? zzbch.UNSUPPORTED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", zzbcp.class, zzbcn.class, "zzd", zzbch.zzc()});
        }
        if (ordinal == 3) {
            return new zzgdu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgdt(bArr);
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
        synchronized (zzgdu.class) {
            zzidkVar = zzf;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zze);
                zzf = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzh(zzbcp zzbcpVar) {
        zzbcpVar.getClass();
        this.zzc = zzbcpVar;
        this.zzb = 1;
    }

    final /* synthetic */ void zzi(zzbcn zzbcnVar) {
        zzbcnVar.getClass();
        this.zzc = zzbcnVar;
        this.zzb = 2;
    }

    final /* synthetic */ void zzj(zzbch zzbchVar) {
        this.zzd = zzbchVar.zza();
        this.zza |= 1;
    }
}
