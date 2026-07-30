package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.RandomAccess;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class My extends AbstractC3199fL {
    private static final My zzf;
    private static volatile GL zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private InterfaceC3414jL zze = C3254gL.f30989x;

    static {
        My my = new My();
        zzf = my;
        AbstractC3199fL.u(My.class, my);
    }

    public static My E(QK qk) {
        My my = zzf;
        YK yk = YK.f28820a;
        int i = KK.f25952a;
        AbstractC3199fL m8 = AbstractC3199fL.m(my, qk, YK.f28821b);
        AbstractC3199fL.z(m8);
        return (My) m8;
    }

    public static Ly F() {
        return (Ly) zzf.r();
    }

    public static My G() {
        return zzf;
    }

    public final C3077d8 A() {
        return this.zzb == 1 ? (C3077d8) this.zzc : C3077d8.I();
    }

    public final C2968b8 B() {
        return this.zzb == 2 ? (C2968b8) this.zzc : C2968b8.D();
    }

    public final X7 C() {
        X7 b9 = X7.b(this.zzd);
        return b9 == null ? X7.UNSUPPORTED : b9;
    }

    public final List D() {
        return this.zze;
    }

    public final /* synthetic */ void H(C3077d8 c3077d8) {
        c3077d8.getClass();
        this.zzc = c3077d8;
        this.zzb = 1;
    }

    public final /* synthetic */ void I(C2968b8 c2968b8) {
        c2968b8.getClass();
        this.zzc = c2968b8;
        this.zzb = 2;
    }

    public final void J(X7 x72) {
        this.zzd = x72.f28615n;
        this.zza |= 1;
    }

    public final void K(InterfaceC3414jL interfaceC3414jL) {
        RandomAccess randomAccess = this.zze;
        if (!((JK) randomAccess).f25759n) {
            C3254gL c3254gL = (C3254gL) randomAccess;
            int i = c3254gL.f30991v;
            this.zze = c3254gL.A(i + i);
        }
        IK.e(interfaceC3414jL, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", C3077d8.class, C2968b8.class, "zzd", C3293h6.f31163o, "zze"});
        }
        if (d2 == 3) {
            return new My();
        }
        if (d2 == 4) {
            return new Ly(zzf);
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
        synchronized (My.class) {
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
