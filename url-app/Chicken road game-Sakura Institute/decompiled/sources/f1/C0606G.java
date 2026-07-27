package f1;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606G extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f6495k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2.j f6496l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0610d f6497m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0606G(Function2 function2, C0610d c0610d, C2.a aVar) {
        super(2, aVar);
        this.f6496l = (E2.j) function2;
        this.f6497m = c0610d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0606G) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0606G(this.f6496l, this.f6497m, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6495k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            Object obj2 = this.f6497m.f6566b;
            this.f6495k = 1;
            obj = this.f6496l.h(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return obj;
    }
}
