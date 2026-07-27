package N1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class n implements Y1.a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f2028a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f2029b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // Y1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f2029b == null) {
            synchronized (this) {
                try {
                    if (this.f2029b == null) {
                        this.f2029b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f2028a.iterator();
                            while (it.hasNext()) {
                                this.f2029b.add(((Y1.a) it.next()).get());
                            }
                            this.f2028a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f2029b);
    }
}
