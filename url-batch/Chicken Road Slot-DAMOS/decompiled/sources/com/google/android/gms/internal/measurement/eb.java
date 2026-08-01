package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class eb extends k1 {
    private static final eb zzl;
    private static volatile j2 zzm;
    private int zzb;
    private String zze = "";
    private v0 zzf = v0.f2860e;
    private String zzg = "";
    private t1 zzh;
    private t1 zzi;
    private boolean zzj;
    private long zzk;

    static {
        eb ebVar = new eb();
        zzl = ebVar;
        k1.o(eb.class, ebVar);
    }

    public eb() {
        m2 m2Var = m2.f2524s;
        this.zzh = m2Var;
        this.zzi = m2Var;
    }

    public static db z() {
        return (db) zzl.j();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void B(u0 u0Var) {
        u0Var.getClass();
        this.zzb |= 2;
        this.zzf = u0Var;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void D(gb gbVar) {
        t1 t1Var = this.zzh;
        if (!((p0) t1Var).f2659d) {
            this.zzh = v4.a.g(t1Var);
        }
        this.zzh.add(gbVar);
    }

    public final void E(String str) {
        str.getClass();
        t1 t1Var = this.zzi;
        if (!((p0) t1Var).f2659d) {
            this.zzi = v4.a.g(t1Var);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void F(boolean z10) {
        this.zzb |= 8;
        this.zzj = z10;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", gb.class, "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new eb();
        }
        if (i10 == 4) {
            return new db(zzl);
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
        synchronized (eb.class) {
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

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final v0 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final t1 x() {
        return this.zzh;
    }

    public final long y() {
        return this.zzk;
    }
}
