package o;

import G.C0192d;
import G.C0205j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: o.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906q implements InterfaceC0893j0 {

    /* renamed from: a, reason: collision with root package name */
    public final M2.p f8854a;

    /* renamed from: b, reason: collision with root package name */
    public final C0904p f8855b = new C0904p(this);

    /* renamed from: c, reason: collision with root package name */
    public final m.e0 f8856c = new m.e0();

    /* renamed from: d, reason: collision with root package name */
    public final C0205j0 f8857d;

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f8858e;

    /* renamed from: f, reason: collision with root package name */
    public final C0205j0 f8859f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0906q(Function1 function1) {
        this.f8854a = (M2.p) function1;
        Boolean bool = Boolean.FALSE;
        G.W w4 = G.W.f2779l;
        this.f8857d = C0192d.K(bool, w4);
        this.f8858e = C0192d.K(bool, w4);
        this.f8859f = C0192d.K(bool, w4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // o.InterfaceC0893j0
    public final float b(float f4) {
        return ((Number) this.f8854a.invoke(Float.valueOf(f4))).floatValue();
    }

    @Override // o.InterfaceC0893j0
    public final boolean d() {
        return ((Boolean) this.f8857d.getValue()).booleanValue();
    }

    @Override // o.InterfaceC0893j0
    public final Object e(m.b0 b0Var, Function2 function2, E2.c cVar) {
        Object d4 = W2.B.d(new C0902o(this, b0Var, function2, null), cVar);
        return d4 == D2.a.f2163d ? d4 : Unit.f7487a;
    }
}
