package B1;

import I.InterfaceC0088c0;
import I2.l;
import L1.z;
import R1.i;
import Y1.e;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class b extends i implements e {

    /* renamed from: e, reason: collision with root package name */
    public int f404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0088c0 interfaceC0088c0, P1.d dVar) {
        super(2, dVar);
        this.f405f = interfaceC0088c0;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new b(this.f405f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((b) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f404e;
        if (i3 == 0) {
            l.Q(obj);
            this.f404e = 1;
            if (AbstractC0552y.e(1100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.Q(obj);
        }
        this.f405f.setValue(Boolean.TRUE);
        return z.f2729a;
    }
}
