package O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0182d0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f715c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f716e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f716e = uVar;
        this.f713a = i;
        this.f714b = textView;
        this.f715c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0182d0 c0182d0;
        int i = this.f713a;
        u uVar = this.f716e;
        uVar.f730n = i;
        uVar.f728l = null;
        TextView textView = this.f714b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f715c == 1 && (c0182d0 = uVar.f734r) != null) {
                c0182d0.setText((CharSequence) null);
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
