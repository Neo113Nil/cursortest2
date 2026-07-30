package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.mI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3573mI extends AbstractC3199fL {
    private static final C3573mI zzd;
    private static volatile GL zze;
    private String zza = "";
    private SK zzb = SK.f27529u;
    private int zzc;

    static {
        C3573mI c3573mI = new C3573mI();
        zzd = c3573mI;
        AbstractC3199fL.u(C3573mI.class, c3573mI);
    }

    public static C3573mI D(byte[] bArr, YK yk) {
        AbstractC3199fL y6 = AbstractC3199fL.y(zzd, bArr, bArr.length, yk);
        AbstractC3199fL.z(y6);
        return (C3573mI) y6;
    }

    public static C3519lI E() {
        return (C3519lI) zzd.r();
    }

    public static C3573mI F() {
        return zzd;
    }

    public final String A() {
        return this.zza;
    }

    public final SK B() {
        return this.zzb;
    }

    public final EI C() {
        EI b9 = EI.b(this.zzc);
        return b9 == null ? EI.UNRECOGNIZED : b9;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void H(SK sk) {
        sk.getClass();
        this.zzb = sk;
    }

    public final /* synthetic */ void I(EI ei) {
        this.zzc = ei.a();
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
            return new C3573mI();
        }
        if (d2 == 4) {
            return new C3519lI(zzd);
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
        synchronized (C3573mI.class) {
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
