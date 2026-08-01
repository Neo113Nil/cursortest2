package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ec extends k1 {
    private static final ec zze;
    private static volatile j2 zzf;
    private b2 zzb = b2.f2159e;

    static {
        ec ecVar = new ec();
        zze = ecVar;
        k1.o(ec.class, ecVar);
    }

    public static ec u() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", cc.f2194a});
        }
        if (i10 == 3) {
            return new ec();
        }
        if (i10 == 4) {
            return new dc(zze);
        }
        if (i10 == 5) {
            return zze;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzf;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (ec.class) {
            try {
                j2Var = zzf;
                if (j2Var == null) {
                    j2Var = new j1(zze);
                    zzf = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final bc t(String str, bc bcVar) {
        str.getClass();
        bc bcVar2 = (bc) this.zzb.get(str);
        return bcVar2 != null ? bcVar2 : bcVar;
    }

    public final b2 v() {
        b2 b2Var = this.zzb;
        if (!b2Var.f2160d) {
            this.zzb = b2Var.a();
        }
        return this.zzb;
    }
}
