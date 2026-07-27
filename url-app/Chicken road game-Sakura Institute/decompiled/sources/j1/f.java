package j1;

import E2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;
import z2.C1412P;

/* loaded from: classes.dex */
public final class f extends j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7150k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7151l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f7152m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Function2 function2, C2.a aVar) {
        super(2, aVar);
        this.f7152m = (j) function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((f) j((C2.a) obj2, (C0708b) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        f fVar = new f(this.f7152m, aVar);
        fVar.f7151l = obj;
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7150k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0708b c0708b = (C0708b) this.f7151l;
            AbstractC1343r.b(obj);
            return c0708b;
        }
        AbstractC1343r.b(obj);
        C0708b c0708b2 = new C0708b(C1412P.j(((C0708b) this.f7151l).a()), false);
        this.f7151l = c0708b2;
        this.f7150k = 1;
        return this.f7152m.h(c0708b2, this) == aVar ? aVar : c0708b2;
    }
}
