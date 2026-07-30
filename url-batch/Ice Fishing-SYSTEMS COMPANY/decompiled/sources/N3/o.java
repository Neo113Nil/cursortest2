package N3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o implements Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f2186a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f2187b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // Y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f2187b == null) {
            synchronized (this) {
                try {
                    if (this.f2187b == null) {
                        this.f2187b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f2186a.iterator();
                            while (it.hasNext()) {
                                this.f2187b.add(((Y3.a) it.next()).get());
                            }
                            this.f2186a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f2187b);
    }
}
