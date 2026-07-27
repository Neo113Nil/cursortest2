package l;

import G.X0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f0 implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public final j0 f7751d;

    /* renamed from: e, reason: collision with root package name */
    public M2.p f7752e;

    /* renamed from: i, reason: collision with root package name */
    public M2.p f7753i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0 f7754j;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(g0 g0Var, j0 j0Var, Function1 function1, Function1 function12) {
        this.f7754j = g0Var;
        this.f7751d = j0Var;
        this.f7752e = (M2.p) function1;
        this.f7753i = (M2.p) function12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void b(h0 h0Var) {
        Object invoke = this.f7753i.invoke(h0Var.c());
        boolean g4 = this.f7754j.f7764c.g();
        j0 j0Var = this.f7751d;
        if (g4) {
            j0Var.f(this.f7753i.invoke(h0Var.b()), invoke, (InterfaceC0799z) this.f7752e.invoke(h0Var));
        } else {
            j0Var.g(invoke, (InterfaceC0799z) this.f7752e.invoke(h0Var));
        }
    }

    @Override // G.X0
    public final Object getValue() {
        b(this.f7754j.f7764c.f());
        return this.f7751d.f7778p.getValue();
    }
}
