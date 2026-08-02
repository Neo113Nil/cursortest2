package I;

/* renamed from: I.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083s extends J0.g implements P0.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f703i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f704j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f705k;

    public /* synthetic */ C0083s(int i2, H0.d dVar) {
        super(i2, dVar);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        switch (this.f703i) {
            case 0:
                I0.a aVar = I0.a.f733e;
                int i2 = this.f704j;
                if (i2 == 0) {
                    i1.a.G(obj);
                    this.f704j = 1;
                    if (P.a((P) this.f705k, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i1.a.G(obj);
                }
                return F0.h.f469a;
            default:
                I0.a aVar2 = I0.a.f733e;
                int i3 = this.f704j;
                if (i3 == 0) {
                    i1.a.G(obj);
                    S s2 = (S) this.f705k;
                    this.f704j = 1;
                    s2.getClass();
                    obj = S.a(s2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i1.a.G(obj);
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, J0.b bVar) {
        switch (this.f703i) {
            case 0:
                return new C0083s((P) this.f705k, bVar).l(F0.h.f469a);
            default:
                ((Boolean) obj2).getClass();
                C0083s c0083s = new C0083s(3, bVar);
                c0083s.f705k = (S) obj;
                return c0083s.l(F0.h.f469a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083s(P p2, H0.d dVar) {
        super(3, dVar);
        this.f705k = p2;
    }
}
