package n0;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2835a;

    public t0(View view) {
        this.f2835a = new WeakReference(view);
    }

    public final void a(float f5) {
        View view = (View) this.f2835a.get();
        if (view != null) {
            view.animate().alpha(f5);
        }
    }

    public final void b() {
        View view = (View) this.f2835a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f2835a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(u0 u0Var) {
        View view = (View) this.f2835a.get();
        if (view != null) {
            if (u0Var != null) {
                view.animate().setListener(new g2.e(u0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f5) {
        View view = (View) this.f2835a.get();
        if (view != null) {
            view.animate().translationY(f5);
        }
    }
}
