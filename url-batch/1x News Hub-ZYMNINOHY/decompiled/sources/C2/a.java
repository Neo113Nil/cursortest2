package C2;

import b0.C0178i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C0178i f222a;

    public a(C0178i c0178i) {
        this.f222a = c0178i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z = obj instanceof a;
        C0178i c0178i = this.f222a;
        return z ? c0178i.equals(((a) obj).f222a) : c0178i.equals(obj);
    }

    public final int hashCode() {
        return this.f222a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, C0178i.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f222a, objArr);
        } catch (InvocationTargetException e3) {
            throw e3.getTargetException();
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Reflection failed for method " + method, e4);
        }
    }
}
