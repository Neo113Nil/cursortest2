package j6;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a implements h6.d, d, Serializable {
    private final h6.d completion;

    public a(h6.d dVar) {
        this.completion = dVar;
    }

    public h6.d create(h6.d dVar) {
        k.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        h6.d dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final h6.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i7;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v5 = eVar.v();
        if (v5 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v5 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i7 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i7 = -1;
        }
        int i8 = i7 >= 0 ? eVar.l()[i7] : -1;
        b8.i iVar = f.f5122b;
        b8.i iVar2 = f.f5121a;
        if (iVar == null) {
            try {
                b8.i iVar3 = new b8.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f5122b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f5122b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2) {
            Method method = iVar.f1413a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = iVar.f1414b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = iVar.f1415c;
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
        return new StackTraceElement(str, eVar.m(), eVar.f(), i8);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // h6.d
    public final void resumeWith(Object obj) {
        h6.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            h6.d dVar2 = aVar.completion;
            k.c(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == i6.a.f4956f) {
                    return;
                }
            } catch (Throwable th) {
                obj = d6.a.b(th);
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

    public h6.d create(Object obj, h6.d dVar) {
        k.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
