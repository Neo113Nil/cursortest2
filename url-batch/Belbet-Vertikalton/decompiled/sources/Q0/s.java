package Q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import n.C0267c0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f1069d;
    public final /* synthetic */ u e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.e = uVar;
        this.f1066a = i;
        this.f1067b = textView;
        this.f1068c = i2;
        this.f1069d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0267c0 c0267c0;
        int i = this.f1066a;
        u uVar = this.e;
        uVar.f1083n = i;
        uVar.f1081l = null;
        TextView textView = this.f1067b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1068c == 1 && (c0267c0 = uVar.f1087r) != null) {
                c0267c0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1069d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1069d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
