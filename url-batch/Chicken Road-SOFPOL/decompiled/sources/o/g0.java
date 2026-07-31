package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 extends i6.h implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public h0 f5465f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f5466g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f5467h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f5468j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5469k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0 f5470l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h0 f5471m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, h0 h0Var, g6.c cVar) {
        super(cVar);
        this.f5470l = i0Var;
        this.f5471m = h0Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((g0) l((g6.c) obj2, (x6.f) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        g0 g0Var = new g0(this.f5470l, this.f5471m, cVar);
        g0Var.f5469k = obj;
        return g0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        x6.f fVar;
        i0 i0Var;
        long[] jArr;
        int i;
        h0 h0Var;
        int i8 = this.f5468j;
        if (i8 == 0) {
            s6.a.K(obj);
            fVar = (x6.f) this.f5469k;
            i0Var = this.f5470l;
            f0 f0Var = i0Var.f5480e;
            jArr = f0Var.f5449c;
            i = f0Var.f5451e;
            h0Var = this.f5471m;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.i;
            jArr = this.f5467h;
            i0Var = this.f5466g;
            h0Var = this.f5465f;
            fVar = (x6.f) this.f5469k;
            s6.a.K(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return c6.m.f1757a;
        }
        int i9 = (int) ((jArr[i] >> 31) & 2147483647L);
        h0Var.f5475e = i;
        Object obj2 = i0Var.f5480e.f5448b[i];
        this.f5469k = fVar;
        this.f5465f = h0Var;
        this.f5466g = i0Var;
        this.f5467h = jArr;
        this.i = i9;
        this.f5468j = 1;
        fVar.b(obj2, this);
        return h6.a.f3204d;
    }
}
