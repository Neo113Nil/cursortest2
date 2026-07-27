package a3;

import W2.InterfaceC0302y;
import Z2.H;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: a3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427e extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f4948k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4949l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0331g f4950m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0429g f4951n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0427e(InterfaceC0331g interfaceC0331g, AbstractC0429g abstractC0429g, C2.a aVar) {
        super(2, aVar);
        this.f4950m = interfaceC0331g;
        this.f4951n = abstractC0429g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0427e) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0427e c0427e = new C0427e(this.f4950m, this.f4951n, aVar);
        c0427e.f4949l = obj;
        return c0427e;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f4948k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Y2.r i4 = this.f4951n.i((InterfaceC0302y) this.f4949l);
            this.f4948k = 1;
            Object i5 = H.i(this.f4950m, i4, true, this);
            if (i5 != obj2) {
                i5 = Unit.f7487a;
            }
            if (i5 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
