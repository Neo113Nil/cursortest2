package A;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import r0.AbstractC1065f;
import w2.C1294c;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class A extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f0k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1294c f2m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w.Y f3n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C1294c c1294c, w.Y y4, C2.a aVar) {
        super(2, aVar);
        this.f2m = c1294c;
        this.f3n = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((A) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        A a4 = new A(this.f2m, this.f3n, aVar);
        a4.f1l = obj;
        return a4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f0k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f1l;
            c0802c.getClass();
            C0029z c0029z = new C0029z(this.f2m, new C0016l(AbstractC1065f.v(c0802c).f9612y), this.f3n, null);
            this.f0k = 1;
            if (m3.z.g(c0802c, c0029z, this) == aVar) {
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
