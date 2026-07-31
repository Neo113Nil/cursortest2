package u0;

import android.content.Context;
import android.util.Log;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3456c {
    public static AbstractC3456c a(d dVar) {
        return y0.b.h(dVar);
    }

    public static AbstractC3456c c() {
        return y0.b.f();
    }

    public static void e(Context context) {
        Log.i("AGConnectInstance", "AGConnectInstance#initialize");
        y0.b.j(context);
    }

    public abstract Context b();

    public abstract d d();
}
