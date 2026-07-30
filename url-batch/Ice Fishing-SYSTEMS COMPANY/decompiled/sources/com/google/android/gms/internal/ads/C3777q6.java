package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3777q6 extends AbstractC3199fL {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33646a = 0;
    private static final C3777q6 zzg;
    private static volatile GL zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        C3777q6 c3777q6 = new C3777q6();
        zzg = c3777q6;
        AbstractC3199fL.u(C3777q6.class, c3777q6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new C3777q6();
        }
        if (d2 == 4) {
            return new C3453k6(zzg);
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
        synchronized (C3777q6.class) {
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
