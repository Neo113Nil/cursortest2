package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.vI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4058vI extends AbstractC3199fL {
    private static final C4058vI zzc;
    private static volatile GL zzd;
    private int zza;
    private InterfaceC3630nL zzb = JL.f25761x;

    static {
        C4058vI c4058vI = new C4058vI();
        zzc = c4058vI;
        AbstractC3199fL.u(C4058vI.class, c4058vI);
    }

    public static C3896sI A() {
        return (C3896sI) zzc.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final void C(C4004uI c4004uI) {
        InterfaceC3630nL interfaceC3630nL = this.zzb;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzb = interfaceC3630nL.A(size + size);
        }
        this.zzb.add(c4004uI);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C4004uI.class});
        }
        if (d2 == 3) {
            return new C4058vI();
        }
        if (d2 == 4) {
            return new C3896sI(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzd;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C4058vI.class) {
            try {
                gl = zzd;
                if (gl == null) {
                    gl = new C3144eL(zzc);
                    zzd = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
