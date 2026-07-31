package i6;

import a0.g1;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a implements g6.c, d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final g6.c f3458d;

    public a(g6.c cVar) {
        this.f3458d = cVar;
    }

    public d e() {
        g6.c cVar = this.f3458d;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Override // g6.c
    public final void k(Object obj) {
        g6.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            g6.c cVar2 = aVar.f3458d;
            q6.i.b(cVar2);
            try {
                obj = aVar.p(obj);
                if (obj == h6.a.f3204d) {
                    return;
                }
            } catch (Throwable th) {
                obj = s6.a.l(th);
            }
            aVar.q();
            if (!(cVar2 instanceof a)) {
                cVar2.k(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public g6.c l(g6.c cVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement n() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
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
        int i8 = i >= 0 ? eVar.l()[i] : -1;
        g1 g1Var = f.f3463b;
        g1 g1Var2 = f.f3462a;
        if (g1Var == null) {
            try {
                g1 g1Var3 = new g1(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 3);
                f.f3463b = g1Var3;
                g1Var = g1Var3;
            } catch (Exception unused2) {
                f.f3463b = g1Var2;
                g1Var = g1Var2;
            }
        }
        if (g1Var != g1Var2 && (method = (Method) g1Var.f84b) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) g1Var.f85c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) g1Var.f86d;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i8);
    }

    public abstract Object p(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object n6 = n();
        if (n6 == null) {
            n6 = getClass().getName();
        }
        sb.append(n6);
        return sb.toString();
    }

    public void q() {
    }
}
