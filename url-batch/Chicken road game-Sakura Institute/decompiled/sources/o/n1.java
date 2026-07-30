package o;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n1 extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public Object f6698g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6699h;

    /* renamed from: i, reason: collision with root package name */
    public r6.v f6700i;

    /* renamed from: j, reason: collision with root package name */
    public long f6701j;

    /* renamed from: k, reason: collision with root package name */
    public int f6702k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c7.x f6704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q6.f f6705n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w.j f6706o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m0 f6707p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(c7.x xVar, q6.f fVar, w.j jVar, m0 m0Var, h6.d dVar) {
        super(2, dVar);
        this.f6704m = xVar;
        this.f6705n = fVar;
        this.f6706o = jVar;
        this.f6707p = m0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        n1 n1Var = new n1(this.f6704m, this.f6705n, this.f6706o, this.f6707p, dVar);
        n1Var.f6703l = obj;
        return n1Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((n1) create((l1.c0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
    
        if (o.p1.a(r3, r18) == r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x019b, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r15.f(r4, r1, r18) == r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
    
        if (r2 == r12) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167 A[Catch: l -> 0x0171, TryCatch #2 {l -> 0x0171, blocks: (B:52:0x0161, B:54:0x0167, B:57:0x0175), top: B:51:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0175 A[Catch: l -> 0x0171, TRY_LEAVE, TryCatch #2 {l -> 0x0171, blocks: (B:52:0x0161, B:54:0x0167, B:57:0x0175), top: B:51:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0 m0Var;
        i6.a aVar;
        l1.c0 c0Var;
        Object b9;
        l1.c0 c0Var2;
        i6.a aVar2;
        r6.v vVar;
        long j8;
        r6.v vVar2;
        long j9;
        Object f9;
        l1.c0 c0Var3;
        r6.v vVar3;
        Object obj2;
        Object obj3;
        l1.c0 c0Var4;
        m0 m0Var2;
        r6.v vVar4;
        l1.c0 c0Var5;
        w.j jVar = this.f6706o;
        a0.x0 x0Var = jVar.f9254h;
        int i7 = this.f6702k;
        c7.x xVar = this.f6704m;
        q6.f fVar = this.f6705n;
        m0 m0Var3 = this.f6707p;
        i6.a aVar3 = i6.a.f4956f;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m0Var = m0Var3;
                aVar = aVar3;
                d6.a.e(obj);
                c0Var = (l1.c0) this.f6703l;
                this.f6703l = c0Var;
                this.f6702k = 1;
                b9 = p1.b(c0Var, (r3 & 1) != 0, l1.k.f5816g, this);
                break;
            case 1:
                m0Var = m0Var3;
                aVar = aVar3;
                c0Var = (l1.c0) this.f6703l;
                d6.a.e(obj);
                b9 = obj;
                c0Var2 = c0Var;
                l1.v vVar5 = (l1.v) b9;
                vVar5.a();
                c7.a0.p(xVar, null, null, new i1(m0Var, null, 1), 3);
                if (fVar != p1.f6716a) {
                    i6.a aVar4 = aVar;
                    m0Var3 = m0Var;
                    aVar2 = aVar4;
                    c7.a0.p(xVar, null, null, new l1(fVar, m0Var3, vVar5, null, 0), 3);
                } else {
                    i6.a aVar5 = aVar;
                    m0Var3 = m0Var;
                    aVar2 = aVar5;
                }
                vVar = new r6.v();
                j8 = 4611686018427387903L;
                try {
                    m1 m1Var = new m1(2, null);
                    this.f6703l = c0Var2;
                    this.f6698g = vVar5;
                    this.f6699h = vVar;
                    this.f6700i = vVar;
                    this.f6701j = 4611686018427387903L;
                    this.f6702k = 2;
                    f9 = c0Var2.f(4611686018427387903L, m1Var, this);
                } catch (l1.l unused) {
                    vVar2 = vVar;
                    j9 = 4611686018427387903L;
                    this.f6703l = c0Var2;
                    this.f6698g = vVar2;
                    this.f6699h = null;
                    this.f6700i = null;
                    this.f6701j = j9;
                    this.f6702k = 3;
                    if (p1.a(c0Var2, this) == aVar2) {
                    }
                    c7.a0.p(xVar, null, null, new j1(m0Var3, null, 5), 3);
                    vVar3 = vVar2;
                    obj3 = vVar3.f7968f;
                    if (obj3 != null) {
                    }
                    return d6.z.f2639a;
                }
                if (f9 == aVar2) {
                    return aVar2;
                }
                c0Var3 = c0Var2;
                vVar3 = vVar;
                try {
                    vVar.f7968f = f9;
                    obj2 = vVar3.f7968f;
                    if (obj2 != null) {
                        c7.a0.p(xVar, null, null, new j1(m0Var3, null, 3), 3);
                    } else {
                        ((l1.v) obj2).a();
                        c7.a0.p(xVar, null, null, new j1(m0Var3, null, 4), 3);
                    }
                } catch (l1.l unused2) {
                    j9 = j8;
                    vVar2 = vVar3;
                    c0Var2 = c0Var3;
                    this.f6703l = c0Var2;
                    this.f6698g = vVar2;
                    this.f6699h = null;
                    this.f6700i = null;
                    this.f6701j = j9;
                    this.f6702k = 3;
                    if (p1.a(c0Var2, this) == aVar2) {
                    }
                    c7.a0.p(xVar, null, null, new j1(m0Var3, null, 5), 3);
                    vVar3 = vVar2;
                    obj3 = vVar3.f7968f;
                    if (obj3 != null) {
                    }
                    return d6.z.f2639a;
                }
                obj3 = vVar3.f7968f;
                if (obj3 != null) {
                    x0Var.o();
                }
                return d6.z.f2639a;
            case 2:
                j8 = this.f6701j;
                vVar = this.f6700i;
                r6.v vVar6 = (r6.v) this.f6699h;
                c0Var2 = (l1.c0) this.f6703l;
                try {
                    d6.a.e(obj);
                    m0Var3 = m0Var3;
                    aVar2 = aVar3;
                    c0Var3 = c0Var2;
                    vVar3 = vVar6;
                    f9 = obj;
                    vVar.f7968f = f9;
                    obj2 = vVar3.f7968f;
                    if (obj2 != null) {
                    }
                } catch (l1.l unused3) {
                    m0Var3 = m0Var3;
                    aVar2 = aVar3;
                    j9 = j8;
                    vVar2 = vVar6;
                    this.f6703l = c0Var2;
                    this.f6698g = vVar2;
                    this.f6699h = null;
                    this.f6700i = null;
                    this.f6701j = j9;
                    this.f6702k = 3;
                    if (p1.a(c0Var2, this) == aVar2) {
                        return aVar2;
                    }
                    c7.a0.p(xVar, null, null, new j1(m0Var3, null, 5), 3);
                    vVar3 = vVar2;
                    obj3 = vVar3.f7968f;
                    if (obj3 != null) {
                    }
                    return d6.z.f2639a;
                }
                obj3 = vVar3.f7968f;
                if (obj3 != null) {
                }
                return d6.z.f2639a;
            case 3:
                vVar2 = (r6.v) this.f6698g;
                d6.a.e(obj);
                c7.a0.p(xVar, null, null, new j1(m0Var3, null, 5), 3);
                vVar3 = vVar2;
                obj3 = vVar3.f7968f;
                if (obj3 != null) {
                }
                return d6.z.f2639a;
            case 4:
                long j10 = this.f6701j;
                r6.v vVar7 = (r6.v) this.f6698g;
                l1.c0 c0Var6 = (l1.c0) this.f6703l;
                d6.a.e(obj);
                l1.v vVar8 = (l1.v) obj;
                if (vVar8 == null) {
                    long j11 = ((l1.v) vVar7.f7968f).f5832c;
                    x0Var.o();
                } else {
                    c7.a0.p(xVar, null, null, new i1(m0Var3, null, 2), 3);
                    if (fVar != p1.f6716a) {
                        c7.a0.p(xVar, null, null, new l1(fVar, m0Var3, vVar8, null, 1), 3);
                    }
                    try {
                        try {
                            c0Var4 = c0Var6;
                            aVar = aVar3;
                            m0Var2 = m0Var3;
                            try {
                                k1 k1Var = new k1(this.f6704m, jVar, vVar7, m0Var2, (h6.d) null);
                                this.f6703l = c0Var4;
                                this.f6698g = vVar7;
                                this.f6699h = vVar8;
                                this.f6702k = 5;
                                break;
                            } catch (l1.l unused4) {
                                vVar4 = vVar7;
                                c0Var5 = c0Var4;
                                long j12 = ((l1.v) vVar4.f7968f).f5832c;
                                x0Var.o();
                                this.f6703l = null;
                                this.f6698g = null;
                                this.f6699h = null;
                                this.f6702k = 6;
                                break;
                            }
                        } catch (l1.l unused5) {
                            aVar = aVar3;
                            m0Var2 = m0Var3;
                            c0Var4 = c0Var6;
                        }
                    } catch (l1.l unused6) {
                        c0Var4 = c0Var6;
                        m0Var2 = m0Var3;
                        aVar = aVar3;
                    }
                }
                return d6.z.f2639a;
            case 5:
                vVar4 = (r6.v) this.f6698g;
                c0Var5 = (l1.c0) this.f6703l;
                try {
                    d6.a.e(obj);
                } catch (l1.l unused7) {
                    m0Var2 = m0Var3;
                    aVar = aVar3;
                    long j122 = ((l1.v) vVar4.f7968f).f5832c;
                    x0Var.o();
                    this.f6703l = null;
                    this.f6698g = null;
                    this.f6699h = null;
                    this.f6702k = 6;
                    break;
                }
                return d6.z.f2639a;
            case 6:
                d6.a.e(obj);
                m0Var2 = m0Var3;
                c7.a0.p(xVar, null, null, new j1(m0Var2, null, 2), 3);
                return d6.z.f2639a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
