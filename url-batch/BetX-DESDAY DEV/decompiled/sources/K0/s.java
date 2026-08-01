package K0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0257d0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f601e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f601e = uVar;
        this.f597a = i;
        this.f598b = textView;
        this.f599c = i2;
        this.f600d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0257d0 c0257d0;
        int i = this.f597a;
        u uVar = this.f601e;
        uVar.f616n = i;
        uVar.f614l = null;
        TextView textView = this.f598b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f599c == 1 && (c0257d0 = uVar.f620r) != null) {
                c0257d0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f600d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f600d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
