package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class fn {
    public abstract void bind(eb0 eb0Var, Object obj);

    public abstract String createQuery();

    public final int handle(cb0 cb0Var, Object obj) {
        cb0Var.getClass();
        if (obj == null) {
            return 0;
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            bind(N, obj);
            N.G();
            mv.h(N, null);
            return n9.u(cb0Var);
        } finally {
        }
    }

    public final int handleMultiple(cb0 cb0Var, Object[] objArr) {
        cb0Var.getClass();
        int i = 0;
        if (objArr == null) {
            return 0;
        }
        eb0 N = cb0Var.N(createQuery());
        int i2 = 0;
        while (i2 < objArr.length) {
            try {
                int i3 = i2 + 1;
                try {
                    Object obj = objArr[i2];
                    if (obj != null) {
                        bind(N, obj);
                        N.G();
                        N.reset();
                        i += n9.u(cb0Var);
                    }
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            } finally {
            }
        }
        mv.h(N, null);
        return i;
    }

    public final int handleMultiple(cb0 cb0Var, Iterable<Object> iterable) {
        cb0Var.getClass();
        int i = 0;
        if (iterable == null) {
            return 0;
        }
        eb0 N = cb0Var.N(createQuery());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    bind(N, obj);
                    N.G();
                    N.reset();
                    i += n9.u(cb0Var);
                }
            }
            mv.h(N, null);
            return i;
        } finally {
        }
    }
}
