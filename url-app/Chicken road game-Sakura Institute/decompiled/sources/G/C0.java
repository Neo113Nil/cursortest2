package G;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class C0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f2642k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f2643l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(Function1 function1, C2.a aVar) {
        super(2, aVar);
        this.f2643l = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0(this.f2643l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f2642k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f2642k = 1;
            if (W2.F.a(16L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return this.f2643l.invoke(new Long(System.nanoTime()));
    }
}
