package k4;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18223a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18224b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18225c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18226d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18227e;

    /* renamed from: f, reason: collision with root package name */
    private final k4.a f18228f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f18229a;

        /* renamed from: b, reason: collision with root package name */
        private int f18230b = 0;

        /* renamed from: c, reason: collision with root package name */
        private String f18231c;

        /* renamed from: d, reason: collision with root package name */
        private k4.a f18232d;

        public final d a() {
            return new d(this);
        }

        public final a b(k4.a aVar) {
            this.f18232d = aVar;
            return this;
        }

        public final a c(boolean z6) {
            this.f18229a = z6;
            return this;
        }
    }

    private d(a aVar) {
        this.f18223a = aVar.f18229a;
        this.f18225c = null;
        this.f18224b = 0;
        this.f18226d = null;
        this.f18227e = aVar.f18231c;
        this.f18228f = aVar.f18232d;
    }

    public k4.a a() {
        return this.f18228f;
    }

    public boolean b() {
        return this.f18223a;
    }

    public final String c() {
        return this.f18227e;
    }
}
