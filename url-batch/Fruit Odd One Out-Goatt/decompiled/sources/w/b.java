package w;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1199d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1200e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f1201f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f1202g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f1203h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f1204i;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1205b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1206c;

    static {
        int i2 = 0;
        f1199d = new b("NONE", i2);
        f1200e = new b("FULL", i2);
        int i3 = 1;
        f1201f = new b("FLAT", i3);
        f1202g = new b("HALF_OPENED", i3);
        int i4 = 2;
        f1203h = new b("FOLD", i4);
        f1204i = new b("HINGE", i4);
    }

    public b(x.a aVar) {
        this.f1205b = 3;
        int i2 = m.f1226b;
        this.f1206c = aVar;
    }

    public String toString() {
        switch (this.f1205b) {
            case 0:
                return (String) this.f1206c;
            case 1:
                return (String) this.f1206c;
            case 2:
                return (String) this.f1206c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(String str, int i2) {
        this.f1205b = i2;
        this.f1206c = str;
    }
}
