package androidx.datastore.preferences.protobuf;

import A.AbstractC0017m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0456v extends AbstractC0434a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0456v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j0 unknownFields;

    public AbstractC0456v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j0.f5365f;
    }

    public static AbstractC0456v f(Class cls) {
        AbstractC0456v abstractC0456v = defaultInstanceMap.get(cls);
        if (abstractC0456v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0456v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC0456v == null) {
            abstractC0456v = (AbstractC0456v) ((AbstractC0456v) s0.b(cls)).e(6);
            if (abstractC0456v == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0456v);
        }
        return abstractC0456v;
    }

    public static Object g(Method method, AbstractC0434a abstractC0434a, Object... objArr) {
        try {
            return method.invoke(abstractC0434a, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0456v abstractC0456v, boolean z4) {
        byte byteValue = ((Byte) abstractC0456v.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        W w4 = W.f5303c;
        w4.getClass();
        boolean a4 = w4.a(abstractC0456v.getClass()).a(abstractC0456v);
        if (z4) {
            abstractC0456v.e(2);
        }
        return a4;
    }

    public static void l(Class cls, AbstractC0456v abstractC0456v) {
        abstractC0456v.j();
        defaultInstanceMap.put(cls, abstractC0456v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0434a
    public final int a(Z z4) {
        int f4;
        int f5;
        if (i()) {
            if (z4 == null) {
                W w4 = W.f5303c;
                w4.getClass();
                f5 = w4.a(getClass()).f(this);
            } else {
                f5 = z4.f(this);
            }
            if (f5 >= 0) {
                return f5;
            }
            throw new IllegalStateException(AbstractC0017m.g(f5, "serialized size must be non-negative, was "));
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (z4 == null) {
            W w5 = W.f5303c;
            w5.getClass();
            f4 = w5.a(getClass()).f(this);
        } else {
            f4 = z4.f(this);
        }
        m(f4);
        return f4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0434a
    public final void b(C0447l c0447l) {
        W w4 = W.f5303c;
        w4.getClass();
        Z a4 = w4.a(getClass());
        H h4 = c0447l.f5373c;
        if (h4 == null) {
            h4 = new H(c0447l);
        }
        a4.c(this, h4);
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
        W w4 = W.f5303c;
        w4.getClass();
        return w4.a(getClass()).i(this, (AbstractC0456v) obj);
    }

    public final int hashCode() {
        if (i()) {
            W w4 = W.f5303c;
            w4.getClass();
            return w4.a(getClass()).d(this);
        }
        if (this.memoizedHashCode == 0) {
            W w5 = W.f5303c;
            w5.getClass();
            this.memoizedHashCode = w5.a(getClass()).d(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0456v k() {
        return (AbstractC0456v) e(4);
    }

    public final void m(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(AbstractC0017m.g(i2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = O.f5281a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        O.c(this, sb, 0);
        return sb.toString();
    }
}
