package w;

import G.C0192d;
import kotlin.jvm.functions.Function2;
import o.InterfaceC0893j0;

/* loaded from: classes.dex */
public final class j0 implements InterfaceC0893j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0893j0 f11236a;

    /* renamed from: b, reason: collision with root package name */
    public final G.F f11237b;

    /* renamed from: c, reason: collision with root package name */
    public final G.F f11238c;

    public j0(InterfaceC0893j0 interfaceC0893j0, m0 m0Var) {
        this.f11236a = interfaceC0893j0;
        this.f11237b = C0192d.D(new i0(m0Var, 1));
        this.f11238c = C0192d.D(new i0(m0Var, 0));
    }

    @Override // o.InterfaceC0893j0
    public final boolean a() {
        return ((Boolean) this.f11237b.getValue()).booleanValue();
    }

    @Override // o.InterfaceC0893j0
    public final float b(float f4) {
        return this.f11236a.b(f4);
    }

    @Override // o.InterfaceC0893j0
    public final boolean c() {
        return ((Boolean) this.f11238c.getValue()).booleanValue();
    }

    @Override // o.InterfaceC0893j0
    public final boolean d() {
        return this.f11236a.d();
    }

    @Override // o.InterfaceC0893j0
    public final Object e(m.b0 b0Var, Function2 function2, E2.c cVar) {
        return this.f11236a.e(b0Var, function2, cVar);
    }
}
