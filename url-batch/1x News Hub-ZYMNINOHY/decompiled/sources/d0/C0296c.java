package d0;

import b2.C0195i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f4913a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.b f4914b;

    public C0296c(kotlin.jvm.internal.e eVar, i0.b bVar) {
        this.f4913a = eVar;
        this.f4914b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        j.e(obj, "obj");
        j.e(method, "method");
        boolean a3 = j.a(method.getName(), "accept");
        i0.b bVar = this.f4914b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a3 || objArr == null || objArr.length != 1) {
            if ((j.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((j.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (j.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class jClass = this.f4913a.f9686a;
        j.e(jClass, "jClass");
        Map map = kotlin.jvm.internal.e.f9683b;
        j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            isInstance = t.c(num.intValue(), obj2);
        } else {
            isInstance = (jClass.isPrimitive() ? C2.b.o(r.a(jClass)) : jClass).isInstance(obj2);
        }
        if (isInstance) {
            j.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.invoke(obj2);
            return C0195i.f2555a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            HashMap hashMap = kotlin.jvm.internal.e.f9684c;
            if (isArray) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(jClass.getName());
                if (str2 == null) {
                    str2 = jClass.getCanonicalName();
                }
            }
        }
        sb.append(str2);
        throw new ClassCastException(sb.toString());
    }
}
