package c0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import k5.v;
import kotlin.jvm.internal.i;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.d f3755a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.b f3756b;

    public C0270c(kotlin.jvm.internal.d dVar, h0.b bVar) {
        this.f3755a = dVar;
        this.f3756b = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String f7;
        i.e(obj, "obj");
        i.e(method, "method");
        boolean a7 = i.a(method.getName(), "accept");
        h0.b bVar = this.f3756b;
        if (!a7 || objArr == null || objArr.length != 1) {
            if (i.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (i.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (i.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        kotlin.jvm.internal.d dVar = this.f3755a;
        if (dVar.c(obj2)) {
            i.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.invoke(obj2);
            return v.f5219a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        Map map = kotlin.jvm.internal.d.f5227g;
        Class jClass = dVar.f5228f;
        i.e(jClass, "jClass");
        String str = null;
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (f7 = i.f(componentType.getName())) != null) {
                    str = f7.concat("Array");
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                str = i.f(jClass.getName());
                if (str == null) {
                    str = jClass.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new ClassCastException(sb.toString());
    }
}
