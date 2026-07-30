package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.kI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3465kI extends AbstractC3199fL {
    private static final C3465kI zzd;
    private static volatile GL zze;
    private String zza = "";
    private SK zzb = SK.f27529u;
    private int zzc;

    static {
        C3465kI c3465kI = new C3465kI();
        zzd = c3465kI;
        AbstractC3199fL.u(C3465kI.class, c3465kI);
    }

    public static C3411jI D() {
        return (C3411jI) zzd.r();
    }

    public static C3465kI E() {
        return zzd;
    }

    public final String A() {
        return this.zza;
    }

    public final SK B() {
        return this.zzb;
    }

    public final int C() {
        int i = this.zzc;
        int i4 = 1;
        if (i != 0) {
            int i9 = 2;
            if (i != 1) {
                i4 = 3;
                if (i != 2) {
                    i9 = 4;
                    if (i != 3) {
                        i4 = i != 4 ? 0 : 5;
                    }
                }
            }
            i4 = i9;
        }
        if (i4 == 0) {
            return 6;
        }
        return i4;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void G(SK sk) {
        sk.getClass();
        this.zzb = sk;
    }

    public final void H(int i) {
        int i4;
        if (i == 6) {
            AbstractC3684oL.a();
            throw null;
        }
        switch (i) {
            case 1:
                i4 = 0;
                break;
            case 2:
                i4 = 1;
                break;
            case 3:
                i4 = 2;
                break;
            case 4:
                i4 = 3;
                break;
            case 5:
                i4 = 4;
                break;
            case 6:
                i4 = -1;
                break;
            default:
                throw null;
        }
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3465kI();
        }
        if (d2 == 4) {
            return new C3411jI(zzd);
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
        synchronized (C3465kI.class) {
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
