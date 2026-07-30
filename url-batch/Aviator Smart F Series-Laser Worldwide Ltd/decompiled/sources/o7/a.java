package o7;

/* loaded from: classes5.dex */
public interface a {
    void clear();

    boolean detach(Object obj, Object obj2);

    Object get(Object obj);

    Object getNoLock(Object obj);

    void lock();

    void put(Object obj, Object obj2);

    void putNoLock(Object obj, Object obj2);

    void remove(Iterable<Object> iterable);

    void remove(Object obj);

    void reserveRoom(int i8);

    void unlock();
}
