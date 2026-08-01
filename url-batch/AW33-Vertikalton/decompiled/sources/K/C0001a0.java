package K;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: K.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001a0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f391a;

    public C0001a0(View view) {
        this.f391a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f391a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f391a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f391a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(b0 b0Var) {
        View view = (View) this.f391a.get();
        if (view != null) {
            if (b0Var != null) {
                view.animate().setListener(new Z(b0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f391a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
