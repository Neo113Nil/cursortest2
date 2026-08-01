package A;

import L.T;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4c;

    public /* synthetic */ b(Object obj, int i, Object obj2) {
        this.f2a = i;
        this.f3b = obj;
        this.f4c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f3b;
        Object obj2 = this.f4c;
        switch (this.f2a) {
            case 0:
                ((c) obj).f5a = obj2;
                return;
            case 1:
                ((Application) obj2).unregisterActivityLifecycleCallbacks((c) obj);
                return;
            case 2:
                try {
                    Method method = d.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d.f13e.invoke(obj2, obj, Boolean.FALSE);
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
            case 3:
                C.b bVar = (C.b) ((D.g) obj).f122b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 4:
                ((I.f) obj).a(obj2);
                return;
            default:
                U.e eVar = ((SwipeDismissBehavior) obj2).f1754a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = T.f490a;
                ((View) obj).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i, boolean z2) {
        this.f2a = i;
        this.f4c = obj;
        this.f3b = obj2;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f2a = 5;
        this.f4c = swipeDismissBehavior;
        this.f3b = view;
    }
}
