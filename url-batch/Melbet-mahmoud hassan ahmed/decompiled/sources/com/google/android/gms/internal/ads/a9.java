package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class a9 extends aq3<a9, j8> implements lr3 {
    private static final a9 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzG;
    private long zzH;
    private long zzI;
    private long zzK;
    private c9 zzN;
    private v8 zzaD;
    private long zzaF;
    private boolean zzaI;
    private long zzaK;
    private j9 zzaL;
    private long zzaM;
    private x8 zzaf;
    private z8 zzah;
    private int zzas;
    private int zzat;
    private int zzau;
    private m9 zzav;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzh = "";
    private String zzi = "";
    private String zzt = "";
    private String zzD = "";
    private String zzE = "D";
    private String zzF = "";
    private String zzJ = "";
    private long zzL = -1;
    private long zzM = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = 1000;
    private int zzY = 1000;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = 1000;
    private jq3<x8> zzag = aq3.r();
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private String zzaq = "D";
    private long zzar = -1;
    private long zzaw = -1;
    private int zzax = 1000;
    private int zzay = 1000;
    private String zzaz = "D";
    private jq3<t8> zzaA = aq3.r();
    private int zzaB = 1000;
    private jq3<n8> zzaC = aq3.r();
    private String zzaE = "";
    private String zzaG = "";
    private int zzaH = 2;
    private String zzaJ = "";
    private String zzaN = "";

    static {
        a9 a9Var = new a9();
        zzb = a9Var;
        aq3.v(a9.class, a9Var);
    }

    private a9() {
    }

    static /* synthetic */ void A0(a9 a9Var, String str) {
        str.getClass();
        a9Var.zze |= 2;
        a9Var.zzi = str;
    }

    static /* synthetic */ void B0(a9 a9Var, long j7) {
        a9Var.zze |= 4;
        a9Var.zzj = j7;
    }

    static /* synthetic */ void C0(a9 a9Var, long j7) {
        a9Var.zze |= 16;
        a9Var.zzl = j7;
    }

    static /* synthetic */ void D0(a9 a9Var, long j7) {
        a9Var.zze |= 32;
        a9Var.zzm = j7;
    }

    static /* synthetic */ void E0(a9 a9Var, long j7) {
        a9Var.zze |= 1024;
        a9Var.zzr = j7;
    }

    static /* synthetic */ void F(a9 a9Var, long j7) {
        a9Var.zze |= 134217728;
        a9Var.zzI = j7;
    }

    static /* synthetic */ void F0(a9 a9Var, long j7) {
        a9Var.zze |= 2048;
        a9Var.zzs = j7;
    }

    static /* synthetic */ void G(a9 a9Var, String str) {
        str.getClass();
        a9Var.zze |= 268435456;
        a9Var.zzJ = str;
    }

    static /* synthetic */ void G0(a9 a9Var, long j7) {
        a9Var.zze |= 8192;
        a9Var.zzu = j7;
    }

    static /* synthetic */ void H(a9 a9Var, long j7) {
        a9Var.zze |= 536870912;
        a9Var.zzK = j7;
    }

    static /* synthetic */ void H0(a9 a9Var, long j7) {
        a9Var.zze |= 16384;
        a9Var.zzv = j7;
    }

    static /* synthetic */ void I(a9 a9Var, long j7) {
        a9Var.zze |= 1073741824;
        a9Var.zzL = j7;
    }

    static /* synthetic */ void I0(a9 a9Var, long j7) {
        a9Var.zze |= 32768;
        a9Var.zzw = j7;
    }

    static /* synthetic */ void J(a9 a9Var, long j7) {
        a9Var.zze |= Integer.MIN_VALUE;
        a9Var.zzM = j7;
    }

    static /* synthetic */ void J0(a9 a9Var, long j7) {
        a9Var.zze |= 65536;
        a9Var.zzx = j7;
    }

    static /* synthetic */ void K(a9 a9Var, long j7) {
        a9Var.zzf |= 2;
        a9Var.zzO = j7;
    }

    static /* synthetic */ void K0(a9 a9Var, long j7) {
        a9Var.zze |= 524288;
        a9Var.zzA = j7;
    }

    static /* synthetic */ void L(a9 a9Var, long j7) {
        a9Var.zzf |= 4;
        a9Var.zzP = j7;
    }

    static /* synthetic */ void L0(a9 a9Var, long j7) {
        a9Var.zze |= 1048576;
        a9Var.zzB = j7;
    }

    static /* synthetic */ void M(a9 a9Var, long j7) {
        a9Var.zzf |= 8;
        a9Var.zzQ = j7;
    }

    static /* synthetic */ void M0(a9 a9Var, long j7) {
        a9Var.zze |= 2097152;
        a9Var.zzC = j7;
    }

    static /* synthetic */ void N(a9 a9Var, long j7) {
        a9Var.zzf |= 16;
        a9Var.zzR = j7;
    }

    static /* synthetic */ void N0(a9 a9Var, String str) {
        str.getClass();
        a9Var.zze |= 4194304;
        a9Var.zzD = str;
    }

    static /* synthetic */ void O(a9 a9Var, long j7) {
        a9Var.zzf |= 32;
        a9Var.zzS = j7;
    }

    static /* synthetic */ void O0(a9 a9Var, String str) {
        str.getClass();
        a9Var.zze |= 16777216;
        a9Var.zzF = str;
    }

    static /* synthetic */ void P(a9 a9Var, long j7) {
        a9Var.zzf |= 64;
        a9Var.zzT = j7;
    }

    static /* synthetic */ void P0(a9 a9Var, long j7) {
        a9Var.zze |= 33554432;
        a9Var.zzG = j7;
    }

    static /* synthetic */ void Q(a9 a9Var, String str) {
        str.getClass();
        a9Var.zzf |= 128;
        a9Var.zzU = str;
    }

    static /* synthetic */ void Q0(a9 a9Var, long j7) {
        a9Var.zze |= 67108864;
        a9Var.zzH = j7;
    }

    static /* synthetic */ void R(a9 a9Var, String str) {
        str.getClass();
        a9Var.zzf |= 256;
        a9Var.zzV = str;
    }

    static /* synthetic */ void S(a9 a9Var, long j7) {
        a9Var.zzf |= 4096;
        a9Var.zzZ = j7;
    }

    static /* synthetic */ void T(a9 a9Var, long j7) {
        a9Var.zzf |= 8192;
        a9Var.zzaa = j7;
    }

    static /* synthetic */ void U(a9 a9Var, long j7) {
        a9Var.zzf |= 16384;
        a9Var.zzab = j7;
    }

    static /* synthetic */ void V(a9 a9Var, x8 x8Var) {
        x8Var.getClass();
        a9Var.zzaf = x8Var;
        a9Var.zzf |= 262144;
    }

    static /* synthetic */ void W(a9 a9Var, x8 x8Var) {
        x8Var.getClass();
        jq3<x8> jq3Var = a9Var.zzag;
        if (!jq3Var.c()) {
            a9Var.zzag = aq3.s(jq3Var);
        }
        a9Var.zzag.add(x8Var);
    }

    static /* synthetic */ void Y(a9 a9Var, z8 z8Var) {
        z8Var.getClass();
        a9Var.zzah = z8Var;
        a9Var.zzf |= 524288;
    }

    static /* synthetic */ void Z(a9 a9Var, long j7) {
        a9Var.zzf |= 2097152;
        a9Var.zzaj = j7;
    }

    static /* synthetic */ void a0(a9 a9Var, long j7) {
        a9Var.zzf |= 4194304;
        a9Var.zzak = j7;
    }

    static /* synthetic */ void b0(a9 a9Var, long j7) {
        a9Var.zzf |= 8388608;
        a9Var.zzal = j7;
    }

    static /* synthetic */ void c0(a9 a9Var, long j7) {
        a9Var.zzf |= 67108864;
        a9Var.zzao = j7;
    }

    static /* synthetic */ void d0(a9 a9Var, long j7) {
        a9Var.zzf |= 134217728;
        a9Var.zzap = j7;
    }

    static /* synthetic */ void e0(a9 a9Var, String str) {
        str.getClass();
        a9Var.zzf |= 268435456;
        a9Var.zzaq = str;
    }

    public static j8 f0() {
        return zzb.x();
    }

    static /* synthetic */ void g0(a9 a9Var, String str) {
        str.getClass();
        a9Var.zzg |= 1024;
        a9Var.zzaG = str;
    }

    static /* synthetic */ void h0(a9 a9Var, boolean z6) {
        a9Var.zzg |= 4096;
        a9Var.zzaI = z6;
    }

    static /* synthetic */ void i0(a9 a9Var, long j7) {
        a9Var.zzg |= 16384;
        a9Var.zzaK = j7;
    }

    static /* synthetic */ void n0(a9 a9Var, int i7) {
        a9Var.zzX = i7 - 1;
        a9Var.zzf |= 1024;
    }

    static /* synthetic */ void o0(a9 a9Var, int i7) {
        a9Var.zzY = i7 - 1;
        a9Var.zzf |= 2048;
    }

    static /* synthetic */ void p0(a9 a9Var, int i7) {
        a9Var.zzae = i7 - 1;
        a9Var.zzf |= 131072;
    }

    static /* synthetic */ void q0(a9 a9Var, int i7) {
        a9Var.zzax = i7 - 1;
        a9Var.zzg |= 8;
    }

    static /* synthetic */ void r0(a9 a9Var, int i7) {
        a9Var.zzay = i7 - 1;
        a9Var.zzg |= 16;
    }

    static /* synthetic */ void s0(a9 a9Var, int i7) {
        a9Var.zzaH = 5;
        a9Var.zzg |= 2048;
    }

    public static a9 u0() {
        return zzb;
    }

    public static a9 v0(byte[] bArr, mp3 mp3Var) {
        return (a9) aq3.D(zzb, bArr, mp3Var);
    }

    static /* synthetic */ void z0(a9 a9Var, String str) {
        str.getClass();
        a9Var.zze |= 1;
        a9Var.zzh = str;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            eq3 eq3Var = g9.f5492a;
            return aq3.u(zzb, "\u0001U\u0000\u0003\u0001ĮU\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂI\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈJ\u0019ဂN\u001aဌK\u001bဈ\u0016\u001cဇL\u001dဈ\u0018\u001eဈM\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHÉဉOĭဂPĮဈQ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaF", "zzB", "zzC", "zzaG", "zzaK", "zzaH", p8.f10117a, "zzD", "zzaI", "zzF", "zzaJ", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", x8.class, "zzS", "zzT", "zzU", "zzV", "zzX", eq3Var, "zzY", eq3Var, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", eq3Var, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", f9.f5044a, "zzat", h9.f6136a, "zzaq", "zzau", l8.f7862a, "zzav", "zzaw", "zzam", "zzan", "zzax", eq3Var, "zzW", "zzE", "zzay", eq3Var, "zzaz", "zzaA", t8.class, "zzaB", eq3Var, "zzaC", n8.class, "zzaD", "zzaE", "zzaL", "zzaM", "zzaN"});
        }
        if (i8 == 3) {
            return new a9();
        }
        i8 i8Var = null;
        if (i8 == 4) {
            return new j8(i8Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean j0() {
        return this.zzaI;
    }

    public final boolean k0() {
        return (this.zze & 4194304) != 0;
    }

    public final boolean l0() {
        return (this.zzg & 32768) != 0;
    }

    public final int m0() {
        int a7 = q8.a(this.zzaH);
        if (a7 == 0) {
            return 3;
        }
        return a7;
    }

    public final j9 w0() {
        j9 j9Var = this.zzaL;
        return j9Var == null ? j9.H() : j9Var;
    }

    public final String x0() {
        return this.zzaG;
    }

    public final String y0() {
        return this.zzD;
    }
}
