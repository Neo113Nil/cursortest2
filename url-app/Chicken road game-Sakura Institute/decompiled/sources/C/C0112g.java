package C;

import A.M;
import W2.InterfaceC0302y;
import Z2.InterfaceC0330f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.InterfaceC0934j;
import y2.AbstractC1343r;

/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112g extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1085k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0934j f1087m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0106a f1088n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0112g(InterfaceC0934j interfaceC0934j, C0106a c0106a, C2.a aVar) {
        super(2, aVar);
        this.f1087m = interfaceC0934j;
        this.f1088n = c0106a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0112g) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0112g c0112g = new C0112g(this.f1087m, this.f1088n, aVar);
        c0112g.f1086l = obj;
        return c0112g;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1085k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f1086l;
            InterfaceC0330f a4 = this.f1087m.a();
            M m4 = new M(this.f1088n, 1, interfaceC0302y);
            this.f1085k = 1;
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
