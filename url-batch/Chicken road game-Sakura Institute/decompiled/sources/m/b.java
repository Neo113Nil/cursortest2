package m;

import c7.m1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public boolean f6110g;

    /* renamed from: h, reason: collision with root package name */
    public int f6111h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6112i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o.m0 f6113j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f6114k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p.j f6115l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f6116m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o.m0 m0Var, long j8, p.j jVar, q qVar, h6.d dVar) {
        super(2, dVar);
        this.f6113j = m0Var;
        this.f6114k = j8;
        this.f6115l = jVar;
        this.f6116m = qVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        b bVar = new b(this.f6113j, this.f6114k, this.f6115l, this.f6116m, dVar);
        bVar.f6112i = obj;
        return bVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((b) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bd, code lost:
    
        if (r15.b(r1, r18) != r11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r15.b(r3, r18) == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        if (r3 == r11) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [p.l] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v4, types: [c7.x0] */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i6.a aVar;
        ?? r10;
        Object c4;
        ?? r12;
        boolean z8;
        p.m mVar;
        int i7 = this.f6111h;
        d6.z zVar = d6.z.f2639a;
        q qVar = this.f6116m;
        p.j jVar = this.f6115l;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 == 0) {
            d6.a.e(obj);
            aVar = aVar2;
            r10 = 0;
            m1 p6 = c7.a0.p((c7.x) this.f6112i, null, null, new a(qVar, this.f6114k, this.f6115l, null, 0), 3);
            this.f6112i = p6;
            this.f6111h = 1;
            c4 = this.f6113j.c(this);
            r12 = p6;
        } else if (i7 == 1) {
            c7.x0 x0Var = (c7.x0) this.f6112i;
            d6.a.e(obj);
            r10 = 0;
            aVar = aVar2;
            c4 = obj;
            r12 = x0Var;
        } else {
            if (i7 == 2) {
                z8 = this.f6110g;
                d6.a.e(obj);
                r10 = 0;
                aVar = aVar2;
                if (z8) {
                    p.l lVar = new p.l(this.f6114k);
                    p.m mVar2 = new p.m(lVar);
                    this.f6112i = mVar2;
                    this.f6111h = 3;
                    if (jVar.b(lVar, this) != aVar) {
                        mVar = mVar2;
                        r10 = r10;
                        this.f6112i = r10;
                        this.f6111h = 4;
                    }
                    return aVar;
                }
                qVar.E = r10;
                return zVar;
            }
            if (i7 != 3) {
                if (i7 != 4 && i7 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d6.a.e(obj);
                r10 = 0;
                qVar.E = r10;
                return zVar;
            }
            mVar = (p.m) this.f6112i;
            d6.a.e(obj);
            r10 = 0;
            aVar = aVar2;
            this.f6112i = r10;
            this.f6111h = 4;
        }
        boolean booleanValue = ((Boolean) c4).booleanValue();
        if (!r12.b()) {
            p.l lVar2 = qVar.E;
            if (lVar2 != null) {
                p.h mVar3 = booleanValue ? new p.m(lVar2) : new p.k(lVar2);
                this.f6112i = r10;
                this.f6111h = 5;
            }
            qVar.E = r10;
            return zVar;
        }
        this.f6112i = r10;
        this.f6110g = booleanValue;
        this.f6111h = 2;
        r12.c(r10);
        Object N = r12.N(this);
        if (N != aVar) {
            N = zVar;
        }
        if (N != aVar) {
            z8 = booleanValue;
            r10 = r10;
            if (z8) {
            }
            qVar.E = r10;
            return zVar;
        }
        return aVar;
    }
}
