package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0110w extends AbstractC0089a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0110w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0110w() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f1516f;
    }

    public static AbstractC0110w d(Class cls) {
        AbstractC0110w abstractC0110w = defaultInstanceMap.get(cls);
        if (abstractC0110w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0110w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0110w != null) {
            return abstractC0110w;
        }
        AbstractC0110w abstractC0110w2 = (AbstractC0110w) ((AbstractC0110w) j0.d(cls)).c(6);
        if (abstractC0110w2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0110w2);
        return abstractC0110w2;
    }

    public static Object e(Method method, AbstractC0110w abstractC0110w, Object... objArr) {
        try {
            return method.invoke(abstractC0110w, objArr);
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

    public static final boolean f(AbstractC0110w abstractC0110w, boolean z2) {
        byte byteValue = ((Byte) abstractC0110w.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t = T.f1483c;
        t.getClass();
        boolean e2 = t.a(abstractC0110w.getClass()).e(abstractC0110w);
        if (z2) {
            abstractC0110w.c(2);
        }
        return e2;
    }

    public static void j(Class cls, AbstractC0110w abstractC0110w) {
        abstractC0110w.h();
        defaultInstanceMap.put(cls, abstractC0110w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0089a
    public final int a(W w2) {
        int h2;
        int h3;
        if (g()) {
            if (w2 == null) {
                T t = T.f1483c;
                t.getClass();
                h3 = t.a(getClass()).h(this);
            } else {
                h3 = w2.h(this);
            }
            if (h3 >= 0) {
                return h3;
            }
            throw new IllegalStateException(L.d.e("serialized size must be non-negative, was ", h3));
        }
        int i2 = this.memoizedSerializedSize;
        if ((i2 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2 & Integer.MAX_VALUE;
        }
        if (w2 == null) {
            T t2 = T.f1483c;
            t2.getClass();
            h2 = t2.a(getClass()).h(this);
        } else {
            h2 = w2.h(this);
        }
        k(h2);
        return h2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0089a
    public final void b(C0101m c0101m) {
        T t = T.f1483c;
        t.getClass();
        W a2 = t.a(getClass());
        F f2 = c0101m.f1562e;
        if (f2 == null) {
            f2 = new F(c0101m);
        }
        a2.b(this, f2);
    }

    public abstract Object c(int i2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t = T.f1483c;
        t.getClass();
        return t.a(getClass()).f(this, (AbstractC0110w) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            T t = T.f1483c;
            t.getClass();
            return t.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            T t2 = T.f1483c;
            t2.getClass();
            this.memoizedHashCode = t2.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0110w i() {
        return (AbstractC0110w) c(4);
    }

    public final void k(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(L.d.e("serialized size must be non-negative, was ", i2));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = M.f1462a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        M.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
