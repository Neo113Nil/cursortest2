package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhrs extends zzibr implements zzidd {
    private static final zzhrs zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzhrw zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhrs zzhrsVar = new zzhrs();
        zze = zzhrsVar;
        zzibr.zzbu(zzhrs.class, zzhrsVar);
    }

    private zzhrs() {
    }

    public static zzhrs zzd(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhrs) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhrr zze() {
        return (zzhrr) zze.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhrw zzb() {
        zzhrw zzhrwVar = this.zzc;
        return zzhrwVar == null ? zzhrw.zzc() : zzhrwVar;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhrs();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrr(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzf;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhrs.class) {
            zzidkVar = zzf;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zze);
                zzf = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zzg(zzhrw zzhrwVar) {
        zzhrwVar.getClass();
        this.zzc = zzhrwVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
