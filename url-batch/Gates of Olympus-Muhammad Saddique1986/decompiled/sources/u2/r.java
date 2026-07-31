package u2;

import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicInteger;
import q2.InterfaceC0835w;
import t2.InterfaceC1053f;

/* loaded from: classes.dex */
public final class r extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9717h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1053f[] f9718i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9719j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f9720k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s2.g f9721l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC1053f[] interfaceC1053fArr, int i3, AtomicInteger atomicInteger, s2.g gVar, V1.d dVar) {
        super(2, dVar);
        this.f9718i = interfaceC1053fArr;
        this.f9719j = i3;
        this.f9720k = atomicInteger;
        this.f9721l = gVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((r) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new r(this.f9718i, this.f9719j, this.f9720k, this.f9721l, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9717h;
        AtomicInteger atomicInteger = this.f9720k;
        s2.g gVar = this.f9721l;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                InterfaceC1053f[] interfaceC1053fArr = this.f9718i;
                int i4 = this.f9719j;
                InterfaceC1053f interfaceC1053f = interfaceC1053fArr[i4];
                q qVar = new q(gVar, i4);
                this.f9717h = 1;
                if (interfaceC1053f.d(qVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                gVar.k(null, false);
            }
            return R1.y.f4171a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                gVar.k(null, false);
            }
        }
    }
}
