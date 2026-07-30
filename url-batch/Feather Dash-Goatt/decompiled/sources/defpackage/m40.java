package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class m40 extends d0 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, m40> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected el1 unknownFields;

    public m40() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = el1.f;
    }

    public static m40 d(Class cls) {
        m40 m40Var = defaultInstanceMap.get(cls);
        if (m40Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m40Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (m40Var != null) {
            return m40Var;
        }
        m40 m40Var2 = (m40) ((m40) ol1.d(cls)).c(6);
        if (m40Var2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, m40Var2);
        return m40Var2;
    }

    public static Object e(Method method, m40 m40Var, Object... objArr) {
        try {
            return method.invoke(m40Var, objArr);
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

    public static final boolean f(m40 m40Var, boolean z) {
        byte byteValue = ((Byte) m40Var.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        i01 i01Var = i01.c;
        i01Var.getClass();
        boolean e = i01Var.a(m40Var.getClass()).e(m40Var);
        if (z) {
            m40Var.c(2);
        }
        return e;
    }

    public static void j(Class cls, m40 m40Var) {
        m40Var.h();
        defaultInstanceMap.put(cls, m40Var);
    }

    @Override // defpackage.d0
    public final int a(u61 u61Var) {
        int d;
        int d2;
        if (g()) {
            if (u61Var == null) {
                i01 i01Var = i01.c;
                i01Var.getClass();
                d2 = i01Var.a(getClass()).d(this);
            } else {
                d2 = u61Var.d(this);
            }
            if (d2 >= 0) {
                return d2;
            }
            dd0.j(qy0.i(d2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (u61Var == null) {
            i01 i01Var2 = i01.c;
            i01Var2.getClass();
            d = i01Var2.a(getClass()).d(this);
        } else {
            d = u61Var.d(this);
        }
        k(d);
        return d;
    }

    @Override // defpackage.d0
    public final void b(wh whVar) {
        i01 i01Var = i01.c;
        i01Var.getClass();
        u61 a = i01Var.a(getClass());
        s40 s40Var = whVar.a;
        if (s40Var == null) {
            s40Var = new s40(whVar);
        }
        a.g(this, s40Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i01 i01Var = i01.c;
        i01Var.getClass();
        return i01Var.a(getClass()).f(this, (m40) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            i01 i01Var = i01.c;
            i01Var.getClass();
            return i01Var.a(getClass()).a(this);
        }
        if (this.memoizedHashCode == 0) {
            i01 i01Var2 = i01.c;
            i01Var2.getClass();
            this.memoizedHashCode = i01Var2.a(getClass()).a(this);
        }
        return this.memoizedHashCode;
    }

    public final m40 i() {
        return (m40) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            dd0.j(qy0.i(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = hl0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        hl0.c(this, sb, 0);
        return sb.toString();
    }
}
