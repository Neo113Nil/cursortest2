package g4;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class g extends AbstractRunnableC0396d {

    /* renamed from: h, reason: collision with root package name */
    public static final A5.b f4284h = new A5.b(2);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4285g;

    static {
        new AtomicLong();
    }

    public g(boolean z5, ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f4285g = z5;
    }

    @Override // g4.AbstractRunnableC0396d
    public C0397e b(Object obj) {
        C0397e c0397e = this.f4285g ? (C0397e) f4284h.get() : new C0397e();
        c0397e.f4282a = obj;
        c0397e.f4283b = System.identityHashCode(obj);
        return c0397e;
    }

    @Override // g4.AbstractRunnableC0396d
    public void d(Object obj) {
        C0397e c0397e = (C0397e) obj;
        c0397e.f4282a = null;
        c0397e.f4283b = 0;
    }
}
