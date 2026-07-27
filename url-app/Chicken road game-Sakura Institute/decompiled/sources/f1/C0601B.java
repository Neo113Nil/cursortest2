package f1;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601B extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public Throwable f6468k;

    /* renamed from: l, reason: collision with root package name */
    public int f6469l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ boolean f6470m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f6471n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6472o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0601B(N n2, int i2, C2.a aVar) {
        super(2, aVar);
        this.f6471n = n2;
        this.f6472o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0601B) j((C2.a) obj2, bool)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0601B c0601b = new C0601B(this.f6471n, this.f6472o, aVar);
        c0601b.f6470m = ((Boolean) obj).booleanValue();
        return c0601b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // E2.a
    public final Object l(Object obj) {
        Throwable th;
        int i2;
        boolean z4;
        Y y4;
        boolean z5;
        D2.a aVar = D2.a.f2163d;
        boolean z6 = this.f6469l;
        N n2 = this.f6471n;
        try {
        } catch (Throwable th2) {
            if (z6 != 0) {
                X e4 = n2.e();
                this.f6468k = th2;
                this.f6470m = z6;
                this.f6469l = 2;
                Integer a4 = e4.a();
                if (a4 == aVar) {
                    return aVar;
                }
                z4 = z6;
                th = th2;
                obj = a4;
            } else {
                boolean z7 = z6;
                th = th2;
                i2 = this.f6472o;
                z4 = z7;
            }
        }
        if (z6 == 0) {
            AbstractC1343r.b(obj);
            boolean z8 = this.f6470m;
            this.f6470m = z8;
            this.f6469l = 1;
            obj = N.c(n2, z8, this);
            z6 = z8;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z6 != 1) {
                if (z6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f6470m;
                th = this.f6468k;
                AbstractC1343r.b(obj);
                i2 = ((Number) obj).intValue();
                Q q2 = new Q(th, i2);
                z5 = z4;
                y4 = q2;
                return new Pair(y4, Boolean.valueOf(z5));
            }
            boolean z9 = this.f6470m;
            AbstractC1343r.b(obj);
            z6 = z9;
        }
        y4 = (Y) obj;
        z5 = z6;
        return new Pair(y4, Boolean.valueOf(z5));
    }
}
