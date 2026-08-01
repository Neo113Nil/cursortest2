package com.google.android.gms.internal.ads;

import androidx.core.view.accessibility.AccessibilityEventCompat;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaqd extends zzgwm implements zzgxx {
    private static final zzaqd zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzaqf zzM;
    private zzapy zzaC;
    private long zzaI;
    private zzapp zzaL;
    private zzapr zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzaqm zzaW;
    private zzaqa zzae;
    private zzaqc zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzaqo zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private zzgwv zzaf = zzaN();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private zzgwv zzaz = zzaN();
    private int zzaA = 1000;
    private zzgwv zzaB = zzaN();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzaqd zzaqdVar = new zzaqd();
        zzb = zzaqdVar;
        zzgwm.zzaU(zzaqd.class, zzaqdVar);
    }

    private zzaqd() {
    }

    static /* synthetic */ void zzA(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 134217728;
        zzaqdVar.zzH = j;
    }

    static /* synthetic */ void zzB(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zzd |= 268435456;
        zzaqdVar.zzI = str;
    }

    static /* synthetic */ void zzC(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 536870912;
        zzaqdVar.zzJ = j;
    }

    static /* synthetic */ void zzD(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 1073741824;
        zzaqdVar.zzK = j;
    }

    static /* synthetic */ void zzE(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= Integer.MIN_VALUE;
        zzaqdVar.zzL = j;
    }

    static /* synthetic */ void zzF(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 2;
        zzaqdVar.zzN = j;
    }

    static /* synthetic */ void zzG(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 4;
        zzaqdVar.zzO = j;
    }

    static /* synthetic */ void zzH(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 8;
        zzaqdVar.zzP = j;
    }

    static /* synthetic */ void zzI(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 16;
        zzaqdVar.zzQ = j;
    }

    static /* synthetic */ void zzJ(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 32;
        zzaqdVar.zzR = j;
    }

    static /* synthetic */ void zzK(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 64;
        zzaqdVar.zzS = j;
    }

    static /* synthetic */ void zzL(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zze |= 128;
        zzaqdVar.zzT = str;
    }

    static /* synthetic */ void zzM(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zze |= 256;
        zzaqdVar.zzU = str;
    }

    static /* synthetic */ void zzN(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 4096;
        zzaqdVar.zzY = j;
    }

    static /* synthetic */ void zzO(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 8192;
        zzaqdVar.zzZ = j;
    }

    static /* synthetic */ void zzP(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 16384;
        zzaqdVar.zzaa = j;
    }

    static /* synthetic */ void zzQ(zzaqd zzaqdVar, zzaqa zzaqaVar) {
        zzaqaVar.getClass();
        zzaqdVar.zzae = zzaqaVar;
        zzaqdVar.zze |= 262144;
    }

    static /* synthetic */ void zzR(zzaqd zzaqdVar, zzaqa zzaqaVar) {
        zzaqaVar.getClass();
        zzgwv zzgwvVar = zzaqdVar.zzaf;
        if (!zzgwvVar.zzc()) {
            zzaqdVar.zzaf = zzgwm.zzaO(zzgwvVar);
        }
        zzaqdVar.zzaf.add(zzaqaVar);
    }

    static /* synthetic */ void zzT(zzaqd zzaqdVar, zzaqc zzaqcVar) {
        zzaqcVar.getClass();
        zzaqdVar.zzag = zzaqcVar;
        zzaqdVar.zze |= 524288;
    }

    static /* synthetic */ void zzU(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 2097152;
        zzaqdVar.zzai = j;
    }

    static /* synthetic */ void zzV(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 4194304;
        zzaqdVar.zzaj = j;
    }

    static /* synthetic */ void zzW(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 8388608;
        zzaqdVar.zzak = j;
    }

    static /* synthetic */ void zzX(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        zzaqdVar.zzan = j;
    }

    static /* synthetic */ void zzY(zzaqd zzaqdVar, long j) {
        zzaqdVar.zze |= 134217728;
        zzaqdVar.zzao = j;
    }

    static /* synthetic */ void zzZ(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zze |= 268435456;
        zzaqdVar.zzap = str;
    }

    public static zzapg zza() {
        return (zzapg) zzb.zzaA();
    }

    static /* synthetic */ void zzaa(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzf |= 512;
        zzaqdVar.zzaE = j;
    }

    static /* synthetic */ void zzab(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzf |= 1024;
        zzaqdVar.zzaF = j;
    }

    static /* synthetic */ void zzac(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzf |= 2048;
        zzaqdVar.zzaG = j;
    }

    static /* synthetic */ void zzad(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzf |= 4096;
        zzaqdVar.zzaH = j;
    }

    static /* synthetic */ void zzae(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zzf |= 32768;
        zzaqdVar.zzaK = str;
    }

    static /* synthetic */ void zzaf(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zzf |= 4194304;
        zzaqdVar.zzaR = str;
    }

    static /* synthetic */ void zzag(zzaqd zzaqdVar, boolean z) {
        zzaqdVar.zzf |= 16777216;
        zzaqdVar.zzaT = z;
    }

    static /* synthetic */ void zzah(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzf |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        zzaqdVar.zzaV = j;
    }

    static /* synthetic */ void zzam(zzaqd zzaqdVar, int i) {
        zzaqdVar.zzW = i - 1;
        zzaqdVar.zze |= 1024;
    }

    static /* synthetic */ void zzan(zzaqd zzaqdVar, int i) {
        zzaqdVar.zzX = i - 1;
        zzaqdVar.zze |= 2048;
    }

    static /* synthetic */ void zzao(zzaqd zzaqdVar, int i) {
        zzaqdVar.zzad = i - 1;
        zzaqdVar.zze |= 131072;
    }

    static /* synthetic */ void zzap(zzaqd zzaqdVar, int i) {
        zzaqdVar.zzaw = i - 1;
        zzaqdVar.zzf |= 8;
    }

    static /* synthetic */ void zzaq(zzaqd zzaqdVar, int i) {
        zzaqdVar.zzax = i - 1;
        zzaqdVar.zzf |= 16;
    }

    static /* synthetic */ void zzar(zzaqd zzaqdVar, int i) {
        zzaqdVar.zzaP = i - 1;
        zzaqdVar.zzf |= 1048576;
    }

    static /* synthetic */ void zzas(zzaqd zzaqdVar, int i) {
        zzaqdVar.zzaS = 5;
        zzaqdVar.zzf |= 8388608;
    }

    public static zzaqd zzd() {
        return zzb;
    }

    public static zzaqd zze(byte[] bArr, zzgvy zzgvyVar) throws zzgwy {
        return (zzaqd) zzgwm.zzaI(zzb, bArr, zzgvyVar);
    }

    static /* synthetic */ void zzi(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zzd |= 1;
        zzaqdVar.zzg = str;
    }

    static /* synthetic */ void zzj(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zzd |= 2;
        zzaqdVar.zzh = str;
    }

    static /* synthetic */ void zzk(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 4;
        zzaqdVar.zzi = j;
    }

    static /* synthetic */ void zzl(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 16;
        zzaqdVar.zzk = j;
    }

    static /* synthetic */ void zzm(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 32;
        zzaqdVar.zzl = j;
    }

    static /* synthetic */ void zzn(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 1024;
        zzaqdVar.zzq = j;
    }

    static /* synthetic */ void zzo(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 2048;
        zzaqdVar.zzr = j;
    }

    static /* synthetic */ void zzp(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 8192;
        zzaqdVar.zzt = j;
    }

    static /* synthetic */ void zzq(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 16384;
        zzaqdVar.zzu = j;
    }

    static /* synthetic */ void zzr(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 32768;
        zzaqdVar.zzv = j;
    }

    static /* synthetic */ void zzs(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 65536;
        zzaqdVar.zzw = j;
    }

    static /* synthetic */ void zzt(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 524288;
        zzaqdVar.zzz = j;
    }

    static /* synthetic */ void zzu(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 1048576;
        zzaqdVar.zzA = j;
    }

    static /* synthetic */ void zzv(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 2097152;
        zzaqdVar.zzB = j;
    }

    static /* synthetic */ void zzw(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zzd |= 4194304;
        zzaqdVar.zzC = str;
    }

    static /* synthetic */ void zzx(zzaqd zzaqdVar, String str) {
        str.getClass();
        zzaqdVar.zzd |= 16777216;
        zzaqdVar.zzE = str;
    }

    static /* synthetic */ void zzy(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= 33554432;
        zzaqdVar.zzF = j;
    }

    static /* synthetic */ void zzz(zzaqd zzaqdVar, long j) {
        zzaqdVar.zzd |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        zzaqdVar.zzG = j;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zzf & 134217728) != 0;
    }

    public final int zzal() {
        int zza = zzapm.zza(this.zzaS);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgwq zzgwqVar = zzaqj.zza;
            return zzaR(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzapl.zza, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzaqa.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzgwqVar, "zzX", zzgwqVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzgwqVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzaqi.zza, "zzas", zzaqk.zza, "zzap", "zzat", zzaph.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzgwqVar, "zzV", "zzD", "zzax", zzgwqVar, "zzay", "zzaz", zzapw.class, "zzaA", zzgwqVar, "zzaB", zzapj.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzapt.zza, "zzaW", "zzaX", "zzaY"});
        }
        if (i2 == 3) {
            return new zzaqd();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzapg(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaqm zzf() {
        zzaqm zzaqmVar = this.zzaW;
        return zzaqmVar == null ? zzaqm.zzd() : zzaqmVar;
    }

    public final String zzg() {
        return this.zzaR;
    }

    public final String zzh() {
        return this.zzC;
    }
}
