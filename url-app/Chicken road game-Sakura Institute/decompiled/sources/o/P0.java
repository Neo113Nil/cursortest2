package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class P0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8695k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8696l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0802C f8697m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ L2.c f8698n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f8699o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function1 f8700p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function1 f8701q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(C0802C c0802c, L2.c cVar, Function1 function1, Function1 function12, Function1 function13, C2.a aVar) {
        super(2, aVar);
        this.f8697m = c0802c;
        this.f8698n = cVar;
        this.f8699o = function1;
        this.f8700p = function12;
        this.f8701q = function13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((P0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        P0 p02 = new P0(this.f8697m, this.f8698n, this.f8699o, this.f8700p, this.f8701q, aVar);
        p02.f8696l = obj;
        return p02;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8695k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f8696l;
            C0802C c0802c = this.f8697m;
            Q q2 = new Q(c0802c);
            O0 o0 = new O0(interfaceC0302y, this.f8698n, this.f8699o, this.f8700p, this.f8701q, q2, null);
            this.f8695k = 1;
            if (m3.z.g(c0802c, o0, this) == aVar) {
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
