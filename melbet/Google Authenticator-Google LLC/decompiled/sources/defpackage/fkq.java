package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkq extends AnimatorListenerAdapter {
    final /* synthetic */ DrawerLayout a;
    final /* synthetic */ View b;

    public fkq(DrawerLayout drawerLayout, View view) {
        this.a = drawerLayout;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        DrawerLayout drawerLayout = this.a;
        drawerLayout.i(this.b, false);
        drawerLayout.n(-1728053248);
    }
}
