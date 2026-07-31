package F3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.lang.reflect.InvocationTargetException;
import l.AbstractC0486c;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f741a;

    public i(int i7) {
        Handler handler;
        Handler handler2;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = AbstractC0486c.b(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f741a = handler2;
                        return;
                    } catch (InstantiationException e7) {
                        e = e7;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f741a = handler2;
                        return;
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f741a = handler2;
                        return;
                    } catch (InvocationTargetException e9) {
                        Throwable cause = e9.getCause();
                        if (cause instanceof RuntimeException) {
                            throw ((RuntimeException) cause);
                        }
                        if (!(cause instanceof Error)) {
                            throw new RuntimeException(cause);
                        }
                        throw ((Error) cause);
                    }
                    handler2 = handler;
                }
                this.f741a = handler2;
                return;
            default:
                Looper mainLooper2 = Looper.getMainLooper();
                this.f741a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper2) : new Handler(mainLooper2);
                return;
        }
    }
}
