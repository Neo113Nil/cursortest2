package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhqt extends zzibr implements zzidd {
    private static final zzhqt zzb;
    private static volatile zzidk zzc;
    private String zza = "";

    static {
        zzhqt zzhqtVar = new zzhqt();
        zzb = zzhqtVar;
        zzibr.zzbu(zzhqt.class, zzhqtVar);
    }

    private zzhqt() {
    }

    public static zzhqt zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhqt) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhqs zzc() {
        return (zzhqs) zzb.zzbn();
    }

    public static zzhqt zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhqt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqs(bArr);
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
        synchronized (zzhqt.class) {
            zzidkVar = zzc;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzb);
                zzc = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
