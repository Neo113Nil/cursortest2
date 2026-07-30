package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbcf extends zzibr implements zzidd {
    private static final zzbcf zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzbcl zzb;

    static {
        zzbcf zzbcfVar = new zzbcf();
        zzc = zzbcfVar;
        zzibr.zzbu(zzbcf.class, zzbcfVar);
    }

    private zzbcf() {
    }

    public static zzbcf zzb(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzbcf) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    public final zzbcl zza() {
        zzbcl zzbclVar = this.zzb;
        return zzbclVar == null ? zzbcl.zze() : zzbclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzbcf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbce(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzd;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzbcf.class) {
            zzidkVar = zzd;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzc);
                zzd = zzidkVar;
            }
        }
        return zzidkVar;
    }
}
