package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class i0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f453a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f455c;

    public i0(o0 o0Var, View view) {
        this.f454b = o0Var;
        this.f455c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f453a) {
            case 0:
                ((o0) this.f454b).f482a.d(1.0f);
                k0.e((View) this.f455c);
                break;
            default:
                ((o.b) this.f454b).remove(animator);
                ((j0.m) this.f455c).f2941n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f453a) {
            case 1:
                ((j0.m) this.f455c).f2941n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i0(j0.m mVar, o.b bVar) {
        this.f455c = mVar;
        this.f454b = bVar;
    }
}
