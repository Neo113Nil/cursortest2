package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhcl extends zzgwm implements zzgxx {
    private static final zzhcl zzb;
    private zzhaw zzB;
    private zzhao zzD;
    private zzhbp zzF;
    private int zzG;
    private long zzJ;
    private int zzd;
    private int zze;
    private int zzf;
    private zzhas zzj;
    private zzhby zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private zzhcg zzu;
    private boolean zzv;
    private zzhck zzz;
    private byte zzK = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzgwv zzk = zzaN();
    private zzgwv zzl = zzaN();
    private String zzm = "";
    private zzgwv zzp = zzgwm.zzaN();
    private String zzq = "";
    private zzgve zzt = zzgve.zzb;
    private String zzw = "";
    private zzgwv zzx = zzgwm.zzaN();
    private zzgwv zzy = zzgwm.zzaN();
    private zzgwv zzA = zzaN();
    private String zzC = "";
    private zzgwv zzE = zzaN();
    private zzgwv zzH = zzaN();
    private zzgwv zzI = zzaN();

    static {
        zzhcl zzhclVar = new zzhcl();
        zzb = zzhclVar;
        zzgwm.zzaU(zzhcl.class, zzhclVar);
    }

    private zzhcl() {
    }

    public static zzhaq zza() {
        return (zzhaq) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzhcl zzhclVar, String str) {
        str.getClass();
        zzhclVar.zzd |= 4;
        zzhclVar.zzg = str;
    }

    static /* synthetic */ void zzh(zzhcl zzhclVar, String str) {
        str.getClass();
        zzhclVar.zzd |= 8;
        zzhclVar.zzh = str;
    }

    static /* synthetic */ void zzi(zzhcl zzhclVar, zzhas zzhasVar) {
        zzhasVar.getClass();
        zzhclVar.zzj = zzhasVar;
        zzhclVar.zzd |= 32;
    }

    static /* synthetic */ void zzj(zzhcl zzhclVar, zzhce zzhceVar) {
        zzhceVar.getClass();
        zzgwv zzgwvVar = zzhclVar.zzk;
        if (!zzgwvVar.zzc()) {
            zzhclVar.zzk = zzgwm.zzaO(zzgwvVar);
        }
        zzhclVar.zzk.add(zzhceVar);
    }

    static /* synthetic */ void zzk(zzhcl zzhclVar, String str) {
        zzhclVar.zzd |= 64;
        zzhclVar.zzm = str;
    }

    static /* synthetic */ void zzl(zzhcl zzhclVar) {
        zzhclVar.zzd &= -65;
        zzhclVar.zzm = zzb.zzm;
    }

    static /* synthetic */ void zzm(zzhcl zzhclVar, zzhby zzhbyVar) {
        zzhbyVar.getClass();
        zzhclVar.zzn = zzhbyVar;
        zzhclVar.zzd |= 128;
    }

    static /* synthetic */ void zzn(zzhcl zzhclVar, zzhcg zzhcgVar) {
        zzhcgVar.getClass();
        zzhclVar.zzu = zzhcgVar;
        zzhclVar.zzd |= 8192;
    }

    static /* synthetic */ void zzo(zzhcl zzhclVar, Iterable iterable) {
        zzgwv zzgwvVar = zzhclVar.zzx;
        if (!zzgwvVar.zzc()) {
            zzhclVar.zzx = zzgwm.zzaO(zzgwvVar);
        }
        zzgun.zzav(iterable, zzhclVar.zzx);
    }

    static /* synthetic */ void zzp(zzhcl zzhclVar, Iterable iterable) {
        zzgwv zzgwvVar = zzhclVar.zzy;
        if (!zzgwvVar.zzc()) {
            zzhclVar.zzy = zzgwm.zzaO(zzgwvVar);
        }
        zzgun.zzav(iterable, zzhclVar.zzy);
    }

    static /* synthetic */ void zzq(zzhcl zzhclVar, int i) {
        zzhclVar.zze = i - 1;
        zzhclVar.zzd |= 1;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzK);
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001 \u0000\u0001\u0001  \u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzhce.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzhbz.zza, "zzf", zzhap.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzhcp.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzhcv.class, "zzB", "zzC", "zzD", "zzE", zzhba.class, "zzF", "zzG", zzhci.zza, "zzH", zzhbs.class, "zzI", zzhbv.class, "zzJ"});
        }
        if (i2 == 3) {
            return new zzhcl();
        }
        zzhag zzhagVar = null;
        if (i2 == 4) {
            return new zzhaq(zzhagVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzK = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
