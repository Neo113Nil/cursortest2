package U0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import l.C0223a0;

/* loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1194c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f1195e;

    public r(t tVar, int i, TextView textView, int i2, TextView textView2) {
        this.f1195e = tVar;
        this.f1192a = i;
        this.f1193b = textView;
        this.f1194c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0223a0 c0223a0;
        int i = this.f1192a;
        t tVar = this.f1195e;
        tVar.f1209n = i;
        tVar.f1207l = null;
        TextView textView = this.f1193b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1194c == 1 && (c0223a0 = tVar.f1213r) != null) {
                c0223a0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(RecyclerView.f1937A0);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(RecyclerView.f1937A0);
        }
    }
}
