package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.b8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2968b8 extends AbstractC3199fL {
    private static final C2968b8 zzf;
    private static volatile GL zzg;
    private int zza;
    private C3131e8 zzb;
    private SK zzc = SK.f27529u;
    private long zzd;
    private long zze;

    static {
        C2968b8 c2968b8 = new C2968b8();
        zzf = c2968b8;
        AbstractC3199fL.u(C2968b8.class, c2968b8);
    }

    public static C2968b8 D() {
        return zzf;
    }

    public final C3131e8 A() {
        C3131e8 c3131e8 = this.zzb;
        return c3131e8 == null ? C3131e8.C() : c3131e8;
    }

    public final SK B() {
        return this.zzc;
    }

    public final long C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C2968b8();
        }
        if (d2 == 4) {
            return new C3453k6(zzf);
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
        synchronized (C2968b8.class) {
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
