package I;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1164a;

    public Y(View view) {
        this.f1164a = new WeakReference(view);
    }

    public final void a(float f7) {
        View view = (View) this.f1164a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
    }

    public final void b() {
        View view = (View) this.f1164a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f1164a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(Z z7) {
        View view = (View) this.f1164a.get();
        if (view != null) {
            if (z7 != null) {
                view.animate().setListener(new X(z7, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f7) {
        View view = (View) this.f1164a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
    }
}
