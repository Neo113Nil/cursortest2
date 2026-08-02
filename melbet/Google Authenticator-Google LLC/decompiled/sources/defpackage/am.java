package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class am extends ck {
    public final ak a;
    private AnimatorSet d;

    public am(ak akVar) {
        akVar.getClass();
        this.a = akVar;
    }

    @Override // defpackage.ck
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        ak akVar = this.a;
        if (animatorSet == null) {
            akVar.a.f(this);
            return;
        }
        cm cmVar = akVar.a;
        if (cmVar.d) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (by.U(2)) {
            boolean z = cmVar.d;
            Objects.toString(cmVar);
        }
    }

    @Override // defpackage.ck
    public final void b(ViewGroup viewGroup) {
        cm cmVar = this.a.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            cmVar.f(this);
            return;
        }
        animatorSet.start();
        if (by.U(2)) {
            Objects.toString(cmVar);
        }
    }

    @Override // defpackage.ck
    public final void c(ViewGroup viewGroup) {
        am amVar;
        ak akVar = this.a;
        if (akVar.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        brr a = akVar.a(context);
        this.d = (AnimatorSet) (a != null ? a.b : null);
        cm cmVar = akVar.a;
        boolean z = cmVar.h == 3;
        View view = cmVar.a.R;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            amVar = this;
            animatorSet.addListener(new al(viewGroup, view, z, cmVar, amVar));
        } else {
            amVar = this;
        }
        AnimatorSet animatorSet2 = amVar.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.ck
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ck
    public final void e(mx mxVar) {
        long totalDuration;
        cm cmVar = this.a.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            cmVar.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !cmVar.a.u) {
            return;
        }
        if (by.U(2)) {
            Objects.toString(cmVar);
        }
        totalDuration = animatorSet.getTotalDuration();
        long j = (long) (mxVar.b * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = (-1) + totalDuration;
        }
        if (by.U(2)) {
            Objects.toString(animatorSet);
            Objects.toString(cmVar);
        }
        animatorSet.setCurrentPlayTime(j);
    }
}
