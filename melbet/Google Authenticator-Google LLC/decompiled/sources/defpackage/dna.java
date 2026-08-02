package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dna extends AnimatorListenerAdapter {
    final /* synthetic */ dne a;

    public dna(dne dneVar) {
        this.a = dneVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dne dneVar = this.a;
        dneVar.b.setVisibility(8);
        kee keeVar = dneVar.n;
        if (keeVar != null) {
            keeVar.j();
        }
        dni dniVar = dneVar.j;
        if (dniVar != null) {
            dniVar.a();
            dneVar.j = null;
        }
        ImageView imageView = dneVar.c;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
    }
}
