package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class db3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ long o;
    public final /* synthetic */ bg3 p;

    public db3(dn3 dn3Var, tm3 tm3Var, long j) {
        this.m = 2;
        this.n = tm3Var;
        this.o = j;
        Objects.requireNonNull(dn3Var);
        this.p = dn3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        long j = this.o;
        Object obj = this.n;
        bg3 bg3Var = this.p;
        switch (i) {
            case 0:
                se3 se3Var = (se3) bg3Var;
                String str = (String) obj;
                se3Var.v();
                ll3.s(str);
                hi hiVar = se3Var.o;
                if (hiVar.isEmpty()) {
                    se3Var.p = j;
                }
                Integer num = (Integer) hiVar.get(str);
                if (num == null) {
                    if (hiVar.o < 100) {
                        hiVar.put(str, 1);
                        se3Var.n.put(str, Long.valueOf(j));
                        break;
                    } else {
                        vh3 vh3Var = ((pj3) se3Var.m).r;
                        pj3.m(vh3Var);
                        vh3Var.u.b("Too many ads visible");
                        break;
                    }
                } else {
                    hiVar.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            case 1:
                se3 se3Var2 = (se3) bg3Var;
                String str2 = (String) obj;
                se3Var2.v();
                ll3.s(str2);
                hi hiVar2 = se3Var2.o;
                Integer num2 = (Integer) hiVar2.get(str2);
                pj3 pj3Var = (pj3) se3Var2.m;
                if (num2 == null) {
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.c(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    dn3 dn3Var = pj3Var.x;
                    vh3 vh3Var3 = pj3Var.r;
                    pj3.l(dn3Var);
                    tm3 C = dn3Var.C(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        hiVar2.put(str2, Integer.valueOf(intValue));
                        break;
                    } else {
                        hiVar2.remove(str2);
                        hi hiVar3 = se3Var2.n;
                        Long l = (Long) hiVar3.get(str2);
                        if (l == null) {
                            pj3.m(vh3Var3);
                            vh3Var3.r.b("First ad unit exposure time was never set");
                        } else {
                            long longValue = j - l.longValue();
                            hiVar3.remove(str2);
                            se3Var2.B(str2, longValue, C);
                        }
                        if (hiVar2.isEmpty()) {
                            long j2 = se3Var2.p;
                            if (j2 != 0) {
                                se3Var2.A(j - j2, C);
                                se3Var2.p = 0L;
                                break;
                            } else {
                                pj3.m(vh3Var3);
                                vh3Var3.r.b("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                dn3 dn3Var2 = (dn3) bg3Var;
                dn3Var2.A((tm3) obj, false, j);
                dn3Var2.q = null;
                jo3 p = ((pj3) dn3Var2.m).p();
                p.v();
                p.x();
                p.K(new pn3(p, null));
                break;
        }
    }

    public /* synthetic */ db3(se3 se3Var, String str, long j, int i) {
        this.m = i;
        this.n = str;
        this.o = j;
        this.p = se3Var;
    }
}
