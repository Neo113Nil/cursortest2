package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.oM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3685oM extends AbstractC3199fL {
    private static final C3685oM zzb;
    private static volatile GL zzc;
    private InterfaceC3630nL zza = JL.f25761x;

    static {
        C3685oM c3685oM = new C3685oM();
        zzb = c3685oM;
        AbstractC3199fL.u(C3685oM.class, c3685oM);
    }

    public static C3631nM A() {
        return (C3631nM) zzb.r();
    }

    public final void B(C3577mM c3577mM) {
        InterfaceC3630nL interfaceC3630nL = this.zza;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zza = interfaceC3630nL.A(size + size);
        }
        this.zza.add(c3577mM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C3577mM.class});
        }
        if (d2 == 3) {
            return new C3685oM();
        }
        if (d2 == 4) {
            return new C3631nM(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzc;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3685oM.class) {
            try {
                gl = zzc;
                if (gl == null) {
                    gl = new C3144eL(zzb);
                    zzc = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
