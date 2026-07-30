package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0092w extends AbstractC0071a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0092w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0092w() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f1428f;
    }

    public static AbstractC0092w f(Class cls) {
        AbstractC0092w abstractC0092w = defaultInstanceMap.get(cls);
        if (abstractC0092w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0092w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0092w == null) {
            abstractC0092w = (AbstractC0092w) ((AbstractC0092w) j0.d(cls)).e(6);
            if (abstractC0092w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0092w);
        }
        return abstractC0092w;
    }

    public static Object g(Method method, AbstractC0071a abstractC0071a, Object... objArr) {
        try {
            return method.invoke(abstractC0071a, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0092w abstractC0092w, boolean z2) {
        byte byteValue = ((Byte) abstractC0092w.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t2 = T.f1395c;
        t2.getClass();
        boolean a2 = t2.a(abstractC0092w.getClass()).a(abstractC0092w);
        if (z2) {
            abstractC0092w.e(2);
        }
        return a2;
    }

    public static void l(Class cls, AbstractC0092w abstractC0092w) {
        abstractC0092w.j();
        defaultInstanceMap.put(cls, abstractC0092w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0071a
    public final int a(W w2) {
        int c2;
        int c3;
        if (i()) {
            if (w2 == null) {
                T t2 = T.f1395c;
                t2.getClass();
                c3 = t2.a(getClass()).c(this);
            } else {
                c3 = w2.c(this);
            }
            if (c3 >= 0) {
                return c3;
            }
            throw new IllegalStateException(F0.h.e("serialized size must be non-negative, was ", c3));
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (w2 == null) {
            T t3 = T.f1395c;
            t3.getClass();
            c2 = t3.a(getClass()).c(this);
        } else {
            c2 = w2.c(this);
        }
        m(c2);
        return c2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0071a
    public final void b(C0083m c0083m) {
        T t2 = T.f1395c;
        t2.getClass();
        W a2 = t2.a(getClass());
        F f2 = c0083m.f1473i;
        if (f2 == null) {
            f2 = new F(c0083m);
        }
        a2.f(this, f2);
    }

    public final void c() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t2 = T.f1395c;
        t2.getClass();
        return t2.a(getClass()).h(this, (AbstractC0092w) obj);
    }

    public final int hashCode() {
        if (i()) {
            T t2 = T.f1395c;
            t2.getClass();
            return t2.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            T t3 = T.f1395c;
            t3.getClass();
            this.memoizedHashCode = t3.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0092w k() {
        return (AbstractC0092w) e(4);
    }

    public final void m(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(F0.h.e("serialized size must be non-negative, was ", i2));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = M.f1374a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        M.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
