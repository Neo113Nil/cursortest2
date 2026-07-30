package w;

import a0.f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f9406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f9407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2.w f9408i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f9409j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f9410k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.q f9411l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a1 f9412m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q6.c f9413n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9414o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(j0 j0Var, a0.x0 x0Var, g2.w wVar, boolean z8, boolean z9, g2.q qVar, a1 a1Var, q6.c cVar, int i7) {
        super(3);
        this.f9406g = j0Var;
        this.f9407h = x0Var;
        this.f9408i = wVar;
        this.f9409j = z8;
        this.f9410k = z9;
        this.f9411l = qVar;
        this.f9412m = a1Var;
        this.f9413n = cVar;
        this.f9414o = i7;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        g0.p pVar = (g0.p) obj2;
        ((Number) obj3).intValue();
        pVar.Q(851809892);
        Object G = pVar.G();
        g0.t0 t0Var = g0.l.f3784a;
        if (G == t0Var) {
            G = new f1();
            pVar.a0(G);
        }
        f1 f1Var = (f1) G;
        Object G2 = pVar.G();
        if (G2 == t0Var) {
            G2 = new x();
            pVar.a0(G2);
        }
        q6.c cVar = this.f9413n;
        int i7 = this.f9414o;
        q0 q0Var = new q0(this.f9406g, this.f9407h, this.f9408i, this.f9409j, this.f9410k, f1Var, this.f9411l, this.f9412m, (x) G2, cVar, i7);
        boolean h3 = pVar.h(q0Var);
        Object G3 = pVar.G();
        if (h3 || G3 == t0Var) {
            c7.a1 a1Var = new c7.a1(1, q0Var, q0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 3);
            pVar.a0(a1Var);
            G3 = a1Var;
        }
        s0.o a3 = androidx.compose.ui.input.key.a.a((q6.c) ((r6.h) G3));
        pVar.p(false);
        return a3;
    }
}
