package V0;

import a.AbstractC0345a;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0345a f4148a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f4148a = new i();
        } else if (i2 >= 28) {
            f4148a = new h();
        } else {
            f4148a = new g();
        }
        new H1.f(13);
    }
}
