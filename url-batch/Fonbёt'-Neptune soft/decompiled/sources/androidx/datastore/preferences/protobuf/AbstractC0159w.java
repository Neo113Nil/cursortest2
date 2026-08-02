package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0159w extends AbstractC0138a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0159w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0159w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f1676f;
    }

    public static AbstractC0159w f(Class cls) {
        AbstractC0159w abstractC0159w = defaultInstanceMap.get(cls);
        if (abstractC0159w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0159w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0159w == null) {
            abstractC0159w = (AbstractC0159w) ((AbstractC0159w) j0.d(cls)).e(6);
            if (abstractC0159w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0159w);
        }
        return abstractC0159w;
    }

    public static Object g(Method method, AbstractC0138a abstractC0138a, Object... objArr) {
        try {
            return method.invoke(abstractC0138a, objArr);
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

    public static final boolean h(AbstractC0159w abstractC0159w, boolean z2) {
        byte byteValue = ((Byte) abstractC0159w.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t2 = T.f1643c;
        t2.getClass();
        boolean a2 = t2.a(abstractC0159w.getClass()).a(abstractC0159w);
        if (z2) {
            abstractC0159w.e(2);
        }
        return a2;
    }

    public static void l(Class cls, AbstractC0159w abstractC0159w) {
        abstractC0159w.j();
        defaultInstanceMap.put(cls, abstractC0159w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0138a
    public final int a(W w2) {
        int f2;
        int f3;
        if (i()) {
            if (w2 == null) {
                T t2 = T.f1643c;
                t2.getClass();
                f3 = t2.a(getClass()).f(this);
            } else {
                f3 = w2.f(this);
            }
            if (f3 >= 0) {
                return f3;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + f3);
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (w2 == null) {
            T t3 = T.f1643c;
            t3.getClass();
            f2 = t3.a(getClass()).f(this);
        } else {
            f2 = w2.f(this);
        }
        m(f2);
        return f2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0138a
    public final void b(C0150m c0150m) {
        T t2 = T.f1643c;
        t2.getClass();
        W a2 = t2.a(getClass());
        F f2 = c0150m.f1722j;
        if (f2 == null) {
            f2 = new F(c0150m);
        }
        a2.d(this, f2);
    }

    public final void c() {
        this.memoizedHashCode = 0;
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
        T t2 = T.f1643c;
        t2.getClass();
        return t2.a(getClass()).i(this, (AbstractC0159w) obj);
    }

    public final int hashCode() {
        if (i()) {
            T t2 = T.f1643c;
            t2.getClass();
            return t2.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            T t3 = T.f1643c;
            t3.getClass();
            this.memoizedHashCode = t3.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0159w k() {
        return (AbstractC0159w) e(4);
    }

    public final void m(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = M.f1622a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        M.c(this, sb, 0);
        return sb.toString();
    }
}
