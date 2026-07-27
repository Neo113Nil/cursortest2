package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902o extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8844k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0906q f8845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m.b0 f8846m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function2 f8847n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0902o(C0906q c0906q, m.b0 b0Var, Function2 function2, C2.a aVar) {
        super(2, aVar);
        this.f8845l = c0906q;
        this.f8846m = b0Var;
        this.f8847n = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0902o) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0902o(this.f8845l, this.f8846m, this.f8847n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8844k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0906q c0906q = this.f8845l;
            m.e0 e0Var = c0906q.f8856c;
            C0904p c0904p = c0906q.f8855b;
            C0900n c0900n = new C0900n(c0906q, this.f8847n, null);
            this.f8844k = 1;
            e0Var.getClass();
            if (W2.B.d(new m.d0(this.f8846m, e0Var, c0900n, c0904p, null), this) == aVar) {
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
