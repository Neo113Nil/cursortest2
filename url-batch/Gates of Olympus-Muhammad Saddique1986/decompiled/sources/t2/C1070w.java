package t2;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import s2.EnumC0967a;
import u2.AbstractC1150b;
import u2.C1147E;

/* renamed from: t2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070w extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9081h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1042M f9082i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1053f f9083j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1150b f9084k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f9085l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1070w(C1042M c1042m, InterfaceC1053f interfaceC1053f, InterfaceC1071x interfaceC1071x, Object obj, V1.d dVar) {
        super(2, dVar);
        this.f9082i = c1042m;
        this.f9083j = interfaceC1053f;
        this.f9084k = (AbstractC1150b) interfaceC1071x;
        this.f9085l = obj;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1070w) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [t2.x, u2.b] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1070w(this.f9082i, this.f9083j, this.f9084k, this.f9085l, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v0, types: [t2.g, t2.x, u2.b] */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9081h;
        R1.y yVar = R1.y.f4171a;
        InterfaceC1053f interfaceC1053f = this.f9083j;
        ?? r6 = this.f9084k;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    R1.a.e(obj);
                    this.f9081h = 3;
                    return interfaceC1053f.d(r6, this) != aVar ? aVar : yVar;
                }
                if (i3 != 3 && i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            R1.a.e(obj);
        }
        R1.a.e(obj);
        C1039J c1039j = C1038I.f8985a;
        C1042M c1042m = this.f9082i;
        if (c1042m == c1039j) {
            this.f9081h = 1;
            if (interfaceC1053f.d(r6, this) == aVar) {
                return aVar;
            }
        } else if (c1042m == C1038I.f8986b) {
            C1147E j3 = r6.j();
            C1068u c1068u = new C1068u(2, null);
            this.f9081h = 2;
            if (AbstractC1035F.k(j3, c1068u, this) == aVar) {
                return aVar;
            }
            this.f9081h = 3;
            if (interfaceC1053f.d(r6, this) != aVar) {
            }
        } else {
            C1147E j4 = r6.j();
            C1040K c1040k = new C1040K(c1042m, null);
            int i4 = AbstractC1064q.f9060a;
            V1.j jVar = V1.j.f4558d;
            EnumC0967a enumC0967a = EnumC0967a.f8359d;
            InterfaceC1053f h3 = AbstractC1035F.h(AbstractC1035F.h(new G.h(new u2.n(c1040k, j4, jVar, -2, enumC0967a), 3, new C1041L(2, null))));
            C1069v c1069v = new C1069v(interfaceC1053f, r6, this.f9085l, null);
            this.f9081h = 4;
            Object d3 = AbstractC1035F.f(new u2.n(new C1063p(c1069v, (V1.d) null), h3, jVar, -2, enumC0967a), 0).d(u2.x.f9734d, this);
            if (d3 != aVar) {
                d3 = yVar;
            }
            if (d3 != aVar) {
                d3 = yVar;
            }
            if (d3 == aVar) {
                return aVar;
            }
        }
    }
}
