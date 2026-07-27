package w;

import G.C0208l;
import G.C0216p;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d0 extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f11153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11154e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G0.y f11155i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11156j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f11157k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G0.s f11158l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p0 f11159m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1277q f11160n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11161o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(P p4, A.a0 a0Var, G0.y yVar, boolean z4, boolean z5, G0.s sVar, p0 p0Var, C1277q c1277q, int i2) {
        super(3);
        this.f11153d = p4;
        this.f11154e = a0Var;
        this.f11155i = yVar;
        this.f11156j = z4;
        this.f11157k = z5;
        this.f11158l = sVar;
        this.f11159m = p0Var;
        this.f11160n = c1277q;
        this.f11161o = i2;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(851809892);
        Object I3 = c0216p.I();
        G.W w4 = C0208l.f2826a;
        if (I3 == w4) {
            I3 = new A.j0();
            c0216p.c0(I3);
        }
        A.j0 j0Var = (A.j0) I3;
        Object I4 = c0216p.I();
        if (I4 == w4) {
            I4 = new C1254C();
            c0216p.c0(I4);
        }
        P p4 = this.f11153d;
        A.a0 a0Var = this.f11154e;
        G0.y yVar = this.f11155i;
        G0.s sVar = this.f11158l;
        p0 p0Var = this.f11159m;
        c0 c0Var = new c0(p4, a0Var, yVar, this.f11156j, this.f11157k, j0Var, sVar, p0Var, (C1254C) I4, this.f11160n, this.f11161o);
        boolean h4 = c0216p.h(c0Var);
        Object I5 = c0216p.I();
        if (h4 || I5 == w4) {
            I5 = new W2.f0(1, c0Var, c0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 3);
            c0216p.c0(I5);
        }
        S.o a4 = androidx.compose.ui.input.key.a.a((Function1) ((M2.m) I5));
        c0216p.q(false);
        return a4;
    }
}
