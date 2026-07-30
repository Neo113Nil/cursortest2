package y;

import android.app.Application;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static Application f17328a;

    public static void a(Context context) {
        if (context == null) {
            a(b());
        } else {
            a((Application) context.getApplicationContext());
        }
    }

    public static Application b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (invoke == null) {
                throw new NullPointerException("u should init first");
            }
            a((Application) invoke);
            return f17328a;
        } catch (ClassNotFoundException e8) {
            e8.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (IllegalAccessException e9) {
            e9.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
            throw new NullPointerException("u should init first");
        } catch (InvocationTargetException e11) {
            e11.printStackTrace();
            throw new NullPointerException("u should init first");
        }
    }

    public static void a(Application application) {
        if (f17328a == null) {
            if (application == null) {
                f17328a = b();
            } else {
                f17328a = application;
            }
        }
    }

    public static Application a() {
        Application application = f17328a;
        return application != null ? application : b();
    }
}
