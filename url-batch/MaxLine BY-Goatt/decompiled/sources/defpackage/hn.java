package defpackage;

import com.google.firebase.messaging.Constants;
import defpackage.aa2;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class hn implements o30, c50, Serializable {
    private final o30 completion;

    public hn(o30 o30Var) {
        this.completion = o30Var;
    }

    public o30 create(o30 o30Var) {
        o30Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.c50
    public c50 getCallerFrame() {
        o30 o30Var = this.completion;
        if (o30Var instanceof c50) {
            return (c50) o30Var;
        }
        return null;
    }

    public final o30 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        n70 n70Var = (n70) getClass().getAnnotation(n70.class);
        String str2 = null;
        if (n70Var == null) {
            return null;
        }
        int v = n70Var.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? n70Var.l()[i] : -1;
        dm1.a.getClass();
        wu wuVar = dm1.c;
        wu wuVar2 = dm1.b;
        if (wuVar == null) {
            try {
                wu wuVar3 = new wu(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                dm1.c = wuVar3;
                wuVar = wuVar3;
            } catch (Exception unused2) {
                dm1.c = wuVar2;
                wuVar = wuVar2;
            }
        }
        if (wuVar != wuVar2 && (method = wuVar.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = wuVar.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = wuVar.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = n70Var.c();
        } else {
            str = str2 + '/' + n70Var.c();
        }
        return new StackTraceElement(str, n70Var.m(), n70Var.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        while (true) {
            hn hnVar = this;
            o30 o30Var = hnVar.completion;
            o30Var.getClass();
            try {
                obj = hnVar.invokeSuspend(obj);
            } catch (Throwable th) {
                aa2.a aVar = aa2.m;
                obj = new ba2(th);
            }
            if (obj == b50.m) {
                return;
            }
            aa2.a aVar2 = aa2.m;
            hnVar.releaseIntercepted();
            if (!(o30Var instanceof hn)) {
                o30Var.resumeWith(obj);
                return;
            }
            this = o30Var;
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

    public o30 create(Object obj, o30 o30Var) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
