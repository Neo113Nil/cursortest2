package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzavf extends zzgwm implements zzgxx {
    private static final zzavf zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzavf zzavfVar = new zzavf();
        zzb = zzavfVar;
        zzgwm.zzaU(zzavf.class, zzavfVar);
    }

    private zzavf() {
    }

    public static zzave zze() {
        return (zzave) zzb.zzaA();
    }

    public static zzavf zzg() {
        return zzb;
    }

    public static zzavf zzh(zzgve zzgveVar) throws zzgwy {
        return (zzavf) zzgwm.zzaE(zzb, zzgveVar);
    }

    public static zzavf zzi(zzgve zzgveVar, zzgvy zzgvyVar) throws zzgwy {
        return (zzavf) zzgwm.zzaG(zzb, zzgveVar, zzgvyVar);
    }

    static /* synthetic */ void zzl(zzavf zzavfVar, String str) {
        str.getClass();
        zzavfVar.zzd |= 1;
        zzavfVar.zze = str;
    }

    static /* synthetic */ void zzm(zzavf zzavfVar, long j) {
        zzavfVar.zzd |= 16;
        zzavfVar.zzi = j;
    }

    static /* synthetic */ void zzn(zzavf zzavfVar, String str) {
        str.getClass();
        zzavfVar.zzd |= 2;
        zzavfVar.zzf = str;
    }

    static /* synthetic */ void zzo(zzavf zzavfVar, long j) {
        zzavfVar.zzd |= 4;
        zzavfVar.zzg = j;
    }

    static /* synthetic */ void zzp(zzavf zzavfVar, long j) {
        zzavfVar.zzd |= 8;
        zzavfVar.zzh = j;
    }

    public final long zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzavf();
        }
        zzavd zzavdVar = null;
        if (i2 == 4) {
            return new zzave(zzavdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
