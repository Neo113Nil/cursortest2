package h1;

import e2.InterfaceC0426e;
import java.util.List;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486d extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6139h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6140i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f6141j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0486d(List list, V1.d dVar) {
        super(2, dVar);
        this.f6141j = list;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0486d) o((V1.d) obj2, (C0493k) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0486d c0486d = new C0486d(this.f6141j, dVar);
        c0486d.f6140i = obj;
        return c0486d;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6139h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0493k c0493k = (C0493k) this.f6140i;
            this.f6139h = 1;
            if (l0.c.h(this.f6141j, c0493k, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
