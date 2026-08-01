package B;

import M.P;
import a1.j;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import r1.AbstractC0369t;
import y1.l;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f25a = i;
        this.f26b = obj;
        this.f27c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w1.h hVar;
        Object obj = this.f27c;
        switch (this.f25a) {
            case 0:
                ((b) this.f26b).f28a = obj;
                return;
            case 1:
                ((Application) obj).unregisterActivityLifecycleCallbacks((b) this.f26b);
                return;
            case 2:
                try {
                    Method method = c.f36d;
                    Object obj2 = this.f26b;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        c.e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 3:
                D.b bVar = (D.b) ((C1.d) this.f26b).f145b;
                if (bVar != null) {
                    bVar.h((Typeface) obj);
                    return;
                }
                return;
            case 4:
                ((J.f) this.f26b).a(obj);
                return;
            case 5:
                U.e eVar = ((SwipeDismissBehavior) obj).f2251a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = P.f711a;
                ((View) this.f26b).postOnAnimation(this);
                return;
            default:
                int i = 0;
                do {
                    try {
                        ((Runnable) this.f26b).run();
                    } catch (Throwable th2) {
                        AbstractC0369t.e(j.f1673a, th2);
                    }
                    hVar = (w1.h) obj;
                    Runnable F2 = hVar.F();
                    if (F2 == null) {
                        return;
                    }
                    this.f26b = F2;
                    i++;
                } while (i < 16);
                l lVar = hVar.f4478c;
                lVar.getClass();
                lVar.D(hVar, this);
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i, boolean z2) {
        this.f25a = i;
        this.f27c = obj;
        this.f26b = obj2;
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f25a = 5;
        this.f27c = swipeDismissBehavior;
        this.f26b = view;
    }
}
