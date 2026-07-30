package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gg1 extends e90 implements ad0 {
    public ro1 u;
    public km1 v;
    public kp1 w;

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        final int d = this.t.d(ej0Var, ej0Var.getLayoutDirection()) - this.s.d(ej0Var, ej0Var.getLayoutDirection());
        final int b = this.t.b(ej0Var) - this.s.b(ej0Var);
        int c = (this.t.c(ej0Var, ej0Var.getLayoutDirection()) - this.s.c(ej0Var, ej0Var.getLayoutDirection())) + d;
        int a = (this.t.a(ej0Var) - this.s.a(ej0Var)) + b;
        final zw0 c2 = qk0Var.c(nm.h(j, -c, -a));
        return xk0.q(ej0Var, nm.f(c2.d + c, j), nm.e(c2.e + a, j), new Function1() { // from class: h90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                yw0.h((yw0) obj, zw0.this, d, b);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.e90, defpackage.zl0
    public final void r0() {
        View K = m90.K(this);
        WeakHashMap weakHashMap = kp1.w;
        kp1 f = sc1.f(K);
        f.a(K);
        this.v.getClass();
        dl1 dl1Var = f.l;
        if (!Intrinsics.a(dl1Var, this.u)) {
            this.u = dl1Var;
            z0();
        }
        this.w = f;
        super.r0();
    }

    @Override // defpackage.e90, defpackage.zl0
    public final void s0() {
        View K = m90.K(this);
        kp1 kp1Var = this.w;
        if (kp1Var != null) {
            int i = kp1Var.u - 1;
            kp1Var.u = i;
            if (i == 0) {
                int i2 = ln1.a;
                hn1.a(K, null);
                K.setWindowInsetsAnimationCallback(null);
                K.removeOnAttachStateChangeListener(kp1Var.v);
            }
        }
        super.s0();
    }

    @Override // defpackage.e90
    public final void z0() {
        this.t = new dl1(this.s, this.u);
        ka0.I(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new d90(this, 0));
        y90.t(this);
    }
}
