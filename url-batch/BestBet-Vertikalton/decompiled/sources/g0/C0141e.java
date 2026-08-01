package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f2818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2820c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0145i f2822f;

    public C0141e(C0145i c0145i, Y y2, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2822f = c0145i;
        this.f2818a = y2;
        this.f2819b = i;
        this.f2820c = view;
        this.d = i2;
        this.f2821e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f2819b;
        View view = this.f2820c;
        if (i != 0) {
            view.setTranslationX(RecyclerView.f1937A0);
        }
        if (this.d != 0) {
            view.setTranslationY(RecyclerView.f1937A0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2821e.setListener(null);
        C0145i c0145i = this.f2822f;
        Y y2 = this.f2818a;
        c0145i.c(y2);
        c0145i.f2863p.remove(y2);
        c0145i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2822f.getClass();
    }
}
