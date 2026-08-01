package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import l.C0204c0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f645c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f646e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f646e = uVar;
        this.f643a = i;
        this.f644b = textView;
        this.f645c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0204c0 c0204c0;
        int i = this.f643a;
        u uVar = this.f646e;
        uVar.f660n = i;
        uVar.f658l = null;
        TextView textView = this.f644b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f645c == 1 && (c0204c0 = uVar.f664r) != null) {
                c0204c0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(RecyclerView.f1559A0);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(RecyclerView.f1559A0);
        }
    }
}
