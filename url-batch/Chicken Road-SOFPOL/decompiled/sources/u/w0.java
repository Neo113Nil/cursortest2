package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7113h;
    public final /* synthetic */ x0 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f7114j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f7115k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, float f6, float f8, g6.c cVar) {
        super(2, cVar);
        this.i = x0Var;
        this.f7114j = f6;
        this.f7115k = f8;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((w0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        return new w0(this.i, this.f7114j, this.f7115k, cVar);
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f7113h;
        if (i == 0) {
            s6.a.K(obj);
            this.f7113h = 1;
            Object a8 = r0.a(this.i.H, (Float.floatToRawIntBits(this.f7114j) << 32) | (Float.floatToRawIntBits(this.f7115k) & 4294967295L), this);
            h6.a aVar = h6.a.f3204d;
            if (a8 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s6.a.K(obj);
        }
        return c6.m.f1757a;
    }
}
