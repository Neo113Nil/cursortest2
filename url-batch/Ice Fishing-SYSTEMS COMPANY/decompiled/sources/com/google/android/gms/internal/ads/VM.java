package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class VM extends AbstractC3199fL {
    private static final VM zzh;
    private static volatile GL zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private InterfaceC3414jL zzd = C3254gL.f30989x;
    private InterfaceC3630nL zzf = JL.f25761x;
    private SK zzg = SK.f27529u;

    static {
        VM vm = new VM();
        zzh = vm;
        AbstractC3199fL.u(VM.class, vm);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", UM.class, "zzg"});
        }
        if (d2 == 3) {
            return new VM();
        }
        if (d2 == 4) {
            return new UL(zzh);
        }
        if (d2 == 5) {
            return zzh;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzi;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (VM.class) {
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
    }
}
