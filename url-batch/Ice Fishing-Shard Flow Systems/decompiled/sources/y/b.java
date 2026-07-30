package y;

import android.app.Application;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8447e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8448i;

    public /* synthetic */ b(Object obj, int i2, Object obj2) {
        this.f8446d = i2;
        this.f8447e = obj;
        this.f8448i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8446d) {
            case 0:
                try {
                    Method method = d.f8458d;
                    Object obj = this.f8448i;
                    Object obj2 = this.f8447e;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d.f8459e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e7) {
                    if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                        throw e7;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            default:
                ((Application) this.f8447e).unregisterActivityLifecycleCallbacks((c) this.f8448i);
                return;
        }
    }
}
