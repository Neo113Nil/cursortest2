package t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6764h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f6765j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v.l f6766k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(u uVar, v.l lVar, g6.c cVar, int i) {
        super(2, cVar);
        this.f6764h = i;
        this.f6765j = uVar;
        this.f6766k = lVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f6764h) {
        }
        return ((e) l(cVar, uVar)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f6764h) {
            case 0:
                return new e(this.f6765j, this.f6766k, cVar, 0);
            case 1:
                return new e(this.f6765j, this.f6766k, cVar, 1);
            default:
                return new e(this.f6765j, this.f6766k, cVar, 2);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f6764h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    v.j jVar = this.f6765j.f6860t;
                    if (jVar != null) {
                        v.k kVar = new v.k(this.f6766k);
                        this.i = 1;
                        Object b8 = jVar.b(kVar, this);
                        h6.a aVar = h6.a.f3204d;
                        if (b8 == aVar) {
                            return aVar;
                        }
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
                if (i8 == 0) {
                    s6.a.K(obj);
                    v.j jVar2 = this.f6765j.f6860t;
                    if (jVar2 != null) {
                        this.i = 1;
                        Object b9 = jVar2.b(this.f6766k, this);
                        h6.a aVar2 = h6.a.f3204d;
                        if (b9 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            default:
                int i9 = this.i;
                if (i9 == 0) {
                    s6.a.K(obj);
                    v.j jVar3 = this.f6765j.f6860t;
                    if (jVar3 != null) {
                        v.m mVar = new v.m(this.f6766k);
                        this.i = 1;
                        Object b10 = jVar3.b(mVar, this);
                        h6.a aVar3 = h6.a.f3204d;
                        if (b10 == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
        }
    }
}
