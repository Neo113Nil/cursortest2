package c1;

import I1.i;
import b1.EnumC0098a;
import j1.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0104a implements a1.d, InterfaceC0107d, Serializable {
    private final a1.d completion;

    public AbstractC0104a(a1.d dVar) {
        this.completion = dVar;
    }

    public a1.d create(a1.d dVar) {
        h.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // c1.InterfaceC0107d
    public InterfaceC0107d getCallerFrame() {
        a1.d dVar = this.completion;
        if (dVar instanceof InterfaceC0107d) {
            return (InterfaceC0107d) dVar;
        }
        return null;
    }

    public final a1.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        InterfaceC0108e interfaceC0108e = (InterfaceC0108e) getClass().getAnnotation(InterfaceC0108e.class);
        String str2 = null;
        if (interfaceC0108e == null) {
            return null;
        }
        int v2 = interfaceC0108e.v();
        if (v2 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
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
        int i2 = i >= 0 ? interfaceC0108e.l()[i] : -1;
        i iVar = AbstractC0109f.f2231b;
        i iVar2 = AbstractC0109f.f2230a;
        if (iVar == null) {
            try {
                i iVar3 = new i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC0109f.f2231b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                AbstractC0109f.f2231b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2) {
            Method method = iVar.f614a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = iVar.f615b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = iVar.f616c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = interfaceC0108e.c();
        } else {
            str = str2 + '/' + interfaceC0108e.c();
        }
        return new StackTraceElement(str, interfaceC0108e.m(), interfaceC0108e.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    public abstract void releaseIntercepted();

    @Override // a1.d
    public final void resumeWith(Object obj) {
        a1.d dVar = this;
        while (true) {
            AbstractC0104a abstractC0104a = (AbstractC0104a) dVar;
            a1.d dVar2 = abstractC0104a.completion;
            h.b(dVar2);
            try {
                obj = abstractC0104a.invokeSuspend(obj);
                if (obj == EnumC0098a.f2223a) {
                    return;
                }
            } catch (Throwable th) {
                obj = H1.d.r(th);
            }
            abstractC0104a.releaseIntercepted();
            if (!(dVar2 instanceof AbstractC0104a)) {
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

    public a1.d create(Object obj, a1.d dVar) {
        h.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
