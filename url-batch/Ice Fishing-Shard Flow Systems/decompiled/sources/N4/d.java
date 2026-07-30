package N4;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class d extends ReferenceQueue implements Runnable, Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f1836d;

    public d(ConcurrentHashMap concurrentHashMap) {
        this.f1836d = concurrentHashMap;
    }

    public Object a(Object obj) {
        obj.getClass();
        e b7 = b(obj);
        try {
            Object obj2 = this.f1836d.get(b7);
            if (obj2 == null) {
                return null;
            }
            return obj2;
        } finally {
            d(b7);
        }
    }

    public abstract e b(Object obj);

    public Object c(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        return this.f1836d.put(new c(obj, this), obj2);
    }

    public abstract void d(Object obj);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this, this.f1836d.entrySet().iterator());
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.f1836d.remove(remove());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final String toString() {
        return this.f1836d.toString();
    }
}
