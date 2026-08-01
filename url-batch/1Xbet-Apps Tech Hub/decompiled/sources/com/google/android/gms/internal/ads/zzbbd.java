package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbbd extends zzgwm implements zzgxx {
    private static final zzbbd zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private zzgwv zze = zzaN();
    private String zzi = "";
    private String zzj = "";

    static {
        zzbbd zzbbdVar = new zzbbd();
        zzb = zzbbdVar;
        zzgwm.zzaU(zzbbd.class, zzbbdVar);
    }

    private zzbbd() {
    }

    public static zzbaz zza() {
        return (zzbaz) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzbbd zzbbdVar, Iterable iterable) {
        zzgwv zzgwvVar = zzbbdVar.zze;
        if (!zzgwvVar.zzc()) {
            zzbbdVar.zze = zzgwm.zzaO(zzgwvVar);
        }
        zzgun.zzav(iterable, zzbbdVar.zze);
    }

    static /* synthetic */ void zze(zzbbd zzbbdVar, int i) {
        zzbbdVar.zzd |= 1;
        zzbbdVar.zzf = i;
    }

    static /* synthetic */ void zzf(zzbbd zzbbdVar, int i) {
        zzbbdVar.zzd |= 2;
        zzbbdVar.zzg = i;
    }

    static /* synthetic */ void zzg(zzbbd zzbbdVar, long j) {
        zzbbdVar.zzd |= 4;
        zzbbdVar.zzh = j;
    }

    static /* synthetic */ void zzh(zzbbd zzbbdVar, String str) {
        str.getClass();
        zzbbdVar.zzd |= 8;
        zzbbdVar.zzi = str;
    }

    static /* synthetic */ void zzi(zzbbd zzbbdVar, String str) {
        str.getClass();
        zzbbdVar.zzd |= 16;
        zzbbdVar.zzj = str;
    }

    static /* synthetic */ void zzj(zzbbd zzbbdVar, long j) {
        zzbbdVar.zzd |= 32;
        zzbbdVar.zzk = j;
    }

    static /* synthetic */ void zzk(zzbbd zzbbdVar, int i) {
        zzbbdVar.zzd |= 64;
        zzbbdVar.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzbay.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzbbd();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbaz(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
