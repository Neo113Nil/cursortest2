package h1;

import e2.InterfaceC0427f;
import j1.C0557c;

/* loaded from: classes.dex */
public final class Y extends X1.i implements InterfaceC0427f {

    /* renamed from: h, reason: collision with root package name */
    public int f6131h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ C0557c f6132i;

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        Y y3 = new Y(3, (V1.d) obj3);
        y3.f6132i = (C0557c) obj;
        return y3.q(R1.y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6131h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0557c c0557c = this.f6132i;
            this.f6131h = 1;
            c0557c.getClass();
            obj = C0557c.a(c0557c, this);
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
