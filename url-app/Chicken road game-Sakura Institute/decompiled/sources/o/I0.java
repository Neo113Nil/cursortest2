package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class I0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q f8639k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(Q q2, C2.a aVar) {
        super(2, aVar);
        this.f8639k = q2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((I0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new I0(this.f8639k, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        Q q2 = this.f8639k;
        q2.f8703e = true;
        q2.f8705j.e(null);
        return Unit.f7487a;
    }
}
