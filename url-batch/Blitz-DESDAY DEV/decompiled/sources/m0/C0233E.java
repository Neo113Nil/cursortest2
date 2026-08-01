package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.winfour.neondrop.R;

/* renamed from: m0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233E extends AnimatorListenerAdapter implements k {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3126a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3127b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3128c;
    public boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3129e;

    public C0233E(h hVar, FrameLayout frameLayout, View view, View view2) {
        this.f3129e = hVar;
        this.f3126a = frameLayout;
        this.f3127b = view;
        this.f3128c = view2;
    }

    @Override // m0.k
    public final void a() {
    }

    @Override // m0.k
    public final void c(m mVar) {
        mVar.x(this);
    }

    @Override // m0.k
    public final void d() {
    }

    @Override // m0.k
    public final void e(m mVar) {
    }

    @Override // m0.k
    public final void f(m mVar) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.f3128c.setTag(R.id.save_overlay_view, null);
        this.f3126a.getOverlay().remove(this.f3127b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3126a.getOverlay().remove(this.f3127b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3127b;
        if (view.getParent() == null) {
            this.f3126a.getOverlay().add(view);
        } else {
            this.f3129e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f3128c;
            View view2 = this.f3127b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3126a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        g();
    }
}
