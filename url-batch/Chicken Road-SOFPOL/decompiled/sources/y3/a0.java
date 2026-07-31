package y3;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public q6.q f8834h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8835j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q6.q f8836k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0 f8837l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8838m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f8839n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q6.q qVar, b0 b0Var, Object obj, boolean z3, g6.c cVar) {
        super(2, cVar);
        this.f8836k = qVar;
        this.f8837l = b0Var;
        this.f8838m = obj;
        this.f8839n = z3;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((a0) l((g6.c) obj2, (j0) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        a0 a0Var = new a0(this.f8836k, this.f8837l, this.f8838m, this.f8839n, cVar);
        a0Var.f8835j = obj;
        return a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r9 == r7) goto L21;
     */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        j0 j0Var;
        q6.q qVar;
        int i = this.i;
        c6.m mVar = c6.m.f1757a;
        Object obj2 = this.f8838m;
        b0 b0Var = this.f8837l;
        q6.q qVar2 = this.f8836k;
        h6.a aVar = h6.a.f3204d;
        if (i == 0) {
            s6.a.K(obj);
            j0 j0Var2 = (j0) this.f8835j;
            r0 g3 = b0Var.g();
            this.f8835j = j0Var2;
            this.f8834h = qVar2;
            this.i = 1;
            Integer num = new Integer(((AtomicInteger) g3.f8934b.f6119e).incrementAndGet());
            if (num != aVar) {
                j0Var = j0Var2;
                obj = num;
                qVar = qVar2;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s6.a.K(obj);
            if (this.f8839n) {
                b0Var.f8845j.s(new c(obj2 != null ? obj2.hashCode() : 0, qVar2.f6203d, obj2));
            }
            return mVar;
        }
        qVar = this.f8834h;
        j0Var = (j0) this.f8835j;
        s6.a.K(obj);
        qVar.f6203d = ((Number) obj).intValue();
        this.f8835j = null;
        this.f8834h = null;
        this.i = 2;
        if (j0Var.f8857b.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        Object e8 = r2.r.e(j0Var.f8856a, new y(j0Var, obj2, null), this);
        if (e8 != aVar) {
            e8 = mVar;
        }
    }
}
