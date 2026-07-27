package n;

import A.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0800A;
import l0.EnumC0812j;
import l0.s;
import o.R0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class f extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int f8512i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8513j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g0 f8514k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g0 g0Var, C2.a aVar) {
        super(2, aVar);
        this.f8514k = g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((f) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        f fVar = new f(this.f8514k, aVar);
        fVar.f8513j = obj;
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        C0800A c0800a;
        s sVar;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8512i;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            c0800a = (C0800A) this.f8513j;
            this.f8513j = c0800a;
            this.f8512i = 1;
            obj = m3.o.e(c0800a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                sVar = (s) obj;
                if (sVar != null) {
                    sVar.a();
                }
                return Unit.f7487a;
            }
            c0800a = (C0800A) this.f8513j;
            AbstractC1343r.b(obj);
        }
        s sVar2 = (s) obj;
        sVar2.a();
        g0 g0Var = this.f8514k;
        ((o) g0Var.f144e).f8540a.setValue(new m(sVar2.f7925c));
        Unit unit = Unit.f7487a;
        this.f8513j = null;
        this.f8512i = 2;
        obj = R0.d(c0800a, EnumC0812j.f7911e, this);
        if (obj == aVar) {
            return aVar;
        }
        sVar = (s) obj;
        if (sVar != null) {
        }
        return Unit.f7487a;
    }
}
