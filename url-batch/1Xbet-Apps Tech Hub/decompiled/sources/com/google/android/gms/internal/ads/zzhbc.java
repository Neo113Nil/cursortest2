package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhbc extends zzgwm implements zzgxx {
    private static final zzhbc zzb;
    private int zzd;
    private byte zzg = 2;
    private zzgve zze = zzgve.zzb;
    private zzgve zzf = zzgve.zzb;

    static {
        zzhbc zzhbcVar = new zzhbc();
        zzb = zzhbcVar;
        zzgwm.zzaU(zzhbc.class, zzhbcVar);
    }

    private zzhbc() {
    }

    public static zzhbb zza() {
        return (zzhbb) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzhbc zzhbcVar, zzgve zzgveVar) {
        zzhbcVar.zzd |= 1;
        zzhbcVar.zze = zzgveVar;
    }

    static /* synthetic */ void zze(zzhbc zzhbcVar, zzgve zzgveVar) {
        zzhbcVar.zzd |= 2;
        zzhbcVar.zzf = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzhbc();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhbb(zzhagVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
