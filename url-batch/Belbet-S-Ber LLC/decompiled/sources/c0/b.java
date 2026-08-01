package c0;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f864a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f865b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f866c;
    public static final Method d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f867e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f868f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f869g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class cls2;
        Method declaredMethod2;
        Class cls3;
        int i;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f864a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f865b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        f866c = field2;
        Class cls4 = f864a;
        Class cls5 = Boolean.TYPE;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls5, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            d = declaredMethod;
            cls2 = f864a;
            if (cls2 != null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls5);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                f867e = declaredMethod2;
                cls3 = f864a;
                i = Build.VERSION.SDK_INT;
                if ((i != 26 || i == 27) && cls3 != null) {
                    Class cls6 = Integer.TYPE;
                    Class cls7 = Boolean.TYPE;
                    Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                    declaredMethod3.setAccessible(true);
                    method = declaredMethod3;
                }
                f868f = method;
            }
            declaredMethod2 = null;
            f867e = declaredMethod2;
            cls3 = f864a;
            i = Build.VERSION.SDK_INT;
            if (i != 26) {
            }
            Class cls62 = Integer.TYPE;
            Class cls72 = Boolean.TYPE;
            Method declaredMethod32 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls62, cls72, Configuration.class, Configuration.class, cls72, cls72);
            declaredMethod32.setAccessible(true);
            method = declaredMethod32;
            f868f = method;
        }
        declaredMethod = null;
        d = declaredMethod;
        cls2 = f864a;
        if (cls2 != null) {
        }
        declaredMethod2 = null;
        f867e = declaredMethod2;
        cls3 = f864a;
        i = Build.VERSION.SDK_INT;
        if (i != 26) {
        }
        Class cls622 = Integer.TYPE;
        Class cls722 = Boolean.TYPE;
        Method declaredMethod322 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls622, cls722, Configuration.class, Configuration.class, cls722, cls722);
        declaredMethod322.setAccessible(true);
        method = declaredMethod322;
        f868f = method;
    }
}
