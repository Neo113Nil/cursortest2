package y;

import R1.y;
import X1.i;
import e2.InterfaceC0426e;
import n.r;
import n0.C0702C;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228b extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10371h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10372i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1229c f10373j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228b(C1229c c1229c, V1.d dVar) {
        super(2, dVar);
        this.f10373j = c1229c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1228b) o((V1.d) obj2, (C0702C) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1228b c1228b = new C1228b(this.f10373j, dVar);
        c1228b.f10372i = obj;
        return c1228b;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10371h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f10372i;
            C1227a c1227a = new C1227a(this.f10373j, null);
            this.f10371h = 1;
            if (r.g(c0702c, c1227a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return y.f4171a;
    }
}
