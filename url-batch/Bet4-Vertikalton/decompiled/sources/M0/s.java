package M0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import l.C0201c0;

/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f628c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f629e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.f629e = uVar;
        this.f626a = i;
        this.f627b = textView;
        this.f628c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0201c0 c0201c0;
        int i = this.f626a;
        u uVar = this.f629e;
        uVar.f643n = i;
        uVar.f641l = null;
        TextView textView = this.f627b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f628c == 1 && (c0201c0 = uVar.f647r) != null) {
                c0201c0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(RecyclerView.f1530C0);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(RecyclerView.f1530C0);
        }
    }
}
