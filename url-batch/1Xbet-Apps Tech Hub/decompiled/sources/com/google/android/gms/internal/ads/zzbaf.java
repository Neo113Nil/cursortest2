package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbaf extends zzgwm implements zzgxx {
    private static final zzbaf zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private zzbbp zzi;
    private zzazx zzk;
    private zzbaa zzl;
    private zzbat zzm;
    private zzazb zzn;
    private zzbbd zzo;
    private zzbck zzp;
    private zzazk zzq;
    private String zzf = "";
    private int zzh = 1000;
    private zzgwu zzj = zzaL();

    static {
        zzbaf zzbafVar = new zzbaf();
        zzb = zzbafVar;
        zzgwm.zzaU(zzbaf.class, zzbafVar);
    }

    private zzbaf() {
    }

    public static zzbae zzd() {
        return (zzbae) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzbaf zzbafVar, String str) {
        str.getClass();
        zzbafVar.zzd |= 2;
        zzbafVar.zzf = str;
    }

    static /* synthetic */ void zzh(zzbaf zzbafVar, Iterable iterable) {
        zzgwu zzgwuVar = zzbafVar.zzj;
        if (!zzgwuVar.zzc()) {
            zzbafVar.zzj = zzgwm.zzaM(zzgwuVar);
        }
        zzgun.zzav(iterable, zzbafVar.zzj);
    }

    static /* synthetic */ void zzj(zzbaf zzbafVar, zzazx zzazxVar) {
        zzazxVar.getClass();
        zzbafVar.zzk = zzazxVar;
        zzbafVar.zzd |= 32;
    }

    static /* synthetic */ void zzk(zzbaf zzbafVar, zzazb zzazbVar) {
        zzazbVar.getClass();
        zzbafVar.zzn = zzazbVar;
        zzbafVar.zzd |= 256;
    }

    static /* synthetic */ void zzl(zzbaf zzbafVar, zzbbd zzbbdVar) {
        zzbbdVar.getClass();
        zzbafVar.zzo = zzbbdVar;
        zzbafVar.zzd |= 512;
    }

    static /* synthetic */ void zzm(zzbaf zzbafVar, zzbck zzbckVar) {
        zzbckVar.getClass();
        zzbafVar.zzp = zzbckVar;
        zzbafVar.zzd |= 1024;
    }

    static /* synthetic */ void zzn(zzbaf zzbafVar, zzazk zzazkVar) {
        zzazkVar.getClass();
        zzbafVar.zzq = zzazkVar;
        zzbafVar.zzd |= 2048;
    }

    public final zzazb zza() {
        zzazb zzazbVar = this.zzn;
        return zzazbVar == null ? zzazb.zzc() : zzazbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzbac.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new zzbaf();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbae(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzazx zzc() {
        zzazx zzazxVar = this.zzk;
        return zzazxVar == null ? zzazx.zzc() : zzazxVar;
    }

    public final String zzf() {
        return this.zzf;
    }
}
