package w1;

import e2.InterfaceC0426e;
import java.util.concurrent.Callable;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class f extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Callable f9873h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Callable callable, V1.d dVar) {
        super(2, dVar);
        this.f9873h = callable;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((f) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new f(this.f9873h, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        return this.f9873h.call();
    }
}
