package L5;

import H5.InterfaceC0163x;
import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class f extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f1497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K5.b f1498g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K5.d f1499h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1500i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(K5.b bVar, K5.d dVar, Object obj, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f1498g = bVar;
        this.f1499h = dVar;
        this.f1500i = obj;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        return new f(this.f1498g, this.f1499h, this.f1500i, interfaceC0564d);
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0163x) obj, (InterfaceC0564d) obj2)).invokeSuspend(v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f1497f;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            K5.f fVar = (K5.f) this.f1498g.f1391l;
            this.f1497f = 1;
            if (fVar.invoke(this.f1499h, this.f1500i, this) == enumC0580a) {
                return enumC0580a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
        }
        return v.f5219a;
    }
}
