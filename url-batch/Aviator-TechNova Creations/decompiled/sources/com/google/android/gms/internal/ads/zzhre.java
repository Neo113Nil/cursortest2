package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhre extends zzibr implements zzidd {
    private static final zzhre zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhre zzhreVar = new zzhre();
        zzb = zzhreVar;
        zzibr.zzbu(zzhre.class, zzhreVar);
    }

    private zzhre() {
    }

    public static zzhrd zzb() {
        return (zzhrd) zzb.zzbn();
    }

    public static zzhre zzc() {
        return zzb;
    }

    public final zzhpt zza() {
        zzhpt zzb2 = zzhpt.zzb(this.zza);
        return zzb2 == null ? zzhpt.UNRECOGNIZED : zzb2;
    }

    final /* synthetic */ void zzd(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhre();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrd(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzc;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhre.class) {
            zzidkVar = zzc;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzb);
                zzc = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
