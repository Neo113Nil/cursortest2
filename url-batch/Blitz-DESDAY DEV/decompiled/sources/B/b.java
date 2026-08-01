package B;

import M.Q;
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
    public final /* synthetic */ int f87a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f88b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f89c;

    public /* synthetic */ b(Object obj, int i, Object obj2) {
        this.f87a = i;
        this.f88b = obj;
        this.f89c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f88b;
        Object obj2 = this.f89c;
        switch (this.f87a) {
            case 0:
                ((c) obj).f90a = obj2;
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
                        d.f98e.invoke(obj2, obj, Boolean.FALSE);
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
                D.b bVar = (D.b) ((E.g) obj).f170b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 4:
                ((J.f) obj).a(obj2);
                return;
            default:
                U.e eVar = ((SwipeDismissBehavior) obj2).f1738a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = Q.f513a;
                ((View) obj).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i, boolean z2) {
        this.f87a = i;
        this.f89c = obj;
        this.f88b = obj2;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f87a = 5;
        this.f89c = swipeDismissBehavior;
        this.f88b = view;
    }
}
