package k;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public Method f4991a;

    /* renamed from: b, reason: collision with root package name */
    public Method f4992b;

    /* renamed from: c, reason: collision with root package name */
    public Method f4993c;

    public f0(Method method, Method method2, Method method3) {
        this.f4991a = method;
        this.f4992b = method2;
        this.f4993c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
