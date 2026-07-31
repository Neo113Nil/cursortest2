package o2;

import k2.InterfaceC0550w;
import n2.AbstractC0682G;
import n2.InterfaceC0701g;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756e extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6700e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0701g f6702g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0758g f6703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0756e(InterfaceC0701g interfaceC0701g, AbstractC0758g abstractC0758g, P1.d dVar) {
        super(2, dVar);
        this.f6702g = interfaceC0701g;
        this.f6703h = abstractC0758g;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0756e c0756e = new C0756e(this.f6702g, this.f6703h, dVar);
        c0756e.f6701f = obj;
        return c0756e;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0756e) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6700e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            m2.s h3 = this.f6703h.h((InterfaceC0550w) this.f6701f);
            this.f6700e = 1;
            Object h4 = AbstractC0682G.h(this.f6702g, h3, true, this);
            if (h4 != aVar) {
                h4 = zVar;
            }
            if (h4 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return zVar;
    }
}
