package s0;

import java.lang.reflect.Method;

/* renamed from: s0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165r0 implements kotlin.coroutines.g, F0.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1165r0 f10311d = new C1165r0();

    /* renamed from: e, reason: collision with root package name */
    public static final X0 f10312e = new X0();

    public static final boolean a() {
        Class cls = C1166s.f10313E0;
        try {
            if (C1166s.f10313E0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C1166s.f10313E0 = cls2;
                C1166s.f10314F0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C1166s.f10314F0;
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
