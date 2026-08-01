package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ka extends z90 {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final t7 G = new t7(PointF.class, "topLeft", 1);
    public static final t7 H = new t7(PointF.class, "bottomRight", 2);
    public static final t7 I = new t7(PointF.class, "bottomRight", 3);
    public static final t7 J = new t7(PointF.class, "topLeft", 4);
    public static final t7 K = new t7(PointF.class, "position", 5);

    public static void I(ha0 ha0Var) {
        View view = ha0Var.b;
        HashMap hashMap = ha0Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.z90
    public final void d(ha0 ha0Var) {
        I(ha0Var);
    }

    @Override // defpackage.z90
    public final void g(ha0 ha0Var) {
        I(ha0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z90
    public final Animator k(ViewGroup viewGroup, ha0 ha0Var, ha0 ha0Var2) {
        int i;
        ka kaVar;
        ObjectAnimator a;
        if (ha0Var == null) {
            return null;
        }
        HashMap hashMap = ha0Var.a;
        if (ha0Var2 == null) {
            return null;
        }
        HashMap hashMap2 = ha0Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = ha0Var2.b;
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        dd0.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            kaVar = this;
            if (i2 == i3 && i4 == i5) {
                kaVar.A.getClass();
                a = ty.a(view, I, ky.f(i6, i8, i7, i9));
            } else {
                kaVar.A.getClass();
                a = ty.a(view, J, ky.f(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            kaVar = this;
            kaVar.A.getClass();
            a = ty.a(view, K, ky.f(i2, i4, i3, i5));
        } else {
            kaVar = this;
            ja jaVar = new ja(view);
            kaVar.A.getClass();
            ObjectAnimator a2 = ty.a(jaVar, G, ky.f(i2, i4, i3, i5));
            kaVar.A.getClass();
            ObjectAnimator a3 = ty.a(jaVar, H, ky.f(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.addListener(new ha(jaVar));
            a = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            xf.L(viewGroup4, true);
            kaVar.o().a(new ia(viewGroup4));
        }
        return a;
    }

    @Override // defpackage.z90
    public final String[] q() {
        return F;
    }
}
