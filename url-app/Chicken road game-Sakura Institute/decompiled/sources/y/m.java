package y;

import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import W2.r0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class m extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11486k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f11487l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, C2.a aVar) {
        super(2, aVar);
        this.f11487l = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((m) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        m mVar = new m(this.f11487l, aVar);
        mVar.f11486k = obj;
        return mVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        boolean z4;
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f11486k;
        n nVar = this.f11487l;
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) nVar.f11488a.getAndSet(null);
        AtomicReference atomicReference = nVar.f11488a;
        r0 m4 = W2.B.m(interfaceC0302y, null, null, new l(interfaceC0280c0, nVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, m4)) {
                z4 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z4 = false;
                break;
            }
        }
        return Boolean.valueOf(z4);
    }
}
