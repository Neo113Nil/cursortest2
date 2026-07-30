package androidx.swiperefreshlayout.widget;

import android.animation.Animator;

/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f4029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4030b;

    public c(e eVar, d dVar) {
        this.f4030b = eVar;
        this.f4029a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f4030b;
        d dVar = this.f4029a;
        eVar.a(1.0f, dVar, true);
        dVar.f4040k = dVar.f4035e;
        dVar.f4041l = dVar.f4036f;
        dVar.f4042m = dVar.f4037g;
        dVar.a((dVar.j + 1) % dVar.f4039i.length);
        if (!eVar.f4059n) {
            eVar.f4058m += 1.0f;
            return;
        }
        eVar.f4059n = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f4043n) {
            dVar.f4043n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4030b.f4058m = 0.0f;
    }
}
