package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class gn {
    public abstract void bind(eb0 eb0Var, Object obj);

    public abstract String createQuery();

    public final void insert(cb0 cb0Var, Object[] objArr) {
        cb0Var.getClass();
        if (objArr == null) {
            return;
        }
        eb0 N = cb0Var.N(createQuery());
        int i = 0;
        while (i < objArr.length) {
            try {
                int i2 = i + 1;
                try {
                    Object obj = objArr[i];
                    if (obj != null) {
                        bind(N, obj);
                        N.G();
                        N.reset();
                    }
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            } finally {
            }
        }
        mv.h(N, null);
    }

    public final long insertAndReturnId(cb0 cb0Var, Object obj) {
        cb0Var.getClass();
        if (obj == null) {
            return -1L;
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            bind(N, obj);
            N.G();
            mv.h(N, null);
            return n9.o(cb0Var);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(cb0 cb0Var, Collection<Object> collection) {
        long j;
        cb0Var.getClass();
        if (collection == null) {
            return new long[0];
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                Object i0 = uc.i0(i, collection);
                if (i0 != null) {
                    bind(N, i0);
                    N.G();
                    N.reset();
                    j = n9.o(cb0Var);
                } else {
                    j = -1;
                }
                jArr[i] = j;
            }
            mv.h(N, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(cb0 cb0Var, Collection<Object> collection) {
        long j;
        cb0Var.getClass();
        if (collection == null) {
            return new Long[0];
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                Object i0 = uc.i0(i, collection);
                if (i0 != null) {
                    bind(N, i0);
                    N.G();
                    N.reset();
                    j = n9.o(cb0Var);
                } else {
                    j = -1;
                }
                lArr[i] = Long.valueOf(j);
            }
            mv.h(N, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(cb0 cb0Var, Collection<Object> collection) {
        cb0Var.getClass();
        if (collection == null) {
            return wm.f;
        }
        dy u = bi.u();
        eb0 N = cb0Var.N(createQuery());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    bind(N, obj);
                    N.G();
                    N.reset();
                    u.add(Long.valueOf(n9.o(cb0Var)));
                } else {
                    u.add(-1L);
                }
            }
            mv.h(N, null);
            return bi.i(u);
        } finally {
        }
    }

    public final void insert(cb0 cb0Var, Object obj) {
        cb0Var.getClass();
        if (obj == null) {
            return;
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            bind(N, obj);
            N.G();
            mv.h(N, null);
        } finally {
        }
    }

    public final void insert(cb0 cb0Var, Iterable<Object> iterable) {
        cb0Var.getClass();
        if (iterable == null) {
            return;
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(N, obj);
                    N.G();
                    N.reset();
                }
            }
            mv.h(N, null);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(cb0 cb0Var, Object[] objArr) {
        long j;
        cb0Var.getClass();
        if (objArr == null) {
            return new long[0];
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            int length = objArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    bind(N, obj);
                    N.G();
                    N.reset();
                    j = n9.o(cb0Var);
                } else {
                    j = -1;
                }
                jArr[i] = j;
            }
            mv.h(N, null);
            return jArr;
        } finally {
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(cb0 cb0Var, Object[] objArr) {
        long j;
        cb0Var.getClass();
        if (objArr == null) {
            return new Long[0];
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    bind(N, obj);
                    N.G();
                    N.reset();
                    j = n9.o(cb0Var);
                } else {
                    j = -1;
                }
                lArr[i] = Long.valueOf(j);
            }
            mv.h(N, null);
            return lArr;
        } finally {
        }
    }

    public final List<Long> insertAndReturnIdsList(cb0 cb0Var, Object[] objArr) {
        cb0Var.getClass();
        if (objArr == null) {
            return wm.f;
        }
        dy u = bi.u();
        eb0 N = cb0Var.N(createQuery());
        try {
            for (Object obj : objArr) {
                if (obj != null) {
                    bind(N, obj);
                    N.G();
                    N.reset();
                    u.add(Long.valueOf(n9.o(cb0Var)));
                } else {
                    u.add(-1L);
                }
            }
            mv.h(N, null);
            return bi.i(u);
        } finally {
        }
    }
}
