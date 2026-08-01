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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class x0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public x0(v90 v90Var, View view) {
        this.a = 9;
        this.b = v90Var;
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
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.p = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 9:
                ((v90) obj).b();
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
                    ColorStateList colorStateList = ((gt) arrayList.get(i2)).b.t;
                    if (colorStateList != null) {
                        k3Var.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                jg jgVar = (jg) obj;
                jgVar.p();
                jgVar.r.start();
                break;
            case 3:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case 4:
                dj djVar = (dj) obj;
                djVar.r = 0;
                djVar.m = null;
                break;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                ls lsVar = (ls) obj;
                lsVar.b.setTranslationY(0.0f);
                lsVar.b(0.0f);
                break;
            case 7:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.setStateInternal(5);
                WeakReference weakReference = sideSheetBehavior.p;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                ((y60) obj).n();
                animator.removeListener(this);
                break;
            case 9:
                ((v90) obj).a();
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
                    jt jtVar = ((gt) arrayList.get(i2)).b;
                    ColorStateList colorStateList = jtVar.t;
                    if (colorStateList != null) {
                        k3Var.setTint(colorStateList.getColorForState(jtVar.x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 4:
                dj djVar = (dj) obj;
                djVar.s.a(0, false);
                djVar.r = 2;
                djVar.m = animator;
                break;
            case 9:
                ((v90) obj).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ x0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
