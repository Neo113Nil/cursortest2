package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhri extends zzibr implements zzidd {
    private static final zzhri zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private zzhre zzc;
    private zzian zzd;
    private zzian zze;

    static {
        zzhri zzhriVar = new zzhri();
        zzf = zzhriVar;
        zzibr.zzbu(zzhri.class, zzhriVar);
    }

    private zzhri() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
    }

    public static zzhri zze(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhri) zzibr.zzbT(zzf, zzianVar, zzibbVar);
    }

    public static zzhrh zzg() {
        return (zzhrh) zzf.zzbn();
    }

    public static zzhri zzh() {
        return zzf;
    }

    public static zzidk zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhre zzb() {
        zzhre zzhreVar = this.zzc;
        return zzhreVar == null ? zzhre.zzc() : zzhreVar;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    public final zzian zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhri();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrh(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzg;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhri.class) {
            zzidkVar = zzg;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzf);
                zzg = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzj(zzhre zzhreVar) {
        zzhreVar.getClass();
        this.zzc = zzhreVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    final /* synthetic */ void zzl(zzian zzianVar) {
        this.zze = zzianVar;
    }
}
