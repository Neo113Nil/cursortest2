package androidx.fragment.app;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f415f;
    public final Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e(Object obj, Object obj2, int i4) {
        this.f415f = i4;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f415f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.g;
                v0 v0Var = (v0) this.h;
                if (arrayList.contains(v0Var)) {
                    arrayList.remove(v0Var);
                    w0.a(v0Var.c.J, v0Var.f542a);
                    return;
                }
                return;
            case 1:
                a2.e eVar = (a2.e) this.g;
                Typeface typeface = (Typeface) this.h;
                b0.b bVar = (b0.b) eVar.g;
                if (bVar != null) {
                    bVar.h(typeface);
                    return;
                }
                return;
            case 2:
                ((h0.f) this.g).accept(this.h);
                return;
            case 3:
                q0.e eVar2 = ((SwipeDismissBehavior) this.h).f1189a;
                if (eVar2 == null || !eVar2.f()) {
                    return;
                }
                ((View) this.g).postOnAnimation(this);
                return;
            case 4:
                ((z.a) this.g).f3621a = this.h;
                return;
            case 5:
                ((Application) this.g).unregisterActivityLifecycleCallbacks((z.a) this.h);
                return;
            default:
                try {
                    Method method = z.b.f3628d;
                    Object obj = this.h;
                    Object obj2 = this.g;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        z.b.f3629e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public e(l lVar, ArrayList arrayList, v0 v0Var) {
        this.f415f = 0;
        this.g = arrayList;
        this.h = v0Var;
    }

    public e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f415f = 3;
        this.h = swipeDismissBehavior;
        this.g = view;
    }
}
