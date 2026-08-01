package z1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4354a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4355b;

    /* renamed from: c, reason: collision with root package name */
    public String f4356c;

    public i(ArrayList arrayList) {
        this.f4354a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        g1.d.e(obj, "proxy");
        g1.d.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (g1.d.a(name, "supports") && g1.d.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (g1.d.a(name, "unsupported") && g1.d.a(Void.TYPE, returnType)) {
            this.f4355b = true;
            return null;
        }
        boolean a2 = g1.d.a(name, "protocols");
        ArrayList arrayList = this.f4354a;
        if (a2 && objArr.length == 0) {
            return arrayList;
        }
        if ((g1.d.a(name, "selectProtocol") || g1.d.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                g1.d.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        g1.d.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f4356c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f4356c = str2;
                return str2;
            }
        }
        if ((!g1.d.a(name, "protocolSelected") && !g1.d.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        g1.d.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f4356c = (String) obj4;
        return null;
    }
}
