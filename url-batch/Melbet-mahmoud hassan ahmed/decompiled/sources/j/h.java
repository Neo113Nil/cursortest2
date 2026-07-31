package j;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f18037c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static Set<String> f18038d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private static final Object f18039e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f18040a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f18041b;

    private h(Context context) {
        this.f18040a = context;
        this.f18041b = (NotificationManager) context.getSystemService("notification");
    }

    public static h b(Context context) {
        return new h(context);
    }

    public boolean a() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            return this.f18041b.areNotificationsEnabled();
        }
        if (i7 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f18040a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f18040a.getApplicationInfo();
        String packageName = this.f18040a.getApplicationContext().getPackageName();
        int i8 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i8), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
