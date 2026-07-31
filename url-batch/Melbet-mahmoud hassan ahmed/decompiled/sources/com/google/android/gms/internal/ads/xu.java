package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xu extends aq3<xu, wu> implements lr3 {
    private static final xu zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        xu xuVar = new xu();
        zzb = xuVar;
        aq3.v(xu.class, xuVar);
    }

    private xu() {
    }

    public static wu F() {
        return zzb.x();
    }

    static /* synthetic */ void H(xu xuVar, boolean z6) {
        xuVar.zze |= 1;
        xuVar.zzf = z6;
    }

    static /* synthetic */ void I(xu xuVar, int i7) {
        xuVar.zze |= 2;
        xuVar.zzg = i7;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new xu();
        }
        gr grVar = null;
        if (i8 == 4) {
            return new wu(grVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean J() {
        return this.zzf;
    }
}
