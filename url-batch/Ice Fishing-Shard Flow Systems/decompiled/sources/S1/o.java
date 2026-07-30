package S1;

import e2.InterfaceC0372a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class o implements InterfaceC0372a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f2497a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f2498b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // e2.InterfaceC0372a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f2498b == null) {
            synchronized (this) {
                try {
                    if (this.f2498b == null) {
                        this.f2498b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f2497a.iterator();
                            while (it.hasNext()) {
                                this.f2498b.add(((InterfaceC0372a) it.next()).get());
                            }
                            this.f2497a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f2498b);
    }
}
