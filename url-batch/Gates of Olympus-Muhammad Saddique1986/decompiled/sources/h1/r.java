package h1;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class r extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public int f6187h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0480D f6188i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0480D c0480d, V1.d dVar) {
        super(1, dVar);
        this.f6188i = c0480d;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        return new r(this.f6188i, (V1.d) obj).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6187h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f6187h = 1;
            obj = this.f6188i.n(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return obj;
    }
}
