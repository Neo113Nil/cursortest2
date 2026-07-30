package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class vu0 extends q0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, vu0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d23 unknownFields;

    public vu0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d23.f;
    }

    public static vu0 d(Class cls) {
        vu0 vu0Var = defaultInstanceMap.get(cls);
        if (vu0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vu0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (vu0Var != null) {
            return vu0Var;
        }
        vu0 vu0Var2 = (vu0) ((vu0) v23.d(cls)).c(6);
        if (vu0Var2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, vu0Var2);
        return vu0Var2;
    }

    public static Object e(Method method, vu0 vu0Var, Object... objArr) {
        try {
            return method.invoke(vu0Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(vu0 vu0Var, boolean z) {
        byte byteValue = ((Byte) vu0Var.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        q52 q52Var = q52.c;
        q52Var.getClass();
        boolean f = q52Var.a(vu0Var.getClass()).f(vu0Var);
        if (z) {
            vu0Var.c(2);
        }
        return f;
    }

    public static void j(Class cls, vu0 vu0Var) {
        vu0Var.h();
        defaultInstanceMap.put(cls, vu0Var);
    }

    @Override // defpackage.q0
    public final int a(se2 se2Var) {
        int d;
        int d2;
        if (g()) {
            if (se2Var == null) {
                q52 q52Var = q52.c;
                q52Var.getClass();
                d2 = q52Var.a(getClass()).d(this);
            } else {
                d2 = se2Var.d(this);
            }
            if (d2 >= 0) {
                return d2;
            }
            lh.g(in1.k(d2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (se2Var == null) {
            q52 q52Var2 = q52.c;
            q52Var2.getClass();
            d = q52Var2.a(getClass()).d(this);
        } else {
            d = se2Var.d(this);
        }
        k(d);
        return d;
    }

    @Override // defpackage.q0
    public final void b(kv kvVar) {
        q52 q52Var = q52.c;
        q52Var.getClass();
        se2 a = q52Var.a(getClass());
        ar0 ar0Var = kvVar.a;
        if (ar0Var == null) {
            ar0Var = new ar0(kvVar);
        }
        a.i(this, ar0Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q52 q52Var = q52.c;
        q52Var.getClass();
        return q52Var.a(getClass()).g(this, (vu0) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            q52 q52Var = q52.c;
            q52Var.getClass();
            return q52Var.a(getClass()).a(this);
        }
        if (this.memoizedHashCode == 0) {
            q52 q52Var2 = q52.c;
            q52Var2.getClass();
            this.memoizedHashCode = q52Var2.a(getClass()).a(this);
        }
        return this.memoizedHashCode;
    }

    public final vu0 i() {
        return (vu0) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            lh.g(in1.k(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = gl1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        gl1.c(this, sb, 0);
        return sb.toString();
    }
}
