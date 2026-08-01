package androidx.fragment.app;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f417f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f418g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f419h;

    public /* synthetic */ e(Object obj, Object obj2, int i) {
        this.f417f = i;
        this.f418g = obj;
        this.f419h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f417f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f418g;
                v0 v0Var = (v0) this.f419h;
                if (arrayList.contains(v0Var)) {
                    arrayList.remove(v0Var);
                    w0.a(v0Var.f562c.J, v0Var.f560a);
                    return;
                }
                return;
            case 1:
                ((c0.a) this.f418g).f742a = this.f419h;
                return;
            case 2:
                ((Application) this.f418g).unregisterActivityLifecycleCallbacks((c0.a) this.f419h);
                return;
            case 3:
                try {
                    Method method = c0.b.d;
                    Object obj = this.f419h;
                    Object obj2 = this.f418g;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        c0.b.f750e.invoke(obj2, obj, Boolean.FALSE);
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
            case 4:
                a0.a aVar = (a0.a) this.f418g;
                Typeface typeface = (Typeface) this.f419h;
                e0.b bVar = (e0.b) aVar.f81g;
                if (bVar != null) {
                    bVar.h(typeface);
                    return;
                }
                return;
            case 5:
                ((k0.f) this.f418g).accept(this.f419h);
                return;
            default:
                t0.e eVar = ((SwipeDismissBehavior) this.f419h).f813a;
                if (eVar == null || !eVar.f()) {
                    return;
                }
                ((View) this.f418g).postOnAnimation(this);
                return;
        }
    }

    public e(l lVar, ArrayList arrayList, v0 v0Var) {
        this.f417f = 0;
        this.f418g = arrayList;
        this.f419h = v0Var;
    }

    public e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f417f = 6;
        this.f419h = swipeDismissBehavior;
        this.f418g = view;
    }
}
