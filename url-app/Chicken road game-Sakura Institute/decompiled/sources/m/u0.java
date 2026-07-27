package m;

import G.C0192d;
import G.C0199g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C0906q;
import o.InterfaceC0893j0;
import p.C0935k;

/* loaded from: classes.dex */
public final class u0 implements InterfaceC0893j0 {

    /* renamed from: i, reason: collision with root package name */
    public static final y.t f8193i;

    /* renamed from: a, reason: collision with root package name */
    public final C0199g0 f8194a;

    /* renamed from: e, reason: collision with root package name */
    public float f8198e;

    /* renamed from: b, reason: collision with root package name */
    public final C0199g0 f8195b = C0192d.J(0);

    /* renamed from: c, reason: collision with root package name */
    public final C0935k f8196c = new C0935k();

    /* renamed from: d, reason: collision with root package name */
    public final C0199g0 f8197d = C0192d.J(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final C0906q f8199f = new C0906q(new A.g0(19, this));

    /* renamed from: g, reason: collision with root package name */
    public final G.F f8200g = C0192d.D(new t0(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final G.F f8201h = C0192d.D(new t0(this, 0));

    static {
        s0 s0Var = s0.f8183d;
        r rVar = r.f8170k;
        y.t tVar = P.o.f3675a;
        f8193i = new y.t(s0Var, 13, rVar);
    }

    public u0(int i2) {
        this.f8194a = C0192d.J(i2);
    }

    @Override // o.InterfaceC0893j0
    public final boolean a() {
        return ((Boolean) this.f8200g.getValue()).booleanValue();
    }

    @Override // o.InterfaceC0893j0
    public final float b(float f4) {
        return this.f8199f.b(f4);
    }

    @Override // o.InterfaceC0893j0
    public final boolean c() {
        return ((Boolean) this.f8201h.getValue()).booleanValue();
    }

    @Override // o.InterfaceC0893j0
    public final boolean d() {
        return this.f8199f.d();
    }

    @Override // o.InterfaceC0893j0
    public final Object e(b0 b0Var, Function2 function2, E2.c cVar) {
        Object e4 = this.f8199f.e(b0Var, function2, cVar);
        return e4 == D2.a.f2163d ? e4 : Unit.f7487a;
    }
}
