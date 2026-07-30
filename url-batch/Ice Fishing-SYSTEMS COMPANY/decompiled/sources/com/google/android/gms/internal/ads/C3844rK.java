package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.rK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3844rK extends AbstractC3199fL {
    private static final C3844rK zzf;
    private static volatile GL zzg;
    private int zza;
    private SK zzb = SK.f27529u;
    private String zzc = "";
    private InterfaceC3630nL zzd = JL.f25761x;
    private boolean zze;

    static {
        C3844rK c3844rK = new C3844rK();
        zzf = c3844rK;
        AbstractC3199fL.u(C3844rK.class, c3844rK);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (d2 == 3) {
            return new C3844rK();
        }
        if (d2 == 4) {
            return new F9(zzf);
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
        synchronized (C3844rK.class) {
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
