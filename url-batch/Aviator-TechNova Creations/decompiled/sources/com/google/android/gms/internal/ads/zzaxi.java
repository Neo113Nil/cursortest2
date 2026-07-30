package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaxi extends zzibr implements zzidd {
    private static final zzaxi zzl;
    private static volatile zzidk zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private zzibz zze = zzbC();
    private zzicd zzh = zzbM();

    static {
        zzaxi zzaxiVar = new zzaxi();
        zzl = zzaxiVar;
        zzibr.zzbu(zzaxi.class, zzaxiVar);
    }

    private zzaxi() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzaxm.class, "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new zzaxi();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxh(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzm;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzaxi.class) {
            zzidkVar = zzm;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzl);
                zzm = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
