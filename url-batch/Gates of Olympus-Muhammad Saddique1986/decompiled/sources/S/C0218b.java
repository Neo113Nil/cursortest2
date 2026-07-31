package S;

import e2.InterfaceC0424c;

/* renamed from: S.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218b extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f4196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f4197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0218b(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, int i3) {
        super(1);
        this.f4195e = i3;
        this.f4196f = interfaceC0424c;
        this.f4197g = interfaceC0424c2;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        int i3;
        switch (this.f4195e) {
            case 0:
                n nVar = (n) obj;
                synchronized (p.f4241b) {
                    i3 = p.f4243d;
                    p.f4243d = i3 + 1;
                }
                return new C0221e(i3, nVar, this.f4196f, this.f4197g);
            case 1:
                this.f4196f.n(obj);
                this.f4197g.n(obj);
                return R1.y.f4171a;
            default:
                this.f4196f.n(obj);
                this.f4197g.n(obj);
                return R1.y.f4171a;
        }
    }
}
