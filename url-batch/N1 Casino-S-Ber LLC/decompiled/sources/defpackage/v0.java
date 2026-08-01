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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class v0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public v0(n90 n90Var, View view) {
        this.a = 10;
        this.b = n90Var;
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
                ((n90) obj).b();
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
                s2 s2Var = (s2) obj;
                ArrayList arrayList = new ArrayList(s2Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((ss) arrayList.get(i2)).b.t;
                    if (colorStateList != null) {
                        s2Var.setTintList(colorStateList);
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
                rg rgVar = (rg) obj;
                rgVar.p();
                rgVar.r.start();
                break;
            case 4:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case 5:
                jj jjVar = (jj) obj;
                jjVar.r = 0;
                jjVar.m = null;
                break;
            case 6:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                xr xrVar = (xr) obj;
                xrVar.b.setTranslationY(0.0f);
                xrVar.b(0.0f);
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
                ((s60) obj).m();
                animator.removeListener(this);
                break;
            case 10:
                ((n90) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                s2 s2Var = (s2) obj;
                ArrayList arrayList = new ArrayList(s2Var.j);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    us usVar = ((ss) arrayList.get(i2)).b;
                    ColorStateList colorStateList = usVar.t;
                    if (colorStateList != null) {
                        s2Var.setTint(colorStateList.getColorForState(usVar.x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 5:
                jj jjVar = (jj) obj;
                jjVar.s.a(0, false);
                jjVar.r = 2;
                jjVar.m = animator;
                break;
            case 10:
                ((n90) obj).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ v0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
