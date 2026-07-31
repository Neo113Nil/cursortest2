package n6;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import v5.k;
import v5.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19641a;
    private static volatile Choreographer choreographer;

    static {
        Object a7;
        try {
            k.a aVar = k.f22832f;
            a7 = k.a(new a(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            k.a aVar2 = k.f22832f;
            a7 = k.a(l.a(th));
        }
        f19641a = (b) (k.c(a7) ? null : a7);
    }

    public static final Handler a(Looper looper, boolean z6) {
        int i7;
        if (!z6 || (i7 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i7 < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
