package p1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class l implements A1.a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f5689a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f5690b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // A1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f5690b == null) {
            synchronized (this) {
                try {
                    if (this.f5690b == null) {
                        this.f5690b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f5689a.iterator();
                            while (it.hasNext()) {
                                this.f5690b.add(((A1.a) it.next()).get());
                            }
                            this.f5689a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f5690b);
    }
}
