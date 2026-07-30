package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.uH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4003uH extends AbstractC3199fL {
    private static final C4003uH zzd;
    private static volatile GL zze;
    private int zza;
    private C4111wH zzb;
    private int zzc;

    static {
        C4003uH c4003uH = new C4003uH();
        zzd = c4003uH;
        AbstractC3199fL.u(C4003uH.class, c4003uH);
    }

    public static C3949tH C() {
        return (C3949tH) zzd.r();
    }

    public static C4003uH D() {
        return zzd;
    }

    public final C4111wH A() {
        C4111wH c4111wH = this.zzb;
        return c4111wH == null ? C4111wH.C() : c4111wH;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(C4111wH c4111wH) {
        this.zzb = c4111wH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C4003uH();
        }
        if (d2 == 4) {
            return new C3949tH(zzd);
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
        synchronized (C4003uH.class) {
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
