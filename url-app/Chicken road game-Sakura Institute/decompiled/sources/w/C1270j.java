package w;

import G.InterfaceC0191c0;
import G.U0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: w.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270j extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11230k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f11231l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f11232m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G0.z f11233n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11234o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G0.m f11235p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1270j(P p4, InterfaceC0191c0 interfaceC0191c0, G0.z zVar, A.a0 a0Var, G0.m mVar, C2.a aVar) {
        super(2, aVar);
        this.f11231l = p4;
        this.f11232m = interfaceC0191c0;
        this.f11233n = zVar;
        this.f11234o = a0Var;
        this.f11235p = mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1270j) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1270j(this.f11231l, this.f11232m, this.f11233n, this.f11234o, this.f11235p, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11230k;
        P p4 = this.f11231l;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                Z2.C c4 = new Z2.C(new U0(new C.v(4, this.f11232m), null));
                a3.m mVar = new a3.m(p4, this.f11233n, this.f11234o, this.f11235p, 2);
                this.f11230k = 1;
                if (c4.e(mVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
            }
            M.g(p4);
            return Unit.f7487a;
        } catch (Throwable th) {
            M.g(p4);
            throw th;
        }
    }
}
