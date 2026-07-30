package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n80 implements fd1 {
    public final /* synthetic */ int m = 1;
    public final Object n;
    public final Object o;

    public n80(hd1 hd1Var) {
        this.n = hd1Var;
        ju juVar = ju.c;
        Class<?> cls = hd1Var.getClass();
        hu huVar = (hu) juVar.a.get(cls);
        this.o = huVar == null ? juVar.a(cls, null) : huVar;
    }

    @Override // defpackage.fd1
    public final void o(id1 id1Var, yc1 yc1Var) {
        int i = this.m;
        Object obj = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                l80 l80Var = (l80) obj;
                switch (m80.a[yc1Var.ordinal()]) {
                    case 1:
                        l80Var.getClass();
                        break;
                    case 2:
                        l80Var.f(id1Var);
                        break;
                    case 3:
                        l80Var.n(id1Var);
                        break;
                    case 4:
                        l80Var.getClass();
                        break;
                    case 5:
                        l80Var.b(id1Var);
                        break;
                    case 6:
                        l80Var.m(id1Var);
                        break;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        lh.e("ON_ANY must not been send by anybody");
                        break;
                    default:
                        a.b();
                        break;
                }
                fd1 fd1Var = (fd1) obj2;
                if (fd1Var != null) {
                    fd1Var.o(id1Var, yc1Var);
                    break;
                }
                break;
            case 1:
                if (yc1Var == yc1.ON_START) {
                    ((ad1) obj).c(this);
                    ((wd2) obj2).d();
                    break;
                }
                break;
            case 2:
                mu1 mu1Var = (mu1) obj;
                int i2 = qu1.a[yc1Var.ordinal()];
                if (i2 == 1) {
                    mu1Var.g(true);
                    break;
                } else if (i2 == 2) {
                    mu1Var.g(false);
                    break;
                } else if (i2 == 3) {
                    mu1Var.e();
                    ((ad1) obj2).c(this);
                    break;
                }
                break;
            default:
                HashMap hashMap = ((hu) obj2).a;
                hu.a((List) hashMap.get(yc1Var), id1Var, yc1Var, obj);
                hu.a((List) hashMap.get(yc1.ON_ANY), id1Var, yc1Var, obj);
                break;
        }
    }

    public n80(l80 l80Var, fd1 fd1Var) {
        l80Var.getClass();
        this.n = l80Var;
        this.o = fd1Var;
    }

    public n80(ad1 ad1Var, wd2 wd2Var) {
        this.n = ad1Var;
        this.o = wd2Var;
    }

    public n80(mu1 mu1Var, ru1 ru1Var, ad1 ad1Var) {
        this.n = mu1Var;
        this.o = ad1Var;
    }
}
