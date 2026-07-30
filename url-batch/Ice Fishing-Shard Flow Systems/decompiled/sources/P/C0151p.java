package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: P.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151p extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2145d;

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C0151p c0151p = new C0151p(2, bVar);
        c0151p.f2145d = obj;
        return c0151p;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0151p) create((m0) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        return Boolean.valueOf(!(((m0) this.f2145d) instanceof c0));
    }
}
