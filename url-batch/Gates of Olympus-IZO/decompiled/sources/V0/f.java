package V0;

import a.AbstractC0157a;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import k.C0523b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0157a f3354a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f3354a = new k();
        } else if (i3 >= 28) {
            f3354a = new j();
        } else if (i3 >= 26) {
            f3354a = new i();
        } else {
            Method method = h.f3357d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f3354a = new h();
            } else {
                f3354a = new g();
            }
        }
        new C0523b();
    }
}
