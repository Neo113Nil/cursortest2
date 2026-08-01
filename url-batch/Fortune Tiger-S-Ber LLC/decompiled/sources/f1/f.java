package f1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends o {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b G = new b(PointF.class, "topLeft", 0);
    public static final b H = new b(PointF.class, "bottomRight", 1);
    public static final b I = new b(PointF.class, "bottomRight", 2);
    public static final b J = new b(PointF.class, "topLeft", 3);
    public static final b K = new b(PointF.class, "position", 4);

    public static void I(w wVar) {
        View view = wVar.f1725b;
        HashMap hashMap = wVar.f1724a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // f1.o
    public final void d(w wVar) {
        I(wVar);
    }

    @Override // f1.o
    public final void g(w wVar) {
        I(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f1.o
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        int i4;
        f fVar;
        ObjectAnimator a4;
        if (wVar != null) {
            HashMap hashMap = wVar.f1724a;
            if (wVar2 != null) {
                HashMap hashMap2 = wVar2.f1724a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = wVar2.f1725b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i5 = rect.left;
                    int i6 = rect2.left;
                    int i7 = rect.top;
                    int i8 = rect2.top;
                    int i9 = rect.right;
                    int i10 = rect2.right;
                    int i11 = rect.bottom;
                    int i12 = rect2.bottom;
                    int i13 = i9 - i5;
                    int i14 = i11 - i7;
                    int i15 = i10 - i6;
                    int i16 = i12 - i8;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
                        i4 = 0;
                    } else {
                        i4 = (i5 == i6 && i7 == i8) ? 0 : 1;
                        if (i9 != i10 || i11 != i12) {
                            i4++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i4++;
                    }
                    int i17 = i4;
                    if (i17 > 0) {
                        y.a(view, i5, i7, i9, i11);
                        if (i17 != 2) {
                            fVar = this;
                            if (i5 == i6 && i7 == i8) {
                                fVar.A.getClass();
                                a4 = i.a(view, I, g2.f.l(i9, i11, i10, i12));
                            } else {
                                fVar.A.getClass();
                                a4 = i.a(view, J, g2.f.l(i5, i7, i6, i8));
                            }
                        } else if (i13 == i15 && i14 == i16) {
                            fVar = this;
                            fVar.A.getClass();
                            a4 = i.a(view, K, g2.f.l(i5, i7, i6, i8));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.A.getClass();
                            ObjectAnimator a5 = i.a(eVar, G, g2.f.l(i5, i7, i6, i8));
                            fVar.A.getClass();
                            ObjectAnimator a6 = i.a(eVar, H, g2.f.l(i9, i11, i10, i12));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a5, a6);
                            animatorSet.addListener(new c(eVar));
                            a4 = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            k3.d.g0(viewGroup4, true);
                            fVar.o().a(new d(viewGroup4));
                        }
                        return a4;
                    }
                }
            }
        }
        return null;
    }

    @Override // f1.o
    public final String[] q() {
        return F;
    }
}
