package V3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t1.h;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final h f3236a;

    public a(h hVar) {
        this.f3236a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z = obj instanceof a;
        h hVar = this.f3236a;
        return z ? hVar.equals(((a) obj).f3236a) : hVar.equals(obj);
    }

    public final int hashCode() {
        return this.f3236a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, h.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f3236a, objArr);
        } catch (InvocationTargetException e4) {
            throw e4.getTargetException();
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Reflection failed for method " + method, e5);
        }
    }
}
