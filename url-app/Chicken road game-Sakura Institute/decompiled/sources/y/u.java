package y;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s0.A0;
import y2.AbstractC1343r;
import y2.C1333h;

/* loaded from: classes.dex */
public final class u extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11496k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f11497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1315e f11498m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, C1315e c1315e, C2.a aVar) {
        super(2, aVar);
        this.f11497l = vVar;
        this.f11498m = c1315e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((u) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new u(this.f11497l, this.f11498m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11496k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
            throw new C1333h();
        }
        AbstractC1343r.b(obj);
        this.f11496k = 1;
        A0.a(this.f11497l, this.f11498m, this);
        return aVar;
    }
}
