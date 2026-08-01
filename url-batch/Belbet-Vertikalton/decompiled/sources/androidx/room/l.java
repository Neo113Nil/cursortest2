package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k0.InterfaceC0203e;

/* loaded from: classes.dex */
public abstract class l extends B {
    public abstract void bind(InterfaceC0203e interfaceC0203e, Object obj);

    public final void insert(Object obj) {
        InterfaceC0203e acquire = acquire();
        try {
            bind(acquire, obj);
            acquire.s();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        InterfaceC0203e acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.s();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        j1.h.e(collection, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    X0.l.l0();
                    throw null;
                }
                bind(acquire, obj);
                jArr[i] = acquire.s();
                i = i2;
            }
            release(acquire);
            return jArr;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> collection) {
        j1.h.e(collection, "entities");
        InterfaceC0203e acquire = acquire();
        Iterator<Object> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(acquire, it.next());
                lArr[i] = Long.valueOf(acquire.s());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        j1.h.e(objArr, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            Y0.c cVar = new Y0.c(10);
            for (Object obj : objArr) {
                bind(acquire, obj);
                cVar.add(Long.valueOf(acquire.s()));
            }
            Y0.c f2 = H1.l.f(cVar);
            release(acquire);
            return f2;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Object[] objArr) {
        j1.h.e(objArr, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(acquire, obj);
                acquire.s();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        j1.h.e(objArr, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bind(acquire, objArr[i]);
                jArr[i2] = acquire.s();
                i++;
                i2 = i3;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        j1.h.e(objArr, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                try {
                    bind(acquire, objArr[i2]);
                    lArr[i] = Long.valueOf(acquire.s());
                    i++;
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
            release(acquire);
            return lArr;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> collection) {
        j1.h.e(collection, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            Y0.c cVar = new Y0.c(10);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                cVar.add(Long.valueOf(acquire.s()));
            }
            Y0.c f2 = H1.l.f(cVar);
            release(acquire);
            return f2;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Iterable<Object> iterable) {
        j1.h.e(iterable, "entities");
        InterfaceC0203e acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.s();
            }
        } finally {
            release(acquire);
        }
    }
}
