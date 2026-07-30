package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface w extends l {
    default int b(o0 o0Var, p1.e0 e0Var, int i7) {
        return f(new p1.o(o0Var, o0Var.getLayoutDirection()), new p1.j(e0Var, 2, 1, 2), r4.a.c(0, i7, 7)).n();
    }

    default int e(o0 o0Var, p1.e0 e0Var, int i7) {
        int i8 = 2;
        return f(new p1.o(o0Var, o0Var.getLayoutDirection()), new p1.j(e0Var, i8, i8, 2), r4.a.c(i7, 0, 13)).f();
    }

    p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8);

    default int h(o0 o0Var, p1.e0 e0Var, int i7) {
        int i8 = 1;
        return f(new p1.o(o0Var, o0Var.getLayoutDirection()), new p1.j(e0Var, i8, i8, 2), r4.a.c(0, i7, 7)).n();
    }

    default int i(o0 o0Var, p1.e0 e0Var, int i7) {
        return f(new p1.o(o0Var, o0Var.getLayoutDirection()), new p1.j(e0Var, 1, 2, 2), r4.a.c(i7, 0, 13)).f();
    }
}
