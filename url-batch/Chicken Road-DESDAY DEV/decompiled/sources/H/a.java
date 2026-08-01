package H;

import K.S;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import z.AbstractC0342b;
import z.C0341a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f199c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f197a = i;
        this.f198b = obj;
        this.f199c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f198b;
        Object obj2 = this.f199c;
        switch (this.f197a) {
            case 0:
                B.b bVar = (B.b) ((C.g) obj).f66b;
                if (bVar != null) {
                    bVar.h((Typeface) obj2);
                    return;
                }
                return;
            case 1:
                ((g) obj).a(obj2);
                return;
            case 2:
                S.e eVar = ((SwipeDismissBehavior) obj2).f1597a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = S.f369a;
                ((View) obj).postOnAnimation(this);
                return;
            case 3:
                ((C0341a) obj).f4237a = obj2;
                return;
            case 4:
                ((Application) obj).unregisterActivityLifecycleCallbacks((C0341a) obj2);
                return;
            default:
                try {
                    Method method = AbstractC0342b.d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0342b.f4245e.invoke(obj, obj2, Boolean.FALSE);
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
        this.f197a = 2;
        this.f199c = swipeDismissBehavior;
        this.f198b = view;
    }
}
