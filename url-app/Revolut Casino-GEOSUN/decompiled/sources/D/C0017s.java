package D;

import u0.C0247g;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017s extends y0.f implements E0.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f260i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f261j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f262k;

    public /* synthetic */ C0017s(int i2, w0.d dVar) {
        super(i2, dVar);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        switch (this.f260i) {
            case 0:
                x0.a aVar = x0.a.f3094e;
                int i2 = this.f261j;
                if (i2 == 0) {
                    o.g.z(obj);
                    this.f261j = 1;
                    if (S.a((S) this.f262k, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.z(obj);
                }
                return C0247g.f3005a;
            default:
                x0.a aVar2 = x0.a.f3094e;
                int i3 = this.f261j;
                if (i3 == 0) {
                    o.g.z(obj);
                    U u2 = (U) this.f262k;
                    this.f261j = 1;
                    u2.getClass();
                    obj = U.a(u2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.z(obj);
                }
                return obj;
        }
    }

    public final Object n(Object obj, Object obj2, y0.b bVar) {
        switch (this.f260i) {
            case 0:
                return new C0017s((S) this.f262k, bVar).l(C0247g.f3005a);
            default:
                ((Boolean) obj2).getClass();
                C0017s c0017s = new C0017s(3, bVar);
                c0017s.f262k = (U) obj;
                return c0017s.l(C0247g.f3005a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017s(S s2, w0.d dVar) {
        super(3, dVar);
        this.f262k = s2;
    }
}
