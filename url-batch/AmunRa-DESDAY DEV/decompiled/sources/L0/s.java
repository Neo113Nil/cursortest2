package L0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0210d0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f553c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f554e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f554e = uVar;
        this.f551a = i;
        this.f552b = textView;
        this.f553c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0210d0 c0210d0;
        int i = this.f551a;
        u uVar = this.f554e;
        uVar.f568n = i;
        uVar.f566l = null;
        TextView textView = this.f552b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f553c == 1 && (c0210d0 = uVar.f572r) != null) {
                c0210d0.setText((CharSequence) null);
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
