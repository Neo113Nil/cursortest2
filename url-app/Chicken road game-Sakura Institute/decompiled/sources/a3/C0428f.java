package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: a3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428f extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f4952k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4953l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0429g f4954m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0428f(AbstractC0429g abstractC0429g, C2.a aVar) {
        super(2, aVar);
        this.f4954m = abstractC0429g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0428f) j((C2.a) obj2, (Y2.q) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0428f c0428f = new C0428f(this.f4954m, aVar);
        c0428f.f4953l = obj;
        return c0428f;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4952k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Y2.q qVar = (Y2.q) this.f4953l;
            this.f4952k = 1;
            if (this.f4954m.f(qVar, this) == aVar) {
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
