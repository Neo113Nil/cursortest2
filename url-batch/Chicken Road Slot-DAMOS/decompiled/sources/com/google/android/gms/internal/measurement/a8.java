package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a8 extends k1 {
    private static final a8 zzw;
    private static volatile j2 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private t1 zzh;
    private t1 zzi;
    private t1 zzj;
    private String zzk;
    private boolean zzl;
    private t1 zzm;
    private t1 zzn;
    private String zzo;
    private String zzp;
    private v7 zzq;
    private c8 zzr;
    private f8 zzs;
    private d8 zzt;
    private b8 zzu;
    private o1 zzv;

    static {
        a8 a8Var = new a8();
        zzw = a8Var;
        k1.o(a8.class, a8Var);
    }

    public a8() {
        m2 m2Var = m2.f2524s;
        this.zzh = m2Var;
        this.zzi = m2Var;
        this.zzj = m2Var;
        this.zzk = "";
        this.zzm = m2Var;
        this.zzn = m2Var;
        this.zzo = "";
        this.zzp = "";
        this.zzv = l1.f2490s;
    }

    public static z7 K() {
        return (z7) zzw.j();
    }

    public static a8 L() {
        return zzw;
    }

    public final List A() {
        return this.zzj;
    }

    public final t1 B() {
        return this.zzm;
    }

    public final int C() {
        return this.zzm.size();
    }

    public final t1 D() {
        return this.zzn;
    }

    public final String E() {
        return this.zzo;
    }

    public final boolean F() {
        return (this.zzb & 128) != 0;
    }

    public final v7 G() {
        v7 v7Var = this.zzq;
        return v7Var == null ? v7.z() : v7Var;
    }

    public final boolean H() {
        return (this.zzb & 512) != 0;
    }

    public final f8 I() {
        f8 f8Var = this.zzs;
        return f8Var == null ? f8.v() : f8Var;
    }

    public final o1 J() {
        return this.zzv;
    }

    public final void M(int i3, y7 y7Var) {
        t1 t1Var = this.zzi;
        if (!((p0) t1Var).f2659d) {
            this.zzi = v4.a.g(t1Var);
        }
        this.zzi.set(i3, y7Var);
    }

    public final void N() {
        this.zzj = m2.f2524s;
    }

    public final void O() {
        this.zzm = m2.f2524s;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", e8.class, "zzi", y7.class, "zzj", i7.class, "zzk", "zzl", "zzm", q9.class, "zzn", w7.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i10 == 3) {
            return new a8();
        }
        if (i10 == 4) {
            return new z7(zzw);
        }
        if (i10 == 5) {
            return zzw;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzx;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (a8.class) {
            try {
                j2Var = zzx;
                if (j2Var == null) {
                    j2Var = new j1(zzw);
                    zzx = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final boolean t() {
        return (this.zzb & 1) != 0;
    }

    public final long u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final t1 x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzi.size();
    }

    public final y7 z(int i3) {
        return (y7) this.zzi.get(i3);
    }
}
