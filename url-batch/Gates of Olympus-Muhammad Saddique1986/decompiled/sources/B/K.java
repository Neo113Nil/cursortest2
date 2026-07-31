package B;

import a0.C0238c;
import e2.InterfaceC0426e;
import m.C0619d;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class K extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0619d f293i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C0619d c0619d, long j3, V1.d dVar) {
        super(2, dVar);
        this.f293i = c0619d;
        this.f294j = j3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((K) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new K(this.f293i, this.f294j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f292h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0238c c0238c = new C0238c(this.f294j);
            m.W w2 = N.f305d;
            this.f292h = 1;
            if (C0619d.c(this.f293i, c0238c, w2, null, this, 12) == aVar) {
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
