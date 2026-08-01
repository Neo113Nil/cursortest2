package T;

import android.os.Handler;
import android.os.Looper;

/* renamed from: T.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0037b {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
