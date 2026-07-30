package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class JM extends AbstractC3199fL {
    private static final JM zzf;
    private static volatile GL zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private SK zzd;
    private SK zze;

    static {
        JM jm = new JM();
        zzf = jm;
        AbstractC3199fL.u(JM.class, jm);
    }

    public JM() {
        QK qk = SK.f27529u;
        this.zzd = qk;
        this.zze = qk;
    }

    public static IM A() {
        return (IM) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void C(SK sk) {
        sk.getClass();
        this.zza |= 4;
        this.zzd = sk;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", C3793qM.f33695j, "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new JM();
        }
        if (d2 == 4) {
            return new IM(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (JM.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
