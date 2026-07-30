package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzigo extends zzibr implements zzidd {
    private static final zzigo zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzian zzc;
    private zzian zzd;

    static {
        zzigo zzigoVar = new zzigo();
        zze = zzigoVar;
        zzibr.zzbu(zzigo.class, zzigoVar);
    }

    private zzigo() {
        zzian zzianVar = zzian.zza;
        this.zzc = zzianVar;
        this.zzd = zzianVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzigo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzign(bArr);
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
        synchronized (zzigo.class) {
            zzidkVar = zzf;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zze);
                zzf = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
