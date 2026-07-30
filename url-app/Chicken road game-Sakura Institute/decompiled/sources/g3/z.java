package g3;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public r6.t f4228g;

    /* renamed from: h, reason: collision with root package name */
    public int f4229h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4230i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r6.t f4231j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a0 f4232k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4233l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f4234m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(r6.t tVar, a0 a0Var, Object obj, boolean z8, h6.d dVar) {
        super(2, dVar);
        this.f4231j = tVar;
        this.f4232k = a0Var;
        this.f4233l = obj;
        this.f4234m = z8;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        z zVar = new z(this.f4231j, this.f4232k, this.f4233l, this.f4234m, dVar);
        zVar.f4230i = obj;
        return zVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((z) create((i3.k) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.b(r1, r7) == r6) goto L16;
     */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i3.k kVar;
        r6.t tVar;
        int i7 = this.f4229h;
        Object obj2 = this.f4233l;
        a0 a0Var = this.f4232k;
        r6.t tVar2 = this.f4231j;
        i6.a aVar = i6.a.f4956f;
        if (i7 == 0) {
            d6.a.e(obj);
            i3.k kVar2 = (i3.k) this.f4230i;
            h0 e9 = a0Var.e();
            this.f4230i = kVar2;
            this.f4228g = tVar2;
            this.f4229h = 1;
            Integer num = new Integer(((AtomicInteger) e9.f4141b.f1394g).incrementAndGet());
            if (num != aVar) {
                kVar = kVar2;
                obj = num;
                tVar = tVar2;
            }
            return aVar;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
            if (this.f4234m) {
                a0Var.f4095l.C(new c(obj2 != null ? obj2.hashCode() : 0, tVar2.f7966f, obj2));
            }
            return d6.z.f2639a;
        }
        tVar = this.f4228g;
        kVar = (i3.k) this.f4230i;
        d6.a.e(obj);
        tVar.f7966f = ((Number) obj).intValue();
        this.f4230i = null;
        this.f4228g = null;
        this.f4229h = 2;
    }
}
