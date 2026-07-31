package m1;

import android.os.Handler;
import android.os.Looper;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0644b {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
