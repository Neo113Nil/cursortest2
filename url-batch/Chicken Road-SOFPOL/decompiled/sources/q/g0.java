package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p6.a f5838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z3, p6.a aVar) {
        super(1);
        this.f5837e = z3;
        this.f5838f = aVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        f1.g0 g0Var = (f1.g0) obj;
        boolean z3 = !this.f5837e && ((Boolean) this.f5838f.b()).booleanValue();
        if (g0Var.f2653n != z3) {
            g0Var.f2644d |= 16384;
            g0Var.f2653n = z3;
        }
        return c6.m.f1757a;
    }
}
