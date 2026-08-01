package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class eb extends kj0 {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final ab G = new ab(PointF.class, "topLeft", 0);
    public static final ab H = new ab(PointF.class, "bottomRight", 1);
    public static final ab I = new ab(PointF.class, "bottomRight", 2);
    public static final ab J = new ab(PointF.class, "topLeft", 3);
    public static final ab K = new ab(PointF.class, "position", 4);

    public static void I(sj0 sj0Var) {
        View view = sj0Var.b;
        HashMap hashMap = sj0Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.kj0
    public final void d(sj0 sj0Var) {
        I(sj0Var);
    }

    @Override // defpackage.kj0
    public final void g(sj0 sj0Var) {
        I(sj0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kj0
    public final Animator k(ViewGroup viewGroup, sj0 sj0Var, sj0 sj0Var2) {
        int i;
        eb ebVar;
        ObjectAnimator a;
        if (sj0Var == null) {
            return null;
        }
        HashMap hashMap = sj0Var.a;
        if (sj0Var2 == null) {
            return null;
        }
        HashMap hashMap2 = sj0Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = sj0Var2.b;
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
        cn0.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            ebVar = this;
            if (i2 == i3 && i4 == i5) {
                ebVar.A.getClass();
                a = h40.a(view, I, xy.f(i6, i8, i7, i9));
            } else {
                ebVar.A.getClass();
                a = h40.a(view, J, xy.f(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            ebVar = this;
            ebVar.A.getClass();
            a = h40.a(view, K, xy.f(i2, i4, i3, i5));
        } else {
            ebVar = this;
            db dbVar = new db(view);
            ebVar.A.getClass();
            ObjectAnimator a2 = h40.a(dbVar, G, xy.f(i2, i4, i3, i5));
            ebVar.A.getClass();
            ObjectAnimator a3 = h40.a(dbVar, H, xy.f(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a2, a3);
            animatorSet.addListener(new bb(dbVar));
            a = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            zb0.m(viewGroup4, true);
            ebVar.o().a(new cb(viewGroup4));
        }
        return a;
    }

    @Override // defpackage.kj0
    public final String[] q() {
        return F;
    }
}
