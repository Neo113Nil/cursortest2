package w;

import A0.C0030a;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import o.AbstractC0870C;
import o.C0868A;
import o.C0919z;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class S extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11082k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802C f11083l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f11084m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C0802C c0802c, Y y4, C2.a aVar) {
        super(2, aVar);
        this.f11083l = c0802c;
        this.f11084m = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((S) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new S(this.f11083l, this.f11084m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f11082k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f11082k = 1;
            Y y4 = this.f11084m;
            A.C c4 = new A.C(y4, 1);
            U u4 = new U(y4, 0);
            U u5 = new U(y4, 1);
            C0030a c0030a = new C0030a(14, y4);
            float f4 = AbstractC0870C.f8598a;
            Object g4 = m3.z.g(this.f11083l, new C0868A(C0919z.f8911d, new M2.D(), null, new A.i0(3, c4), c0030a, u5, new A.g0(21, u4), null), this);
            if (g4 != obj2) {
                g4 = Unit.f7487a;
            }
            if (g4 != obj2) {
                g4 = Unit.f7487a;
            }
            if (g4 != obj2) {
                g4 = Unit.f7487a;
            }
            if (g4 == obj2) {
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
