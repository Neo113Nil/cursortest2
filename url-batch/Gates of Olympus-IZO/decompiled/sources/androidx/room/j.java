package androidx.room;

import a.AbstractC0157a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j extends x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar) {
        super(sVar);
        Z1.i.f(sVar, "database");
    }

    public abstract void bind(v1.e eVar, Object obj);

    public final void insert(Object obj) {
        v1.e acquire = acquire();
        try {
            bind(acquire, obj);
            acquire.I();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        v1.e acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.I();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        Z1.i.f(collection, "entities");
        v1.e acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i3 = 0;
            for (Object obj : collection) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    M1.m.f0();
                    throw null;
                }
                bind(acquire, obj);
                jArr[i3] = acquire.I();
                i3 = i4;
            }
            release(acquire);
            return jArr;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> collection) {
        Z1.i.f(collection, "entities");
        v1.e acquire = acquire();
        Iterator<Object> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i3 = 0; i3 < size; i3++) {
                bind(acquire, it.next());
                lArr[i3] = Long.valueOf(acquire.I());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        Z1.i.f(objArr, "entities");
        v1.e acquire = acquire();
        try {
            N1.c cVar = new N1.c(10);
            for (Object obj : objArr) {
                bind(acquire, obj);
                cVar.add(Long.valueOf(acquire.I()));
            }
            N1.c k3 = AbstractC0157a.k(cVar);
            release(acquire);
            return k3;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Object[] objArr) {
        Z1.i.f(objArr, "entities");
        v1.e acquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(acquire, obj);
                acquire.I();
            }
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        Z1.i.f(objArr, "entities");
        v1.e acquire = acquire();
        L1.q h3 = Z1.i.h(objArr);
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i3 = 0; i3 < length; i3++) {
                bind(acquire, h3.next());
                lArr[i3] = Long.valueOf(acquire.I());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        Z1.i.f(objArr, "entities");
        v1.e acquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int length = objArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = i4 + 1;
                bind(acquire, objArr[i3]);
                jArr[i4] = acquire.I();
                i3++;
                i4 = i5;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> collection) {
        Z1.i.f(collection, "entities");
        v1.e acquire = acquire();
        try {
            N1.c cVar = new N1.c(10);
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                cVar.add(Long.valueOf(acquire.I()));
            }
            N1.c k3 = AbstractC0157a.k(cVar);
            release(acquire);
            return k3;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Iterable<Object> iterable) {
        Z1.i.f(iterable, "entities");
        v1.e acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.I();
            }
        } finally {
            release(acquire);
        }
    }
}
