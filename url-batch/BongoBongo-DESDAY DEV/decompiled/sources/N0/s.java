package N0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import m.C0208d0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f703c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f704e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f704e = uVar;
        this.f701a = i;
        this.f702b = textView;
        this.f703c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0208d0 c0208d0;
        int i = this.f701a;
        u uVar = this.f704e;
        uVar.f719n = i;
        uVar.f717l = null;
        TextView textView = this.f702b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f703c == 1 && (c0208d0 = uVar.f723r) != null) {
                c0208d0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(RecyclerView.A0);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(RecyclerView.A0);
        }
    }
}
