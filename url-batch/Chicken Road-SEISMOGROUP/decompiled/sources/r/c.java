package r;

import a.AbstractC0016a;
import e0.l;
import e0.n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import w.C0096b;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final e0.e f1237a;

    /* renamed from: b, reason: collision with root package name */
    public final C0096b f1238b;

    public c(e0.e eVar, C0096b c0096b) {
        this.f1237a = eVar;
        this.f1238b = c0096b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        e0.h.e(obj, "obj");
        e0.h.e(method, "method");
        boolean a2 = e0.h.a(method.getName(), "accept");
        C0096b c0096b = this.f1238b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((e0.h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((e0.h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(c0096b.hashCode());
            }
            if (e0.h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return c0096b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class cls = this.f1237a.f554a;
        e0.h.e(cls, "jClass");
        Map map = e0.e.f551b;
        e0.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = n.b(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? AbstractC0016a.n(l.a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            e0.h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c0096b.h(obj2);
            return U.g.f433a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = e0.e.f552c;
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
