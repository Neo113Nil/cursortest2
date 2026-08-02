package androidx.datastore.preferences.protobuf;

import E.AbstractC0005f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0189w extends AbstractC0168a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0189w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0189w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f4626f;
    }

    public static AbstractC0189w d(Class cls) {
        AbstractC0189w abstractC0189w = defaultInstanceMap.get(cls);
        if (abstractC0189w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0189w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC0189w != null) {
            return abstractC0189w;
        }
        AbstractC0189w abstractC0189w2 = (AbstractC0189w) ((AbstractC0189w) j0.d(cls)).c(6);
        if (abstractC0189w2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0189w2);
        return abstractC0189w2;
    }

    public static Object e(Method method, AbstractC0189w abstractC0189w, Object... objArr) {
        try {
            return method.invoke(abstractC0189w, objArr);
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

    public static final boolean f(AbstractC0189w abstractC0189w, boolean z) {
        byte byteValue = ((Byte) abstractC0189w.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t4 = T.f4591c;
        t4.getClass();
        boolean d4 = t4.a(abstractC0189w.getClass()).d(abstractC0189w);
        if (z) {
            abstractC0189w.c(2);
        }
        return d4;
    }

    public static void j(Class cls, AbstractC0189w abstractC0189w) {
        abstractC0189w.h();
        defaultInstanceMap.put(cls, abstractC0189w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0168a
    public final int a(W w4) {
        int e4;
        int e5;
        if (g()) {
            if (w4 == null) {
                T t4 = T.f4591c;
                t4.getClass();
                e5 = t4.a(getClass()).e(this);
            } else {
                e5 = w4.e(this);
            }
            if (e5 >= 0) {
                return e5;
            }
            throw new IllegalStateException(AbstractC0005f.j(e5, "serialized size must be non-negative, was "));
        }
        int i4 = this.memoizedSerializedSize;
        if ((i4 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i4 & Integer.MAX_VALUE;
        }
        if (w4 == null) {
            T t5 = T.f4591c;
            t5.getClass();
            e4 = t5.a(getClass()).e(this);
        } else {
            e4 = w4.e(this);
        }
        k(e4);
        return e4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0168a
    public final void b(C0180m c0180m) {
        T t4 = T.f4591c;
        t4.getClass();
        W a3 = t4.a(getClass());
        F f4 = c0180m.f4672a;
        if (f4 == null) {
            f4 = new F(c0180m);
        }
        a3.b(this, f4);
    }

    public abstract Object c(int i4);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t4 = T.f4591c;
        t4.getClass();
        return t4.a(getClass()).g(this, (AbstractC0189w) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            T t4 = T.f4591c;
            t4.getClass();
            return t4.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            T t5 = T.f4591c;
            t5.getClass();
            this.memoizedHashCode = t5.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC0189w i() {
        return (AbstractC0189w) c(4);
    }

    public final void k(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException(AbstractC0005f.j(i4, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i4 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = M.f4572a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        M.c(this, sb, 0);
        return sb.toString();
    }
}
