package v1;

import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.d f15540a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.b f15541b;

    public c(kotlin.jvm.internal.d dVar, A1.b bVar) {
        this.f15540a = dVar;
        this.f15541b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String b4;
        i.e(obj, "obj");
        i.e(method, "method");
        boolean a3 = i.a(method.getName(), "accept");
        A1.b bVar = this.f15541b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str = null;
        if (!a3 || objArr == null || objArr.length != 1) {
            if ((i.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((i.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (i.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                r3 = true;
            }
            if (r3) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class jClass = this.f15540a.f14153a;
        i.e(jClass, "jClass");
        Map map = kotlin.jvm.internal.d.f14152b;
        i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            isInstance = s.c(num.intValue(), obj2);
        } else {
            isInstance = (jClass.isPrimitive() ? AbstractC0347t0.k(q.a(jClass)) : jClass).isInstance(obj2);
        }
        if (isInstance) {
            i.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.invoke(obj2);
            return C0297i.f5732a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (b4 = s.b(componentType.getName())) != null) {
                    str = b4.concat("Array");
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                str = s.b(jClass.getName());
                if (str == null) {
                    str = jClass.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new ClassCastException(sb.toString());
    }
}
