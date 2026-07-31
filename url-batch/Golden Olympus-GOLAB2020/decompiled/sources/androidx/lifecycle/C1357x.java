package androidx.lifecycle;

import com.huawei.hms.framework.common.BundleUtil;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357x {

    /* renamed from: a, reason: collision with root package name */
    public static final C1357x f12685a = new C1357x();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f12686b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f12687c = new HashMap();

    private C1357x() {
    }

    private final InterfaceC1342h a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            android.support.v4.media.session.b.a(newInstance);
            return null;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c4 = c(name);
            if (fullPackage.length() != 0) {
                c4 = fullPackage + JwtParser.SEPARATOR_CHAR + c4;
            }
            Class<?> cls2 = Class.forName(c4);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static final String c(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.G(className, ".", BundleUtil.UNDERLINE_TAG, false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f12686b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g4 = g(cls);
        map.put(cls, Integer.valueOf(g4));
        return g4;
    }

    private final boolean e(Class cls) {
        return cls != null && InterfaceC1353t.class.isAssignableFrom(cls);
    }

    public static final InterfaceC1351q f(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z4 = object instanceof InterfaceC1351q;
        boolean z5 = object instanceof InterfaceC1339e;
        if (z4 && z5) {
            return new C1340f((InterfaceC1339e) object, (InterfaceC1351q) object);
        }
        if (z5) {
            return new C1340f((InterfaceC1339e) object, null);
        }
        if (z4) {
            return (InterfaceC1351q) object;
        }
        Class<?> cls = object.getClass();
        C1357x c1357x = f12685a;
        if (c1357x.d(cls) != 2) {
            return new G(object);
        }
        Object obj = f12687c.get(cls);
        Intrinsics.checkNotNull(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c1357x.a((Constructor) list.get(0), object);
            return new T(null);
        }
        int size = list.size();
        InterfaceC1342h[] interfaceC1342hArr = new InterfaceC1342h[size];
        for (int i4 = 0; i4 < size; i4++) {
            f12685a.a((Constructor) list.get(i4), object);
            interfaceC1342hArr[i4] = null;
        }
        return new C1338d(interfaceC1342hArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b4 = b(cls);
        if (b4 != null) {
            f12687c.put(cls, CollectionsKt.listOf(b4));
            return 2;
        }
        if (C1336b.f12628c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f12687c.get(superclass);
            Intrinsics.checkNotNull(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f12687c.get(intrface);
                Intrinsics.checkNotNull(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f12687c.put(cls, arrayList);
        return 2;
    }
}
