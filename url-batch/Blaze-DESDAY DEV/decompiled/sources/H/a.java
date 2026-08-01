package H;

import K.T;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import z.AbstractC0322b;
import z.C0321a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f271c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f269a = i;
        this.f270b = obj;
        this.f271c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f270b;
        Object obj2 = this.f271c;
        switch (this.f269a) {
            case 0:
                B.b bVar = (B.b) ((C.g) obj).f80b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                T.e eVar = ((SwipeDismissBehavior) obj2).f1690a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = T.f440a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                ((C0321a) obj).f4332a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C0321a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC0322b.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0322b.f4340e.invoke(obj, obj2, Boolean.FALSE);
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
        this.f269a = 2;
        this.f271c = swipeDismissBehavior;
        this.f270b = view;
    }
}
