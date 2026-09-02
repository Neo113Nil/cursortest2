package n;

import android.os.Handler;
import android.os.Looper;

/* renamed from: n.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0086m {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
