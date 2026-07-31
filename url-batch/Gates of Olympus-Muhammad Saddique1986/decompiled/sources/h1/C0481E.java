package h1;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: h1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481E extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6066h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f6067i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0481E(M m3, V1.d dVar) {
        super(2, dVar);
        this.f6067i = m3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0481E) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0481E(this.f6067i, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6066h;
        M m3 = this.f6067i;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                if (m3.f6098j.f() instanceof N) {
                    return m3.f6098j.f();
                }
                this.f6066h = 1;
                if (m3.g(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                    return (X) obj;
                }
                R1.a.e(obj);
            }
            this.f6066h = 2;
            obj = M.d(m3, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (X) obj;
        } catch (Throwable th) {
            return new P(-1, th);
        }
    }
}
