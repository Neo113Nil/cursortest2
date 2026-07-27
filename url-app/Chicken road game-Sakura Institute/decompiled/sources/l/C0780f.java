package l;

import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780f extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f7746k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7747l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0778d f7748m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f7749n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f7750o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0780f(Object obj, C0778d c0778d, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, C2.a aVar) {
        super(2, aVar);
        this.f7747l = obj;
        this.f7748m = c0778d;
        this.f7749n = interfaceC0191c0;
        this.f7750o = interfaceC0191c02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0780f) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0780f(this.f7747l, this.f7748m, this.f7749n, this.f7750o, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7746k;
        C0778d c0778d = this.f7748m;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            if (!Intrinsics.a(this.f7747l, c0778d.f7702e.getValue())) {
                X x2 = AbstractC0782h.f7765a;
                InterfaceC0787m interfaceC0787m = (InterfaceC0787m) this.f7749n.getValue();
                this.f7746k = 1;
                if (C0778d.c(this.f7748m, this.f7747l, interfaceC0787m, null, this, 12) == aVar) {
                    return aVar;
                }
            }
            return Unit.f7487a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1343r.b(obj);
        X x3 = AbstractC0782h.f7765a;
        Function1 function1 = (Function1) this.f7750o.getValue();
        if (function1 != null) {
            function1.invoke(c0778d.d());
        }
        return Unit.f7487a;
    }
}
