package u0;

import java.lang.reflect.Method;

/* renamed from: u0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981k0 implements P1.h, n0.k, F0.d, B0, A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C0981k0 f8358d = new C0981k0();

    /* renamed from: e, reason: collision with root package name */
    public static final L0 f8359e = new L0();

    public static final boolean a() {
        Class cls = C0997t.f8408A0;
        try {
            if (C0997t.f8408A0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C0997t.f8408A0 = cls2;
                C0997t.f8409B0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C0997t.f8409B0;
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
