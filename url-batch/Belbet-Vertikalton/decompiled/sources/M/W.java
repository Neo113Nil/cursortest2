package M;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f718a;

    public W(View view) {
        this.f718a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f718a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f718a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f718a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(X x2) {
        View view = (View) this.f718a.get();
        if (view != null) {
            if (x2 != null) {
                view.animate().setListener(new I0.i(x2, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f718a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
