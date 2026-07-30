package t;

import d1.l;
import d1.n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final d1.e f1153a;

    /* renamed from: b, reason: collision with root package name */
    public final y.b f1154b;

    public c(d1.e eVar, y.b bVar) {
        this.f1153a = eVar;
        this.f1154b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        obj.getClass();
        method.getClass();
        boolean a2 = d1.h.a(method.getName(), "accept");
        y.b bVar = this.f1154b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((d1.h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((d1.h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (d1.h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                r3 = true;
            }
            if (r3) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class cls = this.f1153a.f88a;
        cls.getClass();
        Map map = d1.e.f85b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = n.b(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? a.a.k(l.a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            obj2.getClass();
            bVar.h(obj2);
            return t0.g.f1178a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        HashMap hashMap = d1.e.f86c;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            if (cls.isArray()) {
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
