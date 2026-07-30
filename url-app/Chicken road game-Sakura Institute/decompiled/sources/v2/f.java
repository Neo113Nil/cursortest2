package v2;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import u3.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final q f9107a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f9107a = new k();
        } else if (i7 >= 28) {
            f9107a = new j();
        } else if (i7 >= 26) {
            f9107a = new i();
        } else {
            Method method = h.f9110c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f9107a = new h();
            } else {
                f9107a = new g();
            }
        }
        new m4.f(12);
    }
}
