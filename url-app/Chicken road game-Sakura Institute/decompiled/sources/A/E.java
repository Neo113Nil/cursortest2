package A;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class E extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f14k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f16m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Function1 function1, C2.a aVar) {
        super(2, aVar);
        this.f16m = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((E) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        E e4 = new E(this.f16m, aVar);
        e4.f15l = obj;
        return e4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f14k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f15l;
            D d4 = new D(this.f16m, null);
            this.f14k = 1;
            if (c0802c.B0(d4, this) == aVar) {
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
