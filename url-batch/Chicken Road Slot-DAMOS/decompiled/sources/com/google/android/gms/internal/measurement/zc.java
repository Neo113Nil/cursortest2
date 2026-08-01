package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class zc extends k1 {
    private static final zc zzl;
    private static volatile j2 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private t1 zzg = m2.f2524s;

    static {
        zc zcVar = new zc();
        zzl = zcVar;
        k1.o(zc.class, zcVar);
    }

    public static zc v(InputStream inputStream, c1 c1Var) {
        zc zcVar = zzl;
        y0 h10 = y0.h(inputStream, 4096);
        k1 i3 = zcVar.i();
        try {
            o2 a9 = l2.f2493c.a(i3.getClass());
            androidx.datastore.preferences.protobuf.j jVar = h10.f3001c;
            if (jVar == null) {
                jVar = new androidx.datastore.preferences.protobuf.j(h10);
            }
            a9.f(i3, jVar, c1Var);
            a9.h(i3);
            k1.r(i3);
            return (zc) i3;
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
            return new n2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", l0.f2475b, "zzi", "zzk", "zzj"});
        }
        if (i10 == 3) {
            return new zc();
        }
        if (i10 == 4) {
            return new n7(zzl);
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
        synchronized (zc.class) {
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
        return this.zzf;
    }
}
