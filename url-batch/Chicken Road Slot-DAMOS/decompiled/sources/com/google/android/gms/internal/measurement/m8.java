package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m8 extends k1 {
    private static final m8 zzl;
    private static volatile j2 zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        m8 m8Var = new m8();
        zzl = m8Var;
        k1.o(m8.class, m8Var);
    }

    public static l8 A() {
        return (l8) zzl.j();
    }

    public static m8 B() {
        return zzl;
    }

    public final /* synthetic */ void C(boolean z10) {
        this.zzb |= 1;
        this.zze = z10;
    }

    public final /* synthetic */ void D(boolean z10) {
        this.zzb |= 2;
        this.zzf = z10;
    }

    public final /* synthetic */ void E(boolean z10) {
        this.zzb |= 4;
        this.zzg = z10;
    }

    public final /* synthetic */ void F(boolean z10) {
        this.zzb |= 8;
        this.zzh = z10;
    }

    public final /* synthetic */ void G(boolean z10) {
        this.zzb |= 16;
        this.zzi = z10;
    }

    public final /* synthetic */ void H(boolean z10) {
        this.zzb |= 32;
        this.zzj = z10;
    }

    public final /* synthetic */ void I(boolean z10) {
        this.zzb |= 64;
        this.zzk = z10;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new m8();
        }
        if (i10 == 4) {
            return new l8(zzl);
        }
        if (i10 == 5) {
            return zzl;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzm;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (m8.class) {
            try {
                j2Var = zzm;
                if (j2Var == null) {
                    j2Var = new j1(zzl);
                    zzm = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final boolean t() {
        return this.zze;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return this.zzk;
    }
}
