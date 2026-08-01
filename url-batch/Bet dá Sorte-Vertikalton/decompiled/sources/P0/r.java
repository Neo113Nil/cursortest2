package P0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0202b0;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f652c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f653e;

    public r(t tVar, int i, TextView textView, int i2, TextView textView2) {
        this.f653e = tVar;
        this.f650a = i;
        this.f651b = textView;
        this.f652c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0202b0 c0202b0;
        int i = this.f650a;
        t tVar = this.f653e;
        tVar.f667n = i;
        tVar.f665l = null;
        TextView textView = this.f651b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f652c == 1 && (c0202b0 = tVar.f671r) != null) {
                c0202b0.setText((CharSequence) null);
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
