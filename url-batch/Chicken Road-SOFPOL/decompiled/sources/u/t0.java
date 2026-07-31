package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 extends q6.a implements p6.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7096k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i, i8, cls, obj, str, str2);
        this.f7096k = i9;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [p6.a, q6.j] */
    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7096k) {
            case 0:
                long j7 = ((r2.q) obj).f6537a;
                x0 x0Var = (x0) this.f6181d;
                a7.u uVar = (a7.u) ((q6.j) x0Var.E.f1739f).b();
                if (uVar == null) {
                    throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                }
                a7.x.n(uVar, null, new u0(x0Var, j7, null, 2), 3);
                return c6.m.f1757a;
            default:
                int intValue = ((Number) obj2).intValue();
                ((u0.c) this.f6181d).f((m0.s) obj, intValue);
                return c6.m.f1757a;
        }
    }
}
