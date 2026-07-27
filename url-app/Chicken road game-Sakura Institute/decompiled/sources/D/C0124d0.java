package D;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.InterfaceC0933i;
import y2.AbstractC1343r;

/* renamed from: D.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124d0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1740k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0142j0 f1741l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0933i f1742m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124d0(C0142j0 c0142j0, InterfaceC0933i interfaceC0933i, C2.a aVar) {
        super(2, aVar);
        this.f1741l = c0142j0;
        this.f1742m = interfaceC0933i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0124d0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0124d0(this.f1741l, this.f1742m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1740k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f1740k = 1;
            if (this.f1741l.a(this.f1742m, this) == aVar) {
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
