package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301k0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f11967a;

    /* renamed from: androidx.core.view.k0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1303l0 f11968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11969b;

        a(InterfaceC1303l0 interfaceC1303l0, View view) {
            this.f11968a = interfaceC1303l0;
            this.f11969b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11968a.a(this.f11969b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11968a.b(this.f11969b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f11968a.c(this.f11969b);
        }
    }

    C1301k0(View view) {
        this.f11967a = new WeakReference(view);
    }

    private void h(View view, InterfaceC1303l0 interfaceC1303l0) {
        if (interfaceC1303l0 != null) {
            view.animate().setListener(new a(interfaceC1303l0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1301k0 b(float f4) {
        View view = (View) this.f11967a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f11967a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f11967a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C1301k0 e(long j4) {
        View view = (View) this.f11967a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
        return this;
    }

    public C1301k0 f(Interpolator interpolator) {
        View view = (View) this.f11967a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1301k0 g(InterfaceC1303l0 interfaceC1303l0) {
        View view = (View) this.f11967a.get();
        if (view != null) {
            h(view, interfaceC1303l0);
        }
        return this;
    }

    public C1301k0 i(long j4) {
        View view = (View) this.f11967a.get();
        if (view != null) {
            view.animate().setStartDelay(j4);
        }
        return this;
    }

    public C1301k0 j(final InterfaceC1307n0 interfaceC1307n0) {
        final View view = (View) this.f11967a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1307n0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.j0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC1307n0.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f11967a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1301k0 l(float f4) {
        View view = (View) this.f11967a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
        return this;
    }
}
