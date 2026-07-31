package a0;

import x1.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u implements m0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f147b;

    public /* synthetic */ u(int i, Object obj) {
        this.f146a = i;
        this.f147b = obj;
    }

    @Override // m0.g0
    public final void a() {
        switch (this.f146a) {
            case 0:
                ((w) this.f147b).f164d = null;
                break;
            case 1:
                n0 n0Var = (n0) this.f147b;
                f1 f1Var = n0Var.f119c;
                if (f1Var != null) {
                    f1Var.f78a = false;
                }
                n0Var.f119c = null;
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((i0) this.f147b).f96f = true;
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                u2.p pVar = (u2.p) this.f147b;
                pVar.dismiss();
                u2.n nVar = pVar.f7345k;
                i2 i2Var = nVar.f8325f;
                if (i2Var != null) {
                    i2Var.e();
                }
                nVar.f8325f = null;
                nVar.requestLayout();
                break;
            default:
                ((x1.d1) this.f147b).f8396e.b();
                break;
        }
    }
}
