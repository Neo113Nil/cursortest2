package a2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f186b;

    public z(c0 c0Var, Object obj) {
        this.f185a = c0Var;
        this.f186b = obj;
        int[] iArr = s.m.f8345a;
        new s.x();
    }

    @Override // a2.x0
    public final void a() {
        c0 c0Var = this.f185a;
        c2.g0 g0Var = c0Var.f61d;
        c0Var.c();
        s.h0 h0Var = c0Var.f69w;
        Object obj = this.f186b;
        c2.g0 g0Var2 = (c2.g0) h0Var.k(obj);
        if (g0Var2 != null) {
            if (c0Var.B <= 0) {
                z1.a.b("No pre-composed items to dispose");
            }
            int i3 = ((o0.b) g0Var.m()).f7311d.i(g0Var2);
            if (i3 < ((o0.b) g0Var.m()).f7311d.f7319i - c0Var.B) {
                z1.a.b("Item is not in pre-composed item range");
            }
            c0Var.A++;
            c0Var.B--;
            t tVar = (t) c0Var.f65s.g(g0Var2);
            if (tVar != null) {
                tVar.getClass();
            }
            int i10 = (((o0.b) g0Var.m()).f7311d.f7319i - c0Var.B) - c0Var.A;
            c0Var.e(i3, i10);
            c0Var.b(i10);
        }
        if (c0Var.f72z.h(obj)) {
            c2.g0.R(g0Var, true, 6);
        }
    }
}
