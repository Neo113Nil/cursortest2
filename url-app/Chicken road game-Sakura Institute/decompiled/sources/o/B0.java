package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class B0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8592k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8593l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0802C f8594m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E2.j f8595n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M2.p f8596o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Q f8597p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B0(C0802C c0802c, L2.c cVar, Function1 function1, Q q2, C2.a aVar) {
        super(2, aVar);
        this.f8594m = c0802c;
        this.f8595n = (E2.j) cVar;
        this.f8596o = (M2.p) function1;
        this.f8597p = q2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((B0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E2.j, L2.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        ?? r32 = this.f8596o;
        Q q2 = this.f8597p;
        B0 b02 = new B0(this.f8594m, this.f8595n, r32, q2, aVar);
        b02.f8593l = obj;
        return b02;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [E2.j, L2.c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8592k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            A0 a02 = new A0((InterfaceC0302y) this.f8593l, this.f8595n, this.f8596o, this.f8597p, null);
            this.f8592k = 1;
            if (m3.z.g(this.f8594m, a02, this) == aVar) {
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
