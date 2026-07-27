package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0800A;
import l0.EnumC0812j;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class F0 extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int f8620i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8621j;

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((F0) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        F0 f02 = new F0(2, aVar);
        f02.f8621j = obj;
        return f02;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8620i;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0800A c0800a = (C0800A) this.f8621j;
            this.f8620i = 1;
            obj = R0.d(c0800a, EnumC0812j.f7911e, this);
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
