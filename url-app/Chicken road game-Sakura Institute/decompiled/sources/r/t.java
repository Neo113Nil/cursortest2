package r;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.AbstractC0779e;
import l.C0788n;
import l.X;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class t extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f9546k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f9547l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, C2.a aVar) {
        super(2, aVar);
        this.f9547l = vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((t) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new t(this.f9547l, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f9546k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0788n c0788n = this.f9547l.f9572v;
            Float f4 = new Float(0.0f);
            X i4 = AbstractC0779e.i(400.0f, new Float(0.5f), 1);
            this.f9546k = 1;
            if (AbstractC0779e.d(c0788n, f4, i4, this) == aVar) {
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
