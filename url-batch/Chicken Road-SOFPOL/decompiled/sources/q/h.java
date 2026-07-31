package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends q6.j implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public static final h f5839f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f5840g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5841e;

    static {
        int i = 2;
        f5839f = new h(i, 0);
        f5840g = new h(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, int i8) {
        super(i);
        this.f5841e = i8;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f5841e) {
            case 0:
                long j7 = ((r2.k) obj).f6528a;
                long j8 = ((r2.k) obj2).f6528a;
                long j9 = 1;
                return r.d.l(0.0f, 400.0f, new r2.k((j9 & 4294967295L) | (j9 << 32)), 1);
            default:
                c0 c0Var = (c0) obj2;
                return Boolean.valueOf(((c0) obj) == c0Var && c0Var == c0.f5808f);
        }
    }
}
