package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.rx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3874rx extends AbstractC3199fL {
    private static final C3874rx zzb;
    private static volatile GL zzc;
    private C4169xL zza = C4169xL.f35141u;

    static {
        C3874rx c3874rx = new C3874rx();
        zzb = c3874rx;
        AbstractC3199fL.u(C3874rx.class, c3874rx);
    }

    public static C3874rx C(FileInputStream fileInputStream) {
        C3874rx c3874rx = zzb;
        UK uk = new UK(fileInputStream);
        YK yk = YK.f28820a;
        int i = KK.f25952a;
        AbstractC3199fL l9 = AbstractC3199fL.l(c3874rx, uk, YK.f28821b);
        AbstractC3199fL.z(l9);
        return (C3874rx) l9;
    }

    public static C3874rx D() {
        return zzb;
    }

    public final int A() {
        return this.zza.size();
    }

    public final Map B() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final C4169xL E() {
        C4169xL c4169xL = this.zza;
        if (!c4169xL.f35142n) {
            this.zza = c4169xL.h();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", AbstractC3821qx.f33912a});
        }
        if (d2 == 3) {
            return new C3874rx();
        }
        if (d2 == 4) {
            return new C3767px(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzc;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3874rx.class) {
            try {
                gl = zzc;
                if (gl == null) {
                    gl = new C3144eL(zzb);
                    zzc = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
