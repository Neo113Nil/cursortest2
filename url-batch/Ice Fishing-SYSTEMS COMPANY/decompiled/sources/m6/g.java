package m6;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class g extends AbstractRunnableC4786d {

    /* renamed from: v, reason: collision with root package name */
    public static final H7.b f39579v = new H7.b(14);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f39580u;

    static {
        new AtomicLong();
    }

    public g(boolean z8, ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f39580u = z8;
    }

    @Override // m6.AbstractRunnableC4786d
    public e c(Object obj) {
        e eVar = this.f39580u ? (e) f39579v.get() : new e();
        eVar.f39577a = obj;
        eVar.f39578b = System.identityHashCode(obj);
        return eVar;
    }

    @Override // m6.AbstractRunnableC4786d
    public void e(Object obj) {
        e eVar = (e) obj;
        eVar.f39577a = null;
        eVar.f39578b = 0;
    }
}
