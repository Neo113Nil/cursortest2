package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class f8 implements dg, ch, Serializable {
    public final dg f;

    public f8(dg dgVar) {
        this.f = dgVar;
    }

    @Override // defpackage.ch
    public final ch c() {
        dg dgVar = this.f;
        if (dgVar instanceof ch) {
            return (ch) dgVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dg
    public final void e(Object obj) {
        while (true) {
            f8 f8Var = this;
            dg dgVar = f8Var.f;
            dgVar.getClass();
            try {
                obj = f8Var.l(obj);
                if (obj == bh.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new z90(th);
            }
            f8Var.m();
            if (!(dgVar instanceof f8)) {
                dgVar.e(obj);
                return;
            }
            this = dgVar;
        }
    }

    public dg i(dg dgVar, Object obj) {
        dgVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object l(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.StackTraceElement] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    public String toString() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        ai aiVar = (ai) getClass().getAnnotation(ai.class);
        String str2 = null;
        if (aiVar != null) {
            int v = aiVar.v();
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
            int i2 = i >= 0 ? aiVar.l()[i] : -1;
            qc qcVar = d50.d;
            qc qcVar2 = d50.e;
            if (qcVar2 == null) {
                try {
                    qc qcVar3 = new qc(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    d50.e = qcVar3;
                    qcVar2 = qcVar3;
                } catch (Exception unused2) {
                    d50.e = qcVar;
                    qcVar2 = qcVar;
                }
            }
            if (qcVar2 != qcVar && (method = qcVar2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = qcVar2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = qcVar2.c;
                String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
            }
            if (str2 == null) {
                str = aiVar.c();
            } else {
                str = str2 + '/' + aiVar.c();
            }
            str2 = new StackTraceElement(str, aiVar.m(), aiVar.f(), i2);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }

    public void m() {
    }
}
