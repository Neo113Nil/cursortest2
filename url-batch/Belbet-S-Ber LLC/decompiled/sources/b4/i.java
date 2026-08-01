package b4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f843a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f844b;

    /* renamed from: c, reason: collision with root package name */
    public String f845c;

    public i(ArrayList arrayList) {
        this.f843a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        i3.d.e(obj, "proxy");
        i3.d.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (i3.d.a(name, "supports") && i3.d.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (i3.d.a(name, "unsupported") && i3.d.a(Void.TYPE, returnType)) {
            this.f844b = true;
            return null;
        }
        boolean a5 = i3.d.a(name, "protocols");
        ArrayList arrayList = this.f843a;
        if (a5 && objArr.length == 0) {
            return arrayList;
        }
        if ((i3.d.a(name, "selectProtocol") || i3.d.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        i3.d.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f845c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f845c = str2;
                return str2;
            }
        }
        if ((!i3.d.a(name, "protocolSelected") && !i3.d.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        i3.d.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f845c = (String) obj4;
        return null;
    }
}
