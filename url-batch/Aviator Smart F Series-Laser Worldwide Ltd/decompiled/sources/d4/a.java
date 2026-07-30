package d4;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f16622a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable, long j8) {
        f16622a.postDelayed(runnable, j8);
    }
}
