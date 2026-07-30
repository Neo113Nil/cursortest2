package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.my, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3606my extends AbstractC3199fL {
    private static final C3606my zzl;
    private static volatile GL zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = com.anythink.core.common.g.c.f13422b;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        C3606my c3606my = new C3606my();
        zzl = c3606my;
        AbstractC3199fL.u(C3606my.class, c3606my);
    }

    public static C3552ly H() {
        return (C3552ly) zzl.r();
    }

    public static C3606my I() {
        return zzl;
    }

    public final boolean A() {
        return this.zzd;
    }

    public final long B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return this.zzi;
    }

    public final long F() {
        return this.zzj;
    }

    public final long G() {
        return this.zzk;
    }

    public final /* synthetic */ void J(boolean z8) {
        this.zza |= 4;
        this.zzd = z8;
    }

    public final /* synthetic */ void K(long j9) {
        this.zza |= 64;
        this.zzh = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (d2 == 3) {
            return new C3606my();
        }
        if (d2 == 4) {
            return new C3552ly(zzl);
        }
        if (d2 == 5) {
            return zzl;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzm;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3606my.class) {
            try {
                gl = zzm;
                if (gl == null) {
                    gl = new C3144eL(zzl);
                    zzm = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
