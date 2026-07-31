package R0;

import e2.InterfaceC0424c;

/* renamed from: R0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213b extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f4063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0213b(x xVar, int i3) {
        super(1);
        this.f4062e = i3;
        this.f4063f = xVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f4062e) {
            case 0:
                x xVar = this.f4063f;
                xVar.show();
                return new C0212a(0, xVar);
            default:
                x xVar2 = this.f4063f;
                if (xVar2.f4130h.f4122a) {
                    xVar2.f4129g.b();
                }
                return R1.y.f4171a;
        }
    }
}
