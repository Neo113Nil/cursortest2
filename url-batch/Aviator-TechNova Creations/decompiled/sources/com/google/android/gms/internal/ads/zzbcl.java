package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbcl extends zzibr implements zzidd {
    private static final zzbcl zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzbcn zzb;
    private zzian zzc = zzian.zza;

    static {
        zzbcl zzbclVar = new zzbcl();
        zzd = zzbclVar;
        zzibr.zzbu(zzbcl.class, zzbclVar);
    }

    private zzbcl() {
    }

    public static zzbcl zze() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzbcn zzb() {
        zzbcn zzbcnVar = this.zzb;
        return zzbcnVar == null ? zzbcn.zzd() : zzbcnVar;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzian zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzbcl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbck(bArr);
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
        synchronized (zzbcl.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
