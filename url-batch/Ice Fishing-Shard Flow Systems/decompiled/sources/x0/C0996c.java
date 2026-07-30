package x0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.C0642g;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C0643h f8296a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.b f8297b;

    public C0996c(C0643h clazz, C0.b consumer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f8296a = clazz;
        this.f8297b = consumer;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(method, "method");
        boolean a7 = Intrinsics.a(method.getName(), "accept");
        C0.b bVar = this.f8297b;
        if (!a7 || objArr == null || objArr.length != 1) {
            if (Intrinsics.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (Intrinsics.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (Intrinsics.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object parameter = objArr[0];
        C0643h c0643h = this.f8296a;
        Intrinsics.checkNotNullParameter(c0643h, "<this>");
        if (c0643h.c(parameter)) {
            Intrinsics.c(parameter, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            bVar.invoke(parameter);
            return Unit.f6114a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        C0642g c0642g = C0643h.f6160e;
        Class jClass = c0643h.f6162d;
        c0642g.getClass();
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str = null;
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive()) {
                    String name = componentType.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String a8 = C0642g.a(name);
                    if (a8 != null) {
                        str = a8.concat("Array");
                    }
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                String name2 = jClass.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                str = C0642g.a(name2);
                if (str == null) {
                    str = jClass.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new ClassCastException(sb.toString());
    }
}
