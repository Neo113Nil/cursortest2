package n0;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class y extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7341h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7342i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0700A f7343j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j3, C0700A c0700a, V1.d dVar) {
        super(2, dVar);
        this.f7342i = j3;
        this.f7343j = c0700a;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((y) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new y(this.f7342i, this.f7343j, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0821h c0821h;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7341h;
        long j3 = this.f7342i;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f7341h = 1;
            if (AbstractC0837y.f(j3 - 1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                c0821h = this.f7343j.f7254f;
                if (c0821h != null) {
                    c0821h.u(R1.a.b(new C0713k(j3)));
                }
                return R1.y.f4171a;
            }
            R1.a.e(obj);
        }
        this.f7341h = 2;
        if (AbstractC0837y.f(1L, this) == aVar) {
            return aVar;
        }
        c0821h = this.f7343j.f7254f;
        if (c0821h != null) {
        }
        return R1.y.f4171a;
    }
}
