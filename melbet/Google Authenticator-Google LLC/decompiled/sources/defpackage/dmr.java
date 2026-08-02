package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmr extends AnimatorListenerAdapter {
    final /* synthetic */ dms a;
    final /* synthetic */ int b;
    final /* synthetic */ fhg c;
    final /* synthetic */ View d;
    final /* synthetic */ bry e;

    public dmr(bry bryVar, dms dmsVar, int i, fhg fhgVar, View view) {
        this.a = dmsVar;
        this.b = i;
        this.c = fhgVar;
        this.d = view;
        this.e = bryVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dms dmsVar = this.a;
        dmsVar.a = 1;
        dmsVar.b = this.b;
        dmsVar.c = null;
        dmsVar.d = null;
        dmsVar.e = null;
        Object obj = this.e.a;
        ((FloatingActionButton) obj).setAlpha(1.0f);
        ((fkc) obj).k(0, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dms dmsVar = this.a;
        dmsVar.a = 1;
        dmsVar.b = this.b;
        dmsVar.c = animator;
        dmsVar.d = (View) this.c;
        dmsVar.e = this.d;
    }
}
