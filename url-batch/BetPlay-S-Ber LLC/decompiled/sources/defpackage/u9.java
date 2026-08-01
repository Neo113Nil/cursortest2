package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class u9 extends y60 {
    public static final String[] G = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final q9 H = new q9(PointF.class, "topLeft", 0);
    public static final q9 I = new q9(PointF.class, "bottomRight", 1);
    public static final q9 J = new q9(PointF.class, "bottomRight", 2);
    public static final q9 K = new q9(PointF.class, "topLeft", 3);
    public static final q9 L = new q9(PointF.class, "position", 4);

    public static void K(h70 h70Var) {
        View view = h70Var.b;
        HashMap hashMap = h70Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.y60
    public final void e(h70 h70Var) {
        K(h70Var);
    }

    @Override // defpackage.y60
    public final void h(h70 h70Var) {
        K(h70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y60
    public final Animator l(ViewGroup viewGroup, h70 h70Var, h70 h70Var2) {
        int i;
        u9 u9Var;
        ObjectAnimator a;
        if (h70Var == null) {
            return null;
        }
        HashMap hashMap = h70Var.a;
        if (h70Var2 == null) {
            return null;
        }
        HashMap hashMap2 = h70Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = h70Var2.b;
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
        ba0.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            u9Var = this;
            if (i2 == i3 && i4 == i5) {
                u9Var.B.getClass();
                a = xv.a(view, J, ix.g(i6, i8, i7, i9));
            } else {
                u9Var.B.getClass();
                a = xv.a(view, K, ix.g(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            u9Var = this;
            u9Var.B.getClass();
            a = xv.a(view, L, ix.g(i2, i4, i3, i5));
        } else {
            u9Var = this;
            t9 t9Var = new t9(view);
            u9Var.B.getClass();
            ObjectAnimator a2 = xv.a(t9Var, H, ix.g(i2, i4, i3, i5));
            u9Var.B.getClass();
            ObjectAnimator a3 = xv.a(t9Var, I, ix.g(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.addListener(new r9(t9Var));
            a = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            op.S(viewGroup4, true);
            u9Var.p().a(new s9(viewGroup4));
        }
        return a;
    }

    @Override // defpackage.y60
    public final String[] r() {
        return G;
    }
}
