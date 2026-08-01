package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class vb extends k1 {
    private static final p1 zzl = new h1(14);
    private static final vb zzq;
    private static volatile j2 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private t1 zzi;
    private t1 zzj;
    private o1 zzk;
    private xb zzm;
    private boolean zzn;
    private boolean zzo;
    private tb zzp;
    private v0 zze = v0.f2860e;
    private String zzg = "";

    static {
        vb vbVar = new vb();
        zzq = vbVar;
        k1.o(vb.class, vbVar);
    }

    public vb() {
        m2 m2Var = m2.f2524s;
        this.zzi = m2Var;
        this.zzj = m2Var;
        this.zzk = l1.f2490s;
    }

    public static ub G() {
        return (ub) zzq.j();
    }

    public static vb H() {
        return zzq;
    }

    public final List A() {
        return new q1(this.zzk, zzl);
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final xb C() {
        xb xbVar = this.zzm;
        return xbVar == null ? xb.v() : xbVar;
    }

    public final boolean D() {
        return this.zzn;
    }

    public final boolean E() {
        return this.zzo;
    }

    public final tb F() {
        tb tbVar = this.zzp;
        return tbVar == null ? tb.u() : tbVar;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", l0.f2475b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i10 == 3) {
            return new vb();
        }
        if (i10 == 4) {
            return new ub(zzq);
        }
        if (i10 == 5) {
            return zzq;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzr;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (vb.class) {
            try {
                j2Var = zzr;
                if (j2Var == null) {
                    j2Var = new j1(zzq);
                    zzr = j2Var;
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

    public final v0 u() {
        return this.zze;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final t1 y() {
        return this.zzi;
    }

    public final t1 z() {
        return this.zzj;
    }
}
