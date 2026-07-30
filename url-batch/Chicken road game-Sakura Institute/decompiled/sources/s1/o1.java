package s1;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o1 implements h6.h, f2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o1 f8336f = new o1();

    /* renamed from: g, reason: collision with root package name */
    public static final t2 f8337g = new t2();

    public static final boolean a() {
        Class cls = r.D0;
        try {
            if (r.D0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                r.D0 = cls2;
                r.E0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = r.E0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
