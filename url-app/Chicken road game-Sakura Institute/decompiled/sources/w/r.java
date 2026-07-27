package w;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t.C1199c;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class r extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11324k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1199c f11325l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G0.y f11326m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P f11327n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o0 f11328o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G0.s f11329p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1199c c1199c, G0.y yVar, P p4, o0 o0Var, G0.s sVar, C2.a aVar) {
        super(2, aVar);
        this.f11325l = c1199c;
        this.f11326m = yVar;
        this.f11327n = p4;
        this.f11328o = o0Var;
        this.f11329p = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((r) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new r(this.f11325l, this.f11326m, this.f11327n, this.f11328o, this.f11329p, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        long a4;
        Y.d dVar;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11324k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            X x2 = this.f11327n.f11054a;
            A0.I i4 = this.f11328o.f11290a;
            this.f11324k = 1;
            int b4 = this.f11329p.b(A0.K.d(this.f11326m.f3094b));
            if (b4 < i4.f289a.f279a.f328a.length()) {
                dVar = i4.b(b4);
            } else if (b4 != 0) {
                dVar = i4.b(b4 - 1);
            } else {
                a4 = b0.a(x2.f11119b, x2.f11124g, x2.f11125h, b0.f11137a, 1);
                dVar = new Y.d(0.0f, 0.0f, 1.0f, (int) (a4 & 4294967295L));
            }
            Object a5 = this.f11325l.a(dVar, this);
            if (a5 != aVar) {
                a5 = Unit.f7487a;
            }
            if (a5 == aVar) {
                return aVar;
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
