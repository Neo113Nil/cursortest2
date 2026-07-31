package W;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final b f872g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f873h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f874i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f875j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f876k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f877l;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f878e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f879f;

    static {
        int i2 = 0;
        f872g = new b("NONE", i2);
        f873h = new b("FULL", i2);
        int i3 = 1;
        f874i = new b("FLAT", i3);
        f875j = new b("HALF_OPENED", i3);
        int i4 = 2;
        f876k = new b("FOLD", i4);
        f877l = new b("HINGE", i4);
    }

    public /* synthetic */ b(String str, int i2) {
        this.f878e = i2;
        this.f879f = str;
    }

    public String toString() {
        switch (this.f878e) {
            case 0:
                return (String) this.f879f;
            case 1:
                return (String) this.f879f;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                return (String) this.f879f;
            default:
                return super.toString();
        }
    }

    public b(X.a aVar) {
        this.f878e = 3;
        int i2 = n.f903b;
        this.f879f = aVar;
    }
}
