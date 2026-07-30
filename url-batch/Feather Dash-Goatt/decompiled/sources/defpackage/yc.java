package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class yc implements dn, un, Serializable {
    private final dn d;

    public yc(dn dnVar) {
        this.d = dnVar;
    }

    public un c() {
        dn dnVar = this.d;
        if (dnVar instanceof un) {
            return (un) dnVar;
        }
        return null;
    }

    public dn h(dn dnVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final dn i() {
        return this.d;
    }

    public StackTraceElement j() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        np npVar = (np) getClass().getAnnotation(np.class);
        String str2 = null;
        if (npVar == null) {
            return null;
        }
        int v = npVar.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? npVar.l()[i] : -1;
        fm0.a.getClass();
        i8 i8Var = fm0.c;
        i8 i8Var2 = fm0.b;
        if (i8Var == null) {
            try {
                i8 i8Var3 = new i8(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 13);
                fm0.c = i8Var3;
                i8Var = i8Var3;
            } catch (Exception unused2) {
                fm0.c = i8Var2;
                i8Var = i8Var2;
            }
        }
        if (i8Var != i8Var2 && (method = (Method) i8Var.e) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) i8Var.g) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) i8Var.h;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = npVar.c();
        } else {
            str = str2 + '/' + npVar.c();
        }
        return new StackTraceElement(str, npVar.m(), npVar.f(), i2);
    }

    public abstract Object k(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn
    public final void l(Object obj) {
        while (true) {
            yc ycVar = this;
            dn dnVar = ycVar.d;
            dnVar.getClass();
            try {
                obj = ycVar.k(obj);
            } catch (Throwable th) {
                i31 i31Var = k31.d;
                obj = new j31(th);
            }
            if (obj == tn.d) {
                return;
            }
            i31 i31Var2 = k31.d;
            ycVar.m();
            if (!(dnVar instanceof yc)) {
                dnVar.l(obj);
                return;
            }
            this = dnVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object j = j();
        if (j == null) {
            j = getClass().getName();
        }
        sb.append(j);
        return sb.toString();
    }

    public void m() {
    }
}
