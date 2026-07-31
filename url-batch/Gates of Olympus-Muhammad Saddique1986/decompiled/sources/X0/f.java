package X0;

import O2.l;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l f4628a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f4628a = new k();
        } else if (i3 >= 28) {
            f4628a = new j();
        } else if (i3 >= 26) {
            f4628a = new i();
        } else {
            Method method = h.f4631i;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f4628a = new h();
            } else {
                f4628a = new g();
            }
        }
        new A1.i(26);
    }
}
