package H;

import K.T;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import z.AbstractC0318b;
import z.C0317a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f254c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f252a = i;
        this.f253b = obj;
        this.f254c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f253b;
        Object obj2 = this.f254c;
        switch (this.f252a) {
            case 0:
                B.b bVar = (B.b) ((C.g) obj).f115b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                T.e eVar = ((SwipeDismissBehavior) obj2).f1659a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = T.f423a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                ((C0317a) obj).f4313a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C0317a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC0318b.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0318b.f4321e.invoke(obj, obj2, Boolean.FALSE);
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
        this.f252a = 2;
        this.f254c = swipeDismissBehavior;
        this.f253b = view;
    }
}
