package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907q0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8860k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8861l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0908r0 f8862m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E2.j f8863n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0907q0(C0908r0 c0908r0, Function2 function2, C2.a aVar) {
        super(2, aVar);
        this.f8862m = c0908r0;
        this.f8863n = (E2.j) function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0907q0) j((C2.a) obj2, (S) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0907q0 c0907q0 = new C0907q0(this.f8862m, this.f8863n, aVar);
        c0907q0.f8861l = obj;
        return c0907q0;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8860k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            S s4 = (S) this.f8861l;
            C0908r0 c0908r0 = this.f8862m;
            c0908r0.f8872h = s4;
            this.f8860k = 1;
            if (this.f8863n.h(c0908r0.f8873i, this) == aVar) {
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
