package L;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import n0.C0269f;
import y0.C0318a;

/* renamed from: L.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f509b;

    public /* synthetic */ C0003b0(int i, Object obj) {
        this.f508a = i;
        this.f509b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f508a) {
            case 0:
                ((d0) this.f509b).b();
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f509b;
                actionBarOverlayLayout.f1384w = null;
                actionBarOverlayLayout.f1371j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f508a) {
            case 0:
                ((d0) this.f509b).a();
                break;
            case 1:
                N0.l lVar = (N0.l) this.f509b;
                lVar.q();
                lVar.f670r.start();
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f509b;
                actionBarOverlayLayout.f1384w = null;
                actionBarOverlayLayout.f1371j = false;
                break;
            case 3:
                ((m0.l) this.f509b).m();
                animator.removeListener(this);
                break;
            case 4:
                C0269f c0269f = (C0269f) this.f509b;
                ArrayList arrayList = new ArrayList(c0269f.f3328e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0318a) arrayList.get(i)).f4317b.f4332o;
                    if (colorStateList != null) {
                        E.a.h(c0269f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f509b).f1753h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f508a) {
            case 0:
                ((d0) this.f509b).c();
                break;
            case 4:
                C0269f c0269f = (C0269f) this.f509b;
                ArrayList arrayList = new ArrayList(c0269f.f3328e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    y0.c cVar = ((C0318a) arrayList.get(i)).f4317b;
                    ColorStateList colorStateList = cVar.f4332o;
                    if (colorStateList != null) {
                        E.a.g(c0269f, colorStateList.getColorForState(cVar.f4336s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0003b0(d0 d0Var, View view) {
        this.f508a = 0;
        this.f509b = d0Var;
    }
}
