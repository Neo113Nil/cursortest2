package R1;

import I2.l;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a implements P1.d, d, Serializable {
    private final P1.d completion;

    public a(P1.d dVar) {
        this.completion = dVar;
    }

    public P1.d create(P1.d dVar) {
        Z1.i.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // R1.d
    public d getCallerFrame() {
        P1.d dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final P1.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i3;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v3 = eVar.v();
        if (v3 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i3 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i3 = -1;
        }
        int i4 = i3 >= 0 ? eVar.l()[i3] : -1;
        J2.i iVar = f.f3170b;
        J2.i iVar2 = f.f3169a;
        if (iVar == null) {
            try {
                J2.i iVar3 = new J2.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f3170b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f3170b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2) {
            Method method = iVar.f2628a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = iVar.f2629b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = iVar.f2630c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i4);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // P1.d
    public final void resumeWith(Object obj) {
        P1.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            P1.d dVar2 = aVar.completion;
            Z1.i.c(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == Q1.a.f3113d) {
                    return;
                }
            } catch (Throwable th) {
                obj = l.t(th);
            }
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public P1.d create(Object obj, P1.d dVar) {
        Z1.i.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
