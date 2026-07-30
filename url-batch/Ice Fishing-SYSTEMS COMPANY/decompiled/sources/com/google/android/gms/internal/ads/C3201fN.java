package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.fN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3201fN extends AbstractC3199fL {
    private static final C3201fN zzd;
    private static volatile GL zze;
    private int zza;
    private String zzb = "";
    private InterfaceC3414jL zzc = C3254gL.f30989x;

    static {
        C3201fN c3201fN = new C3201fN();
        zzd = c3201fN;
        AbstractC3199fL.u(C3201fN.class, c3201fN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3201fN();
        }
        if (d2 == 4) {
            return new UL(zzd);
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
        synchronized (C3201fN.class) {
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
