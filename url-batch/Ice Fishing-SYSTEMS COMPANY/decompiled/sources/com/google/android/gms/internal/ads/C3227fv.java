package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.fv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3227fv extends AbstractC3199fL {
    private static final C3227fv zzd;
    private static volatile GL zze;
    private int zza;
    private InterfaceC3630nL zzb = JL.f25761x;
    private C3415jM zzc;

    static {
        C3227fv c3227fv = new C3227fv();
        zzd = c3227fv;
        AbstractC3199fL.u(C3227fv.class, c3227fv);
    }

    public static C3063cv B() {
        return (C3063cv) zzd.r();
    }

    public final int A() {
        return this.zzb.size();
    }

    public final void C(C3172ev c3172ev) {
        InterfaceC3630nL interfaceC3630nL = this.zzb;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzb = interfaceC3630nL.A(size + size);
        }
        this.zzb.add(c3172ev);
    }

    public final void D() {
        this.zzb = JL.f25761x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", C3172ev.class, "zzc"});
        }
        if (d2 == 3) {
            return new C3227fv();
        }
        if (d2 == 4) {
            return new C3063cv(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zze;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3227fv.class) {
            try {
                gl = zze;
                if (gl == null) {
                    gl = new C3144eL(zzd);
                    zze = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
