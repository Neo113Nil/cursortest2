package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class C6 extends AbstractC3199fL {
    private static final C6 zzj;
    private static volatile GL zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        C6 c62 = new C6();
        zzj = c62;
        AbstractC3199fL.u(C6.class, c62);
    }

    public static B6 A() {
        return (B6) zzj.r();
    }

    public final /* synthetic */ void B(long j9) {
        this.zza |= 1;
        this.zzb = j9;
    }

    public final /* synthetic */ void C(long j9) {
        this.zza |= 4;
        this.zzd = j9;
    }

    public final /* synthetic */ void D(long j9) {
        this.zza |= 8;
        this.zze = j9;
    }

    public final /* synthetic */ void E(long j9) {
        this.zza |= 16;
        this.zzf = j9;
    }

    public final /* synthetic */ void F(long j9) {
        this.zza |= 32;
        this.zzg = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new C6();
        }
        if (d2 == 4) {
            return new B6(zzj);
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
        synchronized (C6.class) {
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
