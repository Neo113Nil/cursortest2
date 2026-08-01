package H;

import K.X;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f217c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f215a = i;
        this.f216b = obj;
        this.f217c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f216b;
        Object obj2 = this.f217c;
        switch (this.f215a) {
            case 0:
                B.b bVar = (B.b) ((B0.d) obj).f67b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                S.e eVar = ((SwipeDismissBehavior) obj2).f1747a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = X.f418a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                ((z.d) obj).f4616a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((z.d) obj2);
                return;
            default:
                try {
                    Method method = z.e.f4625d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        z.e.f4626e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f215a = 2;
        this.f217c = swipeDismissBehavior;
        this.f216b = view;
    }
}
