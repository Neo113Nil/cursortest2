package I2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2503a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2504b;

    /* renamed from: c, reason: collision with root package name */
    public String f2505c;

    public i(ArrayList arrayList) {
        this.f2503a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Z1.i.f(obj, "proxy");
        Z1.i.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Z1.i.a(name, "supports") && Z1.i.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (Z1.i.a(name, "unsupported") && Z1.i.a(Void.TYPE, returnType)) {
            this.f2504b = true;
            return null;
        }
        boolean a3 = Z1.i.a(name, "protocols");
        ArrayList arrayList = this.f2503a;
        if (a3 && objArr.length == 0) {
            return arrayList;
        }
        if ((Z1.i.a(name, "selectProtocol") || Z1.i.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                Z1.i.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj3 = list.get(i3);
                        Z1.i.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i3 == size) {
                                break;
                            }
                            i3++;
                        } else {
                            this.f2505c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f2505c = str2;
                return str2;
            }
        }
        if ((!Z1.i.a(name, "protocolSelected") && !Z1.i.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        Z1.i.d(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f2505c = (String) obj4;
        return null;
    }
}
