package j;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Method f17976a;

        /* renamed from: b, reason: collision with root package name */
        private static boolean f17977b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f17978c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f17979d;

        public static IBinder a(Bundle bundle, String str) {
            if (!f17977b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f17976a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e7) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e7);
                }
                f17977b = true;
            }
            Method method2 = f17976a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e8) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e8);
                    f17976a = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f17979d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f17978c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e7) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e7);
                }
                f17979d = true;
            }
            Method method2 = f17978c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e8) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e8);
                    f17978c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.b(bundle, str, iBinder);
        }
    }
}
