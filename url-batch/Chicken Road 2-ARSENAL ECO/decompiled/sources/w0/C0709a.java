package w0;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0709a f6149c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0709a f6150d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6151a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f6152b;

    static {
        if (h.f6169i) {
            f6150d = null;
            f6149c = null;
        } else {
            f6150d = new C0709a(null, false);
            f6149c = new C0709a(null, true);
        }
    }

    public C0709a(Throwable th, boolean z5) {
        this.f6151a = z5;
        this.f6152b = th;
    }
}
