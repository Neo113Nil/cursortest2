package y2;

import L1.z;
import t.u;

/* loaded from: classes.dex */
public final class g extends R1.h implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public int f8839e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ L1.b f8840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E2.b f8841g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(E2.b bVar, P1.d dVar) {
        super(3, dVar);
        this.f8841g = bVar;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        g gVar = new g(this.f8841g, (P1.d) obj3);
        gVar.f8840f = (L1.b) obj;
        return gVar.invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8839e;
        if (i3 == 0) {
            I2.l.Q(obj);
            L1.b bVar = this.f8840f;
            E2.b bVar2 = this.f8841g;
            byte u3 = ((u) bVar2.f777d).u();
            if (u3 == 1) {
                return bVar2.e(true);
            }
            if (u3 == 0) {
                return bVar2.e(false);
            }
            if (u3 != 6) {
                if (u3 == 8) {
                    return bVar2.d();
                }
                u.n((u) bVar2.f777d, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f8839e = 1;
            obj = E2.b.a(bVar2, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return (x2.k) obj;
    }
}
