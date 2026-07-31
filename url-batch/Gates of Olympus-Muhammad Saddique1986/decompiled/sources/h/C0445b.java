package h;

import h2.AbstractC0508a;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445b extends AbstractC0508a {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0445b f5847e;

    /* renamed from: f, reason: collision with root package name */
    public static final ExecutorC0444a f5848f = new ExecutorC0444a(0);

    /* renamed from: d, reason: collision with root package name */
    public final C0447d f5849d = new C0447d();

    public static C0445b b0() {
        if (f5847e != null) {
            return f5847e;
        }
        synchronized (C0445b.class) {
            try {
                if (f5847e == null) {
                    f5847e = new C0445b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5847e;
    }
}
