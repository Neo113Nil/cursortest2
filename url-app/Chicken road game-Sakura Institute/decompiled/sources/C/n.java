package C;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.AbstractC0779e;
import l.AbstractC0798y;
import l.C0778d;
import l.u0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class n extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1105k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f1106l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, C2.a aVar) {
        super(2, aVar);
        this.f1106l = pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((n) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new n(this.f1106l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1105k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            p pVar = this.f1106l;
            Float f4 = new Float(0.0f);
            u0 j4 = AbstractC0779e.j(150, 0, AbstractC0798y.f7866b, 2);
            this.f1105k = 1;
            if (C0778d.c(pVar.f1114f, f4, j4, null, this, 12) == aVar) {
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
