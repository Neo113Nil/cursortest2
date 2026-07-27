package l0;

import W2.C0286h;
import W2.F;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class y extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7956k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f7957l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0800A f7958m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j4, C0800A c0800a, C2.a aVar) {
        super(2, aVar);
        this.f7957l = j4;
        this.f7958m = c0800a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((y) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new y(this.f7957l, this.f7958m, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        C0286h c0286h;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7956k;
        long j4 = this.f7957l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f7956k = 1;
            if (F.a(j4 - 1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                c0286h = this.f7958m.f7869i;
                if (c0286h != null) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    c0286h.u(AbstractC1343r.a(new C0813k(j4)));
                }
                return Unit.f7487a;
            }
            AbstractC1343r.b(obj);
        }
        this.f7956k = 2;
        if (F.a(1L, this) == aVar) {
            return aVar;
        }
        c0286h = this.f7958m.f7869i;
        if (c0286h != null) {
        }
        return Unit.f7487a;
    }
}
