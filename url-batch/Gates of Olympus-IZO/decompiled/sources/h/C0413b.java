package h;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413b extends AbstractC0416e {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0413b f4859b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExecutorC0412a f4860c = new ExecutorC0412a(0);

    /* renamed from: a, reason: collision with root package name */
    public final C0415d f4861a = new C0415d();

    public static C0413b A() {
        if (f4859b != null) {
            return f4859b;
        }
        synchronized (C0413b.class) {
            try {
                if (f4859b == null) {
                    f4859b = new C0413b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4859b;
    }
}
