package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhpx extends zzibr implements zzidd {
    private static final zzhpx zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhpz zzb;
    private int zzc;
    private int zzd;

    static {
        zzhpx zzhpxVar = new zzhpx();
        zze = zzhpxVar;
        zzibr.zzbu(zzhpx.class, zzhpxVar);
    }

    private zzhpx() {
    }

    public static zzhpx zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpx) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhpw zze() {
        return (zzhpw) zze.zzbn();
    }

    public static zzhpx zzg() {
        return zze;
    }

    public final zzhpz zza() {
        zzhpz zzhpzVar = this.zzb;
        return zzhpzVar == null ? zzhpz.zzd() : zzhpzVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhpx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhpw(bArr);
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
        synchronized (zzhpx.class) {
            zzidkVar = zzf;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zze);
                zzf = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzh(zzhpz zzhpzVar) {
        zzhpzVar.getClass();
        this.zzb = zzhpzVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
