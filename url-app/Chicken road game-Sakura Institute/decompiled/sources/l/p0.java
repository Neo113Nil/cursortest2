package l;

import W2.C0286h;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class p0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public e3.a f7825k;

    /* renamed from: l, reason: collision with root package name */
    public U f7826l;

    /* renamed from: m, reason: collision with root package name */
    public int f7827m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f7828n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(U u4, C2.a aVar) {
        super(2, aVar);
        this.f7828n = u4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((p0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new p0(this.f7828n, aVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, y2.j] */
    @Override // E2.a
    public final Object l(Object obj) {
        U u4;
        Object obj2;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7827m;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            U u5 = this.f7828n;
            u5.getClass();
            ((Q.A) s0.f7840a.getValue()).c(u5, d0.f7711j, u5.f7639g);
            e3.c cVar = u5.f7642j;
            this.f7825k = cVar;
            this.f7826l = u5;
            this.f7827m = 1;
            if (cVar.c(null, this) == aVar) {
                return aVar;
            }
            u4 = u5;
            obj2 = cVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u4 = this.f7826l;
            Object obj3 = this.f7825k;
            AbstractC1343r.b(obj);
            obj2 = obj3;
        }
        try {
            u4.f7636d = u4.m();
            C0286h c0286h = u4.f7641i;
            if (c0286h != null) {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                c0286h.u(u4.m());
            }
            u4.f7641i = null;
            Unit unit = Unit.f7487a;
            ((e3.c) obj2).e(null);
            return Unit.f7487a;
        } catch (Throwable th) {
            ((e3.c) obj2).e(null);
            throw th;
        }
    }
}
