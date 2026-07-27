package androidx.lifecycle;

import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476p extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5486k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0477q f5487l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0476p(C0477q c0477q, C2.a aVar) {
        super(2, aVar);
        this.f5487l = c0477q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0476p) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0476p c0476p = new C0476p(this.f5487l, aVar);
        c0476p.f5486k = obj;
        return c0476p;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f5486k;
        C0477q c0477q = this.f5487l;
        C0483x c0483x = c0477q.f5488d;
        if (c0483x.f5496d.compareTo(EnumC0475o.f5481e) >= 0) {
            c0483x.a(c0477q);
        } else {
            InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) interfaceC0302y.q().k(C0299v.f4296e);
            if (interfaceC0280c0 != null) {
                interfaceC0280c0.a(null);
            }
        }
        return Unit.f7487a;
    }
}
