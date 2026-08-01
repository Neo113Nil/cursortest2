package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.j1;
import n0.m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 implements m2 {

    /* renamed from: d, reason: collision with root package name */
    public final w0 f9878d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f9879e;

    /* renamed from: i, reason: collision with root package name */
    public wd.p f9880i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t0 f9881r;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(t0 t0Var, w0 w0Var, Function1 function1, Function1 function12) {
        this.f9881r = t0Var;
        this.f9878d = w0Var;
        this.f9879e = function1;
        this.f9880i = (wd.p) function12;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, wd.p] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, wd.p] */
    public final void b(u0 u0Var) {
        w0 w0Var = this.f9878d;
        j1 j1Var = w0Var.f9905u;
        j1 j1Var2 = w0Var.f9900e;
        n0.f1 f1Var = w0Var.f9906v;
        Object invoke = this.f9880i.invoke(u0Var.c());
        if (this.f9881r.f9885c.g()) {
            w0Var.h(this.f9880i.invoke(u0Var.a()), invoke, (p) this.f9879e.invoke(u0Var));
            return;
        }
        p pVar = (p) this.f9879e.invoke(u0Var);
        if (w0Var.f9907w) {
            q0 q0Var = w0Var.f9904t;
            if (Intrinsics.a(invoke, q0Var != null ? q0Var.f9864c : null)) {
                return;
            }
        }
        if (Intrinsics.a(j1Var2.getValue(), invoke) && f1Var.h() == -1.0f) {
            return;
        }
        j1Var2.setValue(invoke);
        w0Var.f9901i.setValue(pVar);
        w0Var.g(f1Var.h() == -3.0f ? invoke : w0Var.f9908x.getValue(), !((Boolean) j1Var.getValue()).booleanValue());
        j1Var.setValue(Boolean.valueOf(f1Var.h() == -3.0f));
        if (f1Var.h() >= 0.0f) {
            w0Var.f(w0Var.b().b((long) (f1Var.h() * w0Var.b().a())));
        } else if (f1Var.h() == -3.0f) {
            w0Var.f(invoke);
        }
        w0Var.f9907w = false;
        f1Var.i(-1.0f);
    }

    @Override // n0.m2
    public final Object getValue() {
        b(this.f9881r.f9885c.f());
        return this.f9878d.f9908x.getValue();
    }
}
