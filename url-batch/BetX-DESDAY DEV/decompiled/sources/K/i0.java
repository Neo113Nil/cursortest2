package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class i0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f454a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f456c;

    public i0(o0 o0Var, View view) {
        this.f455b = o0Var;
        this.f456c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f454a) {
            case 0:
                ((o0) this.f455b).f483a.d(1.0f);
                k0.e((View) this.f456c);
                break;
            default:
                ((o.b) this.f455b).remove(animator);
                ((j0.m) this.f456c).f2945n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f454a) {
            case 1:
                ((j0.m) this.f456c).f2945n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i0(j0.m mVar, o.b bVar) {
        this.f456c = mVar;
        this.f455b = bVar;
    }
}
