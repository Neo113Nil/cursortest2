package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class w extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected e1 unknownFields;

    public w() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = e1.f674f;
    }

    public static w d(Class cls) {
        w wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = (w) ((w) k1.d(cls)).c(6);
        if (wVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, wVar2);
        return wVar2;
    }

    public static Object e(Method method, w wVar, Object... objArr) {
        try {
            return method.invoke(wVar, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(w wVar, boolean z3) {
        byte byteValue = ((Byte) wVar.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        u0 u0Var = u0.f784c;
        u0Var.getClass();
        boolean e8 = u0Var.a(wVar.getClass()).e(wVar);
        if (z3) {
            wVar.c(2);
        }
        return e8;
    }

    public static void j(Class cls, w wVar) {
        wVar.h();
        defaultInstanceMap.put(cls, wVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(x0 x0Var) {
        int h8;
        int h9;
        if (g()) {
            if (x0Var == null) {
                u0 u0Var = u0.f784c;
                u0Var.getClass();
                h9 = u0Var.a(getClass()).h(this);
            } else {
                h9 = x0Var.h(this);
            }
            if (h9 >= 0) {
                return h9;
            }
            throw new IllegalStateException(a0.q.h("serialized size must be non-negative, was ", h9));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (x0Var == null) {
            u0 u0Var2 = u0.f784c;
            u0Var2.getClass();
            h8 = u0Var2.a(getClass()).h(this);
        } else {
            h8 = x0Var.h(this);
        }
        k(h8);
        return h8;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(m mVar) {
        u0 u0Var = u0.f784c;
        u0Var.getClass();
        x0 a8 = u0Var.a(getClass());
        g0 g0Var = mVar.f727k;
        if (g0Var == null) {
            g0Var = new g0(mVar);
        }
        a8.b(this, g0Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u0 u0Var = u0.f784c;
        u0Var.getClass();
        return u0Var.a(getClass()).f(this, (w) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            u0 u0Var = u0.f784c;
            u0Var.getClass();
            return u0Var.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            u0 u0Var2 = u0.f784c;
            u0Var2.getClass();
            this.memoizedHashCode = u0Var2.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final w i() {
        return (w) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            throw new IllegalStateException(a0.q.h("serialized size must be non-negative, was ", i));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = n0.f733a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        n0.c(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }
}
