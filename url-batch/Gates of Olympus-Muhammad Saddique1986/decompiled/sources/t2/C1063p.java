package t2;

import e2.InterfaceC0427f;

/* renamed from: t2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063p extends X1.i implements InterfaceC0427f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9055h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f9056i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ InterfaceC1054g f9057j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9058k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X1.i f9059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063p(V1.d dVar, Q1.e eVar) {
        super(3, dVar);
        this.f9059l = eVar;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        InterfaceC1054g interfaceC1054g = (InterfaceC1054g) obj;
        switch (this.f9055h) {
            case 0:
                C1063p c1063p = new C1063p((C1069v) this.f9059l, (V1.d) obj3);
                c1063p.f9057j = interfaceC1054g;
                c1063p.f9058k = obj2;
                return c1063p.q(R1.y.f4171a);
            default:
                C1063p c1063p2 = new C1063p((V1.d) obj3, (Q1.e) this.f9059l);
                c1063p2.f9057j = interfaceC1054g;
                c1063p2.f9058k = (Object[]) obj2;
                return c1063p2.q(R1.y.f4171a);
        }
    }

    @Override // X1.a
    public final Object q(Object obj) {
        InterfaceC1054g interfaceC1054g;
        InterfaceC1054g interfaceC1054g2;
        switch (this.f9055h) {
            case 0:
                W1.a aVar = W1.a.f4608d;
                int i3 = this.f9056i;
                if (i3 == 0) {
                    R1.a.e(obj);
                    interfaceC1054g = this.f9057j;
                    Object obj2 = this.f9058k;
                    this.f9057j = interfaceC1054g;
                    this.f9056i = 1;
                    obj = ((C1069v) this.f9059l).h(obj2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        R1.a.e(obj);
                        return R1.y.f4171a;
                    }
                    interfaceC1054g = this.f9057j;
                    R1.a.e(obj);
                }
                this.f9057j = null;
                this.f9056i = 2;
                if (interfaceC1054g.e(obj, this) == aVar) {
                    return aVar;
                }
                return R1.y.f4171a;
            default:
                W1.a aVar2 = W1.a.f4608d;
                int i4 = this.f9056i;
                if (i4 == 0) {
                    R1.a.e(obj);
                    interfaceC1054g2 = this.f9057j;
                    Object[] objArr = (Object[]) this.f9058k;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    this.f9057j = interfaceC1054g2;
                    this.f9056i = 1;
                    obj = ((Q1.e) this.f9059l).f(obj3, obj4, obj5, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        R1.a.e(obj);
                        return R1.y.f4171a;
                    }
                    interfaceC1054g2 = this.f9057j;
                    R1.a.e(obj);
                }
                this.f9057j = null;
                this.f9056i = 2;
                if (interfaceC1054g2.e(obj, this) == aVar2) {
                    return aVar2;
                }
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063p(C1069v c1069v, V1.d dVar) {
        super(3, dVar);
        this.f9059l = c1069v;
    }
}
