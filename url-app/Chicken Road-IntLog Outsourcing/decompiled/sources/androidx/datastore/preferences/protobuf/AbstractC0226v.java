package androidx.datastore.preferences.protobuf;

import b2.AbstractC0279e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0226v extends AbstractC0206a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0226v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC0226v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c0.f4422f;
    }

    public static AbstractC0226v f(Class cls) {
        AbstractC0226v abstractC0226v = defaultInstanceMap.get(cls);
        if (abstractC0226v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0226v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0226v == null) {
            abstractC0226v = (AbstractC0226v) ((AbstractC0226v) i0.d(cls)).e(6);
            if (abstractC0226v == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0226v);
        }
        return abstractC0226v;
    }

    public static Object g(Method method, AbstractC0206a abstractC0206a, Object... objArr) {
        try {
            return method.invoke(abstractC0206a, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0226v abstractC0226v, boolean z) {
        byte byteValue = ((Byte) abstractC0226v.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        S s2 = S.f4392c;
        s2.getClass();
        boolean f3 = s2.a(abstractC0226v.getClass()).f(abstractC0226v);
        if (z) {
            abstractC0226v.e(2);
        }
        return f3;
    }

    public static void l(Class cls, AbstractC0226v abstractC0226v) {
        abstractC0226v.j();
        defaultInstanceMap.put(cls, abstractC0226v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0206a
    public final int a(V v4) {
        int h3;
        int h6;
        if (i()) {
            if (v4 == null) {
                S s2 = S.f4392c;
                s2.getClass();
                h6 = s2.a(getClass()).h(this);
            } else {
                h6 = v4.h(this);
            }
            if (h6 >= 0) {
                return h6;
            }
            throw new IllegalStateException(AbstractC0279e.d(h6, "serialized size must be non-negative, was "));
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (v4 == null) {
            S s4 = S.f4392c;
            s4.getClass();
            h3 = s4.a(getClass()).h(this);
        } else {
            h3 = v4.h(this);
        }
        m(h3);
        return h3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0206a
    public final void b(C0217l c0217l) {
        S s2 = S.f4392c;
        s2.getClass();
        V a6 = s2.a(getClass());
        E e3 = c0217l.f4469c;
        if (e3 == null) {
            e3 = new E(c0217l);
        }
        a6.b(this, e3);
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
        S s2 = S.f4392c;
        s2.getClass();
        return s2.a(getClass()).e(this, (AbstractC0226v) obj);
    }

    public final int hashCode() {
        if (i()) {
            S s2 = S.f4392c;
            s2.getClass();
            return s2.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            S s4 = S.f4392c;
            s4.getClass();
            this.memoizedHashCode = s4.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0226v k() {
        return (AbstractC0226v) e(4);
    }

    public final void m(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(AbstractC0279e.d(i2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = L.f4371a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        L.c(this, sb, 0);
        return sb.toString();
    }
}
