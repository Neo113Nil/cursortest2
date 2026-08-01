package H1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f556a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f557b;

    /* renamed from: c, reason: collision with root package name */
    public String f558c;

    public i(ArrayList arrayList) {
        this.f556a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        j1.h.e(obj, "proxy");
        j1.h.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (j1.h.a(name, "supports") && j1.h.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (j1.h.a(name, "unsupported") && j1.h.a(Void.TYPE, returnType)) {
            this.f557b = true;
            return null;
        }
        boolean a2 = j1.h.a(name, "protocols");
        ArrayList arrayList = this.f556a;
        if (a2 && objArr.length == 0) {
            return arrayList;
        }
        if ((j1.h.a(name, "selectProtocol") || j1.h.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                j1.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        j1.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f558c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f558c = str2;
                return str2;
            }
        }
        if ((!j1.h.a(name, "protocolSelected") && !j1.h.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        j1.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f558c = (String) obj4;
        return null;
    }
}
