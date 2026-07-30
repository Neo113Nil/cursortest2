package defpackage;

import android.os.Build;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sj3 extends in3 {
    private static final sj3 zzat;
    private int zzA;
    private String zzB;
    private String zzC;
    private boolean zzD;
    private rn3 zzE;
    private String zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private String zzJ;
    private long zzK;
    private long zzL;
    private String zzM;
    private String zzN;
    private int zzO;
    private String zzP;
    private vj3 zzQ;
    private on3 zzR;
    private long zzS;
    private long zzT;
    private String zzU;
    private String zzV;
    private int zzW;
    private boolean zzX;
    private String zzY;
    private boolean zzZ;
    private kj3 zzaa;
    private String zzab;
    private rn3 zzac;
    private String zzad;
    private long zzae;
    private boolean zzaf;
    private String zzag;
    private boolean zzah;
    private String zzai;
    private int zzaj;
    private String zzak;
    private mi3 zzal;
    private int zzam;
    private gi3 zzan;
    private String zzao;
    private ck3 zzap;
    private long zzaq;
    private String zzar;
    private wi3 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private rn3 zzf;
    private rn3 zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private int zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private long zzu;
    private long zzv;
    private String zzw;
    private boolean zzx;
    private String zzy;
    private long zzz;

    static {
        sj3 sj3Var = new sj3();
        zzat = sj3Var;
        in3.m(sj3.class, sj3Var);
    }

    public sj3() {
        vo3 vo3Var = vo3.q;
        this.zzf = vo3Var;
        this.zzg = vo3Var;
        this.zzm = BuildConfig.FLAVOR;
        this.zzn = BuildConfig.FLAVOR;
        this.zzo = BuildConfig.FLAVOR;
        this.zzp = BuildConfig.FLAVOR;
        this.zzr = BuildConfig.FLAVOR;
        this.zzs = BuildConfig.FLAVOR;
        this.zzt = BuildConfig.FLAVOR;
        this.zzw = BuildConfig.FLAVOR;
        this.zzy = BuildConfig.FLAVOR;
        this.zzB = BuildConfig.FLAVOR;
        this.zzC = BuildConfig.FLAVOR;
        this.zzE = vo3Var;
        this.zzF = BuildConfig.FLAVOR;
        this.zzJ = BuildConfig.FLAVOR;
        this.zzM = BuildConfig.FLAVOR;
        this.zzN = BuildConfig.FLAVOR;
        this.zzP = BuildConfig.FLAVOR;
        this.zzR = kn3.q;
        this.zzU = BuildConfig.FLAVOR;
        this.zzV = BuildConfig.FLAVOR;
        this.zzY = BuildConfig.FLAVOR;
        this.zzab = BuildConfig.FLAVOR;
        this.zzac = vo3Var;
        this.zzad = BuildConfig.FLAVOR;
        this.zzag = BuildConfig.FLAVOR;
        this.zzai = BuildConfig.FLAVOR;
        this.zzak = BuildConfig.FLAVOR;
        this.zzao = BuildConfig.FLAVOR;
        this.zzar = BuildConfig.FLAVOR;
    }

    public static qj3 U() {
        return (qj3) zzat.h();
    }

    public static qj3 V(sj3 sj3Var) {
        en3 h = zzat.h();
        h.e(sj3Var);
        return (qj3) h;
    }

    public final long A() {
        return this.zzz;
    }

    public final boolean A0() {
        return (this.zzd & 131072) != 0;
    }

    public final /* synthetic */ void A1(boolean z) {
        this.zzb |= 131072;
        this.zzx = z;
    }

    public final boolean B() {
        return (this.zzb & 1048576) != 0;
    }

    public final String B0() {
        return this.zzag;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final int C() {
        return this.zzA;
    }

    public final boolean C0() {
        return (this.zzd & 262144) != 0;
    }

    public final /* synthetic */ void C1(String str) {
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final String D() {
        return this.zzB;
    }

    public final boolean D0() {
        return this.zzah;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final String E() {
        return this.zzC;
    }

    public final boolean E0() {
        return (this.zzd & 524288) != 0;
    }

    public final /* synthetic */ void E1(long j) {
        this.zzb |= 524288;
        this.zzz = j;
    }

    public final boolean F() {
        return (this.zzb & 8388608) != 0;
    }

    public final String F0() {
        return this.zzai;
    }

    public final /* synthetic */ void F1(int i) {
        this.zzb |= 1048576;
        this.zzA = i;
    }

    public final boolean G() {
        return this.zzD;
    }

    public final int G0() {
        return this.zzaj;
    }

    public final /* synthetic */ void G1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final rn3 H() {
        return this.zzE;
    }

    public final boolean H0() {
        return (this.zzd & 4194304) != 0;
    }

    public final /* synthetic */ void H1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final String I() {
        return this.zzF;
    }

    public final mi3 I0() {
        mi3 mi3Var = this.zzal;
        return mi3Var == null ? mi3.x() : mi3Var;
    }

    public final /* synthetic */ void I1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final boolean J() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean J0() {
        return (this.zzd & 8388608) != 0;
    }

    public final /* synthetic */ void J1() {
        this.zzb |= 8388608;
        this.zzD = false;
    }

    public final int K() {
        return this.zzG;
    }

    public final int K0() {
        return this.zzam;
    }

    public final void K1(ArrayList arrayList) {
        rn3 rn3Var = this.zzE;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzE = rn3Var.h(size + size);
        }
        zl3.c(arrayList, this.zzE);
    }

    public final boolean L() {
        return (this.zzb & 536870912) != 0;
    }

    public final boolean L0() {
        return (this.zzd & 16777216) != 0;
    }

    public final void L1() {
        this.zzE = vo3.q;
    }

    public final long M() {
        return this.zzK;
    }

    public final gi3 M0() {
        gi3 gi3Var = this.zzan;
        return gi3Var == null ? gi3.P() : gi3Var;
    }

    public final /* synthetic */ void M1(String str) {
        this.zzb |= 16777216;
        this.zzF = str;
    }

    public final boolean N() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean N0() {
        return (this.zzd & 67108864) != 0;
    }

    public final /* synthetic */ void N1(int i) {
        this.zzb |= 33554432;
        this.zzG = i;
    }

    public final String O() {
        return this.zzM;
    }

    public final ck3 O0() {
        ck3 ck3Var = this.zzap;
        return ck3Var == null ? ck3.r() : ck3Var;
    }

    public final /* synthetic */ void O1() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final boolean P() {
        return (this.zzb & 1) != 0;
    }

    public final int P0() {
        return this.zze;
    }

    public final List P1() {
        return this.zzf;
    }

    public final boolean Q() {
        return (this.zzd & 134217728) != 0;
    }

    public final /* synthetic */ void Q0(long j) {
        this.zzb |= 536870912;
        this.zzK = j;
    }

    public final void Q1() {
        rn3 rn3Var = this.zzf;
        if (((bm3) rn3Var).m) {
            return;
        }
        int size = rn3Var.size();
        this.zzf = rn3Var.h(size + size);
    }

    public final long R() {
        return this.zzaq;
    }

    public final /* synthetic */ void R0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final void R1() {
        rn3 rn3Var = this.zzg;
        if (((bm3) rn3Var).m) {
            return;
        }
        int size = rn3Var.size();
        this.zzg = rn3Var.h(size + size);
    }

    public final boolean S() {
        return (this.zzd & 536870912) != 0;
    }

    public final /* synthetic */ void S0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final int S1() {
        return this.zzf.size();
    }

    public final wi3 T() {
        wi3 wi3Var = this.zzas;
        return wi3Var == null ? wi3.r() : wi3Var;
    }

    public final /* synthetic */ void T0(int i) {
        this.zzd |= 2;
        this.zzO = i;
    }

    public final cj3 T1(int i) {
        return (cj3) this.zzf.get(i);
    }

    public final void U0(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzR;
        if (!((bm3) randomAccess).m) {
            kn3 kn3Var = (kn3) randomAccess;
            int i = kn3Var.o;
            this.zzR = kn3Var.h(i + i);
        }
        zl3.c(arrayList, this.zzR);
    }

    public final rn3 U1() {
        return this.zzg;
    }

    public final /* synthetic */ void V0(long j) {
        this.zzd |= 16;
        this.zzS = j;
    }

    public final int V1() {
        return this.zzg.size();
    }

    public final /* synthetic */ void W() {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void W0(long j) {
        this.zzd |= 32;
        this.zzT = j;
    }

    public final ek3 W1(int i) {
        return (ek3) this.zzg.get(i);
    }

    public final /* synthetic */ void X(int i, cj3 cj3Var) {
        Q1();
        this.zzf.set(i, cj3Var);
    }

    public final /* synthetic */ void X0(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean X1() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void Y(cj3 cj3Var) {
        Q1();
        this.zzf.add(cj3Var);
    }

    public final /* synthetic */ void Y0(String str) {
        str.getClass();
        this.zzd |= Utility.DEFAULT_STREAM_BUFFER_SIZE;
        this.zzab = str;
    }

    public final long Y1() {
        return this.zzh;
    }

    public final /* synthetic */ void Z(Iterable iterable) {
        Q1();
        zl3.c(iterable, this.zzf);
    }

    public final /* synthetic */ void Z0() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean Z1() {
        return (this.zzb & 4) != 0;
    }

    public final void a0() {
        this.zzf = vo3.q;
    }

    public final void a1(Set set) {
        rn3 rn3Var = this.zzac;
        if (!((bm3) rn3Var).m) {
            int size = rn3Var.size();
            this.zzac = rn3Var.h(size + size);
        }
        zl3.c(set, this.zzac);
    }

    public final long a2() {
        return this.zzi;
    }

    public final /* synthetic */ void b0(int i) {
        Q1();
        this.zzf.remove(i);
    }

    public final /* synthetic */ void b1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final boolean b2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void c0(int i, ek3 ek3Var) {
        R1();
        this.zzg.set(i, ek3Var);
    }

    public final /* synthetic */ void c1(long j) {
        this.zzd |= 32768;
        this.zzae = j;
    }

    public final long c2() {
        return this.zzj;
    }

    public final /* synthetic */ void d0(ek3 ek3Var) {
        R1();
        this.zzg.add(ek3Var);
    }

    public final /* synthetic */ void d1(boolean z) {
        this.zzd |= NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        this.zzaf = z;
    }

    public final boolean d2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void e0(int i) {
        R1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void e1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final long e2() {
        return this.zzk;
    }

    public final /* synthetic */ void f0(long j) {
        this.zzb |= 2;
        this.zzh = j;
    }

    public final /* synthetic */ void f1(boolean z) {
        this.zzd |= 262144;
        this.zzah = z;
    }

    public final boolean f2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void g0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void g1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final long g2() {
        return this.zzl;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 4;
        this.zzi = j;
    }

    public final /* synthetic */ void h1(int i) {
        this.zzd |= 1048576;
        this.zzaj = i;
    }

    public final String h2() {
        return this.zzm;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzb |= 8;
        this.zzj = j;
    }

    public final /* synthetic */ void i1(mi3 mi3Var) {
        this.zzal = mi3Var;
        this.zzd |= 4194304;
    }

    public final String i2() {
        return this.zzn;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final /* synthetic */ void j1(int i) {
        this.zzd |= 8388608;
        this.zzam = i;
    }

    public final String j2() {
        return this.zzo;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void k1(gi3 gi3Var) {
        this.zzan = gi3Var;
        this.zzd |= 16777216;
    }

    public final String k2() {
        return this.zzp;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 32;
        this.zzl = j;
    }

    public final /* synthetic */ void l1(ck3 ck3Var) {
        this.zzap = ck3Var;
        this.zzd |= 67108864;
    }

    public final boolean l2() {
        return (this.zzb & 1024) != 0;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void m1(long j) {
        this.zzd |= 134217728;
        this.zzaq = j;
    }

    public final int m2() {
        return this.zzq;
    }

    public final /* synthetic */ void n0() {
        this.zzb |= 64;
        this.zzm = "android";
    }

    public final /* synthetic */ void n1() {
        this.zzd |= 268435456;
        this.zzar = BuildConfig.FLAVOR;
    }

    public final String n2() {
        return this.zzr;
    }

    @Override // defpackage.in3
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new wo3(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", cj3.class, "zzg", ek3.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", pi3.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", mg3.g, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i2 == 3) {
            return new sj3();
        }
        if (i2 == 4) {
            return new qj3(zzat);
        }
        if (i2 == 5) {
            return zzat;
        }
        throw null;
    }

    public final /* synthetic */ void o0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void o1(wi3 wi3Var) {
        this.zzas = wi3Var;
        this.zzd |= 536870912;
    }

    public final String p() {
        return this.zzs;
    }

    public final boolean p0() {
        return (this.zzd & 2) != 0;
    }

    public final /* synthetic */ void p1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    public final String q() {
        return this.zzt;
    }

    public final int q0() {
        return this.zzO;
    }

    public final /* synthetic */ void q1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean r() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean r0() {
        return (this.zzd & 16) != 0;
    }

    public final /* synthetic */ void r1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final long s() {
        return this.zzu;
    }

    public final long s0() {
        return this.zzS;
    }

    public final /* synthetic */ void s1(int i) {
        this.zzb |= 1024;
        this.zzq = i;
    }

    public final boolean t() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean t0() {
        return (this.zzd & 128) != 0;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    public final long u() {
        return this.zzv;
    }

    public final String u0() {
        return this.zzV;
    }

    public final /* synthetic */ void u1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    public final String v() {
        return this.zzw;
    }

    public final boolean v0() {
        return (this.zzd & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= Utility.DEFAULT_STREAM_BUFFER_SIZE;
        this.zzt = str;
    }

    public final boolean w() {
        return (this.zzb & 131072) != 0;
    }

    public final String w0() {
        return this.zzab;
    }

    public final /* synthetic */ void w1(long j) {
        this.zzb |= 16384;
        this.zzu = j;
    }

    public final boolean x() {
        return this.zzx;
    }

    public final boolean x0() {
        return (this.zzd & 32768) != 0;
    }

    public final /* synthetic */ void x1() {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    public final String y() {
        return this.zzy;
    }

    public final long y0() {
        return this.zzae;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzb |= NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        this.zzw = str;
    }

    public final boolean z() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean z0() {
        return this.zzaf;
    }

    public final /* synthetic */ void z1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }
}
