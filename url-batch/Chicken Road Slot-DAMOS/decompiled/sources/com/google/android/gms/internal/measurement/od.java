package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class od extends k1 {
    private static final od zzj;
    private static volatile j2 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private v0 zzf = v0.f2860e;
    private String zzg = "";
    private t1 zzi = m2.f2524s;

    static {
        od odVar = new od();
        zzj = odVar;
        k1.o(od.class, odVar);
    }

    public static od A() {
        return zzj;
    }

    public static nd z() {
        return (nd) zzj.j();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(v0 v0Var) {
        v0Var.getClass();
        this.zzb |= 2;
        this.zzf = v0Var;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void F(qd qdVar) {
        t1 t1Var = this.zzi;
        if (!((p0) t1Var).f2659d) {
            this.zzi = v4.a.g(t1Var);
        }
        this.zzi.add(qdVar);
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", qd.class});
        }
        if (i10 == 3) {
            return new od();
        }
        if (i10 == 4) {
            return new nd(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzk;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (od.class) {
            try {
                j2Var = zzk;
                if (j2Var == null) {
                    j2Var = new j1(zzj);
                    zzk = j2Var;
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

    public final v0 u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final long w() {
        return this.zzh;
    }

    public final t1 x() {
        return this.zzi;
    }

    public final int y() {
        return this.zzi.size();
    }
}
