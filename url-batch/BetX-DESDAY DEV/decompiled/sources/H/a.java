package H;

import K.X;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.luckyarcade.spinthrow.GameConfig;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f216c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f214a = i;
        this.f215b = obj;
        this.f216c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f215b;
        Object obj2 = this.f216c;
        switch (this.f214a) {
            case 0:
                B.b bVar = (B.b) ((B0.d) obj).f66b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                S.e eVar = ((SwipeDismissBehavior) obj2).f1725a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = X.f419a;
                ((View) obj).postOnAnimation(this);
                return;
            case GameConfig.COMBO_EVERY /* 3 */:
                ((z.d) obj).f4620a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((z.d) obj2);
                return;
            default:
                try {
                    Method method = z.e.f4629d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        z.e.f4630e.invoke(obj, obj2, Boolean.FALSE);
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
        this.f214a = 2;
        this.f216c = swipeDismissBehavior;
        this.f215b = view;
    }
}
