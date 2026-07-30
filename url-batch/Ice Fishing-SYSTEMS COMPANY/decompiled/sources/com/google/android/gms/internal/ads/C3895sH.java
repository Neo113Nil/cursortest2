package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.sH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3895sH extends AbstractC3199fL {
    private static final C3895sH zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private C4111wH zzc;
    private SK zzd = SK.f27529u;

    static {
        C3895sH c3895sH = new C3895sH();
        zze = c3895sH;
        AbstractC3199fL.u(C3895sH.class, c3895sH);
    }

    public static C3841rH D() {
        return (C3841rH) zze.r();
    }

    public static C3895sH E() {
        return zze;
    }

    public final int A() {
        return this.zzb;
    }

    public final C4111wH B() {
        C4111wH c4111wH = this.zzc;
        return c4111wH == null ? C4111wH.C() : c4111wH;
    }

    public final SK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(C4111wH c4111wH) {
        this.zzc = c4111wH;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(SK sk) {
        sk.getClass();
        this.zzd = sk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3895sH();
        }
        if (d2 == 4) {
            return new C3841rH(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzf;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3895sH.class) {
            try {
                gl = zzf;
                if (gl == null) {
                    gl = new C3144eL(zze);
                    zzf = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
