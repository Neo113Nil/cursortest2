package A1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f30a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31b;

    /* renamed from: c, reason: collision with root package name */
    public String f32c;

    public i(ArrayList arrayList) {
        this.f30a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        h1.d.e(obj, "proxy");
        h1.d.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (h1.d.a(name, "supports") && h1.d.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (h1.d.a(name, "unsupported") && h1.d.a(Void.TYPE, returnType)) {
            this.f31b = true;
            return null;
        }
        boolean a2 = h1.d.a(name, "protocols");
        ArrayList arrayList = this.f30a;
        if (a2 && objArr.length == 0) {
            return arrayList;
        }
        if ((h1.d.a(name, "selectProtocol") || h1.d.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                h1.d.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        h1.d.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f32c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f32c = str2;
                return str2;
            }
        }
        if ((!h1.d.a(name, "protocolSelected") && !h1.d.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        h1.d.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f32c = (String) obj4;
        return null;
    }
}
