package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class wk3 extends aq3<wk3, vk3> implements lr3 {
    private static final wk3 zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        wk3 wk3Var = new wk3();
        zzb = wk3Var;
        aq3.v(wk3.class, wk3Var);
    }

    private wk3() {
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new wk3();
        }
        uk3 uk3Var = null;
        if (i8 == 4) {
            return new vk3(uk3Var);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zzg;
    }

    public final String H() {
        return this.zzi;
    }

    public final String I() {
        return this.zze;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return this.zzh;
    }
}
