package D0;

import O.f0;
import O.j0;
import O.n0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f622c;

    public /* synthetic */ j(Object obj, View view, int i) {
        this.f620a = i;
        this.f621b = obj;
        this.f622c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f620a) {
            case 1:
                ((f0) this.f621b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f620a) {
            case 0:
                ((s.b) this.f621b).remove(animator);
                ((o) this.f622c).f646G.remove(animator);
                break;
            case 1:
                ((f0) this.f621b).c();
                break;
            default:
                ((n0) this.f621b).f2300a.d(1.0f);
                j0.e((View) this.f622c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f620a) {
            case 0:
                ((o) this.f622c).f646G.add(animator);
                break;
            case 1:
                ((f0) this.f621b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(o oVar, s.b bVar) {
        this.f620a = 0;
        this.f622c = oVar;
        this.f621b = bVar;
    }
}
