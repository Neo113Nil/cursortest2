package o2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.c1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2936c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f2937e;

    public q(s sVar, int i, TextView textView, int i4, TextView textView2) {
        this.f2937e = sVar;
        this.f2934a = i;
        this.f2935b = textView;
        this.f2936c = i4;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c1 c1Var;
        int i = this.f2934a;
        s sVar = this.f2937e;
        sVar.f2950n = i;
        sVar.f2948l = null;
        TextView textView = this.f2935b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f2936c == 1 && (c1Var = sVar.f2954r) != null) {
                c1Var.setText((CharSequence) null);
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
