package j2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import k.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2359b;
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f2360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f2361e;

    public t(u uVar, int i4, TextView textView, int i5, TextView textView2) {
        this.f2361e = uVar;
        this.f2358a = i4;
        this.f2359b = textView;
        this.c = i5;
        this.f2360d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z0 z0Var;
        int i4 = this.f2358a;
        u uVar = this.f2361e;
        uVar.f2372n = i4;
        uVar.f2370l = null;
        TextView textView = this.f2359b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (z0Var = uVar.f2376r) != null) {
                z0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f2360d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f2360d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
