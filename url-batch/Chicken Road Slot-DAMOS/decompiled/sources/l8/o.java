package l8;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements w8.a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f5929a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f5930b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // w8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f5930b == null) {
            synchronized (this) {
                try {
                    if (this.f5930b == null) {
                        this.f5930b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f5929a.iterator();
                            while (it.hasNext()) {
                                this.f5930b.add(((w8.a) it.next()).get());
                            }
                            this.f5929a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f5930b);
    }
}
