package q;

import B.L;
import I.InterfaceC0142c0;
import R1.y;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import q2.InterfaceC0835w;
import t2.InterfaceC1053f;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810f extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7839h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f7840i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f7841j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0810f(j jVar, InterfaceC0142c0 interfaceC0142c0, V1.d dVar) {
        super(2, dVar);
        this.f7840i = jVar;
        this.f7841j = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0810f) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0810f(this.f7840i, this.f7841j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7839h;
        if (i3 == 0) {
            R1.a.e(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC1053f a3 = this.f7840i.a();
            L l3 = new L(arrayList, 5, this.f7841j);
            this.f7839h = 1;
            if (a3.d(l3, this) == aVar) {
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
