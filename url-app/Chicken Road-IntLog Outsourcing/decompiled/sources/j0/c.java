package j0;

import f4.v;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import o0.C1355b;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.d f10445a;

    /* renamed from: b, reason: collision with root package name */
    public final C1355b f10446b;

    public c(kotlin.jvm.internal.d dVar, C1355b c1355b) {
        this.f10445a = dVar;
        this.f10446b = c1355b;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String f3;
        kotlin.jvm.internal.i.e(obj, "obj");
        kotlin.jvm.internal.i.e(method, "method");
        boolean a6 = kotlin.jvm.internal.i.a(method.getName(), "accept");
        C1355b c1355b = this.f10446b;
        if (!a6 || objArr == null || objArr.length != 1) {
            if (kotlin.jvm.internal.i.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (kotlin.jvm.internal.i.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(c1355b.hashCode());
            }
            if (kotlin.jvm.internal.i.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return c1355b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        kotlin.jvm.internal.d dVar = this.f10445a;
        if (dVar.c(obj2)) {
            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c1355b.invoke(obj2);
            return v.f5689a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        Map map = kotlin.jvm.internal.d.f10735b;
        Class jClass = dVar.f10736a;
        kotlin.jvm.internal.i.e(jClass, "jClass");
        String str = null;
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (f3 = kotlin.jvm.internal.i.f(componentType.getName())) != null) {
                    str = f3.concat("Array");
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                str = kotlin.jvm.internal.i.f(jClass.getName());
                if (str == null) {
                    str = jClass.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new ClassCastException(sb.toString());
    }
}
