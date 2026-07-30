package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.iv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3387iv extends AbstractC3199fL {
    private static final C3387iv zzi;
    private static volatile GL zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        C3387iv c3387iv = new C3387iv();
        zzi = c3387iv;
        AbstractC3199fL.u(C3387iv.class, c3387iv);
    }

    public static C3335hv A() {
        return (C3335hv) zzi.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void C(long j9) {
        this.zzb = j9;
    }

    public final /* synthetic */ void D(long j9) {
        this.zzc = j9;
    }

    public final /* synthetic */ void E(boolean z8) {
        this.zzd = z8;
    }

    public final /* synthetic */ void F(long j9) {
        this.zze = j9;
    }

    public final /* synthetic */ void G(long j9) {
        this.zzf = j9;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void I(int i) {
        this.zzh = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (d2 == 3) {
            return new C3387iv();
        }
        if (d2 == 4) {
            return new C3335hv(zzi);
        }
        if (d2 == 5) {
            return zzi;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzj;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3387iv.class) {
            try {
                gl = zzj;
                if (gl == null) {
                    gl = new C3144eL(zzi);
                    zzj = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
