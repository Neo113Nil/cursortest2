package o7;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public class b implements a {
    private final org.greenrobot.greendao.internal.c map = new org.greenrobot.greendao.internal.c();
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

    public Object get2(long j8) {
        this.lock.lock();
        try {
            Reference reference = (Reference) this.map.get(j8);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.lock.unlock();
        }
    }

    public Object get2NoLock(long j8) {
        Reference reference = (Reference) this.map.get(j8);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // o7.a
    public void lock() {
        this.lock.lock();
    }

    public void put2(long j8, Object obj) {
        this.lock.lock();
        try {
            this.map.put(j8, new WeakReference(obj));
        } finally {
            this.lock.unlock();
        }
    }

    public void put2NoLock(long j8, Object obj) {
        this.map.put(j8, new WeakReference(obj));
    }

    @Override // o7.a
    public void reserveRoom(int i8) {
        this.map.reserveRoom(i8);
    }

    @Override // o7.a
    public void unlock() {
        this.lock.unlock();
    }

    @Override // o7.a
    public boolean detach(Long l8, Object obj) {
        this.lock.lock();
        try {
            if (get(l8) != obj || obj == null) {
                this.lock.unlock();
                return false;
            }
            remove(l8);
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // o7.a
    public Object get(Long l8) {
        return get2(l8.longValue());
    }

    @Override // o7.a
    public Object getNoLock(Long l8) {
        return get2NoLock(l8.longValue());
    }

    @Override // o7.a
    public void put(Long l8, Object obj) {
        put2(l8.longValue(), obj);
    }

    @Override // o7.a
    public void putNoLock(Long l8, Object obj) {
        put2NoLock(l8.longValue(), obj);
    }

    @Override // o7.a
    public void remove(Long l8) {
        this.lock.lock();
        try {
            this.map.remove(l8.longValue());
        } finally {
            this.lock.unlock();
        }
    }

    @Override // o7.a
    public void remove(Iterable<Long> iterable) {
        this.lock.lock();
        try {
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                this.map.remove(it.next().longValue());
            }
        } finally {
            this.lock.unlock();
        }
    }
}
