package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhrg extends zzibr implements zzidd {
    private static final zzhrg zzj;
    private static volatile zzidk zzk;
    private int zza;
    private int zzb;
    private zzhri zzc;
    private zzian zzd;
    private zzian zze;
    private zzian zzf;
    private zzian zzg;
    private zzian zzh;
    private zzian zzi;

    static {
        zzhrg zzhrgVar = new zzhrg();
        zzj = zzhrgVar;
        zzibr.zzbu(zzhrg.class, zzhrgVar);
    }

    private zzhrg() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
        this.zzf = zzianVar;
        this.zzg = zzianVar;
        this.zzh = zzianVar;
        this.zzi = zzianVar;
    }

    public static zzhrg zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrg) zzibr.zzbT(zzj, zzianVar, zzibbVar);
    }

    public static zzhrf zzk() {
        return (zzhrf) zzj.zzbn();
    }

    public static zzidk zzl() {
        return zzj.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhri zzb() {
        zzhri zzhriVar = this.zzc;
        return zzhriVar == null ? zzhri.zzh() : zzhriVar;
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
            return zzbv(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzhrg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrf(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzk;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhrg.class) {
            zzidkVar = zzk;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzj);
                zzk = zzidkVar;
            }
        }
        return zzidkVar;
    }

    public final zzian zze() {
        return this.zzf;
    }

    public final zzian zzg() {
        return this.zzg;
    }

    public final zzian zzh() {
        return this.zzh;
    }

    public final zzian zzi() {
        return this.zzi;
    }

    final /* synthetic */ void zzm(int i) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzn(zzhri zzhriVar) {
        zzhriVar.getClass();
        this.zzc = zzhriVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzo(zzian zzianVar) {
        this.zzd = zzianVar;
    }

    final /* synthetic */ void zzp(zzian zzianVar) {
        this.zze = zzianVar;
    }

    final /* synthetic */ void zzq(zzian zzianVar) {
        this.zzf = zzianVar;
    }

    final /* synthetic */ void zzr(zzian zzianVar) {
        this.zzg = zzianVar;
    }

    final /* synthetic */ void zzs(zzian zzianVar) {
        this.zzh = zzianVar;
    }

    final /* synthetic */ void zzt(zzian zzianVar) {
        this.zzi = zzianVar;
    }
}
