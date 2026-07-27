package G;

/* renamed from: G.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219q0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0217p0 f2889a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2890b;

    /* renamed from: c, reason: collision with root package name */
    public final M0 f2891c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2892d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2893e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2894f = true;

    public C0219q0(AbstractC0217p0 abstractC0217p0, Object obj, boolean z4, M0 m02, boolean z5) {
        this.f2889a = abstractC0217p0;
        this.f2890b = z4;
        this.f2891c = m02;
        this.f2892d = z5;
        this.f2893e = obj;
    }

    public final Object a() {
        if (this.f2890b) {
            return null;
        }
        Object obj = this.f2893e;
        if (obj != null) {
            return obj;
        }
        C0192d.x("Unexpected form of a provided value");
        throw null;
    }
}
