package P;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class P extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.C f2010d;

    /* renamed from: e, reason: collision with root package name */
    public int f2011e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2012i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.C f2013l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q f2014m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2015n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2016o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(kotlin.jvm.internal.C c7, Q q4, Object obj, boolean z7, V5.b bVar) {
        super(2, bVar);
        this.f2013l = c7;
        this.f2014m = q4;
        this.f2015n = obj;
        this.f2016o = z7;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        P p7 = new P(this.f2013l, this.f2014m, this.f2015n, this.f2016o, bVar);
        p7.f2012i = obj;
        return p7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((b0) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r6.b(r2, r7) == r0) goto L16;
     */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        kotlin.jvm.internal.C c7;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2011e;
        Object obj2 = this.f2015n;
        Q q4 = this.f2014m;
        kotlin.jvm.internal.C c8 = this.f2013l;
        if (i2 == 0) {
            V6.b.P(obj);
            b0 b0Var2 = (b0) this.f2012i;
            l0 g7 = q4.g();
            this.f2012i = b0Var2;
            this.f2010d = c8;
            this.f2011e = 1;
            Integer num = new Integer(((AtomicInteger) g7.f2126b.f152e).incrementAndGet());
            if (num != aVar) {
                b0Var = b0Var2;
                obj = num;
                c7 = c8;
            }
            return aVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            if (this.f2016o) {
                q4.f2024p.w(new C0139d(obj2, obj2 != null ? obj2.hashCode() : 0, c8.f6151d));
            }
            return Unit.f6114a;
        }
        c7 = this.f2010d;
        b0Var = (b0) this.f2012i;
        V6.b.P(obj);
        c7.f6151d = ((Number) obj).intValue();
        this.f2012i = null;
        this.f2010d = null;
        this.f2011e = 2;
    }
}
