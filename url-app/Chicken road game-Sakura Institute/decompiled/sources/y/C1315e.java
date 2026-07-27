package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s0.Q;
import y2.AbstractC1343r;
import y2.C1333h;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315e extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11470k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11471l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P0.h f11472m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1316f f11473n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f11474o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315e(P0.h hVar, C1316f c1316f, v vVar, C2.a aVar) {
        super(2, aVar);
        this.f11472m = hVar;
        this.f11473n = c1316f;
        this.f11474o = vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((C1315e) j((C2.a) obj2, (Q) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C1315e c1315e = new C1315e(this.f11472m, this.f11473n, this.f11474o, aVar);
        c1315e.f11471l = obj;
        return c1315e;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11470k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C1314d c1314d = new C1314d((Q) this.f11471l, this.f11472m, this.f11473n, this.f11474o, null);
            this.f11470k = 1;
            if (W2.B.d(c1314d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        throw new C1333h();
    }
}
