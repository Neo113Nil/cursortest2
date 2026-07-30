package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhqk extends zzibr implements zzidd {
    private static final zzhqk zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzhqc zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhqk zzhqkVar = new zzhqk();
        zzf = zzhqkVar;
        zzibr.zzbu(zzhqk.class, zzhqkVar);
    }

    private zzhqk() {
    }

    public static zzhqj zze() {
        return (zzhqj) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhqc zzb() {
        zzhqc zzhqcVar = this.zzb;
        return zzhqcVar == null ? zzhqc.zze() : zzhqcVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhqy zzd() {
        zzhqy zzb = zzhqy.zzb(this.zze);
        return zzb == null ? zzhqy.UNRECOGNIZED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhqk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqj(bArr);
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
        synchronized (zzhqk.class) {
            zzidkVar = zzg;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzf);
                zzg = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzg(zzhqc zzhqcVar) {
        zzhqcVar.getClass();
        this.zzb = zzhqcVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzd = i;
    }

    final /* synthetic */ void zzi(zzhqy zzhqyVar) {
        this.zze = zzhqyVar.zza();
    }

    public final int zzk() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzc = zzhqd.zza(i);
    }
}
