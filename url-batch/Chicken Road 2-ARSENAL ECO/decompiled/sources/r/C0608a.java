package r;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0608a f5815c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0608a f5816d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5817a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f5818b;

    static {
        if (h.f5833i) {
            f5816d = null;
            f5815c = null;
        } else {
            f5816d = new C0608a(null, false);
            f5815c = new C0608a(null, true);
        }
    }

    public C0608a(Throwable th, boolean z5) {
        this.f5817a = z5;
        this.f5818b = th;
    }
}
