package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzawx extends zzibr implements zzidd {
    private static final zzawx zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzawx zzawxVar = new zzawx();
        zzd = zzawxVar;
        zzibr.zzbu(zzawx.class, zzawxVar);
    }

    private zzawx() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzawk.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzawx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaww(bArr);
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
        synchronized (zzawx.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
