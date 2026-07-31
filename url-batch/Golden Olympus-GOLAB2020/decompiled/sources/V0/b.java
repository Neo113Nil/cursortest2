package V0;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f9470a;

    public static Context a() {
        return f9470a;
    }

    public static void b(Context context) {
        if (context == null || f9470a != null) {
            return;
        }
        f9470a = context.getApplicationContext();
    }
}
