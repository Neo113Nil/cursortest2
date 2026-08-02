package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class apw extends AnimatorListenerAdapter implements apb {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public apw(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() {
        if (!this.a) {
            apq.d(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        ViewGroup viewGroup;
        if (!this.e || this.f == z || (viewGroup = this.d) == null) {
            return;
        }
        this.f = z;
        apn.a(viewGroup, z);
    }

    @Override // defpackage.apb
    public final void b(ape apeVar) {
        throw null;
    }

    @Override // defpackage.apb
    public final void c() {
        i(false);
        if (this.a) {
            return;
        }
        apq.d(this.b, this.c);
    }

    @Override // defpackage.apb
    public final void d() {
        i(true);
        if (this.a) {
            return;
        }
        apq.d(this.b, 0);
    }

    @Override // defpackage.apb
    public final /* synthetic */ void e(ape apeVar) {
        apeVar.y(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            apq.d(this.b, 0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // defpackage.apb
    public final void f() {
    }

    @Override // defpackage.apb
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.apb
    public final void a(ape apeVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
