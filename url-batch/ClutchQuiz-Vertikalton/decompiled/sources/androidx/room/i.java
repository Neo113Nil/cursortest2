package androidx.room;

import i0.InterfaceC0146e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class i extends y {
    public abstract void bind(InterfaceC0146e interfaceC0146e, Object obj);

    public final void insert(Object obj) {
        InterfaceC0146e acquire = acquire();
        try {
            bind(acquire, obj);
            acquire.q();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        InterfaceC0146e acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.q();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        g1.f.e(collection, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                bind(acquire, obj);
                jArr[i] = acquire.q();
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
        g1.f.e(collection, "entities");
        InterfaceC0146e acquire = acquire();
        Iterator<Object> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(acquire, it.next());
                lArr[i] = Long.valueOf(acquire.q());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        g1.f.e(objArr, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            W0.c cVar = new W0.c(10);
            for (Object obj : objArr) {
                bind(acquire, obj);
                cVar.add(Long.valueOf(acquire.q()));
            }
            W0.c h = T.d.h(cVar);
            release(acquire);
            return h;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Object[] objArr) {
        g1.f.e(objArr, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(acquire, obj);
                acquire.q();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        g1.f.e(objArr, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bind(acquire, objArr[i]);
                jArr[i2] = acquire.q();
                i++;
                i2 = i3;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        g1.f.e(objArr, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                try {
                    bind(acquire, objArr[i2]);
                    lArr[i] = Long.valueOf(acquire.q());
                    i++;
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new NoSuchElementException(e2.getMessage());
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
        g1.f.e(collection, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            W0.c cVar = new W0.c(10);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                cVar.add(Long.valueOf(acquire.q()));
            }
            W0.c h = T.d.h(cVar);
            release(acquire);
            return h;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Iterable<Object> iterable) {
        g1.f.e(iterable, "entities");
        InterfaceC0146e acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.q();
            }
        } finally {
            release(acquire);
        }
    }
}
