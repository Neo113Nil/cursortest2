package k0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2758a;

    public l0(View view) {
        this.f2758a = new WeakReference(view);
    }

    public final void a(float f4) {
        View view = (View) this.f2758a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
    }

    public final void b() {
        View view = (View) this.f2758a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = (View) this.f2758a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(m0 m0Var) {
        View view = (View) this.f2758a.get();
        if (view != null) {
            if (m0Var != null) {
                view.animate().setListener(new f1.k(m0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f4) {
        View view = (View) this.f2758a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
    }
}
