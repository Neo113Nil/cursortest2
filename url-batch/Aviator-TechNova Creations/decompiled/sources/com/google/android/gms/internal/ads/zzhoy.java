package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhoy extends zzibr implements zzidd {
    private static final zzhoy zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    static {
        zzhoy zzhoyVar = new zzhoy();
        zzc = zzhoyVar;
        zzibr.zzbu(zzhoy.class, zzhoyVar);
    }

    private zzhoy() {
    }

    public static zzhoy zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoy) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhox zzd() {
        return (zzhox) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (ordinal == 3) {
            return new zzhoy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhox(bArr);
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
        synchronized (zzhoy.class) {
            zzidkVar = zzd;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzc);
                zzd = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}
