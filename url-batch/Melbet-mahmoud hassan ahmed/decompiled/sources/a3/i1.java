package a3;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.xh0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class i1 {
    @Deprecated
    public static <T> T a(Context context, Callable<T> callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            io0.e("Unexpected exception.", th);
            xh0.c(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
