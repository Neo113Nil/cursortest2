package I;

/* renamed from: I.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116q0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0114p0 f2333a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2334b;

    /* renamed from: c, reason: collision with root package name */
    public final N0 f2335c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2336d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2337e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2338f = true;

    public C0116q0(AbstractC0114p0 abstractC0114p0, Object obj, boolean z3, N0 n02, boolean z4) {
        this.f2333a = abstractC0114p0;
        this.f2334b = z3;
        this.f2335c = n02;
        this.f2336d = z4;
        this.f2337e = obj;
    }

    public final Object a() {
        if (this.f2334b) {
            return null;
        }
        Object obj = this.f2337e;
        if (obj != null) {
            return obj;
        }
        C0089d.x("Unexpected form of a provided value");
        throw null;
    }
}
