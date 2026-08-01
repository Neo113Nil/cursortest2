package defpackage;

import android.app.Application;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.f;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class h1 implements Runnable {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public h1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f = 9;
        this.h = swipeDismissBehavior;
        this.g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yt ytVar;
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                f1 f1Var = (f1) obj;
                k1 k1Var = (k1) obj2;
                au auVar = k1Var.h;
                if (auVar != null && (ytVar = auVar.e) != null) {
                    ytVar.m(auVar);
                }
                View view = (View) k1Var.m;
                if (view != null && view.getWindowToken() != null) {
                    if (!f1Var.b()) {
                        if (f1Var.f != null) {
                            f1Var.d(0, 0, false, false);
                        }
                    }
                    k1Var.x = f1Var;
                }
                k1Var.z = null;
                return;
            case 1:
                ((t1) obj).a = obj2;
                return;
            case 2:
                ((Application) obj).unregisterActivityLifecycleCallbacks((t1) obj2);
                return;
            case 3:
                try {
                    Method method = u1.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        u1.e.invoke(obj, obj2, Boolean.FALSE);
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
            case 4:
                Typeface typeface = (Typeface) obj2;
                l70 l70Var = (l70) ((tx) obj).f;
                if (l70Var != null) {
                    l70Var.D(typeface);
                    return;
                }
                return;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                ml.g((View) obj, (Rect) obj2);
                return;
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                ((ye) obj).a();
                if (n.G(2)) {
                    Log.v("FragmentManager", "Transition for operation " + ((s) obj2) + "has completed");
                    return;
                }
                return;
            case 7:
                ((rj) obj).accept(obj2);
                return;
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                f fVar = (f) obj2;
                s sVar = (s) obj;
                fVar.b.remove(sVar);
                fVar.c.remove(sVar);
                return;
            default:
                h90 h90Var = ((SwipeDismissBehavior) obj2).a;
                if (h90Var == null || !h90Var.f()) {
                    return;
                }
                ((View) obj).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ h1(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ h1(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    public h1(ml mlVar, View view, Rect rect) {
        this.f = 5;
        this.g = view;
        this.h = rect;
    }
}
