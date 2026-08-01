package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l9 extends k1 {
    private static final l9 zzh;
    private static volatile j2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        l9 l9Var = new l9();
        zzh = l9Var;
        k1.o(l9.class, l9Var);
    }

    public static k9 u() {
        return (k9) zzh.j();
    }

    public static l9 v() {
        return zzh;
    }

    public final /* synthetic */ void A(int i3) {
        this.zzg = i3 - 1;
        this.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.k1
    public final Object s(int i3) {
        j2 j2Var;
        int i10 = i3 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new n2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", l0.f2486o, "zzf", l0.f2484m, "zzg", l0.f2485n});
        }
        if (i10 == 3) {
            return new l9();
        }
        if (i10 == 4) {
            return new k9(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        if (i10 != 6) {
            throw null;
        }
        j2 j2Var2 = zzi;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (l9.class) {
            try {
                j2Var = zzi;
                if (j2Var == null) {
                    j2Var = new j1(zzh);
                    zzi = j2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2Var;
    }

    public final int t() {
        int b10 = v4.a.b(this.zzf);
        if (b10 == 0) {
            return 1;
        }
        return b10;
    }

    public final void w(int i3) {
        this.zzf = v4.a.c(i3);
        this.zzb |= 2;
    }

    public final int x() {
        int i3;
        int i10 = this.zze;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i3 = 4;
                    if (i10 != 3) {
                        i3 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i3 = 3;
                }
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int y() {
        int i3;
        int i10 = this.zzg;
        if (i10 != 0) {
            i3 = 2;
            if (i10 != 1) {
                int i11 = 3;
                if (i10 != 2) {
                    i3 = 4;
                    if (i10 != 3) {
                        i11 = 5;
                        if (i10 != 4) {
                            i3 = i10 != 5 ? 0 : 6;
                        }
                    }
                }
                i3 = i11;
            }
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final /* synthetic */ void z(int i3) {
        this.zze = i3 - 1;
        this.zzb |= 1;
    }
}
