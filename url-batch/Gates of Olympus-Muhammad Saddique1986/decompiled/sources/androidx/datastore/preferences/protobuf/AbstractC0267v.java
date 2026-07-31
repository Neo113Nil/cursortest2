package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0267v extends AbstractC0245a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0267v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j0 unknownFields;

    public AbstractC0267v() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j0.f5091f;
    }

    public static AbstractC0267v f(Class cls) {
        AbstractC0267v abstractC0267v = defaultInstanceMap.get(cls);
        if (abstractC0267v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0267v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0267v == null) {
            abstractC0267v = (AbstractC0267v) ((AbstractC0267v) s0.b(cls)).e(6);
            if (abstractC0267v == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0267v);
        }
        return abstractC0267v;
    }

    public static Object g(Method method, AbstractC0245a abstractC0245a, Object... objArr) {
        try {
            return method.invoke(abstractC0245a, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0267v abstractC0267v, boolean z3) {
        byte byteValue = ((Byte) abstractC0267v.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        W w2 = W.f5029c;
        w2.getClass();
        boolean a3 = w2.a(abstractC0267v.getClass()).a(abstractC0267v);
        if (z3) {
            abstractC0267v.e(2);
        }
        return a3;
    }

    public static void l(Class cls, AbstractC0267v abstractC0267v) {
        abstractC0267v.j();
        defaultInstanceMap.put(cls, abstractC0267v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0245a
    public final int a(Z z3) {
        int f3;
        int f4;
        if (i()) {
            if (z3 == null) {
                W w2 = W.f5029c;
                w2.getClass();
                f4 = w2.a(getClass()).f(this);
            } else {
                f4 = z3.f(this);
            }
            if (f4 >= 0) {
                return f4;
            }
            throw new IllegalStateException(A.k.h("serialized size must be non-negative, was ", f4));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (z3 == null) {
            W w3 = W.f5029c;
            w3.getClass();
            f3 = w3.a(getClass()).f(this);
        } else {
            f3 = z3.f(this);
        }
        m(f3);
        return f3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0245a
    public final void b(C0258l c0258l) {
        W w2 = W.f5029c;
        w2.getClass();
        Z a3 = w2.a(getClass());
        H h3 = c0258l.f5099c;
        if (h3 == null) {
            h3 = new H(c0258l);
        }
        a3.d(this, h3);
    }

    public final void c() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        W w2 = W.f5029c;
        w2.getClass();
        return w2.a(getClass()).i(this, (AbstractC0267v) obj);
    }

    public final int hashCode() {
        if (i()) {
            W w2 = W.f5029c;
            w2.getClass();
            return w2.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            W w3 = W.f5029c;
            w3.getClass();
            this.memoizedHashCode = w3.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0267v k() {
        return (AbstractC0267v) e(4);
    }

    public final void m(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(A.k.h("serialized size must be non-negative, was ", i3));
        }
        this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = O.f5007a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        O.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
