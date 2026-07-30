package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzawf extends zzibr implements zzidd {
    private static final zzawf zzg;
    private static volatile zzidk zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzawf zzawfVar = new zzawf();
        zzg = zzawfVar;
        zzibr.zzbu(zzawf.class, zzawfVar);
    }

    private zzawf() {
    }

    public static zzawf zza() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzawf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawe(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzh;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzawf.class) {
            zzidkVar = zzh;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzg);
                zzh = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
