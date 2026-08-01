package K;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f360a;

    public Z(View view) {
        this.f360a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f360a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f360a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f360a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(a0 a0Var) {
        View view = (View) this.f360a.get();
        if (view != null) {
            if (a0Var != null) {
                view.animate().setListener(new Y(a0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f360a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
