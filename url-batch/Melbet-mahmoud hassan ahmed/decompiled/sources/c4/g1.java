package c4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f1967a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f1968b = new j1("Google consent worker");

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
