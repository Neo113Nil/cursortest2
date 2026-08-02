package X;

import Q0.p;
import Q0.r;
import c0.C0167b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Q0.e f1125a;

    /* renamed from: b, reason: collision with root package name */
    public final C0167b f1126b;

    public c(Q0.e eVar, C0167b c0167b) {
        this.f1125a = eVar;
        this.f1126b = c0167b;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        Q0.h.e(obj, "obj");
        Q0.h.e(method, "method");
        boolean a2 = Q0.h.a(method.getName(), "accept");
        C0167b c0167b = this.f1126b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if (Q0.h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (Q0.h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(c0167b.hashCode());
            }
            if (Q0.h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return c0167b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class cls = this.f1125a.f974a;
        Q0.h.e(cls, "jClass");
        Map map = Q0.e.f971b;
        Q0.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = r.b(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? i1.a.q(p.a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            Q0.h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c0167b.i(obj2);
            return F0.h.f469a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = Q0.e.f972c;
            if (isArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls.getName());
                if (str2 == null) {
                    str2 = cls.getCanonicalName();
                }
            }
        }
        sb.append(str2);
        throw new ClassCastException(sb.toString());
    }
}
