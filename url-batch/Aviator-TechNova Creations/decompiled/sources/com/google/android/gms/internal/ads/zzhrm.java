package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhrm extends zzibr implements zzidd {
    private static final zzhrm zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhrm zzhrmVar = new zzhrm();
        zzd = zzhrmVar;
        zzibr.zzbu(zzhrm.class, zzhrmVar);
    }

    private zzhrm() {
    }

    public static zzhrl zzd() {
        return (zzhrl) zzd.zzbn();
    }

    public static zzhrm zze() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzb = zzhpt.zzb(this.zza);
        return zzb == null ? zzhpt.UNRECOGNIZED : zzb;
    }

    public final zzhpt zzb() {
        zzhpt zzb = zzhpt.zzb(this.zzb);
        return zzb == null ? zzhpt.UNRECOGNIZED : zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhrm();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrl(bArr);
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
        synchronized (zzhrm.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzg(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    final /* synthetic */ void zzh(zzhpt zzhptVar) {
        this.zzb = zzhptVar.zza();
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
