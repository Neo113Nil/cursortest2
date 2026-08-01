package g2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import k1.n;
import n0.u0;
import s2.k;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1895b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1894a = i;
        this.f1895b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1894a) {
            case 1:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) this.f1895b;
                focusRingDrawable.f1164p = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 2:
            case 4:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1895b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f315o = false;
                break;
            case 5:
                ((u0) this.f1895b).c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1894a) {
            case 0:
                i iVar = (i) this.f1895b;
                iVar.f1916r = 0;
                iVar.f1911m = null;
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                ((n) this.f1895b).m();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1895b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f315o = false;
                break;
            case 4:
                l1.e eVar = (l1.e) this.f1895b;
                ArrayList arrayList = new ArrayList(eVar.f2647j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((z1.a) arrayList.get(i)).f4128b.f4140t;
                    if (colorStateList != null) {
                        eVar.setTintList(colorStateList);
                    }
                }
                break;
            case 5:
                ((u0) this.f1895b).b();
                break;
            case 6:
                k kVar = (k) this.f1895b;
                kVar.p();
                kVar.f3265r.start();
                break;
            case 7:
                ((ExpandableTransformationBehavior) this.f1895b).f1273b = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1894a) {
            case 0:
                i iVar = (i) this.f1895b;
                iVar.f1917s.a(0, false);
                iVar.f1916r = 2;
                iVar.f1911m = animator;
                break;
            case 4:
                l1.e eVar = (l1.e) this.f1895b;
                ArrayList arrayList = new ArrayList(eVar.f2647j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    z1.c cVar = ((z1.a) arrayList.get(i)).f4128b;
                    ColorStateList colorStateList = cVar.f4140t;
                    if (colorStateList != null) {
                        eVar.setTint(colorStateList.getColorForState(cVar.f4144x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 5:
                ((u0) this.f1895b).g();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public e(u0 u0Var, View view) {
        this.f1894a = 5;
        this.f1895b = u0Var;
    }
}
