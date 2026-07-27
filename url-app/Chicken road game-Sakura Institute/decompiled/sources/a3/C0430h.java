package a3;

import Z2.InterfaceC0331g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: a3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430h extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f4958k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4959l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0431i f4960m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0430h(AbstractC0431i abstractC0431i, C2.a aVar) {
        super(2, aVar);
        this.f4960m = abstractC0431i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0430h) j((C2.a) obj2, (InterfaceC0331g) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0430h c0430h = new C0430h(this.f4960m, aVar);
        c0430h.f4959l = obj;
        return c0430h;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f4958k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0331g interfaceC0331g = (InterfaceC0331g) this.f4959l;
            this.f4958k = 1;
            if (this.f4960m.j(interfaceC0331g, this) == aVar) {
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
