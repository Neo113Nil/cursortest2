package t2;

import e2.InterfaceC0426e;
import u2.AbstractC1150b;

/* renamed from: t2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069v extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9076h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9077i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1053f f9078j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1150b f9079k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f9080l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1069v(InterfaceC1053f interfaceC1053f, InterfaceC1071x interfaceC1071x, Object obj, V1.d dVar) {
        super(2, dVar);
        this.f9078j = interfaceC1053f;
        this.f9079k = (AbstractC1150b) interfaceC1071x;
        this.f9080l = obj;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1069v) o((V1.d) obj2, (EnumC1037H) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [t2.x, u2.b] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1069v c1069v = new C1069v(this.f9078j, this.f9079k, this.f9080l, dVar);
        c1069v.f9077i = obj;
        return c1069v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [t2.g, t2.x, u2.b] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9076h;
        if (i3 == 0) {
            R1.a.e(obj);
            int ordinal = ((EnumC1037H) this.f9077i).ordinal();
            ?? r12 = this.f9079k;
            if (ordinal == 0) {
                this.f9076h = 1;
                if (this.f9078j.d(r12, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new C1.c();
                }
                m1.q qVar = AbstractC1035F.f8976a;
                Object obj2 = this.f9080l;
                if (obj2 == qVar) {
                    r12.a();
                } else {
                    r12.c(obj2);
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
