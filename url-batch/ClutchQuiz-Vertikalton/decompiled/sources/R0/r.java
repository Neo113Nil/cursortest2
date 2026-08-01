package R0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0204b0;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f714c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f715e;

    public r(t tVar, int i, TextView textView, int i2, TextView textView2) {
        this.f715e = tVar;
        this.f712a = i;
        this.f713b = textView;
        this.f714c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0204b0 c0204b0;
        int i = this.f712a;
        t tVar = this.f715e;
        tVar.f729n = i;
        tVar.f727l = null;
        TextView textView = this.f713b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f714c == 1 && (c0204b0 = tVar.f733r) != null) {
                c0204b0.setText((CharSequence) null);
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
