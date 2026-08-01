package H;

import K.S;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import z.AbstractC0329b;
import z.C0328a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f268c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f266a = i;
        this.f267b = obj;
        this.f268c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f267b;
        Object obj2 = this.f268c;
        switch (this.f266a) {
            case 0:
                B.b bVar = (B.b) ((C.h) obj).f150b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                S.e eVar = ((SwipeDismissBehavior) obj2).f1663a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = S.f351a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                ((C0328a) obj).f4233a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C0328a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC0329b.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0329b.f4241e.invoke(obj, obj2, Boolean.FALSE);
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
        this.f266a = 2;
        this.f268c = swipeDismissBehavior;
        this.f267b = view;
    }
}
