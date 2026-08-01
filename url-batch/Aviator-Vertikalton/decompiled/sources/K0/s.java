package K0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0257e0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f600e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f600e = uVar;
        this.f596a = i;
        this.f597b = textView;
        this.f598c = i2;
        this.f599d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0257e0 c0257e0;
        int i = this.f596a;
        u uVar = this.f600e;
        uVar.f615n = i;
        uVar.f613l = null;
        TextView textView = this.f597b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f598c == 1 && (c0257e0 = uVar.f619r) != null) {
                c0257e0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f599d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f599d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
