package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaxk extends zzibr implements zzidd {
    private static final zzaxk zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzian zzb;
    private zzian zzc;
    private zzian zzd;
    private zzian zze;

    static {
        zzaxk zzaxkVar = new zzaxk();
        zzf = zzaxkVar;
        zzibr.zzbu(zzaxk.class, zzaxkVar);
    }

    private zzaxk() {
        zzian zzianVar = zzian.zza;
        this.zzb = zzianVar;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
        this.zze = zzianVar;
    }

    public static zzaxk zze(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzaxk) zzibr.zzbV(zzf, bArr, zzibbVar);
    }

    public static zzaxj zzg() {
        return (zzaxj) zzf.zzbn();
    }

    public final zzian zza() {
        return this.zzb;
    }

    public final zzian zzb() {
        return this.zzc;
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
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzaxk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxj(bArr);
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
        synchronized (zzaxk.class) {
            zzidkVar = zzg;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzf);
                zzg = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzh(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    final /* synthetic */ void zzi(zzian zzianVar) {
        this.zza |= 2;
        this.zzc = zzianVar;
    }

    final /* synthetic */ void zzj(zzian zzianVar) {
        this.zza |= 4;
        this.zzd = zzianVar;
    }

    final /* synthetic */ void zzk(zzian zzianVar) {
        this.zza |= 8;
        this.zze = zzianVar;
    }
}
