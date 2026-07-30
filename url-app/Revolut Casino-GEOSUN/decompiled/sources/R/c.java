package R;

import F0.q;
import F0.s;
import a.AbstractC0069a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import u0.C0247g;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final F0.e f873a;

    /* renamed from: b, reason: collision with root package name */
    public final W.b f874b;

    public c(F0.e eVar, W.b bVar) {
        this.f873a = eVar;
        this.f874b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        F0.i.e(obj, "obj");
        F0.i.e(method, "method");
        boolean a2 = F0.i.a(method.getName(), "accept");
        W.b bVar = this.f874b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((F0.i.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((F0.i.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (F0.i.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class cls = this.f873a.f315a;
        F0.i.e(cls, "jClass");
        Map map = F0.e.f312b;
        F0.i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = s.b(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? AbstractC0069a.p(q.a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            F0.i.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.i(obj2);
            return C0247g.f3005a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = F0.e.f313c;
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
