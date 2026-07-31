package m;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class a0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2.u f6713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0624i f6715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f6716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0628m f6717i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f6718j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f6719k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f2.u uVar, Object obj, InterfaceC0624i interfaceC0624i, r rVar, C0628m c0628m, float f3, InterfaceC0424c interfaceC0424c) {
        super(1);
        this.f6713e = uVar;
        this.f6714f = obj;
        this.f6715g = interfaceC0624i;
        this.f6716h = rVar;
        this.f6717i = c0628m;
        this.f6718j = f3;
        this.f6719k = interfaceC0424c;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        long longValue = ((Number) obj).longValue();
        InterfaceC0624i interfaceC0624i = this.f6715g;
        u0 d3 = interfaceC0624i.d();
        Object e3 = interfaceC0624i.e();
        B.H h3 = new B.H(this.f6717i, 1);
        C0626k c0626k = new C0626k(this.f6714f, d3, this.f6716h, longValue, e3, longValue, h3);
        AbstractC0620e.g(c0626k, longValue, this.f6718j, this.f6715g, this.f6717i, this.f6719k);
        this.f6713e.f5832d = c0626k;
        return R1.y.f4171a;
    }
}
