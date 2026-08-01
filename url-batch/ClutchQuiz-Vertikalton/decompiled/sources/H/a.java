package H;

import K.S;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o1.AbstractC0299s;
import z.AbstractC0389b;
import z.C0388a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212a;

    /* renamed from: b, reason: collision with root package name */
    public Object f213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f214c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f212a = i;
        this.f213b = obj;
        this.f214c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1.g gVar;
        Object obj = this.f214c;
        switch (this.f212a) {
            case 0:
                B.b bVar = (B.b) ((A0.h) this.f213b).f30b;
                if (bVar != null) {
                    bVar.h((Typeface) obj);
                    return;
                }
                return;
            case 1:
                ((g) this.f213b).a(obj);
                return;
            case 2:
                int i = 0;
                do {
                    try {
                        ((Runnable) this.f213b).run();
                    } catch (Throwable th) {
                        AbstractC0299s.e(X0.j.f1156a, th);
                    }
                    gVar = (s1.g) obj;
                    Runnable A2 = gVar.A();
                    if (A2 == null) {
                        return;
                    }
                    this.f213b = A2;
                    i++;
                } while (i < 16);
                u1.l lVar = gVar.f3651c;
                lVar.getClass();
                lVar.y(gVar, this);
                return;
            case 3:
                S.e eVar = ((SwipeDismissBehavior) obj).f1741a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap = S.f365a;
                ((View) this.f213b).postOnAnimation(this);
                return;
            case 4:
                ((C0388a) this.f213b).f4019a = obj;
                return;
            case 5:
                ((Application) this.f213b).unregisterActivityLifecycleCallbacks((C0388a) obj);
                return;
            default:
                try {
                    Method method = AbstractC0389b.d;
                    Object obj2 = this.f213b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0389b.f4027e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
        }
    }

    public a(s1.g gVar, Runnable runnable) {
        this.f212a = 2;
        this.f214c = gVar;
        this.f213b = runnable;
    }

    public a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f212a = 3;
        this.f214c = swipeDismissBehavior;
        this.f213b = view;
    }
}
