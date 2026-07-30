package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.cy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3066cy extends AbstractC3199fL {
    private static final C3066cy zzE;
    private static volatile GL zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private C3498ky zzj;
    private boolean zzk;
    private C3606my zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = com.anythink.basead.exoplayer.i.a.f8040f;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = com.anythink.expressad.video.module.a.a.m.ai;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        C3066cy c3066cy = new C3066cy();
        zzE = c3066cy;
        AbstractC3199fL.u(C3066cy.class, c3066cy);
    }

    public static C2957ay k0() {
        return (C2957ay) zzE.r();
    }

    public final /* synthetic */ void A(boolean z8) {
        this.zza |= 16;
        this.zzf = z8;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void C(C3498ky c3498ky) {
        this.zzj = c3498ky;
        this.zza |= 256;
    }

    public final /* synthetic */ void D(long j9) {
        this.zza |= 1024;
        this.zzl = j9;
    }

    public final /* synthetic */ void E(long j9) {
        this.zza |= 2048;
        this.zzm = j9;
    }

    public final /* synthetic */ void F(C3606my c3606my) {
        this.zzn = c3606my;
        this.zza |= 4096;
    }

    public final /* synthetic */ void G(long j9) {
        this.zza |= 524288;
        this.zzy = j9;
    }

    public final /* synthetic */ void H(boolean z8) {
        this.zza |= com.anythink.basead.exoplayer.h.o.f7899d;
        this.zzz = z8;
    }

    public final /* synthetic */ void I(boolean z8) {
        this.zza |= com.anythink.basead.exoplayer.b.bc;
        this.zzD = z8;
    }

    public final int J() {
        int b9 = AbstractC3217fl.b(this.zzb);
        if (b9 == 0) {
            return 1;
        }
        return b9;
    }

    public final int K() {
        int b9 = AbstractC3217fl.b(this.zzc);
        if (b9 == 0) {
            return 2;
        }
        return b9;
    }

    public final int L() {
        int i = this.zzh;
        int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final /* synthetic */ void M(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final void N() {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final boolean O() {
        return this.zzd;
    }

    public final boolean P() {
        return this.zze;
    }

    public final boolean Q() {
        return this.zzf;
    }

    public final String R() {
        return this.zzg;
    }

    public final boolean S() {
        return this.zzi;
    }

    public final C3498ky T() {
        C3498ky c3498ky = this.zzj;
        return c3498ky == null ? C3498ky.F() : c3498ky;
    }

    public final boolean U() {
        return this.zzk;
    }

    public final long V() {
        return this.zzl;
    }

    public final long W() {
        return this.zzm;
    }

    public final C3606my X() {
        C3606my c3606my = this.zzn;
        return c3606my == null ? C3606my.I() : c3606my;
    }

    public final long Y() {
        return this.zzo;
    }

    public final long Z() {
        return this.zzp;
    }

    public final long a0() {
        return this.zzu;
    }

    public final String b0() {
        return this.zzv;
    }

    public final String c0() {
        return this.zzw;
    }

    public final long d0() {
        return this.zzx;
    }

    public final long e0() {
        return this.zzy;
    }

    public final boolean f0() {
        return this.zzz;
    }

    public final boolean g0() {
        return this.zzA;
    }

    public final boolean h0() {
        return this.zzB;
    }

    public final boolean i0() {
        return this.zzC;
    }

    public final boolean j0() {
        return this.zzD;
    }

    public final /* synthetic */ void l0(boolean z8) {
        this.zza |= 4;
        this.zzd = z8;
    }

    public final /* synthetic */ void m0(boolean z8) {
        this.zza |= 8;
        this.zze = z8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3293h6 c3293h6 = C3293h6.f31146A;
            return new KL(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", c3293h6, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", c3293h6, "zze", "zzf", "zzh", "zzD"});
        }
        if (d2 == 3) {
            return new C3066cy();
        }
        if (d2 == 4) {
            return new C2957ay(zzE);
        }
        if (d2 == 5) {
            return zzE;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzF;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3066cy.class) {
            try {
                gl = zzF;
                if (gl == null) {
                    gl = new C3144eL(zzE);
                    zzF = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
