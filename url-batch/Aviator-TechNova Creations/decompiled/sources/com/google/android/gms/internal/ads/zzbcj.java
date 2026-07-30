package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbcj extends zzibr implements zzidd {
    private static final zzbcj zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzbcp zzb;
    private zzian zzc;
    private zzian zzd;

    static {
        zzbcj zzbcjVar = new zzbcj();
        zze = zzbcjVar;
        zzibr.zzbu(zzbcj.class, zzbcjVar);
    }

    private zzbcj() {
        zzian zzianVar = zzian.zza;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
    }

    public static zzbcj zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzbcj) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzbcj zze(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzbcj) zzibr.zzbV(zze, bArr, zzibbVar);
    }

    public final zzbcp zza() {
        zzbcp zzbcpVar = this.zzb;
        return zzbcpVar == null ? zzbcp.zzj() : zzbcpVar;
    }

    public final zzian zzb() {
        return this.zzc;
    }

    public final zzian zzc() {
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
            return zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzbcj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbci(bArr);
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
        synchronized (zzbcj.class) {
            zzidkVar = zzf;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zze);
                zzf = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
