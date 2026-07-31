package l1;

import R1.y;
import S1.B;
import X1.i;
import e2.InterfaceC0426e;

/* renamed from: l1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597f extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6590h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6591i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f6592j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0597f(InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(2, dVar);
        this.f6592j = (i) interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0597f) o((V1.d) obj2, (C0593b) obj)).q(y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X1.i, e2.e] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0597f c0597f = new C0597f(this.f6592j, dVar);
        c0597f.f6591i = obj;
        return c0597f;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [X1.i, e2.e] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6590h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0593b c0593b = (C0593b) this.f6591i;
            R1.a.e(obj);
            return c0593b;
        }
        R1.a.e(obj);
        C0593b c0593b2 = new C0593b(B.N(((C0593b) this.f6591i).a()), false);
        this.f6591i = c0593b2;
        this.f6590h = 1;
        return this.f6592j.h(c0593b2, this) == aVar ? aVar : c0593b2;
    }
}
