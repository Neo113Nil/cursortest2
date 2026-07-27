package t1;

import G.C0197f0;
import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.U;
import s1.C1193i;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class t extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10698k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f10699l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f10700m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0197f0 f10701n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(U u4, InterfaceC0191c0 interfaceC0191c0, C0197f0 c0197f0, C2.a aVar) {
        super(2, aVar);
        this.f10699l = u4;
        this.f10700m = interfaceC0191c0;
        this.f10701n = c0197f0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((t) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new t(this.f10699l, this.f10700m, this.f10701n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10698k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C1193i c1193i = (C1193i) ((List) this.f10700m.getValue()).get(((List) r4.getValue()).size() - 2);
            float d4 = this.f10701n.d();
            this.f10698k = 1;
            if (this.f10699l.x(d4, c1193i, this) == aVar) {
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
