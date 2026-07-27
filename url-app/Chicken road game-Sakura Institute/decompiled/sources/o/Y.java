package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.AbstractC0779e;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class Y extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8732k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8733l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0908r0 f8734m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f8735n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M2.B f8736o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0908r0 c0908r0, long j4, M2.B b4, C2.a aVar) {
        super(2, aVar);
        this.f8734m = c0908r0;
        this.f8735n = j4;
        this.f8736o = b4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((Y) j((C2.a) obj2, (C0903o0) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        Y y4 = new Y(this.f8734m, this.f8735n, this.f8736o, aVar);
        y4.f8733l = obj;
        return y4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8732k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0903o0 c0903o0 = (C0903o0) this.f8733l;
            C0908r0 c0908r0 = this.f8734m;
            float f4 = c0908r0.f(this.f8735n);
            E.k kVar = new E.k(this.f8736o, c0908r0, c0903o0, 2);
            this.f8732k = 1;
            if (AbstractC0779e.c(0.0f, f4, null, kVar, this, 12) == aVar) {
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
