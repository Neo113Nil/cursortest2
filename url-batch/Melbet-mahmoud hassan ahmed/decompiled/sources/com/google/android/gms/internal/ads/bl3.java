package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class bl3 extends aq3<bl3, yk3> implements lr3 {
    private static final bl3 zzb;
    private int zze;
    private jq3<al3> zzf = aq3.r();

    static {
        bl3 bl3Var = new bl3();
        zzb = bl3Var;
        aq3.v(bl3.class, bl3Var);
    }

    private bl3() {
    }

    public static bl3 I(byte[] bArr, mp3 mp3Var) {
        return (bl3) aq3.D(zzb, bArr, mp3Var);
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", al3.class});
        }
        if (i8 == 3) {
            return new bl3();
        }
        xk3 xk3Var = null;
        if (i8 == 4) {
            return new yk3(xk3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zzf.size();
    }

    public final int G() {
        return this.zze;
    }

    public final List<al3> J() {
        return this.zzf;
    }
}
