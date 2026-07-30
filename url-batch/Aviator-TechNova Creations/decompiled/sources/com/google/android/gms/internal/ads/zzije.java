package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzije extends zzibr implements zzidd {
    private static final zzije zzj;
    private static volatile zzidk zzk;
    private int zza;
    private zziin zzh;
    private String zzb = "";
    private String zzc = "";
    private zzicd zzd = zzbM();
    private zzicd zze = zzbM();
    private zzicd zzf = zzbM();
    private int zzg = -1;
    private String zzi = "";

    static {
        zzije zzijeVar = new zzije();
        zzj = zzijeVar;
        zzibr.zzbu(zzije.class, zzijeVar);
    }

    private zzije() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", zziir.class, "zze", zziiy.class, "zzg", "zzb", "zzf", zzijl.class, "zzi", "zzh"});
        }
        if (ordinal == 3) {
            return new zzije();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijd(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzk;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzije.class) {
            zzidkVar = zzk;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzj);
                zzk = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
