package q5;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k.f0;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0605a implements InterfaceC0564d, d, Serializable {
    private final InterfaceC0564d completion;

    public AbstractC0605a(InterfaceC0564d interfaceC0564d) {
        this.completion = interfaceC0564d;
    }

    public InterfaceC0564d create(InterfaceC0564d completion) {
        i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // q5.d
    public d getCallerFrame() {
        InterfaceC0564d interfaceC0564d = this.completion;
        if (interfaceC0564d instanceof d) {
            return (d) interfaceC0564d;
        }
        return null;
    }

    public final InterfaceC0564d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i7;
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
            i7 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i7 = -1;
        }
        int i8 = i7 >= 0 ? eVar.l()[i7] : -1;
        f0 f0Var = f.f5814b;
        f0 f0Var2 = f.f5813a;
        if (f0Var == null) {
            try {
                f0 f0Var3 = new f0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f5814b = f0Var3;
                f0Var = f0Var3;
            } catch (Exception unused2) {
                f.f5814b = f0Var2;
                f0Var = f0Var2;
            }
        }
        if (f0Var != f0Var2 && (method = f0Var.f4991a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = f0Var.f4992b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = f0Var.f4993c;
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

    public abstract Object invokeSuspend(Object obj);

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        InterfaceC0564d interfaceC0564d = this;
        while (true) {
            AbstractC0605a abstractC0605a = (AbstractC0605a) interfaceC0564d;
            InterfaceC0564d interfaceC0564d2 = abstractC0605a.completion;
            i.b(interfaceC0564d2);
            try {
                obj = abstractC0605a.invokeSuspend(obj);
                if (obj == EnumC0580a.f5697f) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0676f.f(th);
            }
            abstractC0605a.releaseIntercepted();
            if (!(interfaceC0564d2 instanceof AbstractC0605a)) {
                interfaceC0564d2.resumeWith(obj);
                return;
            }
            interfaceC0564d = interfaceC0564d2;
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

    public InterfaceC0564d create(Object obj, InterfaceC0564d completion) {
        i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
