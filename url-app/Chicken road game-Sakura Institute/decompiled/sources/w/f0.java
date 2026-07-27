package w;

import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0935k;
import p.C0936l;
import p.C0937m;
import p.C0938n;
import p.InterfaceC0933i;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class f0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0191c0 f11199k;

    /* renamed from: l, reason: collision with root package name */
    public int f11200l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f11201m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f11202n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0935k f11203o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(InterfaceC0191c0 interfaceC0191c0, boolean z4, C0935k c0935k, C2.a aVar) {
        super(2, aVar);
        this.f11201m = interfaceC0191c0;
        this.f11202n = z4;
        this.f11203o = c0935k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((f0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new f0(this.f11201m, this.f11202n, this.f11203o, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        InterfaceC0191c0 interfaceC0191c0;
        InterfaceC0191c0 interfaceC0191c02;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11200l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            interfaceC0191c0 = this.f11201m;
            C0937m c0937m = (C0937m) interfaceC0191c0.getValue();
            if (c0937m != null) {
                InterfaceC0933i c0938n = this.f11202n ? new C0938n(c0937m) : new C0936l(c0937m);
                C0935k c0935k = this.f11203o;
                if (c0935k != null) {
                    this.f11199k = interfaceC0191c0;
                    this.f11200l = 1;
                    if (c0935k.b(c0938n, this) == aVar) {
                        return aVar;
                    }
                    interfaceC0191c02 = interfaceC0191c0;
                }
                interfaceC0191c0.setValue(null);
            }
            return Unit.f7487a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC0191c02 = this.f11199k;
        AbstractC1343r.b(obj);
        interfaceC0191c0 = interfaceC0191c02;
        interfaceC0191c0.setValue(null);
        return Unit.f7487a;
    }
}
