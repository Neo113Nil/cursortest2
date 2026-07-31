package n2;

import o2.AbstractC0753b;

/* renamed from: n2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716v extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6392e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0700f f6394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0753b f6395h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0716v(InterfaceC0700f interfaceC0700f, InterfaceC0718x interfaceC0718x, Object obj, P1.d dVar) {
        super(2, dVar);
        this.f6394g = interfaceC0700f;
        this.f6395h = (AbstractC0753b) interfaceC0718x;
        this.f6396i = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n2.x, o2.b] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0716v c0716v = new C0716v(this.f6394g, this.f6395h, this.f6396i, dVar);
        c0716v.f6393f = obj;
        return c0716v;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0716v) create((EnumC0684I) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [n2.g, n2.x, o2.b] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6392e;
        if (i3 == 0) {
            I2.l.Q(obj);
            int ordinal = ((EnumC0684I) this.f6393f).ordinal();
            ?? r12 = this.f6395h;
            if (ordinal == 0) {
                this.f6392e = 1;
                if (this.f6394g.collect(r12, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new L1.f();
                }
                j1.p pVar = AbstractC0682G.f6293a;
                Object obj2 = this.f6396i;
                if (obj2 == pVar) {
                    r12.a();
                } else {
                    r12.c(obj2);
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
