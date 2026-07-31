package com.google.android.gms.internal.ads;

import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class yl3 extends aq3<yl3, xl3> implements lr3 {
    private static final yl3 zzb;
    private String zze = "";
    private jq3<wk3> zzf = aq3.r();

    static {
        yl3 yl3Var = new yl3();
        zzb = yl3Var;
        aq3.v(yl3.class, yl3Var);
    }

    private yl3() {
    }

    public static yl3 G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", wk3.class});
        }
        if (i8 == 3) {
            return new yl3();
        }
        wl3 wl3Var = null;
        if (i8 == 4) {
            return new xl3(wl3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final List<wk3> H() {
        return this.zzf;
    }
}
