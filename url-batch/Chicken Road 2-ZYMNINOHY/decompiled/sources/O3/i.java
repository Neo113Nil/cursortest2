package O3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2068a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2069b;

    /* renamed from: c, reason: collision with root package name */
    public String f2070c;

    public i(ArrayList arrayList) {
        this.f2068a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        kotlin.jvm.internal.i.e(proxy, "proxy");
        kotlin.jvm.internal.i.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.i.a(name, "supports") && kotlin.jvm.internal.i.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.i.a(name, "unsupported") && kotlin.jvm.internal.i.a(Void.TYPE, returnType)) {
            this.f2069b = true;
            return null;
        }
        boolean a3 = kotlin.jvm.internal.i.a(name, "protocols");
        ArrayList arrayList = this.f2068a;
        if (a3 && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.i.a(name, "selectProtocol") || kotlin.jvm.internal.i.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        Object obj2 = list.get(i4);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj2;
                        if (arrayList.contains(str)) {
                            this.f2070c = str;
                            return str;
                        }
                        if (i4 == size) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f2070c = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.i.a(name, "protocolSelected") && !kotlin.jvm.internal.i.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f2070c = (String) obj3;
        return null;
    }
}
