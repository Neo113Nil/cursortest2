package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzijg extends zzibr implements zzidd {
    private static final zzijg zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private zzicd zze = zzibr.zzbM();

    static {
        zzijg zzijgVar = new zzijg();
        zzf = zzijgVar;
        zzibr.zzbu(zzijg.class, zzijgVar);
    }

    private zzijg() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzijg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijf(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzg;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzijg.class) {
            zzidkVar = zzg;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzf);
                zzg = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
