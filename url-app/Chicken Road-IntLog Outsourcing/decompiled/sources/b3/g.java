package b3;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class g extends AbstractRunnableC0283d {

    /* renamed from: c, reason: collision with root package name */
    public static final Y4.d f4827c = new Y4.d(1);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4828b;

    static {
        new AtomicLong();
    }

    public g(boolean z, ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f4828b = z;
    }

    @Override // b3.AbstractRunnableC0283d
    public C0284e c(Object obj) {
        C0284e c0284e = this.f4828b ? (C0284e) f4827c.get() : new C0284e();
        c0284e.f4825a = obj;
        c0284e.f4826b = System.identityHashCode(obj);
        return c0284e;
    }

    @Override // b3.AbstractRunnableC0283d
    public void e(Object obj) {
        C0284e c0284e = (C0284e) obj;
        c0284e.f4825a = null;
        c0284e.f4826b = 0;
    }
}
