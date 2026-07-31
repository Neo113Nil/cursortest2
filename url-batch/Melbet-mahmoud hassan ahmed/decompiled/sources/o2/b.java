package o2;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static Method f19691a;

    public static IBinder a(Bundle bundle, String str) {
        return m0.f19752a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        String str2;
        Method method = f19691a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f19691a = method2;
                method2.setAccessible(true);
                method = f19691a;
            } catch (NoSuchMethodException e7) {
                e = e7;
                str2 = "Failed to retrieve getIBinder method";
                r.g("BundleUtil", str2, e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e8) {
            e = e8;
            str2 = "Failed to invoke getIBinder via reflection";
            r.g("BundleUtil", str2, e);
            return null;
        }
    }
}
