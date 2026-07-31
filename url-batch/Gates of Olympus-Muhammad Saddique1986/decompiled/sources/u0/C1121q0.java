package u0;

import java.lang.reflect.Method;

/* renamed from: u0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1121q0 implements V1.h, H0.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1121q0 f9440d = new C1121q0();

    /* renamed from: e, reason: collision with root package name */
    public static final W0 f9441e = new W0();

    public static final boolean a() {
        Class cls = C1123s.f9450B0;
        try {
            if (C1123s.f9450B0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C1123s.f9450B0 = cls2;
                C1123s.f9451C0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C1123s.f9451C0;
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
