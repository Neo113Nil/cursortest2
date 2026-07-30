package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.m6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3561m6 extends AbstractC3199fL {
    private static final C3561m6 zzo;
    private static volatile GL zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private InterfaceC3630nL zzm = JL.f25761x;

    static {
        C3561m6 c3561m6 = new C3561m6();
        zzo = c3561m6;
        AbstractC3199fL.u(C3561m6.class, c3561m6);
    }

    public static C3347i6 A() {
        return (C3347i6) zzo.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void C(long j9) {
        this.zza |= 2;
        this.zzc = j9;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C3507l6.class, "zzn", C3293h6.f31152c});
        }
        if (d2 == 3) {
            return new C3561m6();
        }
        if (d2 == 4) {
            return new C3347i6(zzo);
        }
        if (d2 == 5) {
            return zzo;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzp;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3561m6.class) {
            try {
                gl = zzp;
                if (gl == null) {
                    gl = new C3144eL(zzo);
                    zzp = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
