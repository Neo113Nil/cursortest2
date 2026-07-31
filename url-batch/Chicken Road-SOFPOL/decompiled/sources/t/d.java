package t;

import a7.h1;
import u.c1;
import u.e1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6757h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f6758j;

    /* renamed from: k, reason: collision with root package name */
    public Object f6759k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6760l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6761m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, long j7, Object obj2, g6.c cVar, int i) {
        super(2, cVar);
        this.f6757h = i;
        this.f6760l = obj;
        this.f6758j = j7;
        this.f6761m = obj2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f6757h) {
            case 0:
                return ((d) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            default:
                return ((d) l((g6.c) obj2, (c1) obj)).p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f6757h) {
            case 0:
                return new d((u) this.f6760l, this.f6758j, (v.j) this.f6761m, cVar, 0);
            default:
                d dVar = new d((e1) this.f6760l, this.f6758j, (q6.p) this.f6761m, cVar, 1);
                dVar.f6759k = obj;
                return dVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r0.b(r13, r12) == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r13 == r7) goto L38;
     */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        v.m mVar;
        switch (this.f6757h) {
            case 0:
                v.j jVar = (v.j) this.f6761m;
                int i = this.i;
                c6.m mVar2 = c6.m.f1757a;
                h6.a aVar = h6.a.f3204d;
                if (i == 0) {
                    s6.a.K(obj);
                    h1 h1Var = ((u) this.f6760l).I;
                    if (h1Var != null) {
                        this.i = 1;
                        h1Var.a(null);
                        Object r7 = h1Var.r(this);
                        if (r7 != aVar) {
                            r7 = mVar2;
                            break;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj);
                            return mVar2;
                        }
                        mVar = (v.m) this.f6759k;
                        s6.a.K(obj);
                        this.f6759k = null;
                        this.i = 3;
                        if (jVar.b(mVar, this) != aVar) {
                            return mVar2;
                        }
                        return aVar;
                    }
                    s6.a.K(obj);
                }
                v.l lVar = new v.l(this.f6758j);
                mVar = new v.m(lVar);
                this.f6759k = mVar;
                this.i = 2;
                break;
            default:
                e1 e1Var = (e1) this.f6760l;
                int i8 = this.i;
                if (i8 == 0) {
                    s6.a.K(obj);
                    c1 c1Var = (c1) this.f6759k;
                    float g3 = e1Var.g(this.f6758j);
                    b6.c cVar = new b6.c((q6.p) this.f6761m, e1Var, c1Var, 5);
                    this.i = 1;
                    Object c8 = r.d.c(0.0f, g3, null, cVar, this, 12);
                    h6.a aVar2 = h6.a.f3204d;
                    if (c8 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
        }
    }
}
