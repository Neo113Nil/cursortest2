package t1;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.C0764I;
import l.Q;
import l.U;
import l.m0;
import s1.C1193i;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class u extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10702k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f10703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f10704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1193i f10705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(float f4, U u4, C1193i c1193i, C2.a aVar) {
        super(2, aVar);
        this.f10703l = f4;
        this.f10704m = u4;
        this.f10705n = c1193i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((u) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new u(this.f10703l, this.f10704m, this.f10705n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object a4;
        Object obj2 = D2.a.f2163d;
        int i2 = this.f10702k;
        U u4 = this.f10704m;
        float f4 = this.f10703l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            if (f4 > 0.0f) {
                this.f10702k = 1;
                if (u4.x(f4, u4.f7634b.getValue(), this) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                return Unit.f7487a;
            }
            AbstractC1343r.b(obj);
        }
        if (f4 == 0.0f) {
            this.f10702k = 2;
            m0 m0Var = u4.f7637e;
            if (m0Var == null) {
                a4 = Unit.f7487a;
            } else {
                Object value = u4.f7635c.getValue();
                C1193i c1193i = this.f10705n;
                if (Intrinsics.a(value, c1193i) && Intrinsics.a(u4.f7634b.getValue(), c1193i)) {
                    a4 = Unit.f7487a;
                } else {
                    a4 = C0764I.a(u4.f7643k, new Q(u4, c1193i, m0Var, null), this);
                    if (a4 != obj2) {
                        a4 = Unit.f7487a;
                    }
                }
            }
            if (a4 == obj2) {
                return obj2;
            }
        }
        return Unit.f7487a;
    }
}
