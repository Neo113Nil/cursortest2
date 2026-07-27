package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* renamed from: w.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1253B extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11013k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11014l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f11015m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11016n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253B(Y y4, A.a0 a0Var, C2.a aVar) {
        super(2, aVar);
        this.f11015m = y4;
        this.f11016n = a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1253B) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C1253B c1253b = new C1253B(this.f11015m, this.f11016n, aVar);
        c1253b.f11014l = obj;
        return c1253b;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11013k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C1252A c1252a = new C1252A((C0802C) this.f11014l, this.f11015m, this.f11016n, null);
            this.f11013k = 1;
            if (W2.B.d(c1252a, this) == aVar) {
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
