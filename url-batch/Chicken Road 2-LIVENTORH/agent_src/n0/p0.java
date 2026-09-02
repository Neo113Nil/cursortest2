package n0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2772a;

    public p0(View view) {
        this.f2772a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f2772a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f2772a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = (View) this.f2772a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(q0 q0Var) {
        View view = (View) this.f2772a.get();
        if (view != null) {
            if (q0Var != null) {
                view.animate().setListener(new j1.k(q0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f2772a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
