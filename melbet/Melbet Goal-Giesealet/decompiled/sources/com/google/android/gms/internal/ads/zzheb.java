package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzheb extends zzhih implements zzhjt {
    private static final zzheb zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhdt zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzheb zzhebVar = new zzheb();
        zzf = zzhebVar;
        zzhih.zzbu(zzheb.class, zzhebVar);
    }

    private zzheb() {
    }

    public static zzhea zze() {
        return (zzhea) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzhdt zzb() {
        zzhdt zzhdtVar = this.zzb;
        return zzhdtVar == null ? zzhdt.zze() : zzhdtVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzhep zzd() {
        zzhep zzb = zzhep.zzb(this.zze);
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
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzheb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhea(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzg;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzheb.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzg(zzhdt zzhdtVar) {
        zzhdtVar.getClass();
        this.zzb = zzhdtVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzd = i;
    }

    final /* synthetic */ void zzi(zzhep zzhepVar) {
        this.zze = zzhepVar.zza();
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
        this.zzc = zzhdu.zza(i);
    }
}
