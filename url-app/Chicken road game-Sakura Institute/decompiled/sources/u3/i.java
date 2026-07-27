package u3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10950a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10951b;

    /* renamed from: c, reason: collision with root package name */
    public String f10952c;

    public i(ArrayList protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        this.f10950a = protocols;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.a(name, "supports") && Intrinsics.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.a(name, "unsupported") && Intrinsics.a(Void.TYPE, returnType)) {
            this.f10951b = true;
            return null;
        }
        boolean a4 = Intrinsics.a(name, "protocols");
        ArrayList arrayList = this.f10950a;
        if (a4 && objArr.length == 0) {
            return arrayList;
        }
        if ((Intrinsics.a(name, "selectProtocol") || Intrinsics.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj2 = list.get(i2);
                        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (!arrayList.contains(str)) {
                            if (i2 == size) {
                                break;
                            }
                            i2++;
                        } else {
                            this.f10952c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f10952c = str2;
                return str2;
            }
        }
        if ((!Intrinsics.a(name, "protocolSelected") && !Intrinsics.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f10952c = (String) obj3;
        return null;
    }
}
