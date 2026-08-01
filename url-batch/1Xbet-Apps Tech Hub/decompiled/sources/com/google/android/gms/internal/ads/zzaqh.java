package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaqh extends zzgwm implements zzgxx {
    private static final zzaqh zzb;
    private int zzd;
    private zzgve zze = zzgve.zzb;
    private zzgve zzf;
    private zzgve zzg;
    private zzgve zzh;

    static {
        zzaqh zzaqhVar = new zzaqh();
        zzb = zzaqhVar;
        zzgwm.zzaU(zzaqh.class, zzaqhVar);
    }

    private zzaqh() {
        zzgve zzgveVar = zzgve.zzb;
        this.zzf = zzgveVar;
        this.zzg = zzgveVar;
        this.zzh = zzgveVar;
    }

    public static zzaqg zza() {
        return (zzaqg) zzb.zzaA();
    }

    public static zzaqh zzd(byte[] bArr, zzgvy zzgvyVar) throws zzgwy {
        return (zzaqh) zzgwm.zzaI(zzb, bArr, zzgvyVar);
    }

    static /* synthetic */ void zzi(zzaqh zzaqhVar, zzgve zzgveVar) {
        zzaqhVar.zzd |= 1;
        zzaqhVar.zze = zzgveVar;
    }

    static /* synthetic */ void zzj(zzaqh zzaqhVar, zzgve zzgveVar) {
        zzaqhVar.zzd |= 2;
        zzaqhVar.zzf = zzgveVar;
    }

    static /* synthetic */ void zzk(zzaqh zzaqhVar, zzgve zzgveVar) {
        zzaqhVar.zzd |= 4;
        zzaqhVar.zzg = zzgveVar;
    }

    static /* synthetic */ void zzl(zzaqh zzaqhVar, zzgve zzgveVar) {
        zzaqhVar.zzd |= 8;
        zzaqhVar.zzh = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaqh();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzaqg(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgve zze() {
        return this.zze;
    }

    public final zzgve zzf() {
        return this.zzf;
    }

    public final zzgve zzg() {
        return this.zzh;
    }

    public final zzgve zzh() {
        return this.zzg;
    }
}
