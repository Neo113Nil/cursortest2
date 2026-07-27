package D;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: D.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121c0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1728k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0142j0 f1729l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0133g0 f1730m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0121c0(C0142j0 c0142j0, C0133g0 c0133g0, C2.a aVar) {
        super(2, aVar);
        this.f1729l = c0142j0;
        this.f1730m = c0133g0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0121c0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0121c0(this.f1729l, this.f1730m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1728k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0133g0 c0133g0 = this.f1730m;
            this.f1728k = 1;
            C0142j0 c0142j0 = this.f1729l;
            c0142j0.f1855a = c0133g0.f1795a;
            c0142j0.f1856b = c0133g0.f1796b;
            c0142j0.f1857c = c0133g0.f1798d;
            c0142j0.f1858d = c0133g0.f1797c;
            Object b4 = c0142j0.b(this);
            if (b4 != aVar) {
                b4 = Unit.f7487a;
            }
            if (b4 == aVar) {
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
