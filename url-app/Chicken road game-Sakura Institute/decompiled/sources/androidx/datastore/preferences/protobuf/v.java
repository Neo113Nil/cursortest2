package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class v extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, v> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected i1 unknownFields;

    public v() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = i1.f843f;
    }

    public static v d(Class cls) {
        v vVar = defaultInstanceMap.get(cls);
        if (vVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = (v) ((v) r1.b(cls)).c(6);
        if (vVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, vVar2);
        return vVar2;
    }

    public static Object e(Method method, v vVar, Object... objArr) {
        try {
            return method.invoke(vVar, objArr);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e9);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(v vVar, boolean z8) {
        byte byteValue = ((Byte) vVar.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        v0 v0Var = v0.f916c;
        v0Var.getClass();
        boolean f9 = v0Var.a(vVar.getClass()).f(vVar);
        if (z8) {
            vVar.c(2);
        }
        return f9;
    }

    public static void j(Class cls, v vVar) {
        vVar.h();
        defaultInstanceMap.put(cls, vVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(y0 y0Var) {
        int h3;
        int h8;
        if (g()) {
            if (y0Var == null) {
                v0 v0Var = v0.f916c;
                v0Var.getClass();
                h8 = v0Var.a(getClass()).h(this);
            } else {
                h8 = y0Var.h(this);
            }
            if (h8 >= 0) {
                return h8;
            }
            throw new IllegalStateException(a0.m.i("serialized size must be non-negative, was ", h8));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i7 & Integer.MAX_VALUE;
        }
        if (y0Var == null) {
            v0 v0Var2 = v0.f916c;
            v0Var2.getClass();
            h3 = v0Var2.a(getClass()).h(this);
        } else {
            h3 = y0Var.h(this);
        }
        k(h3);
        return h3;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(l lVar) {
        v0 v0Var = v0.f916c;
        v0Var.getClass();
        y0 a3 = v0Var.a(getClass());
        h0 h0Var = lVar.f857c;
        if (h0Var == null) {
            h0Var = new h0(lVar);
        }
        a3.c(this, h0Var);
    }

    public abstract Object c(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v0 v0Var = v0.f916c;
        v0Var.getClass();
        return v0Var.a(getClass()).g(this, (v) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            v0 v0Var = v0.f916c;
            v0Var.getClass();
            return v0Var.a(getClass()).d(this);
        }
        if (this.memoizedHashCode == 0) {
            v0 v0Var2 = v0.f916c;
            v0Var2.getClass();
            this.memoizedHashCode = v0Var2.a(getClass()).d(this);
        }
        return this.memoizedHashCode;
    }

    public final v i() {
        return (v) c(4);
    }

    public final void k(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(a0.m.i("serialized size must be non-negative, was ", i7));
        }
        this.memoizedSerializedSize = (i7 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = o0.f869a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        o0.c(this, sb, 0);
        return sb.toString();
    }
}
