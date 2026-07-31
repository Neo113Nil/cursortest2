package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public abstract class h {

    private static class a {
        public static boolean a(Handler handler, Runnable runnable, Object obj, long j4) {
            return handler.postDelayed(runnable, obj, j4);
        }
    }

    public static boolean a(Handler handler, Runnable runnable, Object obj, long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(handler, runnable, obj, j4);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j4);
    }
}
