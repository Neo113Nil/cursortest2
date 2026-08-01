package I0;

import M.X;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p0.m;
import q0.C0337f;

/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f595b;

    public /* synthetic */ i(int i, Object obj) {
        this.f594a = i;
        this.f595b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f594a) {
            case 1:
                ((X) this.f595b).d();
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f595b;
                actionBarOverlayLayout.f1749w = null;
                actionBarOverlayLayout.j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f594a) {
            case 0:
                j jVar = (j) this.f595b;
                jVar.f581b.setTranslationY(0.0f);
                jVar.b(0.0f);
                break;
            case 1:
                ((X) this.f595b).a();
                break;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f595b;
                sideSheetBehavior.w(5);
                WeakReference weakReference = sideSheetBehavior.f2464p;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.f2464p.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                Q0.l lVar = (Q0.l) this.f595b;
                lVar.q();
                lVar.f1034r.start();
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f595b;
                actionBarOverlayLayout.f1749w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 5:
                ((m) this.f595b).m();
                animator.removeListener(this);
                break;
            case 6:
                C0337f c0337f = (C0337f) this.f595b;
                ArrayList arrayList = new ArrayList(c0337f.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((B0.a) arrayList.get(i)).f43b.f57o;
                    if (colorStateList != null) {
                        F.a.h(c0337f, colorStateList);
                    }
                }
                break;
            case 7:
                ((HideBottomViewOnScrollBehavior) this.f595b).f2250h = null;
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f595b;
                bottomSheetBehavior.I(5);
                WeakReference weakReference2 = bottomSheetBehavior.f2276U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) bottomSheetBehavior.f2276U.get()).requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f594a) {
            case 1:
                ((X) this.f595b).g();
                break;
            case 6:
                C0337f c0337f = (C0337f) this.f595b;
                ArrayList arrayList = new ArrayList(c0337f.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    B0.d dVar = ((B0.a) arrayList.get(i)).f43b;
                    ColorStateList colorStateList = dVar.f57o;
                    if (colorStateList != null) {
                        F.a.g(c0337f, colorStateList.getColorForState(dVar.f61s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i(X x2, View view) {
        this.f594a = 1;
        this.f595b = x2;
    }
}
