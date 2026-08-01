package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class bc extends k1 {
    private static final bc zzg;
    private static volatile j2 zzh;
    private int zzb;
    private t1 zze = m2.f2524s;
    private String zzf = "";

    static {
        bc bcVar = new bc();
        zzg = bcVar;
        k1.o(bc.class, bcVar);
    }

    public static bc u() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new bc();
        }
        if (i10 == 4) {
            return new ac(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzh;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (bc.class) {
            try {
                j2Var = zzh;
                if (j2Var == null) {
                    j2Var = new j1(zzg);
                    zzh = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final List t() {
        return this.zze;
    }

    public final void v(String str) {
        t1 t1Var = this.zze;
        if (!((p0) t1Var).f2659d) {
            this.zze = v4.a.g(t1Var);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}
