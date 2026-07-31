package w4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7893a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f7896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7898f;

    public d(z5.r rVar, int i, TextView textView, int i8, TextView textView2) {
        this.f7898f = rVar;
        this.f7894b = i;
        this.f7896d = textView;
        this.f7895c = i8;
        this.f7897e = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7893a) {
            case 0:
                int i = this.f7894b;
                View view = this.f7896d;
                if (i != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f7895c != 0) {
                    view.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l.j0 j0Var;
        switch (this.f7893a) {
            case 0:
                ((ViewPropertyAnimator) this.f7897e).setListener(null);
                g gVar = (g) this.f7898f;
                gVar.a(null);
                gVar.f7919p.remove((Object) null);
                gVar.f();
                break;
            default:
                TextView textView = (TextView) this.f7897e;
                z5.r rVar = (z5.r) this.f7898f;
                rVar.f9255n = this.f7894b;
                rVar.f9253l = null;
                TextView textView2 = (TextView) this.f7896d;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                    if (this.f7895c == 1 && (j0Var = rVar.f9259r) != null) {
                        j0Var.setText((CharSequence) null);
                    }
                }
                if (textView != null) {
                    textView.setTranslationY(0.0f);
                    textView.setAlpha(1.0f);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7893a) {
            case 0:
                ((g) this.f7898f).getClass();
                break;
            default:
                TextView textView = (TextView) this.f7897e;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setAlpha(0.0f);
                    break;
                }
                break;
        }
    }

    public d(g gVar, p0 p0Var, int i, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7898f = gVar;
        this.f7894b = i;
        this.f7896d = view;
        this.f7895c = i8;
        this.f7897e = viewPropertyAnimator;
    }
}
