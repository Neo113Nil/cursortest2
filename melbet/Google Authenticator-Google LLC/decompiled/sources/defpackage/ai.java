package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ai implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ cm a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ aj d;

    public ai(cm cmVar, ViewGroup viewGroup, View view, aj ajVar) {
        this.a = cmVar;
        this.b = viewGroup;
        this.c = view;
        this.d = ajVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new ajx(viewGroup, this.c, this.d, 1));
        if (by.U(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (by.U(2)) {
            Objects.toString(this.a);
        }
    }
}
