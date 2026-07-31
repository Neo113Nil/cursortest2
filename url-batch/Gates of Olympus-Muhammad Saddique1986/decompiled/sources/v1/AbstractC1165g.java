package v1;

import android.os.Handler;
import android.os.Looper;

/* renamed from: v1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1165g {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
