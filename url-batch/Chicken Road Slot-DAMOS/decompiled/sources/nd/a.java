package nd;

import a1.n;
import hd.l;
import hd.m;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a implements ld.a, d, Serializable {
    private final ld.a completion;

    public a(ld.a aVar) {
        this.completion = aVar;
    }

    public ld.a create(ld.a aVar) {
        aVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        ld.a aVar = this.completion;
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return null;
    }

    public final ld.a getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i3;
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
            i3 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i3 = -1;
        }
        int i10 = i3 >= 0 ? eVar.l()[i3] : -1;
        f.f7245a.getClass();
        n nVar = f.f7247c;
        n nVar2 = f.f7246b;
        if (nVar == null) {
            try {
                n nVar3 = new n(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 29);
                f.f7247c = nVar3;
                nVar = nVar3;
            } catch (Exception unused2) {
                f.f7247c = nVar2;
                nVar = nVar2;
            }
        }
        if (nVar != nVar2 && (method = (Method) nVar.f41i) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) nVar.f40e) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) nVar.f42r;
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
        return new StackTraceElement(str, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // ld.a
    public final void resumeWith(Object obj) {
        ld.a aVar = this;
        while (true) {
            a aVar2 = (a) aVar;
            ld.a aVar3 = aVar2.completion;
            aVar3.getClass();
            try {
                obj = aVar2.invokeSuspend(obj);
            } catch (Throwable th) {
                l lVar = hd.n.f4511e;
                obj = new m(th);
            }
            if (obj == md.a.f6622d) {
                return;
            }
            l lVar2 = hd.n.f4511e;
            aVar2.releaseIntercepted();
            if (!(aVar3 instanceof a)) {
                aVar3.resumeWith(obj);
                return;
            }
            aVar = aVar3;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public ld.a create(Object obj, ld.a aVar) {
        aVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
