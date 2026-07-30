package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.e6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3129e6 extends AbstractC3199fL {
    private static final C3129e6 zzj;
    private static volatile GL zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private C3615n6 zzg;
    private C3777q6 zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        C3129e6 c3129e6 = new C3129e6();
        zzj = c3129e6;
        AbstractC3199fL.u(C3129e6.class, c3129e6);
    }

    public static C3075d6 E() {
        return (C3075d6) zzj.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final boolean B() {
        return this.zze;
    }

    public final C3615n6 C() {
        C3615n6 c3615n6 = this.zzg;
        return c3615n6 == null ? C3615n6.D() : c3615n6;
    }

    public final void D() {
        if (this.zzh == null) {
            int i = C3777q6.f33646a;
        }
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void G(boolean z8) {
        this.zza |= 8;
        this.zze = z8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", C3293h6.f31151b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new C3129e6();
        }
        if (d2 == 4) {
            return new C3075d6(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzk;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3129e6.class) {
            try {
                gl = zzk;
                if (gl == null) {
                    gl = new C3144eL(zzj);
                    zzk = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
