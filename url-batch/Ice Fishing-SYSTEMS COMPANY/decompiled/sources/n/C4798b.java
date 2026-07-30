package n;

import a.AbstractC0415a;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4798b extends AbstractC0415a {

    /* renamed from: u, reason: collision with root package name */
    public static volatile C4798b f39612u;

    /* renamed from: v, reason: collision with root package name */
    public static final ExecutorC4797a f39613v = new ExecutorC4797a(0);

    /* renamed from: n, reason: collision with root package name */
    public final C4800d f39614n = new C4800d();

    public static C4798b J() {
        if (f39612u != null) {
            return f39612u;
        }
        synchronized (C4798b.class) {
            try {
                if (f39612u == null) {
                    f39612u = new C4798b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f39612u;
    }
}
