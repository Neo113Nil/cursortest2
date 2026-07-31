package v3;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f22818a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            r3.o.i(context);
            r3.o.i(th);
            return false;
        } catch (Exception e7) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e7);
            return false;
        }
    }
}
