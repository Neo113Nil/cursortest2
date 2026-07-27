package D;

import W2.InterfaceC0302y;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0935k;
import y2.AbstractC1343r;

/* renamed from: D.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130f0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1785k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0935k f1787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0142j0 f1788n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130f0(C0935k c0935k, C0142j0 c0142j0, C2.a aVar) {
        super(2, aVar);
        this.f1787m = c0935k;
        this.f1788n = c0142j0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0130f0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0130f0 c0130f0 = new C0130f0(this.f1787m, this.f1788n, aVar);
        c0130f0.f1786l = obj;
        return c0130f0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1785k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
            return Unit.f7487a;
        }
        AbstractC1343r.b(obj);
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f1786l;
        ArrayList arrayList = new ArrayList();
        Z2.G g4 = this.f1787m.f8972a;
        C0127e0 c0127e0 = new C0127e0(arrayList, interfaceC0302y, this.f1788n, 0);
        this.f1785k = 1;
        g4.getClass();
        Z2.G.m(g4, c0127e0, this);
        return aVar;
    }
}
