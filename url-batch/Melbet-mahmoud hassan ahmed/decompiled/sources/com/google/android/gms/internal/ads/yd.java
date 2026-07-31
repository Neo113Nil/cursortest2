package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yd extends aq3<yd, xd> implements lr3 {
    private static final yd zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        yd ydVar = new yd();
        zzb = ydVar;
        aq3.v(yd.class, ydVar);
    }

    private yd() {
    }

    public static xd I() {
        return zzb.x();
    }

    public static yd K() {
        return zzb;
    }

    public static yd L(uo3 uo3Var) {
        return (yd) aq3.A(zzb, uo3Var);
    }

    public static yd M(uo3 uo3Var, mp3 mp3Var) {
        return (yd) aq3.C(zzb, uo3Var, mp3Var);
    }

    static /* synthetic */ void P(yd ydVar, String str) {
        str.getClass();
        ydVar.zze |= 1;
        ydVar.zzf = str;
    }

    static /* synthetic */ void Q(yd ydVar, long j7) {
        ydVar.zze |= 16;
        ydVar.zzj = j7;
    }

    static /* synthetic */ void R(yd ydVar, String str) {
        str.getClass();
        ydVar.zze |= 2;
        ydVar.zzg = str;
    }

    static /* synthetic */ void S(yd ydVar, long j7) {
        ydVar.zze |= 4;
        ydVar.zzh = j7;
    }

    static /* synthetic */ void T(yd ydVar, long j7) {
        ydVar.zze |= 8;
        ydVar.zzi = j7;
    }

    @Override // com.google.android.gms.internal.ads.aq3
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return aq3.u(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new yd();
        }
        wd wdVar = null;
        if (i8 == 4) {
            return new xd(wdVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final long F() {
        return this.zzi;
    }

    public final long G() {
        return this.zzh;
    }

    public final long H() {
        return this.zzj;
    }

    public final String N() {
        return this.zzg;
    }

    public final String O() {
        return this.zzf;
    }
}
