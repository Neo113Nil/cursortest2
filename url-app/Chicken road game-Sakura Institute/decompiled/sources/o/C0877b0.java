package o;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877b0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8746k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8747l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8748m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0877b0(C0891i0 c0891i0, long j4, C2.a aVar) {
        super(2, aVar);
        this.f8747l = c0891i0;
        this.f8748m = j4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0877b0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0877b0(this.f8747l, this.f8748m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object l4;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8746k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0908r0 c0908r0 = this.f8747l.f8791I;
            this.f8746k = 1;
            N n2 = c0908r0.f8868d;
            N n4 = N.f8666e;
            long j4 = this.f8748m;
            long a4 = n2 == n4 ? M0.o.a(j4, 0.0f, 0.0f, 1) : M0.o.a(j4, 0.0f, 0.0f, 2);
            C0905p0 c0905p0 = new C0905p0(c0908r0, null);
            m.i0 i0Var = c0908r0.f8866b;
            if (i0Var == null || !(c0908r0.f8865a.a() || c0908r0.f8865a.c())) {
                C0905p0 c0905p02 = new C0905p0(c0905p0.f8853n, this);
                c0905p02.f8852m = a4;
                l4 = c0905p02.l(Unit.f7487a);
                if (l4 != aVar) {
                    l4 = Unit.f7487a;
                }
            } else {
                l4 = i0Var.b(a4, c0905p0, this);
                if (l4 != aVar) {
                    l4 = Unit.f7487a;
                }
            }
            if (l4 == aVar) {
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
