package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class w0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public w0(yc0 yc0Var, View view) {
        this.a = 9;
        this.b = yc0Var;
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
            case 4:
                ((u7) obj).d();
                break;
            case 5:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.p = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 9:
                ((yc0) obj).b();
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
                c3 c3Var = (c3) obj;
                ArrayList arrayList = new ArrayList(c3Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((tv) arrayList.get(i2)).b.t;
                    if (colorStateList != null) {
                        c3Var.setTintList(colorStateList);
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
                si siVar = (si) obj;
                siVar.p();
                siVar.r.start();
                break;
            case 4:
                ((u7) obj).e();
                break;
            case 5:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                yu yuVar = (yu) obj;
                yuVar.b.setTranslationY(0.0f);
                yuVar.b(0.0f);
                break;
            case 7:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 8:
                ((z90) obj).m();
                animator.removeListener(this);
                break;
            case 9:
                ((yc0) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                c3 c3Var = (c3) obj;
                ArrayList arrayList = new ArrayList(c3Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    vv vvVar = ((tv) arrayList.get(i2)).b;
                    ColorStateList colorStateList = vvVar.t;
                    if (colorStateList != null) {
                        c3Var.setTint(colorStateList.getColorForState(vvVar.x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 4:
                ((u7) obj).f(animator);
                break;
            case 9:
                ((yc0) obj).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ w0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
