package n;

import a0.C0238c;
import e2.InterfaceC0427f;
import q2.AbstractC0837y;

/* renamed from: n.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697x extends X1.i implements InterfaceC0427f {

    /* renamed from: h, reason: collision with root package name */
    public int f7219h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ p.T f7220i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f7221j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0698y f7222k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0697x(C0698y c0698y, V1.d dVar) {
        super(3, dVar);
        this.f7222k = c0698y;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        long j3 = ((C0238c) obj2).f4722a;
        C0697x c0697x = new C0697x(this.f7222k, (V1.d) obj3);
        c0697x.f7220i = (p.T) obj;
        c0697x.f7221j = j3;
        return c0697x.q(R1.y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        Object obj2;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7219h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            p.T t3 = this.f7220i;
            long j3 = this.f7221j;
            C0698y c0698y = this.f7222k;
            if (c0698y.f7237w) {
                this.f7219h = 1;
                q.k kVar = c0698y.f7233s;
                if (kVar == null || (obj2 = AbstractC0837y.e(new C0678d(t3, j3, kVar, c0698y, null), this)) != aVar) {
                    obj2 = yVar;
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
