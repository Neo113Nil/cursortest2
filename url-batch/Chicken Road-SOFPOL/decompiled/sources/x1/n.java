package x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends q6.j implements p6.c {

    /* renamed from: f, reason: collision with root package name */
    public static final n f8510f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f8511g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f8512h;
    public static final n i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8513e;

    static {
        int i8 = 1;
        f8510f = new n(i8, 0);
        f8511g = new n(i8, 1);
        f8512h = new n(i8, 2);
        i = new n(i8, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i8, int i9) {
        super(i8);
        this.f8513e = i9;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f8513e) {
            case 0:
                return c6.m.f1757a;
            case 1:
                return Boolean.TRUE;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(g0.f(obj));
        }
    }
}
