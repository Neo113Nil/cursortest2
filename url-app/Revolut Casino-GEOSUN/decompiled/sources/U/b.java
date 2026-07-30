package U;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final b f994g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f995h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f996i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f997j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f998k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f999l;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1000e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1001f;

    static {
        int i2 = 0;
        f994g = new b("NONE", i2);
        f995h = new b("FULL", i2);
        int i3 = 1;
        f996i = new b("FLAT", i3);
        f997j = new b("HALF_OPENED", i3);
        int i4 = 2;
        f998k = new b("FOLD", i4);
        f999l = new b("HINGE", i4);
    }

    public /* synthetic */ b(String str, int i2) {
        this.f1000e = i2;
        this.f1001f = str;
    }

    public String toString() {
        switch (this.f1000e) {
            case 0:
                return (String) this.f1001f;
            case 1:
                return (String) this.f1001f;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                return (String) this.f1001f;
            default:
                return super.toString();
        }
    }

    public b(V.a aVar) {
        this.f1000e = 3;
        int i2 = n.f1025b;
        this.f1001f = aVar;
    }
}
