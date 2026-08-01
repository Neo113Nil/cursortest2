package q1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3563a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3564b;

    /* renamed from: c, reason: collision with root package name */
    public String f3565c;

    public i(ArrayList arrayList) {
        this.f3563a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        X0.d.e(obj, "proxy");
        X0.d.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (X0.d.a(name, "supports") && X0.d.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (X0.d.a(name, "unsupported") && X0.d.a(Void.TYPE, returnType)) {
            this.f3564b = true;
            return null;
        }
        boolean a2 = X0.d.a(name, "protocols");
        ArrayList arrayList = this.f3563a;
        if (a2 && objArr.length == 0) {
            return arrayList;
        }
        if ((X0.d.a(name, "selectProtocol") || X0.d.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                X0.d.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        X0.d.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f3565c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f3565c = str2;
                return str2;
            }
        }
        if ((!X0.d.a(name, "protocolSelected") && !X0.d.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        X0.d.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f3565c = (String) obj4;
        return null;
    }
}
