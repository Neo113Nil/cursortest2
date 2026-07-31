package r;

import e2.InterfaceC0424c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0887I;

/* loaded from: classes.dex */
public final class b0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f8030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f8032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887I f8034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, int i3, AbstractC0893O abstractC0893O, int i4, InterfaceC0887I interfaceC0887I) {
        super(1);
        this.f8030e = c0Var;
        this.f8031f = i3;
        this.f8032g = abstractC0893O;
        this.f8033h = i4;
        this.f8034i = interfaceC0887I;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e2.e, f2.k] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        ?? r02 = this.f8030e.f8044s;
        AbstractC0893O abstractC0893O = this.f8032g;
        AbstractC0892N.e((AbstractC0892N) obj, abstractC0893O, ((O0.h) r02.h(new O0.j(O2.d.d(this.f8031f - abstractC0893O.f8126d, this.f8033h - abstractC0893O.f8127e)), this.f8034i.getLayoutDirection())).f3734a);
        return R1.y.f4171a;
    }
}
