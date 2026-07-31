package F;

import a.AbstractC0086a;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036s extends I0.g implements O0.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f424i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f425j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f426k;

    public /* synthetic */ C0036s(int i2, G0.d dVar) {
        super(i2, dVar);
    }

    @Override // O0.q
    public final Object k(Object obj, Object obj2, I0.b bVar) {
        switch (this.f424i) {
            case 0:
                return new C0036s((P) this.f426k, bVar).m(D0.h.f206a);
            default:
                ((Boolean) obj2).getClass();
                C0036s c0036s = new C0036s(3, bVar);
                c0036s.f426k = (S) obj;
                return c0036s.m(D0.h.f206a);
        }
    }

    @Override // I0.b
    public final Object m(Object obj) {
        switch (this.f424i) {
            case 0:
                int i2 = this.f425j;
                if (i2 == 0) {
                    AbstractC0086a.I(obj);
                    P p2 = (P) this.f426k;
                    this.f425j = 1;
                    Object a2 = P.a(p2, this);
                    H0.a aVar = H0.a.f511e;
                    if (a2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0086a.I(obj);
                }
                return D0.h.f206a;
            default:
                int i3 = this.f425j;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0086a.I(obj);
                    return obj;
                }
                AbstractC0086a.I(obj);
                S s2 = (S) this.f426k;
                this.f425j = 1;
                s2.getClass();
                Object a3 = S.a(s2, this);
                H0.a aVar2 = H0.a.f511e;
                return a3 == aVar2 ? aVar2 : a3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036s(P p2, I0.b bVar) {
        super(3, bVar);
        this.f426k = p2;
    }
}
