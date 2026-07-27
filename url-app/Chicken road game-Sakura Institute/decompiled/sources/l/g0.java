package l;

import G.C0192d;
import G.C0205j0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f7762a;

    /* renamed from: b, reason: collision with root package name */
    public final C0205j0 f7763b = C0192d.K(null, G.W.f2779l);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f7764c;

    public g0(m0 m0Var, v0 v0Var, String str) {
        this.f7764c = m0Var;
        this.f7762a = v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0 a(Function1 function1, Function1 function12) {
        C0205j0 c0205j0 = this.f7763b;
        f0 f0Var = (f0) c0205j0.getValue();
        m0 m0Var = this.f7764c;
        if (f0Var == null) {
            Object invoke = function12.invoke(m0Var.f7800a.l());
            Object invoke2 = function12.invoke(m0Var.f7800a.l());
            v0 v0Var = this.f7762a;
            AbstractC0792s abstractC0792s = (AbstractC0792s) v0Var.f7853a.invoke(invoke2);
            abstractC0792s.d();
            j0 j0Var = new j0(m0Var, invoke, abstractC0792s, v0Var);
            f0Var = new f0(this, j0Var, function1, function12);
            c0205j0.setValue(f0Var);
            m0Var.f7808i.add(j0Var);
        }
        f0Var.f7753i = (M2.p) function12;
        f0Var.f7752e = (M2.p) function1;
        f0Var.b(m0Var.f());
        return f0Var;
    }
}
