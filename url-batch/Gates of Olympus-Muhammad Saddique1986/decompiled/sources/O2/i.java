package O2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3896a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3897b;

    /* renamed from: c, reason: collision with root package name */
    public String f3898c;

    public i(ArrayList arrayList) {
        this.f3896a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        f2.j.f(obj, "proxy");
        f2.j.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (f2.j.a(name, "supports") && f2.j.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (f2.j.a(name, "unsupported") && f2.j.a(Void.TYPE, returnType)) {
            this.f3897b = true;
            return null;
        }
        boolean a3 = f2.j.a(name, "protocols");
        ArrayList arrayList = this.f3896a;
        if (a3 && objArr.length == 0) {
            return arrayList;
        }
        if ((f2.j.a(name, "selectProtocol") || f2.j.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                f2.j.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj3 = list.get(i3);
                        f2.j.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i3 == size) {
                                break;
                            }
                            i3++;
                        } else {
                            this.f3898c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f3898c = str2;
                return str2;
            }
        }
        if ((!f2.j.a(name, "protocolSelected") && !f2.j.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        f2.j.d(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f3898c = (String) obj4;
        return null;
    }
}
