package j1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f extends o {
    public static final String[] G = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b H = new b(PointF.class, "topLeft", 0);
    public static final b I = new b(PointF.class, "bottomRight", 1);
    public static final b J = new b(PointF.class, "bottomRight", 2);
    public static final b K = new b(PointF.class, "topLeft", 3);
    public static final b L = new b(PointF.class, "position", 4);

    public static void J(w wVar) {
        View view = wVar.f1968b;
        HashMap hashMap = wVar.f1967a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // j1.o
    public final void d(w wVar) {
        J(wVar);
    }

    @Override // j1.o
    public final void g(w wVar) {
        J(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j1.o
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        int i;
        f fVar;
        ObjectAnimator a2;
        if (wVar != null) {
            HashMap hashMap = wVar.f1967a;
            if (wVar2 != null) {
                HashMap hashMap2 = wVar2.f1967a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = wVar2.f1968b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i4 = rect.left;
                    int i5 = rect2.left;
                    int i6 = rect.top;
                    int i7 = rect2.top;
                    int i8 = rect.right;
                    int i9 = rect2.right;
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    int i12 = i8 - i4;
                    int i13 = i10 - i6;
                    int i14 = i9 - i5;
                    int i15 = i11 - i7;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                        i = 0;
                    } else {
                        i = (i4 == i5 && i6 == i7) ? 0 : 1;
                        if (i8 != i9 || i10 != i11) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i16 = i;
                    if (i16 > 0) {
                        y.a(view, i4, i6, i8, i10);
                        if (i16 != 2) {
                            fVar = this;
                            if (i4 == i5 && i6 == i7) {
                                fVar.B.getClass();
                                a2 = i.a(view, J, l2.f.g(i8, i10, i9, i11));
                            } else {
                                fVar.B.getClass();
                                a2 = i.a(view, K, l2.f.g(i4, i6, i5, i7));
                            }
                        } else if (i12 == i14 && i13 == i15) {
                            fVar = this;
                            fVar.B.getClass();
                            a2 = i.a(view, L, l2.f.g(i4, i6, i5, i7));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.B.getClass();
                            ObjectAnimator a4 = i.a(eVar, H, l2.f.g(i4, i6, i5, i7));
                            fVar.B.getClass();
                            ObjectAnimator a5 = i.a(eVar, I, l2.f.g(i8, i10, i9, i11));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a4, a5);
                            animatorSet.addListener(new c(eVar));
                            a2 = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            h.a.p0(viewGroup4, true);
                            fVar.p().a(new d(viewGroup4));
                        }
                        return a2;
                    }
                }
            }
        }
        return null;
    }

    @Override // j1.o
    public final String[] r() {
        return G;
    }
}
