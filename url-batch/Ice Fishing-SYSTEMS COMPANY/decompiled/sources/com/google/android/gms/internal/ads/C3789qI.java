package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.qI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3789qI extends AbstractC3199fL {
    private static final C3789qI zzf;
    private static volatile GL zzg;
    private int zza;
    private C3465kI zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3789qI c3789qI = new C3789qI();
        zzf = c3789qI;
        AbstractC3199fL.u(C3789qI.class, c3789qI);
    }

    public static C3735pI E() {
        return (C3735pI) zzf.r();
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final C3465kI B() {
        C3465kI c3465kI = this.zzb;
        return c3465kI == null ? C3465kI.E() : c3465kI;
    }

    public final int C() {
        return this.zzd;
    }

    public final EI D() {
        EI b9 = EI.b(this.zze);
        return b9 == null ? EI.UNRECOGNIZED : b9;
    }

    public final /* synthetic */ void F(C3465kI c3465kI) {
        this.zzb = c3465kI;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzd = i;
    }

    public final /* synthetic */ void H(EI ei) {
        this.zze = ei.a();
    }

    public final int I() {
        int i = this.zzc;
        int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final void J(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            AbstractC3684oL.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3789qI();
        }
        if (d2 == 4) {
            return new C3735pI(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3789qI.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
