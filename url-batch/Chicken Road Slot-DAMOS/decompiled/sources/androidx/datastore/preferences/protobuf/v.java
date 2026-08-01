package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class v extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d1 unknownFields;

    public v() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d1.f524f;
    }

    public static v d(Class cls) {
        v vVar = defaultInstanceMap.get(cls);
        if (vVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = (v) ((v) j1.d(cls)).c(6);
        if (vVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, vVar2);
        return vVar2;
    }

    public static Object e(Method method, v vVar, Object... objArr) {
        try {
            return method.invoke(vVar, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
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

    public static final boolean f(v vVar, boolean z10) {
        byte byteValue = ((Byte) vVar.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        t0 t0Var = t0.f636c;
        t0Var.getClass();
        boolean e2 = t0Var.a(vVar.getClass()).e(vVar);
        if (z10) {
            vVar.c(2);
        }
        return e2;
    }

    public static void j(Class cls, v vVar) {
        vVar.h();
        defaultInstanceMap.put(cls, vVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(w0 w0Var) {
        int h10;
        int h11;
        if (g()) {
            if (w0Var == null) {
                t0 t0Var = t0.f636c;
                t0Var.getClass();
                h11 = t0Var.a(getClass()).h(this);
            } else {
                h11 = w0Var.h(this);
            }
            if (h11 >= 0) {
                return h11;
            }
            kotlin.collections.i0.l(v4.a.j(h11, "serialized size must be non-negative, was "));
            return UNINITIALIZED_HASH_CODE;
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (w0Var == null) {
            t0 t0Var2 = t0.f636c;
            t0Var2.getClass();
            h10 = t0Var2.a(getClass()).h(this);
        } else {
            h10 = w0Var.h(this);
        }
        k(h10);
        return h10;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(l lVar) {
        t0 t0Var = t0.f636c;
        t0Var.getClass();
        w0 a9 = t0Var.a(getClass());
        f0 f0Var = lVar.f578a;
        if (f0Var == null) {
            f0Var = new f0(lVar);
        }
        a9.b(this, f0Var);
    }

    public abstract Object c(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t0 t0Var = t0.f636c;
        t0Var.getClass();
        return t0Var.a(getClass()).f(this, (v) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            t0 t0Var = t0.f636c;
            t0Var.getClass();
            return t0Var.a(getClass()).c(this);
        }
        if (this.memoizedHashCode == 0) {
            t0 t0Var2 = t0.f636c;
            t0Var2.getClass();
            this.memoizedHashCode = t0Var2.a(getClass()).c(this);
        }
        return this.memoizedHashCode;
    }

    public final v i() {
        return (v) c(4);
    }

    public final void k(int i3) {
        if (i3 < 0) {
            kotlin.collections.i0.l(v4.a.j(i3, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = m0.f584a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        m0.c(this, sb2, UNINITIALIZED_HASH_CODE);
        return sb2.toString();
    }
}
