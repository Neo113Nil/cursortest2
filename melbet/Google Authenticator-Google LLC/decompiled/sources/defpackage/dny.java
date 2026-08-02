package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dny extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ ColorStateList b;
    final /* synthetic */ ColorStateList c;
    final /* synthetic */ dnz d;

    public dny(dnz dnzVar, boolean z, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.a = z;
        this.b = colorStateList;
        this.c = colorStateList2;
        this.d = dnzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ColorStateList colorStateList = this.a ? this.b : this.c;
        dnz dnzVar = this.d;
        dnzVar.f = colorStateList;
        dnzVar.invalidateSelf();
    }
}
