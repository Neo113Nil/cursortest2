package p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface r extends s0.m {
    default int b(r1.o0 o0Var, e0 e0Var, int i7) {
        return f(new o(o0Var, o0Var.getLayoutDirection()), new j(e0Var, 2, 1, 1), r4.a.c(0, i7, 7)).n();
    }

    default int e(r1.o0 o0Var, e0 e0Var, int i7) {
        return f(new o(o0Var, o0Var.getLayoutDirection()), new j(e0Var, 2, 2, 1), r4.a.c(i7, 0, 13)).f();
    }

    g0 f(h0 h0Var, e0 e0Var, long j8);

    default int h(r1.o0 o0Var, e0 e0Var, int i7) {
        return f(new o(o0Var, o0Var.getLayoutDirection()), new j(e0Var, 1, 1, 1), r4.a.c(0, i7, 7)).n();
    }

    default int i(r1.o0 o0Var, e0 e0Var, int i7) {
        return f(new o(o0Var, o0Var.getLayoutDirection()), new j(e0Var, 1, 2, 1), r4.a.c(i7, 0, 13)).f();
    }
}
