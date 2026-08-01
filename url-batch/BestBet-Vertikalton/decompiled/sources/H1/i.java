package H1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f516a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f517b;

    /* renamed from: c, reason: collision with root package name */
    public String f518c;

    public i(ArrayList arrayList) {
        this.f516a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        k1.e.e(obj, "proxy");
        k1.e.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (k1.e.a(name, "supports") && k1.e.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (k1.e.a(name, "unsupported") && k1.e.a(Void.TYPE, returnType)) {
            this.f517b = true;
            return null;
        }
        boolean a2 = k1.e.a(name, "protocols");
        ArrayList arrayList = this.f516a;
        if (a2 && objArr.length == 0) {
            return arrayList;
        }
        if ((k1.e.a(name, "selectProtocol") || k1.e.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                k1.e.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        k1.e.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f518c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f518c = str2;
                return str2;
            }
        }
        if ((!k1.e.a(name, "protocolSelected") && !k1.e.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        k1.e.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f518c = (String) obj4;
        return null;
    }
}
