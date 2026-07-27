package D;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.C0778d;
import l.InterfaceC0787m;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class P1 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1590k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S1 f1591l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1592m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(S1 s12, float f4, C2.a aVar) {
        super(2, aVar);
        this.f1591l = s12;
        this.f1592m = f4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((P1) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new P1(this.f1591l, this.f1592m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1590k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            S1 s12 = this.f1591l;
            C0778d c0778d = s12.f1622w;
            if (c0778d != null) {
                Float f4 = new Float(this.f1592m);
                InterfaceC0787m interfaceC0787m = s12.f1621v ? androidx.compose.material3.a.f5155f : androidx.compose.material3.a.f5156g;
                this.f1590k = 1;
                obj = C0778d.c(c0778d, f4, interfaceC0787m, null, this, 12);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.f7487a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1343r.b(obj);
        return Unit.f7487a;
    }
}
