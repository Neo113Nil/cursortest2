package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhpe extends zzibr implements zzidd {
    private static final zzhpe zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhpg zzb;
    private int zzc;

    static {
        zzhpe zzhpeVar = new zzhpe();
        zzd = zzhpeVar;
        zzibr.zzbu(zzhpe.class, zzhpeVar);
    }

    private zzhpe() {
    }

    public static zzhpe zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpe) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhpd zzc() {
        return (zzhpd) zzd.zzbn();
    }

    public final zzhpg zza() {
        zzhpg zzhpgVar = this.zzb;
        return zzhpgVar == null ? zzhpg.zzc() : zzhpgVar;
    }

    final /* synthetic */ void zzd(zzhpg zzhpgVar) {
        zzhpgVar.getClass();
        this.zzb = zzhpgVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhpe();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhpd(bArr);
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
        synchronized (zzhpe.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
