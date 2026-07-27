package D;

import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.C0778d;
import p.InterfaceC0933i;
import y2.AbstractC1343r;

/* renamed from: D.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134g1 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f1799k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0778d f1800l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1802n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0933i f1803o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f1804p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134g1(C0778d c0778d, float f4, boolean z4, InterfaceC0933i interfaceC0933i, InterfaceC0191c0 interfaceC0191c0, C2.a aVar) {
        super(2, aVar);
        this.f1800l = c0778d;
        this.f1801m = f4;
        this.f1802n = z4;
        this.f1803o = interfaceC0933i;
        this.f1804p = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0134g1) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0134g1(this.f1800l, this.f1801m, this.f1802n, this.f1803o, this.f1804p, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f1799k;
        InterfaceC0933i interfaceC0933i = this.f1803o;
        InterfaceC0191c0 interfaceC0191c0 = this.f1804p;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0778d c0778d = this.f1800l;
            float f4 = ((M0.e) c0778d.f7702e.getValue()).f3545d;
            float f5 = this.f1801m;
            if (!M0.e.a(f4, f5)) {
                if (this.f1802n) {
                    InterfaceC0933i interfaceC0933i2 = (InterfaceC0933i) interfaceC0191c0.getValue();
                    this.f1799k = 2;
                    if (E.b.a(c0778d, f5, interfaceC0933i2, interfaceC0933i, this) == aVar) {
                        return aVar;
                    }
                } else {
                    M0.e eVar = new M0.e(f5);
                    this.f1799k = 1;
                    if (c0778d.e(this, eVar) == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f7487a;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1343r.b(obj);
        interfaceC0191c0.setValue(interfaceC0933i);
        return Unit.f7487a;
    }
}
