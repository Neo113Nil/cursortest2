package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o81 {
    public final jd0 a;
    public final pv b;
    public final q90 c;
    public final mn0 d = new mn0(2);

    public o81(jd0 jd0Var, pv pvVar, en0 en0Var) {
        this.a = jd0Var;
        this.b = pvVar;
        this.c = en0Var;
    }

    public final l81 a() {
        return new l81(this.b, false, this.a, new h81());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(jd0 jd0Var, h81 h81Var) {
        String str;
        String str2;
        pi1 pi1Var;
        pi1 pi1Var2;
        l5 l5Var;
        l5 l5Var2;
        boolean z;
        boolean z2;
        mn0 mn0Var = this.d;
        Object[] objArr = mn0Var.a;
        int i = mn0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            i3 i3Var = (i3) objArr[i2];
            nq0 nq0Var = i3Var.d;
            AutofillManager autofillManager = (AutofillManager) nq0Var.e;
            d4 d4Var = i3Var.g;
            h81 v = jd0Var.v();
            int i3 = jd0Var.e;
            if (h81Var != null) {
                Object g = h81Var.d.g(p81.C);
                if (g == null) {
                    g = null;
                }
                y7 y7Var = (y7) g;
                if (y7Var != null) {
                    str = y7Var.e;
                    if (v != null) {
                        Object g2 = v.d.g(p81.C);
                        if (g2 == null) {
                            g2 = null;
                        }
                        y7 y7Var2 = (y7) g2;
                        if (y7Var2 != null) {
                            str2 = y7Var2.e;
                            if (str != str2) {
                                if (str == null) {
                                    nq0Var.C(d4Var, i3, true);
                                } else if (str2 == null) {
                                    nq0Var.C(d4Var, i3, false);
                                } else if (Intrinsics.a((a5) ca0.o(v, p81.r), j41.g)) {
                                    autofillManager.notifyValueChanged(d4Var, i3, AutofillValue.forText(str2));
                                }
                            }
                            if (h81Var != null) {
                                Object g3 = h81Var.d.g(p81.G);
                                if (g3 == null) {
                                    g3 = null;
                                }
                                pi1Var = (pi1) g3;
                            } else {
                                pi1Var = null;
                            }
                            if (v != null) {
                                Object g4 = v.d.g(p81.G);
                                if (g4 == null) {
                                    g4 = null;
                                }
                                pi1Var2 = (pi1) g4;
                            } else {
                                pi1Var2 = null;
                            }
                            if (pi1Var != pi1Var2) {
                                if (pi1Var == null) {
                                    nq0Var.C(d4Var, i3, true);
                                } else if (pi1Var2 == null) {
                                    nq0Var.C(d4Var, i3, false);
                                } else if (Intrinsics.a((a5) ca0.o(v, p81.r), j41.h)) {
                                    int ordinal = pi1Var2.ordinal();
                                    Boolean bool = ordinal != 0 ? ordinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                    if (bool != null) {
                                        autofillManager.notifyValueChanged(d4Var, i3, AutofillValue.forToggle(bool.booleanValue()));
                                    }
                                }
                            }
                            if (h81Var != null) {
                                Object g5 = h81Var.d.g(p81.s);
                                if (g5 == null) {
                                    g5 = null;
                                }
                                l5Var = (l5) g5;
                            } else {
                                l5Var = null;
                            }
                            if (v != null) {
                                Object g6 = v.d.g(p81.s);
                                if (g6 == null) {
                                    g6 = null;
                                }
                                l5Var2 = (l5) g6;
                            } else {
                                l5Var2 = null;
                            }
                            if (!Intrinsics.a(l5Var, l5Var2)) {
                                if (l5Var == null) {
                                    nq0Var.C(d4Var, i3, true);
                                } else if (l5Var2 == null) {
                                    nq0Var.C(d4Var, i3, false);
                                } else {
                                    autofillManager.notifyValueChanged(d4Var, i3, l5Var2.a);
                                }
                            }
                            z = h81Var == null && h81Var.d.b(p81.q);
                            z2 = v == null && v.d.b(p81.q);
                            if (z != z2) {
                                fn0 fn0Var = i3Var.k;
                                if (z2) {
                                    fn0Var.a(i3);
                                } else {
                                    fn0Var.e(i3);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != str2) {
                    }
                    if (h81Var != null) {
                    }
                    if (v != null) {
                    }
                    if (pi1Var != pi1Var2) {
                    }
                    if (h81Var != null) {
                    }
                    if (v != null) {
                    }
                    if (!Intrinsics.a(l5Var, l5Var2)) {
                    }
                    if (h81Var == null) {
                    }
                    if (v == null) {
                    }
                    if (z != z2) {
                    }
                }
            }
            str = null;
            if (v != null) {
            }
            str2 = null;
            if (str != str2) {
            }
            if (h81Var != null) {
            }
            if (v != null) {
            }
            if (pi1Var != pi1Var2) {
            }
            if (h81Var != null) {
            }
            if (v != null) {
            }
            if (!Intrinsics.a(l5Var, l5Var2)) {
            }
            if (h81Var == null) {
            }
            if (v == null) {
            }
            if (z != z2) {
            }
        }
    }
}
