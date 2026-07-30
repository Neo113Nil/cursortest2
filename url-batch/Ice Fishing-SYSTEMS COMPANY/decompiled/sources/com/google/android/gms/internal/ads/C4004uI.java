package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.uI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4004uI extends AbstractC3199fL {
    private static final C4004uI zze;
    private static volatile GL zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        C4004uI c4004uI = new C4004uI();
        zze = c4004uI;
        AbstractC3199fL.u(C4004uI.class, c4004uI);
    }

    public static C3950tI A() {
        return (C3950tI) zze.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void C(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void D(EI ei) {
        this.zzd = ei.a();
    }

    public final void E(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            AbstractC3684oL.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C4004uI();
        }
        if (d2 == 4) {
            return new C3950tI(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzf;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C4004uI.class) {
            try {
                gl = zzf;
                if (gl == null) {
                    gl = new C3144eL(zze);
                    zzf = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
