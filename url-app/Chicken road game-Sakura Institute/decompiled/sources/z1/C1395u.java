package z1;

import B1.C0104k;
import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: z1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395u extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0191c0 f11914k;

    /* renamed from: l, reason: collision with root package name */
    public int f11915l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0104k f11916m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f11917n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1395u(C0104k c0104k, InterfaceC0191c0 interfaceC0191c0, C2.a aVar) {
        super(2, aVar);
        this.f11916m = c0104k;
        this.f11917n = interfaceC0191c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1395u) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1395u(this.f11916m, this.f11917n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        InterfaceC0191c0 interfaceC0191c0;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11915l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0191c0 interfaceC0191c02 = this.f11917n;
            this.f11914k = interfaceC0191c02;
            this.f11915l = 1;
            Object a4 = this.f11916m.a(this);
            if (a4 == aVar) {
                return aVar;
            }
            interfaceC0191c0 = interfaceC0191c02;
            obj = a4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0191c0 = this.f11914k;
            AbstractC1343r.b(obj);
        }
        interfaceC0191c0.setValue((B1.B) obj);
        return Unit.f7487a;
    }
}
