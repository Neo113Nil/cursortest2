package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqe extends AnimatorListenerAdapter {
    final /* synthetic */ aqh a;

    public aqe(aqh aqhVar) {
        this.a = aqhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aqh aqhVar = this.a;
        ArrayList arrayList = new ArrayList(aqhVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aqc) arrayList.get(i)).b(aqhVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        aqh aqhVar = this.a;
        ArrayList arrayList = new ArrayList(aqhVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aqc) arrayList.get(i)).c(aqhVar);
        }
    }
}
