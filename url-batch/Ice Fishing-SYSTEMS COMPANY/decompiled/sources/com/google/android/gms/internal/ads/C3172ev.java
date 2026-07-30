package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.ev, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3172ev extends AbstractC3199fL {
    private static final C3172ev zzc;
    private static volatile GL zzd;
    private int zza;
    private C3009bv zzb;

    static {
        C3172ev c3172ev = new C3172ev();
        zzc = c3172ev;
        AbstractC3199fL.u(C3172ev.class, c3172ev);
    }

    public static C3117dv A() {
        return (C3117dv) zzc.r();
    }

    public final /* synthetic */ void B(C3009bv c3009bv) {
        this.zzb = c3009bv;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new C3172ev();
        }
        if (d2 == 4) {
            return new C3117dv(zzc);
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
        synchronized (C3172ev.class) {
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
