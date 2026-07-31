package m;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class b0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2.u f6728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f6729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0624i f6730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0628m f6731h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f6732i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f2.u uVar, float f3, InterfaceC0624i interfaceC0624i, C0628m c0628m, InterfaceC0424c interfaceC0424c) {
        super(1);
        this.f6728e = uVar;
        this.f6729f = f3;
        this.f6730g = interfaceC0624i;
        this.f6731h = c0628m;
        this.f6732i = interfaceC0424c;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f6728e.f5832d;
        f2.j.c(obj2);
        AbstractC0620e.g((C0626k) obj2, longValue, this.f6729f, this.f6730g, this.f6731h, this.f6732i);
        return R1.y.f4171a;
    }
}
