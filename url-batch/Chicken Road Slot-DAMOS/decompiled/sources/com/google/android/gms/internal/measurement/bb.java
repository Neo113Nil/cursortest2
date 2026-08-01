package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class bb extends k1 {
    private static final bb zzg;
    private static volatile j2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        bb bbVar = new bb();
        zzg = bbVar;
        k1.o(bb.class, bbVar);
    }

    public static ab t() {
        return (ab) zzg.j();
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new bb();
        }
        if (i10 == 4) {
            return new ab(zzg);
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
        synchronized (bb.class) {
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

    public final /* synthetic */ void u(int i3) {
        this.zze = i3 - 2;
        this.zzb |= 1;
    }

    public final /* synthetic */ void v(int i3) {
        if (i3 == 1) {
            te.a1.e("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i3 - 2;
            this.zzb |= 2;
        }
    }
}
