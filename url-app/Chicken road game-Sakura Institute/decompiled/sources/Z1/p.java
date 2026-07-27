package Z1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import u2.InterfaceC1229b;

/* loaded from: classes.dex */
public final class p implements InterfaceC1229b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f4593a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f4594b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // u2.InterfaceC1229b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f4594b == null) {
            synchronized (this) {
                try {
                    if (this.f4594b == null) {
                        this.f4594b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f4593a.iterator();
                            while (it.hasNext()) {
                                this.f4594b.add(((InterfaceC1229b) it.next()).get());
                            }
                            this.f4593a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f4594b);
    }
}
