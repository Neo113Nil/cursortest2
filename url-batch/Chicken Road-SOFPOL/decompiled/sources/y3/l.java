package y3;

import x1.c2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8903h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f8904j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(b0 b0Var, g6.c cVar, int i) {
        super(2, cVar);
        this.f8903h = i;
        this.f8904j = b0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f8903h) {
            case 0:
                return ((l) l((g6.c) obj2, (d7.g) obj)).p(c6.m.f1757a);
            case 1:
                return ((l) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            default:
                return ((l) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f8903h) {
            case 0:
                return new l(this.f8904j, cVar, 0);
            case 1:
                return new l(this.f8904j, cVar, 1);
            default:
                return new l(this.f8904j, cVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (r7 == r5) goto L43;
     */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        switch (this.f8903h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    this.i = 1;
                    Object c8 = b0.c(this.f8904j, this);
                    h6.a aVar = h6.a.f3204d;
                    if (c8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            case 1:
                int i8 = this.i;
                c6.m mVar = c6.m.f1757a;
                b0 b0Var = this.f8904j;
                h6.a aVar2 = h6.a.f3204d;
                if (i8 == 0) {
                    s6.a.K(obj);
                    c5.x xVar = b0Var.f8846k;
                    this.i = 1;
                    Object f02 = ((a7.m) xVar.f1738e).f0(this);
                    if (f02 != aVar2) {
                        f02 = mVar;
                        break;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s6.a.K(obj);
                        return mVar;
                    }
                    s6.a.K(obj);
                }
                d7.f e8 = d7.e0.e(b0Var.g().f8935c, -1);
                c2 c2Var = new c2(1, b0Var);
                this.i = 2;
                if (e8.c(c2Var, this) != aVar2) {
                    return mVar;
                }
                return aVar2;
            default:
                b0 b0Var2 = this.f8904j;
                q3.k kVar = b0Var2.f8845j;
                int i9 = this.i;
                h6.a aVar3 = h6.a.f3204d;
                try {
                    if (i9 == 0) {
                        s6.a.K(obj);
                        if (kVar.i() instanceof k0) {
                            return kVar.i();
                        }
                        this.i = 1;
                        if (b0.d(b0Var2, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i9 != 1) {
                            if (i9 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj);
                            return (s0) obj;
                        }
                        s6.a.K(obj);
                    }
                    this.i = 2;
                    obj = b0.e(b0Var2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (s0) obj;
                } catch (Throwable th) {
                    return new n0(th, -1);
                }
        }
    }
}
