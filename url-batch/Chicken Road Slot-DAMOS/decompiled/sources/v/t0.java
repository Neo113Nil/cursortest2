package v;

import kotlin.jvm.functions.Function1;
import n0.j1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final c6.s f9883a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f9884b = n0.h.r(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f9885c;

    public t0(z0 z0Var, c6.s sVar, String str) {
        this.f9885c = z0Var;
        this.f9883a = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s0 a(Function1 function1, Function1 function12) {
        j1 j1Var = this.f9884b;
        s0 s0Var = (s0) j1Var.getValue();
        z0 z0Var = this.f9885c;
        if (s0Var == null) {
            Object invoke = function12.invoke(z0Var.f9917a.l());
            Object invoke2 = function12.invoke(z0Var.f9917a.l());
            c6.s sVar = this.f9883a;
            l lVar = (l) ((Function1) sVar.f1868d).invoke(invoke2);
            lVar.d();
            w0 w0Var = new w0(z0Var, invoke, lVar, sVar);
            s0Var = new s0(this, w0Var, function1, function12);
            j1Var.setValue(s0Var);
            z0Var.f9924i.add(w0Var);
        }
        s0Var.f9880i = (wd.p) function12;
        s0Var.f9879e = function1;
        s0Var.b(z0Var.f());
        return s0Var;
    }
}
