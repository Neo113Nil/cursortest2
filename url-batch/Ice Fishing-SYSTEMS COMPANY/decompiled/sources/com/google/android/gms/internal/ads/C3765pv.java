package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.pv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3765pv extends AbstractC3199fL {
    private static final C3765pv zzg;
    private static volatile GL zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        C3765pv c3765pv = new C3765pv();
        zzg = c3765pv;
        AbstractC3199fL.u(C3765pv.class, c3765pv);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new C3765pv();
        }
        if (d2 == 4) {
            return new F9(zzg);
        }
        if (d2 == 5) {
            return zzg;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzh;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3765pv.class) {
            try {
                gl = zzh;
                if (gl == null) {
                    gl = new C3144eL(zzg);
                    zzh = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
