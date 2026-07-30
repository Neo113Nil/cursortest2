package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhoi extends zzibr implements zzidd {
    private static final zzhoi zzd;
    private static volatile zzidk zze;
    private int zza;
    private zzhok zzb;
    private int zzc;

    static {
        zzhoi zzhoiVar = new zzhoi();
        zzd = zzhoiVar;
        zzibr.zzbu(zzhoi.class, zzhoiVar);
    }

    private zzhoi() {
    }

    public static zzhoh zzc() {
        return (zzhoh) zzd.zzbn();
    }

    public static zzhoi zzd() {
        return zzd;
    }

    public final zzhok zza() {
        zzhok zzhokVar = this.zzb;
        return zzhokVar == null ? zzhok.zzc() : zzhokVar;
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
            return new zzhoi();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhoh(bArr);
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
        synchronized (zzhoi.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(zzhok zzhokVar) {
        zzhokVar.getClass();
        this.zzb = zzhokVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
