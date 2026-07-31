package R0;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class h extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f4089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f4090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E f4091g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4092h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O0.k f4093i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(A a3, InterfaceC0422a interfaceC0422a, E e3, String str, O0.k kVar) {
        super(0);
        this.f4089e = a3;
        this.f4090f = interfaceC0422a;
        this.f4091g = e3;
        this.f4092h = str;
        this.f4093i = kVar;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        this.f4089e.i(this.f4090f, this.f4091g, this.f4092h, this.f4093i);
        return R1.y.f4171a;
    }
}
