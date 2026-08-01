package k3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2832a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2833b;
    public String c;

    public i(ArrayList arrayList) {
        this.f2832a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        u2.c.e(obj, "proxy");
        u2.c.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (u2.c.a(name, "supports") && u2.c.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (u2.c.a(name, "unsupported") && u2.c.a(Void.TYPE, returnType)) {
            this.f2833b = true;
            return null;
        }
        boolean a4 = u2.c.a(name, "protocols");
        ArrayList arrayList = this.f2832a;
        if (a4 && objArr.length == 0) {
            return arrayList;
        }
        if ((u2.c.a(name, "selectProtocol") || u2.c.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i4 = 0;
                    while (true) {
                        Object obj3 = list.get(i4);
                        u2.c.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i4 == size) {
                                break;
                            }
                            i4++;
                        } else {
                            this.c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!u2.c.a(name, "protocolSelected") && !u2.c.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        u2.c.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.c = (String) obj4;
        return null;
    }
}
