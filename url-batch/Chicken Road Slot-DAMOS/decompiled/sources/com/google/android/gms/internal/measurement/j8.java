package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j8 extends k1 {
    private static final j8 zzp;
    private static volatile j2 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private b2 zzm;
    private b2 zzn;
    private String zzo;

    static {
        j8 j8Var = new j8();
        zzp = j8Var;
        k1.o(j8.class, j8Var);
    }

    public j8() {
        b2 b2Var = b2.f2159e;
        this.zzm = b2Var;
        this.zzn = b2Var;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static g8 Y() {
        return (g8) zzp.j();
    }

    public static j8 Z() {
        return zzp;
    }

    public final /* synthetic */ void A() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void B(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    public final b2 C() {
        b2 b2Var = this.zzm;
        if (!b2Var.f2160d) {
            this.zzm = b2Var.a();
        }
        return this.zzm;
    }

    public final b2 D() {
        b2 b2Var = this.zzn;
        if (!b2Var.f2160d) {
            this.zzn = b2Var.a();
        }
        return this.zzn;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean G() {
        return (this.zzb & 1) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 2) != 0;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 4) != 0;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 8) != 0;
    }

    public final long N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zzb & 16) != 0;
    }

    public final String P() {
        return this.zzi;
    }

    public final boolean Q() {
        return (this.zzb & 32) != 0;
    }

    public final String R() {
        return this.zzj;
    }

    public final boolean S() {
        return (this.zzb & 64) != 0;
    }

    public final String T() {
        return this.zzk;
    }

    public final boolean U() {
        return (this.zzb & 128) != 0;
    }

    public final long V() {
        return this.zzl;
    }

    public final boolean W() {
        return (this.zzb & 256) != 0;
    }

    public final String X() {
        return this.zzo;
    }

    public final /* synthetic */ void a0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void b0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void c0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void d0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void e0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", h8.f2369a, "zzn", i8.f2396a, "zzo"});
        }
        if (i10 == 3) {
            return new j8();
        }
        if (i10 == 4) {
            return new g8(zzp);
        }
        if (i10 == 5) {
            return zzp;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzq;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (j8.class) {
            try {
                j2Var = zzq;
                if (j2Var == null) {
                    j2Var = new j1(zzp);
                    zzq = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final /* synthetic */ void t() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void z(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }
}
