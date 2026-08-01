package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class z0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public z0(xm0 xm0Var, View view) {
        this.a = 10;
        this.b = xm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.o = false;
                break;
            case 6:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.p = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 10:
                ((xm0) obj).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.o = false;
                break;
            case 1:
                k3 k3Var = (k3) obj;
                ArrayList arrayList = new ArrayList(k3Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((w00) arrayList.get(i2)).b.t;
                    if (colorStateList != null) {
                        k3Var.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.M(5);
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.Y.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                dl dlVar = (dl) obj;
                dlVar.p();
                dlVar.r.start();
                break;
            case 4:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case 5:
                so soVar = (so) obj;
                soVar.r = 0;
                soVar.m = null;
                break;
            case 6:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                d00 d00Var = (d00) obj;
                d00Var.b.setTranslationY(0.0f);
                d00Var.b(0.0f);
                break;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 9:
                ((kj0) obj).m();
                animator.removeListener(this);
                break;
            case 10:
                ((xm0) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                k3 k3Var = (k3) obj;
                ArrayList arrayList = new ArrayList(k3Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    y00 y00Var = ((w00) arrayList.get(i2)).b;
                    ColorStateList colorStateList = y00Var.t;
                    if (colorStateList != null) {
                        k3Var.setTint(colorStateList.getColorForState(y00Var.x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 5:
                so soVar = (so) obj;
                soVar.s.a(0, false);
                soVar.r = 2;
                soVar.m = animator;
                break;
            case 10:
                ((xm0) obj).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ z0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
