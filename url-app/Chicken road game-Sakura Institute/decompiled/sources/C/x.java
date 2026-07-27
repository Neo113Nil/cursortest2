package C;

import A.M;
import W2.InterfaceC0302y;
import Z2.InterfaceC0330f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class x extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1138k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f1140m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, C2.a aVar) {
        super(2, aVar);
        this.f1140m = yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((x) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        x xVar = new x(this.f1140m, aVar);
        xVar.f1139l = obj;
        return xVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1138k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f1139l;
            y yVar = this.f1140m;
            InterfaceC0330f a4 = yVar.f1143t.a();
            M m4 = new M(yVar, 2, interfaceC0302y);
            this.f1138k = 1;
            if (a4.e(m4, this) == aVar) {
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
