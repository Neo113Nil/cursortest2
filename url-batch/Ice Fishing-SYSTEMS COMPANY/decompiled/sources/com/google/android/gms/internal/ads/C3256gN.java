package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.gN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3256gN extends AbstractC3199fL {
    private static final C3256gN zzl;
    private static volatile GL zzm;
    private int zza;
    private SK zzb = SK.f27529u;
    private InterfaceC3414jL zzc;
    private long zzd;
    private InterfaceC3414jL zze;
    private InterfaceC3630nL zzf;
    private String zzg;
    private InterfaceC3630nL zzh;
    private C3310hN zzi;
    private C3416jN zzj;
    private C3844rK zzk;

    static {
        C3256gN c3256gN = new C3256gN();
        zzl = c3256gN;
        AbstractC3199fL.u(C3256gN.class, c3256gN);
    }

    public C3256gN() {
        C3254gL c3254gL = C3254gL.f30989x;
        this.zzc = c3254gL;
        this.zze = c3254gL;
        JL jl = JL.f25761x;
        this.zzf = jl;
        this.zzg = "";
        this.zzh = jl;
    }

    public static C3256gN A(byte[] bArr, YK yk) {
        AbstractC3199fL y6 = AbstractC3199fL.y(zzl, bArr, bArr.length, yk);
        AbstractC3199fL.z(y6);
        return (C3256gN) y6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", C3037cN.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (d2 == 3) {
            return new C3256gN();
        }
        if (d2 == 4) {
            return new UL(zzl);
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
        synchronized (C3256gN.class) {
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
