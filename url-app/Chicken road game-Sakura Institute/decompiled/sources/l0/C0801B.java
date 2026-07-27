package l0;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: l0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801B extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7873k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802C f7874l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0801B(C0802C c0802c, C2.a aVar) {
        super(2, aVar);
        this.f7874l = c0802c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0801B) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0801B(this.f7874l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7873k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = this.f7874l;
            Function2 function2 = c0802c.f7880w;
            this.f7873k = 1;
            if (function2.h(c0802c, this) == aVar) {
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
