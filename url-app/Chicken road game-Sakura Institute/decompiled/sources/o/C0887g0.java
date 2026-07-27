package o;

import W2.InterfaceC0302y;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887g0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8769k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8770l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f8771m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f8772n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0887g0(C0891i0 c0891i0, float f4, float f5, C2.a aVar) {
        super(2, aVar);
        this.f8770l = c0891i0;
        this.f8771m = f4;
        this.f8772n = f5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0887g0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0887g0(this.f8770l, this.f8771m, this.f8772n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8769k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0908r0 c0908r0 = this.f8770l.f8791I;
            long c4 = AbstractC0345a.c(this.f8771m, this.f8772n);
            this.f8769k = 1;
            if (androidx.compose.foundation.gestures.a.a(c0908r0, c4, this) == aVar) {
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
