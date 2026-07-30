package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhpa extends zzibr implements zzidd {
    private static final zzhpa zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzian zzb = zzian.zza;

    static {
        zzhpa zzhpaVar = new zzhpa();
        zzc = zzhpaVar;
        zzibr.zzbu(zzhpa.class, zzhpaVar);
    }

    private zzhpa() {
    }

    public static zzhpa zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpa) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhoz zzd() {
        return (zzhoz) zzc.zzbn();
    }

    public static zzidk zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzian zzb() {
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
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhpa();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhoz(bArr);
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
        synchronized (zzhpa.class) {
            zzidkVar = zzd;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzc);
                zzd = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzg(zzian zzianVar) {
        this.zzb = zzianVar;
    }
}
