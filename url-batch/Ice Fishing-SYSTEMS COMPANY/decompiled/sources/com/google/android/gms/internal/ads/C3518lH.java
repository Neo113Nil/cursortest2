package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.lH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3518lH extends AbstractC3199fL {
    private static final C3518lH zzb;
    private static volatile GL zzc;
    private int zza;

    static {
        C3518lH c3518lH = new C3518lH();
        zzb = c3518lH;
        AbstractC3199fL.u(C3518lH.class, c3518lH);
    }

    public static C3464kH B() {
        return (C3464kH) zzb.r();
    }

    public static C3518lH C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
    }

    public final /* synthetic */ void D(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new C3518lH();
        }
        if (d2 == 4) {
            return new C3464kH(zzb);
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
        synchronized (C3518lH.class) {
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
