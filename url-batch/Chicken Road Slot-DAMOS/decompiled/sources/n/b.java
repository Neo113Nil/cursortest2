package n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends g8.b {

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f6632b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f6633c = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final d f6634a = new d();

    public static b Q() {
        if (f6632b != null) {
            return f6632b;
        }
        synchronized (b.class) {
            try {
                if (f6632b == null) {
                    f6632b = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6632b;
    }
}
