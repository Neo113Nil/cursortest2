package n;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: n.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666I extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7046h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.k f7047i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.i f7048j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q2.G f7049k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0666I(q.k kVar, q.i iVar, q2.G g3, V1.d dVar) {
        super(2, dVar);
        this.f7047i = kVar;
        this.f7048j = iVar;
        this.f7049k = g3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0666I) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0666I(this.f7047i, this.f7048j, this.f7049k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7046h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f7046h = 1;
            if (this.f7047i.b(this.f7048j, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        q2.G g3 = this.f7049k;
        if (g3 != null) {
            g3.a();
        }
        return R1.y.f4171a;
    }
}
