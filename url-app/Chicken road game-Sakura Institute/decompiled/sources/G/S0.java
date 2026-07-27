package G;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class S0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f2753k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2754l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f2755m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z2.D f2756n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(CoroutineContext coroutineContext, Z2.D d4, C2.a aVar) {
        super(2, aVar);
        this.f2755m = coroutineContext;
        this.f2756n = d4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((S0) j((C2.a) obj2, (C0215o0) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        S0 s02 = new S0(this.f2755m, this.f2756n, aVar);
        s02.f2754l = obj;
        return s02;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f2753k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0215o0 c0215o0 = (C0215o0) this.f2754l;
            kotlin.coroutines.i iVar = kotlin.coroutines.i.f7498d;
            CoroutineContext coroutineContext = this.f2755m;
            boolean a4 = Intrinsics.a(coroutineContext, iVar);
            Z2.D d4 = this.f2756n;
            if (a4) {
                Q0 q02 = new Q0(c0215o0, 0);
                this.f2753k = 1;
                if (d4.e(q02, this) == aVar) {
                    return aVar;
                }
            } else {
                R0 r02 = new R0(d4, c0215o0, null);
                this.f2753k = 2;
                if (W2.B.q(coroutineContext, r02, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
