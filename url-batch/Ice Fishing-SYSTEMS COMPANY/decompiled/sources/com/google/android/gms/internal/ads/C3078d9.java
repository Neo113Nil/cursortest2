package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.d9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3078d9 extends AbstractC3199fL {
    private static final C3078d9 zzB;
    private static volatile GL zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private InterfaceC3630nL zzA;
    private int zzl;
    private int zzm;
    private int zzn = 1000;
    private P9 zzo;
    private R9 zzp;
    private InterfaceC3630nL zzu;
    private S9 zzv;
    private C3564m9 zzw;
    private C3242g9 zzx;
    private Z9 zzy;
    private C2933aa zzz;

    static {
        C3078d9 c3078d9 = new C3078d9();
        zzB = c3078d9;
        AbstractC3199fL.u(C3078d9.class, c3078d9);
    }

    public C3078d9() {
        JL jl = JL.f25761x;
        this.zzu = jl;
        this.zzA = jl;
    }

    public static C3078d9 A() {
        return zzB;
    }

    public final void B(EnumC2969b9 enumC2969b9) {
        this.zzm = enumC2969b9.f29427n;
        this.zzl |= 1;
    }

    public final void C(R9 r9) {
        this.zzp = r9;
        this.zzl |= 8;
    }

    public final R9 D() {
        R9 r9 = this.zzp;
        return r9 == null ? R9.A() : r9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", C3293h6.f31164p, "zzn", C3293h6.f31172x, "zzo", "zzp", "zzu", O9.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", C3941t9.class});
        }
        if (d2 == 3) {
            return new C3078d9();
        }
        if (d2 == 4) {
            return new C3023c9(zzB);
        }
        if (d2 == 5) {
            return zzB;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzC;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3078d9.class) {
            try {
                gl = zzC;
                if (gl == null) {
                    gl = new C3144eL(zzB);
                    zzC = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
