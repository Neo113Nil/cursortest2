package c4;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    private static c1 f1943a;

    interface a {
        a a(Application application);

        c1 zza();
    }

    public static c1 a(Context context) {
        c1 c1Var;
        synchronized (c1.class) {
            if (f1943a == null) {
                f1943a = new j(null).a((Application) context.getApplicationContext()).zza();
            }
            c1Var = f1943a;
        }
        return c1Var;
    }

    public abstract d2 b();

    public abstract a0 c();
}
