package A1;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: A1.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059h0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f608k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0059h0(Function0 function0, C2.a aVar) {
        super(2, aVar);
        this.f608k = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0059h0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0059h0(this.f608k, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        this.f608k.invoke();
        return Unit.f7487a;
    }
}
