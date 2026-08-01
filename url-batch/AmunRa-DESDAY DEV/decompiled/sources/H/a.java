package H;

import K.S;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import z.AbstractC0337b;
import z.C0336a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f192c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f190a = i;
        this.f191b = obj;
        this.f192c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f191b;
        Object obj2 = this.f192c;
        switch (this.f190a) {
            case 0:
                B.b bVar = (B.b) ((C.g) obj).f64b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                S.e eVar = ((SwipeDismissBehavior) obj2).f1567a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = S.f362a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                ((C0336a) obj).f4278a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C0336a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC0337b.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0337b.f4286e.invoke(obj, obj2, Boolean.FALSE);
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
        this.f190a = 2;
        this.f192c = swipeDismissBehavior;
        this.f191b = view;
    }
}
