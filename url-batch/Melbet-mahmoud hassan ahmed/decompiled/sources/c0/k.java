package c0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public class k {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final n f1739a = new n(k.d().getWebkitToCompatConverter());
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final l f1740a = k.a();
    }

    static l a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new f();
        }
        try {
            return new m((WebViewProviderFactoryBoundaryInterface) s6.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new f();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static n c() {
        return a.f1739a;
    }

    public static l d() {
        return b.f1740a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? d.b() : f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }
}
