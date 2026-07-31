package B;

import e2.InterfaceC0424c;
import x.EnumC1187E;

/* renamed from: B.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0013n f390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0005f(InterfaceC0013n interfaceC0013n, boolean z3, boolean z4) {
        super(1);
        this.f390e = interfaceC0013n;
        this.f391f = z3;
        this.f392g = z4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        A0.i iVar = (A0.i) obj;
        long a3 = this.f390e.a();
        iVar.c(F.f280c, new E(this.f391f ? EnumC1187E.f9941e : EnumC1187E.f9942f, a3, this.f392g ? 1 : 3, l0.c.D(a3)));
        return R1.y.f4171a;
    }
}
