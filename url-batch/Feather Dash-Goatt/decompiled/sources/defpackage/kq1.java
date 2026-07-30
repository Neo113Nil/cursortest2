package defpackage;

import com.feathherdashh.dashgame.R;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kq1 implements ll, sg0 {
    public final d4 d;
    public final tl e;
    public boolean g;
    public xg0 h;
    public Function2 i = kk.a;

    public kq1(d4 d4Var, tl tlVar) {
        this.d = d4Var;
        this.e = tlVar;
    }

    public final void d() {
        if (!this.g) {
            this.g = true;
            this.d.getView().setTag(R.id.wrapped_composition_tag, null);
            xg0 xg0Var = this.h;
            if (xg0Var != null) {
                xg0Var.f(this);
            }
        }
        this.e.m();
    }

    @Override // defpackage.sg0
    public final void e(vg0 vg0Var, ng0 ng0Var) {
        if (ng0Var == ng0.ON_DESTROY) {
            d();
        } else {
            if (ng0Var != ng0.ON_CREATE || this.g) {
                return;
            }
            f(this.i);
        }
    }

    public final void f(Function2 function2) {
        this.d.setOnViewTreeOwnersAvailable(new t4(this, 8, function2));
    }
}
