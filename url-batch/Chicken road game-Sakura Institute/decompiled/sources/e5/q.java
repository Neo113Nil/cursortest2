package e5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f2792a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f2793b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // z5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f2793b == null) {
            synchronized (this) {
                try {
                    if (this.f2793b == null) {
                        this.f2793b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f2792a.iterator();
                            while (it.hasNext()) {
                                this.f2793b.add(((z5.b) it.next()).get());
                            }
                            this.f2792a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f2793b);
    }
}
