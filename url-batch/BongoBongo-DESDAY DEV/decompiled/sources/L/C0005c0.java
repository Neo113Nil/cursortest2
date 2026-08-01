package L;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: L.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005c0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f510a;

    public C0005c0(View view) {
        this.f510a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f510a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f510a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f510a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(d0 d0Var) {
        View view = (View) this.f510a.get();
        if (view != null) {
            if (d0Var != null) {
                view.animate().setListener(new C0003b0(d0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f510a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
