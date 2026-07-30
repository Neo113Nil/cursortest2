package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class DI extends AbstractC3199fL {
    private static final DI zzd;
    private static volatile GL zze;
    private int zza;
    private String zzb = "";
    private C3573mI zzc;

    static {
        DI di = new DI();
        zzd = di;
        AbstractC3199fL.u(DI.class, di);
    }

    public static DI C(SK sk, YK yk) {
        return (DI) AbstractC3199fL.m(zzd, sk, yk);
    }

    public static CI D() {
        return (CI) zzd.r();
    }

    public static DI E() {
        return zzd;
    }

    public final String A() {
        return this.zzb;
    }

    public final C3573mI B() {
        C3573mI c3573mI = this.zzc;
        return c3573mI == null ? C3573mI.F() : c3573mI;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void G(C3573mI c3573mI) {
        c3573mI.getClass();
        this.zzc = c3573mI;
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
            return new KL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new DI();
        }
        if (d2 == 4) {
            return new CI(zzd);
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
        synchronized (DI.class) {
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
