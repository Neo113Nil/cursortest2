package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class i extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar) {
        super(uVar);
        r6.k.f(uVar, "database");
    }

    public abstract void bind(y3.e eVar, Object obj);

    public final void insert(Object obj) {
        y3.e acquire = acquire();
        try {
            bind(acquire, obj);
            acquire.L();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        y3.e acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.L();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        r6.k.f(collection, "entities");
        y3.e acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i7 = 0;
            for (Object obj : collection) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    e6.m.Z();
                    throw null;
                }
                bind(acquire, obj);
                jArr[i7] = acquire.L();
                i7 = i8;
            }
            release(acquire);
            return jArr;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> collection) {
        r6.k.f(collection, "entities");
        y3.e acquire = acquire();
        Iterator<Object> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i7 = 0; i7 < size; i7++) {
                bind(acquire, it.next());
                lArr[i7] = Long.valueOf(acquire.L());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        r6.k.f(objArr, "entities");
        y3.e acquire = acquire();
        try {
            f6.c cVar = new f6.c(10);
            for (Object obj : objArr) {
                bind(acquire, obj);
                cVar.add(Long.valueOf(acquire.L()));
            }
            f6.c s5 = t6.a.s(cVar);
            release(acquire);
            return s5;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Object[] objArr) {
        r6.k.f(objArr, "entities");
        y3.e acquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(acquire, obj);
                acquire.L();
            }
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        r6.k.f(objArr, "entities");
        y3.e acquire = acquire();
        d6.q h3 = r6.k.h(objArr);
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i7 = 0; i7 < length; i7++) {
                bind(acquire, h3.next());
                lArr[i7] = Long.valueOf(acquire.L());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        r6.k.f(objArr, "entities");
        y3.e acquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int length = objArr.length;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                int i9 = i8 + 1;
                bind(acquire, objArr[i7]);
                jArr[i8] = acquire.L();
                i7++;
                i8 = i9;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> collection) {
        r6.k.f(collection, "entities");
        y3.e acquire = acquire();
        try {
            f6.c cVar = new f6.c(10);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                cVar.add(Long.valueOf(acquire.L()));
            }
            f6.c s5 = t6.a.s(cVar);
            release(acquire);
            return s5;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Iterable<Object> iterable) {
        r6.k.f(iterable, "entities");
        y3.e acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.L();
            }
        } finally {
            release(acquire);
        }
    }
}
