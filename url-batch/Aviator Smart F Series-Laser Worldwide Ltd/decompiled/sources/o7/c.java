package o7;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public class c implements a {
    private final HashMap<Object, Reference<Object>> map = new HashMap<>();
    private final ReentrantLock lock = new ReentrantLock();

    @Override // o7.a
    public void clear() {
        this.lock.lock();
        try {
            this.map.clear();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // o7.a
    public boolean detach(Object obj, Object obj2) {
        this.lock.lock();
        try {
            if (get(obj) != obj2 || obj2 == null) {
                this.lock.unlock();
                return false;
            }
            remove(obj);
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // o7.a
    public Object get(Object obj) {
        this.lock.lock();
        try {
            Reference<Object> reference = this.map.get(obj);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // o7.a
    public Object getNoLock(Object obj) {
        Reference<Object> reference = this.map.get(obj);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // o7.a
    public void lock() {
        this.lock.lock();
    }

    @Override // o7.a
    public void put(Object obj, Object obj2) {
        this.lock.lock();
        try {
            this.map.put(obj, new WeakReference(obj2));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // o7.a
    public void putNoLock(Object obj, Object obj2) {
        this.map.put(obj, new WeakReference(obj2));
    }

    @Override // o7.a
    public void remove(Object obj) {
        this.lock.lock();
        try {
            this.map.remove(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // o7.a
    public void reserveRoom(int i8) {
    }

    @Override // o7.a
    public void unlock() {
        this.lock.unlock();
    }

    @Override // o7.a
    public void remove(Iterable<Object> iterable) {
        this.lock.lock();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                this.map.remove(it.next());
            }
        } finally {
            this.lock.unlock();
        }
    }
}
