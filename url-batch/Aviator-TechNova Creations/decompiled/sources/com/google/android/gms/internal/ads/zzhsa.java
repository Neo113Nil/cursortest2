package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhsa extends zzibr implements zzidd {
    private static final zzhsa zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhsa zzhsaVar = new zzhsa();
        zzb = zzhsaVar;
        zzibr.zzbu(zzhsa.class, zzhsaVar);
    }

    private zzhsa() {
    }

    public static zzhsa zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhsa) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhsa zzc() {
        return zzb;
    }

    public final int zza() {
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
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhsa();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrz(bArr);
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
        synchronized (zzhsa.class) {
            zzidkVar = zzc;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzb);
                zzc = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
