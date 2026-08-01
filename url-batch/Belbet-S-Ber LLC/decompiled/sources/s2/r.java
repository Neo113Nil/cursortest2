package s2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.z0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3297c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f3298e;

    public r(s sVar, int i, TextView textView, int i4, TextView textView2) {
        this.f3298e = sVar;
        this.f3295a = i;
        this.f3296b = textView;
        this.f3297c = i4;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z0 z0Var;
        int i = this.f3295a;
        s sVar = this.f3298e;
        sVar.f3309n = i;
        sVar.f3307l = null;
        TextView textView = this.f3296b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f3297c == 1 && (z0Var = sVar.f3313r) != null) {
                z0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
