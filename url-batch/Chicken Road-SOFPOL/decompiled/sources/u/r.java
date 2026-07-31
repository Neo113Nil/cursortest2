package u;

import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends i6.h implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public q6.p f7076f;

    /* renamed from: g, reason: collision with root package name */
    public int f7077g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7078h;
    public final /* synthetic */ s1 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b6.j0 f7079j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b6.i1 f7080k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.e f7081l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s1 s1Var, b6.j0 j0Var, b6.i1 i1Var, c.e eVar, g6.c cVar) {
        super(cVar);
        this.i = s1Var;
        this.f7079j = j0Var;
        this.f7080k = i1Var;
        this.f7081l = eVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((r) l((g6.c) obj2, (q1.r) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        r rVar = new r(this.i, this.f7079j, this.f7080k, this.f7081l, cVar);
        rVar.f7078h = obj;
        return rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r12 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        q1.r rVar;
        q6.p pVar;
        r rVar2;
        q1.r rVar3;
        q1.k kVar;
        int i = this.f7077g;
        h6.a aVar = h6.a.f3204d;
        if (i == 0) {
            s6.a.K(obj);
            rVar = (q1.r) this.f7078h;
            this.f7078h = rVar;
            this.f7077g = 1;
            obj = h1.a(rVar, (r3 & 1) != 0, q1.g.f5989e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    rVar2 = this;
                    if (((Boolean) obj).booleanValue()) {
                        rVar2.f7080k.b();
                    } else {
                        float f6 = t.f7095a;
                    }
                    return c6.m.f1757a;
                }
                pVar = this.f7076f;
                rVar3 = (q1.r) this.f7078h;
                s6.a.K(obj);
                rVar2 = this;
                kVar = (q1.k) obj;
                if (kVar != null) {
                    float f8 = t.f7095a;
                    Float f9 = new Float(pVar.f6202d);
                    b6.j0 j0Var = rVar2.f7079j;
                    j0Var.g(kVar, f9);
                    long j7 = kVar.f5994a;
                    a0.t tVar = new a0.t(22, j0Var);
                    rVar2.f7078h = null;
                    rVar2.f7076f = null;
                    rVar2.f7077g = 3;
                    obj = t.b(rVar3, j7, tVar, this);
                }
                return c6.m.f1757a;
            }
            rVar = (q1.r) this.f7078h;
            s6.a.K(obj);
        }
        q1.r rVar4 = rVar;
        q1.k kVar2 = (q1.k) obj;
        pVar = new q6.p();
        long j8 = kVar2.f5994a;
        int i8 = kVar2.i;
        b6.j0 j0Var2 = new b6.j0(8, pVar);
        this.f7078h = rVar4;
        this.f7076f = pVar;
        this.f7077g = 2;
        rVar2 = this;
        obj = t.a(rVar4, j8, i8, j0Var2, rVar2);
        if (obj != aVar) {
            rVar3 = rVar4;
            kVar = (q1.k) obj;
            if (kVar != null) {
            }
            return c6.m.f1757a;
        }
        return aVar;
    }
}
