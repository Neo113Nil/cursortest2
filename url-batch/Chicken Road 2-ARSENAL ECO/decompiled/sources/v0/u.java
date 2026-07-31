package v0;

import java.util.HashMap;
import u0.C0680j;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final String f6101e = l0.q.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final F3.i f6102a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6103b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6104c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f6105d = new Object();

    public u(F3.i iVar) {
        this.f6102a = iVar;
    }

    public final void a(C0680j c0680j) {
        synchronized (this.f6105d) {
            try {
                if (((t) this.f6103b.remove(c0680j)) != null) {
                    l0.q.d().a(f6101e, "Stopping timer for " + c0680j);
                    this.f6104c.remove(c0680j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
