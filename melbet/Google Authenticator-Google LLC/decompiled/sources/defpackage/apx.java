package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class apx extends AnimatorListenerAdapter implements apb {
    final /* synthetic */ apz a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public apx(apz apzVar, ViewGroup viewGroup, View view, View view2) {
        this.a = apzVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.apb
    public final void a(ape apeVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.apb
    public final void b(ape apeVar) {
        throw null;
    }

    @Override // defpackage.apb
    public final /* synthetic */ void e(ape apeVar) {
        apeVar.y(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.c;
        if (view.getParent() == null) {
            yq.g(this.b, view);
            return;
        }
        ape apeVar = this.a;
        ArrayList arrayList = apeVar.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(apeVar.l);
        apeVar.l = ape.a;
        while (true) {
            size--;
            if (size < 0) {
                apeVar.l = animatorArr;
                apeVar.q(apeVar, apd.c, false);
                return;
            } else {
                Animator animator2 = animatorArr[size];
                animatorArr[size] = null;
                animator2.cancel();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.d;
            View view2 = this.c;
            view.setTag(R.id.save_overlay_view, view2);
            yq.g(this.b, view2);
            this.e = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // defpackage.apb
    public final void c() {
    }

    @Override // defpackage.apb
    public final void d() {
    }

    @Override // defpackage.apb
    public final void f() {
    }

    @Override // defpackage.apb
    public final /* synthetic */ void g() {
    }
}
