package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhdt extends zzhih implements zzhjt {
    private static final zzhdt zzd;
    private static volatile zzhka zze;
    private String zza = "";
    private zzhhb zzb = zzhhb.zzb;
    private int zzc;

    static {
        zzhdt zzhdtVar = new zzhdt();
        zzd = zzhdtVar;
        zzhih.zzbu(zzhdt.class, zzhdtVar);
    }

    private zzhdt() {
    }

    public static zzhdr zzd() {
        return (zzhdr) zzd.zzbn();
    }

    public static zzhdt zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhhb zzb() {
        return this.zzb;
    }

    public final zzhds zzc() {
        int i = this.zzc;
        zzhds zzhdsVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzhds.REMOTE : zzhds.ASYMMETRIC_PUBLIC : zzhds.ASYMMETRIC_PRIVATE : zzhds.SYMMETRIC : zzhds.UNKNOWN_KEYMATERIAL;
        return zzhdsVar == null ? zzhds.UNRECOGNIZED : zzhdsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhdt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhdr(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zze;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhdt.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zzb = zzhhbVar;
    }

    final /* synthetic */ void zzi(zzhds zzhdsVar) {
        this.zzc = zzhdsVar.zza();
    }
}
