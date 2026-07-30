package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhpg extends zzibr implements zzidd {
    private static final zzhpg zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhpg zzhpgVar = new zzhpg();
        zzd = zzhpgVar;
        zzibr.zzbu(zzhpg.class, zzhpgVar);
    }

    private zzhpg() {
    }

    public static zzhpf zzb() {
        return (zzhpf) zzd.zzbn();
    }

    public static zzhpg zzc() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzb = zzhpt.zzb(this.zza);
        return zzb == null ? zzhpt.UNRECOGNIZED : zzb;
    }

    final /* synthetic */ void zzd(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhpg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhpf(bArr);
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
        synchronized (zzhpg.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }

    public final int zzg() {
        int i = this.zzb;
        int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzb = zzhps.zza(i);
    }

    final /* synthetic */ void zzj(int i) {
        this.zzc = zzhpl.zza(i);
    }
}
