package l;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769N extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7603k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f7604l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0769N(U u4, C2.a aVar) {
        super(2, aVar);
        this.f7604l = u4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0769N) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0769N(this.f7604l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7603k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f7603k = 1;
            if (U.s(this.f7604l, this) == aVar) {
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
