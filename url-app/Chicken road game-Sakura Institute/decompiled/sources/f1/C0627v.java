package f1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627v extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6625k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f6626l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0627v(Y y4, C2.a aVar) {
        super(2, aVar);
        this.f6626l = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0627v) j((C2.a) obj2, (Y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0627v c0627v = new C0627v(this.f6626l, aVar);
        c0627v.f6625k = obj;
        return c0627v;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        Y y4 = (Y) this.f6625k;
        return Boolean.valueOf((y4 instanceof C0610d) && y4.f6557a <= this.f6626l.f6557a);
    }
}
