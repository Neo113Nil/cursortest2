package R0;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class z extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2.t f4136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f4137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O0.i f4138g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f4139h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f4140i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f2.t tVar, A a3, O0.i iVar, long j3, long j4) {
        super(0);
        this.f4136e = tVar;
        this.f4137f = a3;
        this.f4138g = iVar;
        this.f4139h = j3;
        this.f4140i = j4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        A a3 = this.f4137f;
        D positionProvider = a3.getPositionProvider();
        O0.k parentLayoutDirection = a3.getParentLayoutDirection();
        this.f4136e.f5831d = positionProvider.a(this.f4138g, this.f4139h, parentLayoutDirection, this.f4140i);
        return R1.y.f4171a;
    }
}
