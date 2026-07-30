package m7;

import java.lang.reflect.InvocationTargetException;
import org.greenrobot.eventbus.android.AndroidComponentsImpl;

/* loaded from: classes5.dex */
public class b {
    private static final String ANDROID_COMPONENTS_IMPLEMENTATION_CLASS_NAME = "org.greenrobot.eventbus.android.AndroidComponentsImpl";

    public static boolean areAndroidComponentsAvailable() {
        try {
            int i8 = AndroidComponentsImpl.f17218a;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static a instantiateAndroidComponents() {
        try {
            int i8 = AndroidComponentsImpl.f17218a;
            return (a) AndroidComponentsImpl.class.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean isAndroidSDKAvailable() {
        try {
            return Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", new Class[0]).invoke(null, new Object[0]) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
