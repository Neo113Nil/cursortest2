package Z2;

import kotlin.Unit;
import y2.AbstractC1343r;

/* renamed from: Z2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340p extends E2.j implements L2.c {

    /* renamed from: k, reason: collision with root package name */
    public int f4711k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ InterfaceC0331g f4712l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4713m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f4714n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0340p(w wVar, C2.a aVar) {
        super(3, aVar);
        this.f4714n = wVar;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0340p c0340p = new C0340p(this.f4714n, (C2.a) obj3);
        c0340p.f4712l = (InterfaceC0331g) obj;
        c0340p.f4713m = obj2;
        return c0340p.l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        InterfaceC0331g interfaceC0331g;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4711k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            interfaceC0331g = this.f4712l;
            Object obj2 = this.f4713m;
            this.f4712l = interfaceC0331g;
            this.f4711k = 1;
            obj = this.f4714n.h(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                return Unit.f7487a;
            }
            interfaceC0331g = this.f4712l;
            AbstractC1343r.b(obj);
        }
        this.f4712l = null;
        this.f4711k = 2;
        if (interfaceC0331g.d(obj, this) == aVar) {
            return aVar;
        }
        return Unit.f7487a;
    }
}
