package I;

/* renamed from: I.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170q0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0168p0 f2892a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2893b;

    /* renamed from: c, reason: collision with root package name */
    public final M0 f2894c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2895d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2896e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2897f = true;

    public C0170q0(AbstractC0168p0 abstractC0168p0, Object obj, boolean z3, M0 m02, boolean z4) {
        this.f2892a = abstractC0168p0;
        this.f2893b = z3;
        this.f2894c = m02;
        this.f2895d = z4;
        this.f2896e = obj;
    }

    public final Object a() {
        if (this.f2893b) {
            return null;
        }
        Object obj = this.f2896e;
        if (obj != null) {
            return obj;
        }
        C0143d.x("Unexpected form of a provided value");
        throw null;
    }
}
