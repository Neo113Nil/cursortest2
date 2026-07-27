package D;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0935k;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class r extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1990k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0935k f1991l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q.v f1992m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0935k c0935k, Q.v vVar, C2.a aVar) {
        super(2, aVar);
        this.f1991l = c0935k;
        this.f1992m = vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((r) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new r(this.f1991l, this.f1992m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1990k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
            return Unit.f7487a;
        }
        AbstractC1343r.b(obj);
        Z2.G g4 = this.f1991l.f8972a;
        C0162q c0162q = new C0162q(this.f1992m, 0);
        this.f1990k = 1;
        g4.getClass();
        Z2.G.m(g4, c0162q, this);
        return aVar;
    }
}
