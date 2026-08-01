package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class zb extends k1 {
    private static final zb zzg;
    private static volatile j2 zzh;
    private int zzb;
    private vb zze;
    private wb zzf;

    static {
        zb zbVar = new zb();
        zzg = zbVar;
        k1.o(zb.class, zbVar);
    }

    public static zb v(byte[] bArr, c1 c1Var) {
        return (zb) k1.e(zzg, bArr, c1Var);
    }

    public static yb w() {
        return (yb) zzg.j();
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zb();
        }
        if (i10 == 4) {
            return new yb(zzg);
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
        synchronized (zb.class) {
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

    public final vb t() {
        vb vbVar = this.zze;
        return vbVar == null ? vb.H() : vbVar;
    }

    public final wb u() {
        wb wbVar = this.zzf;
        return wbVar == null ? wb.t() : wbVar;
    }

    public final /* synthetic */ void x(vb vbVar) {
        this.zze = vbVar;
        this.zzb |= 1;
    }
}
