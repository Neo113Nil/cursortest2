package K;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: K.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009e0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f438a;

    public C0009e0(View view) {
        this.f438a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f438a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f438a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f438a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(f0 f0Var) {
        View view = (View) this.f438a.get();
        if (view != null) {
            if (f0Var != null) {
                view.animate().setListener(new C0007d0(f0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f438a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
