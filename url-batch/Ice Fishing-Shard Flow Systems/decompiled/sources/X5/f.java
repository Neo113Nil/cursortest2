package X5;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Method f2886a;

    /* renamed from: b, reason: collision with root package name */
    public Method f2887b;

    /* renamed from: c, reason: collision with root package name */
    public Method f2888c;

    public f(Method method, Method method2, Method method3) {
        this.f2886a = method;
        this.f2887b = method2;
        this.f2888c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
