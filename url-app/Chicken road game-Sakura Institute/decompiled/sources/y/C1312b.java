package y;

import G.C0192d;
import G.Y;
import W2.InterfaceC0302y;
import Z2.G;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;
import y2.C1333h;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312b extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11460k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1316f f11461l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f11462m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312b(C1316f c1316f, t tVar, C2.a aVar) {
        super(2, aVar);
        this.f11461l = c1316f;
        this.f11462m = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1312b) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1312b(this.f11461l, this.f11462m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11460k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C1311a c1311a = C1311a.f11456e;
            this.f11460k = 1;
            CoroutineContext coroutineContext = this.f2311e;
            Intrinsics.c(coroutineContext);
            if (C0192d.F(coroutineContext).f(new Y(0, c1311a), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                throw new C1333h();
            }
            AbstractC1343r.b(obj);
        }
        Z2.y i4 = this.f11461l.i();
        if (i4 == null) {
            return Unit.f7487a;
        }
        Z2.r rVar = new Z2.r(5, this.f11462m);
        this.f11460k = 2;
        G.m((G) i4, rVar, this);
        return aVar;
    }
}
