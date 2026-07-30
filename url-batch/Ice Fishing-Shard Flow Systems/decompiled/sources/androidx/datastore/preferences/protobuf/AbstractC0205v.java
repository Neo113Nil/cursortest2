package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0205v extends AbstractC0185a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0205v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC0205v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0.f3485f;
    }

    public static AbstractC0205v d(Class cls) {
        AbstractC0205v abstractC0205v = defaultInstanceMap.get(cls);
        if (abstractC0205v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0205v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0205v != null) {
            return abstractC0205v;
        }
        AbstractC0205v abstractC0205v2 = (AbstractC0205v) ((AbstractC0205v) i0.d(cls)).c(6);
        if (abstractC0205v2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0205v2);
        return abstractC0205v2;
    }

    public static Object e(Method method, AbstractC0205v abstractC0205v, Object... objArr) {
        try {
            return method.invoke(abstractC0205v, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(AbstractC0205v abstractC0205v, boolean z7) {
        byte byteValue = ((Byte) abstractC0205v.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        S s7 = S.f3454c;
        s7.getClass();
        boolean e7 = s7.a(abstractC0205v.getClass()).e(abstractC0205v);
        if (z7) {
            abstractC0205v.c(2);
        }
        return e7;
    }

    public static void j(Class cls, AbstractC0205v abstractC0205v) {
        abstractC0205v.h();
        defaultInstanceMap.put(cls, abstractC0205v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0185a
    public final int a(V v7) {
        int h7;
        int h8;
        if (g()) {
            if (v7 == null) {
                S s7 = S.f3454c;
                s7.getClass();
                h8 = s7.a(getClass()).h(this);
            } else {
                h8 = v7.h(this);
            }
            if (h8 >= 0) {
                return h8;
            }
            throw new IllegalStateException(C4.p.g(h8, "serialized size must be non-negative, was "));
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (v7 == null) {
            S s8 = S.f3454c;
            s8.getClass();
            h7 = s8.a(getClass()).h(this);
        } else {
            h7 = v7.h(this);
        }
        k(h7);
        return h7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0185a
    public final void b(C0196l c0196l) {
        S s7 = S.f3454c;
        s7.getClass();
        V a7 = s7.a(getClass());
        E e7 = c0196l.f3531c;
        if (e7 == null) {
            e7 = new E(c0196l);
        }
        a7.b(this, e7);
    }

    public abstract Object c(int i2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        S s7 = S.f3454c;
        s7.getClass();
        return s7.a(getClass()).f(this, (AbstractC0205v) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            S s7 = S.f3454c;
            s7.getClass();
            return s7.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            S s8 = S.f3454c;
            s8.getClass();
            this.memoizedHashCode = s8.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0205v i() {
        return (AbstractC0205v) c(4);
    }

    public final void k(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(C4.p.g(i2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = L.f3434a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        L.c(this, sb, 0);
        return sb.toString();
    }
}
