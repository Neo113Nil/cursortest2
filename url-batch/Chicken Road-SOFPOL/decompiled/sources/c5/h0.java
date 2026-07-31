package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1674a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1675b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1676c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1677d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f1678e;

    public h0(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f1678e = hVar;
        this.f1674a = viewGroup;
        this.f1675b = view;
        this.f1676c = view2;
    }

    @Override // c5.m
    public final void d(o oVar) {
        oVar.x(this);
    }

    @Override // c5.m
    public final void f(o oVar) {
        if (this.f1677d) {
            g();
        }
    }

    public final void g() {
        this.f1676c.setTag(R.id.save_overlay_view, null);
        this.f1674a.getOverlay().remove(this.f1675b);
        this.f1677d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f1674a.getOverlay().remove(this.f1675b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f1675b;
        if (view.getParent() == null) {
            this.f1674a.getOverlay().add(view);
        } else {
            this.f1678e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            View view = this.f1676c;
            View view2 = this.f1675b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f1674a.getOverlay().add(view2);
            this.f1677d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        g();
    }

    @Override // c5.m
    public final void b() {
    }

    @Override // c5.m
    public final void c() {
    }

    @Override // c5.m
    public final void e(o oVar) {
    }
}
