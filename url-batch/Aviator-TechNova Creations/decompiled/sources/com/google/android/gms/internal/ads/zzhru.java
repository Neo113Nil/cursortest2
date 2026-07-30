package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhru extends zzibr implements zzidd {
    private static final zzhru zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private zzhrw zzc;

    static {
        zzhru zzhruVar = new zzhru();
        zzd = zzhruVar;
        zzibr.zzbu(zzhru.class, zzhruVar);
    }

    private zzhru() {
    }

    public static zzhru zzc(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhru) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhrt zzd() {
        return (zzhrt) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhrw zzb() {
        zzhrw zzhrwVar = this.zzc;
        return zzhrwVar == null ? zzhrw.zzc() : zzhrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhru();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrt(bArr);
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
        synchronized (zzhru.class) {
            zzidkVar = zze;
            if (zzidkVar == null) {
                zzidkVar = new zzibm(zzd);
                zze = zzidkVar;
            }
        }
        return zzidkVar;
    }

    final /* synthetic */ void zze(zzhrw zzhrwVar) {
        zzhrwVar.getClass();
        this.zzc = zzhrwVar;
        this.zza |= 1;
    }
}
