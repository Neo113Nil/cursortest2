package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class lb extends k1 {
    private static final lb zzj;
    private static volatile j2 zzk;
    private int zzb;
    private long zzh;
    private b2 zzi = b2.f2159e;
    private String zze = "";
    private v0 zzf = v0.f2860e;
    private String zzg = "";

    static {
        lb lbVar = new lb();
        zzj = lbVar;
        k1.o(lb.class, lbVar);
    }

    public static lb A() {
        return zzj;
    }

    public static lb z(y0 y0Var, c1 c1Var) {
        k1 i3 = zzj.i();
        try {
            o2 a9 = l2.f2493c.a(i3.getClass());
            androidx.datastore.preferences.protobuf.j jVar = y0Var.f3001c;
            if (jVar == null) {
                jVar = new androidx.datastore.preferences.protobuf.j(y0Var);
            }
            a9.f(i3, jVar, c1Var);
            a9.h(i3);
            k1.r(i3);
            return (lb) i3;
        } catch (s2 e2) {
            throw e2.a();
        } catch (v1 e9) {
            if (e9.f2862d) {
                throw new v1(e9.getMessage(), e9);
            }
            throw e9;
        } catch (IOException e10) {
            if (e10.getCause() instanceof v1) {
                throw ((v1) e10.getCause());
            }
            throw new v1(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof v1) {
                throw ((v1) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", kb.f2448a});
        }
        if (i10 == 3) {
            return new lb();
        }
        if (i10 == 4) {
            return new n7(zzj);
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
        synchronized (lb.class) {
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

    public final int x() {
        return this.zzi.size();
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
