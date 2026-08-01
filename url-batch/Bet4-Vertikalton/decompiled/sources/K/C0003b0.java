package K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import m0.C0266f;
import x0.C0314a;

/* renamed from: K.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f442b;

    public /* synthetic */ C0003b0(int i, Object obj) {
        this.f441a = i;
        this.f442b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f441a) {
            case 0:
                ((d0) this.f442b).b();
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f442b;
                actionBarOverlayLayout.f1299w = null;
                actionBarOverlayLayout.f1286j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f441a) {
            case 0:
                ((d0) this.f442b).a();
                break;
            case 1:
                M0.l lVar = (M0.l) this.f442b;
                lVar.q();
                lVar.f596r.start();
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f442b;
                actionBarOverlayLayout.f1299w = null;
                actionBarOverlayLayout.f1286j = false;
                break;
            case 3:
                ((l0.m) this.f442b).m();
                animator.removeListener(this);
                break;
            case 4:
                C0266f c0266f = (C0266f) this.f442b;
                ArrayList arrayList = new ArrayList(c0266f.f3137e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0314a) arrayList.get(i)).f4210b.f4224o;
                    if (colorStateList != null) {
                        D.a.h(c0266f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f442b).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f441a) {
            case 0:
                ((d0) this.f442b).c();
                break;
            case 4:
                C0266f c0266f = (C0266f) this.f442b;
                ArrayList arrayList = new ArrayList(c0266f.f3137e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    x0.c cVar = ((C0314a) arrayList.get(i)).f4210b;
                    ColorStateList colorStateList = cVar.f4224o;
                    if (colorStateList != null) {
                        D.a.g(c0266f, colorStateList.getColorForState(cVar.f4228s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0003b0(d0 d0Var, View view) {
        this.f441a = 0;
        this.f442b = d0Var;
    }
}
