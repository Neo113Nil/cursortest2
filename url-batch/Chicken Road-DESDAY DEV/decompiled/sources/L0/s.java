package L0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.C0213d0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f565c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f566e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f566e = uVar;
        this.f563a = i;
        this.f564b = textView;
        this.f565c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0213d0 c0213d0;
        int i = this.f563a;
        u uVar = this.f566e;
        uVar.f580n = i;
        uVar.f578l = null;
        TextView textView = this.f564b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f565c == 1 && (c0213d0 = uVar.f584r) != null) {
                c0213d0.setText((CharSequence) null);
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
