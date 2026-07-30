package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class CM extends AbstractC3199fL {
    private static final CM zzh;
    private static volatile GL zzi;
    private int zza;
    private BM zzb;
    private SK zzd;
    private SK zze;
    private int zzf;
    private byte zzg = 2;
    private InterfaceC3630nL zzc = JL.f25761x;

    static {
        CM cm = new CM();
        zzh = cm;
        AbstractC3199fL.u(CM.class, cm);
    }

    public CM() {
        QK qk = SK.f27529u;
        this.zzd = qk;
        this.zze = qk;
    }

    public static AM A() {
        return (AM) zzh.r();
    }

    public final void B(C4278zM c4278zM) {
        InterfaceC3630nL interfaceC3630nL = this.zzc;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzc = interfaceC3630nL.A(size + size);
        }
        this.zzc.add(c4278zM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        switch (AbstractC5088e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = abstractC3199fL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new KL(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", C4278zM.class, "zzd", "zze", "zzf"});
            case 3:
                return new CM();
            case 4:
                return new AM(zzh);
            case 5:
                return zzh;
            case 6:
                GL gl2 = zzi;
                if (gl2 != null) {
                    return gl2;
                }
                synchronized (CM.class) {
                    try {
                        gl = zzi;
                        if (gl == null) {
                            gl = new C3144eL(zzh);
                            zzi = gl;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gl;
            default:
                throw null;
        }
    }
}
