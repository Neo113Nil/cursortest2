package X5;

import R5.l;
import R5.n;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a implements V5.b, d, Serializable {
    private final V5.b completion;

    public a(V5.b bVar) {
        this.completion = bVar;
    }

    public V5.b create(V5.b completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // X5.d
    public d getCallerFrame() {
        V5.b bVar = this.completion;
        if (bVar instanceof d) {
            return (d) bVar;
        }
        return null;
    }

    public final V5.b getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Intrinsics.checkNotNullParameter(this, "<this>");
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
            i2 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        int i5 = i2 >= 0 ? eVar.l()[i2] : -1;
        g.f2889a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        f fVar = g.f2891c;
        f fVar2 = g.f2890b;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.f2891c = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f2891c = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.f2886a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.f2887b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = fVar.f2888c;
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
        return new StackTraceElement(str, eVar.m(), eVar.f(), i5);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // V5.b
    public final void resumeWith(Object obj) {
        V5.b frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            V5.b bVar = aVar.completion;
            Intrinsics.b(bVar);
            try {
                obj = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                l lVar = n.f2421d;
                obj = V6.b.n(th);
            }
            if (obj == W5.a.f2787d) {
                return;
            }
            l lVar2 = n.f2421d;
            aVar.releaseIntercepted();
            if (!(bVar instanceof a)) {
                bVar.resumeWith(obj);
                return;
            }
            frame = bVar;
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

    public V5.b create(Object obj, V5.b completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
