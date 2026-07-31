package x;

import I.C0143d;
import e2.InterfaceC0426e;
import p.InterfaceC0778n0;

/* loaded from: classes.dex */
public final class k0 implements InterfaceC0778n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0778n0 f10159a;

    /* renamed from: b, reason: collision with root package name */
    public final I.F f10160b;

    /* renamed from: c, reason: collision with root package name */
    public final I.F f10161c;

    public k0(InterfaceC0778n0 interfaceC0778n0, n0 n0Var) {
        this.f10159a = interfaceC0778n0;
        this.f10160b = C0143d.D(new j0(n0Var, 1));
        this.f10161c = C0143d.D(new j0(n0Var, 0));
    }

    @Override // p.InterfaceC0778n0
    public final boolean a() {
        return ((Boolean) this.f10160b.getValue()).booleanValue();
    }

    @Override // p.InterfaceC0778n0
    public final float b(float f3) {
        return this.f10159a.b(f3);
    }

    @Override // p.InterfaceC0778n0
    public final boolean c() {
        return ((Boolean) this.f10161c.getValue()).booleanValue();
    }

    @Override // p.InterfaceC0778n0
    public final Object d(n.e0 e0Var, InterfaceC0426e interfaceC0426e, X1.c cVar) {
        return this.f10159a.d(e0Var, interfaceC0426e, cVar);
    }

    @Override // p.InterfaceC0778n0
    public final boolean e() {
        return this.f10159a.e();
    }
}
