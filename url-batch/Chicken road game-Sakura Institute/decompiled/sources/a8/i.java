package a8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f553a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f554b;

    /* renamed from: c, reason: collision with root package name */
    public String f555c;

    public i(ArrayList arrayList) {
        this.f553a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        r6.k.f(obj, "proxy");
        r6.k.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (r6.k.a(name, "supports") && r6.k.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (r6.k.a(name, "unsupported") && r6.k.a(Void.TYPE, returnType)) {
            this.f554b = true;
            return null;
        }
        boolean a3 = r6.k.a(name, "protocols");
        ArrayList arrayList = this.f553a;
        if (a3 && objArr.length == 0) {
            return arrayList;
        }
        if ((r6.k.a(name, "selectProtocol") || r6.k.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i7 = 0;
                    while (true) {
                        Object obj3 = list.get(i7);
                        r6.k.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i7 == size) {
                                break;
                            }
                            i7++;
                        } else {
                            this.f555c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f555c = str2;
                return str2;
            }
        }
        if ((!r6.k.a(name, "protocolSelected") && !r6.k.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        r6.k.d(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f555c = (String) obj4;
        return null;
    }
}
