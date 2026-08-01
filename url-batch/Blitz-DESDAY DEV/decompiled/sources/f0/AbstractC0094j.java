package f0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0094j {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
