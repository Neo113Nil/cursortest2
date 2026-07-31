package x;

import I.C0159l;
import I.C0167p;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;

/* loaded from: classes.dex */
public final class e0 extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f10087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ I0.z f10089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10090h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10091i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.t f10092j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q0 f10093k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1204q f10094l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10095m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Q q3, B.a0 a0Var, I0.z zVar, boolean z3, boolean z4, I0.t tVar, q0 q0Var, C1204q c1204q, int i3) {
        super(3);
        this.f10087e = q3;
        this.f10088f = a0Var;
        this.f10089g = zVar;
        this.f10090h = z3;
        this.f10091i = z4;
        this.f10092j = tVar;
        this.f10093k = q0Var;
        this.f10094l = c1204q;
        this.f10095m = i3;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(851809892);
        Object G3 = c0167p.G();
        I.W w2 = C0159l.f2829a;
        if (G3 == w2) {
            G3 = new B.i0();
            c0167p.a0(G3);
        }
        B.i0 i0Var = (B.i0) G3;
        Object G4 = c0167p.G();
        if (G4 == w2) {
            G4 = new C1185C();
            c0167p.a0(G4);
        }
        Q q3 = this.f10087e;
        B.a0 a0Var = this.f10088f;
        I0.z zVar = this.f10089g;
        I0.t tVar = this.f10092j;
        q0 q0Var = this.f10093k;
        d0 d0Var = new d0(q3, a0Var, zVar, this.f10090h, this.f10091i, i0Var, tVar, q0Var, (C1185C) G4, this.f10094l, this.f10095m);
        boolean h3 = c0167p.h(d0Var);
        Object G5 = c0167p.G();
        if (h3 || G5 == w2) {
            G5 = new q2.a0(1, d0Var, d0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 3);
            c0167p.a0(G5);
        }
        U.q a3 = androidx.compose.ui.input.key.a.a((InterfaceC0424c) ((f2.h) G5));
        c0167p.p(false);
        return a3;
    }
}
