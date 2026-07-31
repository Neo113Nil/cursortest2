package w4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7889c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f7890d;

    public /* synthetic */ c(g gVar, Object obj, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f7887a = i;
        this.f7890d = gVar;
        this.f7889c = viewPropertyAnimator;
        this.f7888b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7887a) {
            case 1:
                this.f7888b.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7887a) {
            case 0:
                this.f7889c.setListener(null);
                this.f7888b.setAlpha(1.0f);
                g gVar = this.f7890d;
                gVar.a(null);
                gVar.f7920q.remove((Object) null);
                gVar.f();
                break;
            case 1:
                this.f7889c.setListener(null);
                g gVar2 = this.f7890d;
                gVar2.a(null);
                gVar2.f7918o.remove((Object) null);
                gVar2.f();
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7889c.setListener(null);
                View view = this.f7888b;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                g gVar3 = this.f7890d;
                gVar3.a(null);
                gVar3.f7921r.remove((Object) null);
                gVar3.f();
                break;
            default:
                this.f7889c.setListener(null);
                View view2 = this.f7888b;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                g gVar4 = this.f7890d;
                gVar4.a(null);
                gVar4.f7921r.remove((Object) null);
                gVar4.f();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7887a) {
            case 0:
                this.f7890d.getClass();
                break;
            case 1:
                this.f7890d.getClass();
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7890d.getClass();
                break;
            default:
                this.f7890d.getClass();
                break;
        }
    }

    public c(g gVar, p0 p0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7887a = 1;
        this.f7890d = gVar;
        this.f7888b = view;
        this.f7889c = viewPropertyAnimator;
    }
}
