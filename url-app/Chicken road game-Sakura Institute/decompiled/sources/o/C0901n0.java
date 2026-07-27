package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901n0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public C0908r0 f8836k;

    /* renamed from: l, reason: collision with root package name */
    public M2.D f8837l;

    /* renamed from: m, reason: collision with root package name */
    public long f8838m;

    /* renamed from: n, reason: collision with root package name */
    public int f8839n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f8840o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0908r0 f8841p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M2.D f8842q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f8843r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0901n0(C0908r0 c0908r0, M2.D d4, long j4, C2.a aVar) {
        super(2, aVar);
        this.f8841p = c0908r0;
        this.f8842q = d4;
        this.f8843r = j4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0901n0) j((C2.a) obj2, (C0903o0) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0901n0 c0901n0 = new C0901n0(this.f8841p, this.f8842q, this.f8843r, aVar);
        c0901n0.f8840o = obj;
        return c0901n0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        C0908r0 c0908r0;
        M2.D d4;
        long j4;
        C0908r0 c0908r02;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8839n;
        N n2 = N.f8666e;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0903o0 c0903o0 = (C0903o0) this.f8840o;
            c0908r0 = this.f8841p;
            C0899m0 c0899m0 = new C0899m0(c0908r0, c0903o0);
            C0898m c0898m = c0908r0.f8867c;
            d4 = this.f8842q;
            long j5 = d4.f3579d;
            N n4 = c0908r0.f8868d;
            long j6 = this.f8843r;
            float c4 = c0908r0.c(n4 == n2 ? M0.o.b(j6) : M0.o.c(j6));
            this.f8840o = c0908r0;
            this.f8836k = c0908r0;
            this.f8837l = d4;
            this.f8838m = j5;
            this.f8839n = 1;
            c0898m.getClass();
            obj = W2.B.q(c0898m.f8829b, new C0896l(c4, c0898m, c0899m0, null), this);
            if (obj == aVar) {
                return aVar;
            }
            j4 = j5;
            c0908r02 = c0908r0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = this.f8838m;
            d4 = this.f8837l;
            c0908r0 = this.f8836k;
            c0908r02 = (C0908r0) this.f8840o;
            AbstractC1343r.b(obj);
        }
        float c5 = c0908r02.c(((Number) obj).floatValue());
        d4.f3579d = c0908r0.f8868d == n2 ? M0.o.a(j4, c5, 0.0f, 2) : M0.o.a(j4, 0.0f, c5, 1);
        return Unit.f7487a;
    }
}
