package androidx.lifecycle;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import m1.C0622b;

/* loaded from: classes.dex */
public final class H extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f3968e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0238x f3970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ EnumC0230o f3971h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0622b f3972i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C0238x c0238x, EnumC0230o enumC0230o, C0622b c0622b, P1.d dVar) {
        super(2, dVar);
        this.f3970g = c0238x;
        this.f3971h = enumC0230o;
        this.f3972i = c0622b;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        H h3 = new H(this.f3970g, this.f3971h, this.f3972i, dVar);
        h3.f3969f = obj;
        return h3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((H) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f3968e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f3969f;
            r2.e eVar = k2.E.f5312a;
            l2.d dVar = p2.n.f6799a.f5551i;
            G g3 = new G(this.f3970g, this.f3971h, interfaceC0550w, this.f3972i, null);
            this.f3968e = 1;
            if (AbstractC0552y.y(dVar, g3, this) == aVar) {
                return aVar;
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
