package N4;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class g extends d {

    /* renamed from: i, reason: collision with root package name */
    public static final I6.d f1839i = new I6.d(1);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1840e;

    static {
        new AtomicLong();
    }

    public g(boolean z7, ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f1840e = z7;
    }

    @Override // N4.d
    public e b(Object obj) {
        e eVar = this.f1840e ? (e) f1839i.get() : new e();
        eVar.f1837a = obj;
        eVar.f1838b = System.identityHashCode(obj);
        return eVar;
    }

    @Override // N4.d
    public void d(Object obj) {
        e eVar = (e) obj;
        eVar.f1837a = null;
        eVar.f1838b = 0;
    }
}
