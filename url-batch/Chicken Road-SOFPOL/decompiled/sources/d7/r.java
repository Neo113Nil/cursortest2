package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends i6.i implements p6.f {

    /* renamed from: h, reason: collision with root package name */
    public int f2416h;
    public /* synthetic */ g i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2417j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c2.a f2418k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c2.a aVar, g6.c cVar) {
        super(3, cVar);
        this.f2418k = aVar;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        r rVar = new r(this.f2418k, (g6.c) obj3);
        rVar.i = (g) obj;
        rVar.f2417j = obj2;
        return rVar.p(c6.m.f1757a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0.a(r5, r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r3) goto L15;
     */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        g gVar;
        int i = this.f2416h;
        h6.a aVar = h6.a.f3204d;
        if (i == 0) {
            s6.a.K(obj);
            gVar = this.i;
            Object obj2 = this.f2417j;
            this.i = gVar;
            this.f2416h = 1;
            obj = this.f2418k.g(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s6.a.K(obj);
                return c6.m.f1757a;
            }
            gVar = this.i;
            s6.a.K(obj);
        }
        this.i = null;
        this.f2416h = 2;
    }
}
