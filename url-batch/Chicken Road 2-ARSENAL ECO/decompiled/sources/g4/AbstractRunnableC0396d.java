package g4;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0396d extends ReferenceQueue implements Runnable, Iterable {

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f4281f;

    public AbstractRunnableC0396d(ConcurrentHashMap concurrentHashMap) {
        this.f4281f = concurrentHashMap;
    }

    public Object a(Object obj) {
        obj.getClass();
        C0397e b7 = b(obj);
        try {
            Object obj2 = this.f4281f.get(b7);
            if (obj2 == null) {
                return null;
            }
            return obj2;
        } finally {
            d(b7);
        }
    }

    public abstract C0397e b(Object obj);

    public Object c(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        return this.f4281f.put(new C0395c(obj, this), obj2);
    }

    public abstract void d(Object obj);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0393a(this, this.f4281f.entrySet().iterator());
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.f4281f.remove(remove());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final String toString() {
        return this.f4281f.toString();
    }
}
