package u1;

import I.C0148f0;
import I.InterfaceC0142c0;
import e2.InterfaceC0426e;
import java.util.List;
import m.U;
import q2.InterfaceC0835w;
import t1.C1028h;

/* loaded from: classes.dex */
public final class t extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9637h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U f9638i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f9639j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0148f0 f9640k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(U u3, InterfaceC0142c0 interfaceC0142c0, C0148f0 c0148f0, V1.d dVar) {
        super(2, dVar);
        this.f9638i = u3;
        this.f9639j = interfaceC0142c0;
        this.f9640k = c0148f0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((t) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new t(this.f9638i, this.f9639j, this.f9640k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9637h;
        if (i3 == 0) {
            R1.a.e(obj);
            C1028h c1028h = (C1028h) ((List) this.f9639j.getValue()).get(((List) r4.getValue()).size() - 2);
            float g3 = this.f9640k.g();
            this.f9637h = 1;
            if (this.f9638i.m(g3, c1028h, this) == aVar) {
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
