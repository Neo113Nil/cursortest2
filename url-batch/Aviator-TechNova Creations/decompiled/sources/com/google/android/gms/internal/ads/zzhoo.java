package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhoo extends zzibr implements zzidd {
    private static final zzhoo zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhoq zzb;
    private int zzc;

    static {
        zzhoo zzhooVar = new zzhoo();
        zzd = zzhooVar;
        zzibr.zzbu(zzhoo.class, zzhooVar);
    }

    private zzhoo() {
    }

    public static zzhoo zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhoo) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhon zzd() {
        return (zzhon) zzd.zzbn();
    }

    public final zzhoq zza() {
        zzhoq zzhoqVar = this.zzb;
        return zzhoqVar == null ? zzhoq.zzc() : zzhoqVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhoo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhon(bArr);
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
        synchronized (zzhoo.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(zzhoq zzhoqVar) {
        zzhoqVar.getClass();
        this.zzb = zzhoqVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
