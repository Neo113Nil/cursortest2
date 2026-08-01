package L;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class g0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f522a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f524c;

    public g0(m0 m0Var, View view) {
        this.f523b = m0Var;
        this.f524c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f522a) {
            case 0:
                ((m0) this.f523b).f548a.d(1.0f);
                i0.e((View) this.f524c);
                break;
            default:
                ((p.b) this.f523b).remove(animator);
                ((m0.l) this.f524c).f3289n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f522a) {
            case 1:
                ((m0.l) this.f524c).f3289n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public g0(m0.l lVar, p.b bVar) {
        this.f524c = lVar;
        this.f523b = bVar;
    }
}
