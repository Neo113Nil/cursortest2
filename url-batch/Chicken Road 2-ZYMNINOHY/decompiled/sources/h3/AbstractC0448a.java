package h3;

import O3.l;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0448a implements InterfaceC0425c, d, Serializable {
    private final InterfaceC0425c completion;

    public AbstractC0448a(InterfaceC0425c interfaceC0425c) {
        this.completion = interfaceC0425c;
    }

    public InterfaceC0425c create(InterfaceC0425c completion) {
        i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        InterfaceC0425c interfaceC0425c = this.completion;
        if (interfaceC0425c instanceof d) {
            return (d) interfaceC0425c;
        }
        return null;
    }

    public final InterfaceC0425c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i4;
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
            i4 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i4 = -1;
        }
        int i5 = i4 >= 0 ? eVar.l()[i4] : -1;
        P3.i iVar = f.f9242b;
        P3.i iVar2 = f.f9241a;
        if (iVar == null) {
            try {
                P3.i iVar3 = new P3.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f9242b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f9242b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.f2105a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f2106b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = iVar.f2107c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + IOUtils.DIR_SEPARATOR_UNIX + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i5);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // f3.InterfaceC0425c
    public final void resumeWith(Object obj) {
        InterfaceC0425c interfaceC0425c = this;
        while (true) {
            AbstractC0448a abstractC0448a = (AbstractC0448a) interfaceC0425c;
            InterfaceC0425c interfaceC0425c2 = abstractC0448a.completion;
            i.b(interfaceC0425c2);
            try {
                obj = abstractC0448a.invokeSuspend(obj);
                if (obj == EnumC0441a.f9038a) {
                    return;
                }
            } catch (Throwable th) {
                obj = l.h(th);
            }
            abstractC0448a.releaseIntercepted();
            if (!(interfaceC0425c2 instanceof AbstractC0448a)) {
                interfaceC0425c2.resumeWith(obj);
                return;
            }
            interfaceC0425c = interfaceC0425c2;
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

    public InterfaceC0425c create(Object obj, InterfaceC0425c completion) {
        i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
