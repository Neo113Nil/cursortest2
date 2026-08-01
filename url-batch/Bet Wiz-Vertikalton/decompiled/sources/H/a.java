package H;

import K.S;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import z.AbstractC0344b;
import z.C0343a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f252c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f250a = i;
        this.f251b = obj;
        this.f252c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f251b;
        Object obj2 = this.f252c;
        switch (this.f250a) {
            case 0:
                B.b bVar = (B.b) ((C.g) obj).f67b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                S.e eVar = ((SwipeDismissBehavior) obj2).f1634a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = S.f422a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                ((C0343a) obj).f4306a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C0343a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC0344b.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0344b.f4314e.invoke(obj, obj2, Boolean.FALSE);
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
        this.f250a = 2;
        this.f252c = swipeDismissBehavior;
        this.f251b = view;
    }
}
