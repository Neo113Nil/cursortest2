package T;

import P0.p;
import P0.r;
import a.AbstractC0086a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final P0.e f835a;

    /* renamed from: b, reason: collision with root package name */
    public final Y.b f836b;

    public c(P0.e eVar, Y.b bVar) {
        this.f835a = eVar;
        this.f836b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String b2;
        P0.h.e(obj, "obj");
        P0.h.e(method, "method");
        boolean a2 = P0.h.a(method.getName(), "accept");
        Y.b bVar = this.f836b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((P0.h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((P0.h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (P0.h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                r3 = true;
            }
            if (r3) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class cls = this.f835a.f798a;
        P0.h.e(cls, "jClass");
        Map map = P0.e.f797b;
        P0.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = r.c(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? AbstractC0086a.s(p.a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            P0.h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.j(obj2);
            return D0.h.f206a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (b2 = r.b(componentType.getName())) != null) {
                    str = b2.concat("Array");
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                str = r.b(cls.getName());
                if (str == null) {
                    str = cls.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new ClassCastException(sb.toString());
    }
}
