package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbcn extends zzibr implements zzidd {
    private static final zzbcn zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzbcr zzb;
    private zzian zzc = zzian.zza;
    private long zzd;
    private long zze;

    static {
        zzbcn zzbcnVar = new zzbcn();
        zzf = zzbcnVar;
        zzibr.zzbu(zzbcn.class, zzbcnVar);
    }

    private zzbcn() {
    }

    public static zzbcn zzd() {
        return zzf;
    }

    public final zzbcr zza() {
        zzbcr zzbcrVar = this.zzb;
        return zzbcrVar == null ? zzbcr.zzc() : zzbcrVar;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final long zzc() {
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
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzbcn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbcm(bArr);
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
        synchronized (zzbcn.class) {
            zzidkVar = zzg;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzf);
                zzg = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
