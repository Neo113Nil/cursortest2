package r;

import e2.InterfaceC0424c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0887I;

/* renamed from: r.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0869p extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f8069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0884F f8070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887I f8071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8072h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8073i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f8074j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0869p(AbstractC0893O abstractC0893O, InterfaceC0884F interfaceC0884F, InterfaceC0887I interfaceC0887I, int i3, int i4, r rVar) {
        super(1);
        this.f8069e = abstractC0893O;
        this.f8070f = interfaceC0884F;
        this.f8071g = interfaceC0887I;
        this.f8072h = i3;
        this.f8073i = i4;
        this.f8074j = rVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        O0.k layoutDirection = this.f8071g.getLayoutDirection();
        U.i iVar = this.f8074j.f8081a;
        AbstractC0868o.b((AbstractC0892N) obj, this.f8069e, this.f8070f, layoutDirection, this.f8072h, this.f8073i, iVar);
        return R1.y.f4171a;
    }
}
