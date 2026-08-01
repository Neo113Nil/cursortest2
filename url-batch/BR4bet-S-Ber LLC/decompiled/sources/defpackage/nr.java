package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nr implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public nr(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kr.b(name, "supports") && kr.b(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kr.b(name, "unsupported") && kr.b(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean b = kr.b(name, "protocols");
        ArrayList arrayList = this.a;
        if (b && objArr.length == 0) {
            return arrayList;
        }
        if ((kr.b(name, "selectProtocol") || kr.b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        obj3.getClass();
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
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
        if ((!kr.b(name, "protocolSelected") && !kr.b(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        this.c = (String) obj4;
        return null;
    }
}
