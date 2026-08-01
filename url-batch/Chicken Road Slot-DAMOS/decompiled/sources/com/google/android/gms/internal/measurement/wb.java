package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class wb extends k1 {
    private static final wb zzo;
    private static volatile j2 zzp;
    private int zzb;
    private boolean zzf;
    private t1 zzh;
    private t1 zzi;
    private o1 zzj;
    private xb zzk;
    private boolean zzl;
    private boolean zzm;
    private tb zzn;
    private v0 zze = v0.f2860e;
    private String zzg = "";

    static {
        wb wbVar = new wb();
        zzo = wbVar;
        k1.o(wb.class, wbVar);
    }

    public wb() {
        m2 m2Var = m2.f2524s;
        this.zzh = m2Var;
        this.zzi = m2Var;
        this.zzj = l1.f2490s;
    }

    public static wb t() {
        return zzo;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", l0.f2475b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i10 == 3) {
            return new wb();
        }
        if (i10 == 4) {
            return new n7(zzo);
        }
        if (i10 == 5) {
            return zzo;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzp;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (wb.class) {
            try {
                j2Var = zzp;
                if (j2Var == null) {
                    j2Var = new j1(zzo);
                    zzp = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }
}
