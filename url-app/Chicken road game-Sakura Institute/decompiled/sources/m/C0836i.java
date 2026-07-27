package m;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import o.B0;
import o.C0910s0;
import o.R0;
import y2.AbstractC1343r;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836i extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8122k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0850x f8124m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0836i(C0850x c0850x, C2.a aVar) {
        super(2, aVar);
        this.f8124m = c0850x;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0836i) j((C2.a) obj2, (C0802C) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0836i c0836i = new C0836i(this.f8124m, aVar);
        c0836i.f8123l = obj;
        return c0836i;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f8122k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0802C c0802c = (C0802C) this.f8123l;
            this.f8122k = 1;
            C0850x c0850x = this.f8124m;
            c0850x.getClass();
            C0849w c0849w = new C0849w(c0850x, null);
            A.g0 g0Var = new A.g0(18, c0850x);
            C0910s0 c0910s0 = R0.f8710a;
            Object d4 = W2.B.d(new B0(c0802c, c0849w, g0Var, new o.Q(c0802c), null), this);
            if (d4 != obj2) {
                d4 = Unit.f7487a;
            }
            if (d4 != obj2) {
                d4 = Unit.f7487a;
            }
            if (d4 == obj2) {
                return obj2;
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
