package c5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends o {
    public static final String[] D = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b E = new b(PointF.class, "topLeft", 0);
    public static final b F = new b(PointF.class, "bottomRight", 1);
    public static final b G = new b(PointF.class, "bottomRight", 2);
    public static final b H = new b(PointF.class, "topLeft", 3);
    public static final b I = new b(PointF.class, "position", 4);

    public static void I(w wVar) {
        View view = wVar.f1735b;
        HashMap hashMap = wVar.f1734a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // c5.o
    public final void d(w wVar) {
        I(wVar);
    }

    @Override // c5.o
    public final void g(w wVar) {
        I(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c5.o
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        int i;
        f fVar;
        ObjectAnimator a8;
        if (wVar != null) {
            HashMap hashMap = wVar.f1734a;
            if (wVar2 != null) {
                HashMap hashMap2 = wVar2.f1734a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = wVar2.f1735b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i8 = rect.left;
                    int i9 = rect2.left;
                    int i10 = rect.top;
                    int i11 = rect2.top;
                    int i12 = rect.right;
                    int i13 = rect2.right;
                    int i14 = rect.bottom;
                    int i15 = rect2.bottom;
                    int i16 = i12 - i8;
                    int i17 = i14 - i10;
                    int i18 = i13 - i9;
                    int i19 = i15 - i11;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i16 == 0 || i17 == 0) && (i18 == 0 || i19 == 0)) {
                        i = 0;
                    } else {
                        i = (i8 == i9 && i10 == i11) ? 0 : 1;
                        if (i12 != i13 || i14 != i15) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i20 = i;
                    if (i20 > 0) {
                        z.a(view, i8, i10, i12, i14);
                        if (i20 != 2) {
                            fVar = this;
                            if (i8 == i9 && i10 == i11) {
                                fVar.f1723y.getClass();
                                a8 = i.a(view, G, w5.f.h(i12, i14, i13, i15));
                            } else {
                                fVar.f1723y.getClass();
                                a8 = i.a(view, H, w5.f.h(i8, i10, i9, i11));
                            }
                        } else if (i16 == i18 && i17 == i19) {
                            fVar = this;
                            fVar.f1723y.getClass();
                            a8 = i.a(view, I, w5.f.h(i8, i10, i9, i11));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.f1723y.getClass();
                            ObjectAnimator a9 = i.a(eVar, E, w5.f.h(i8, i10, i9, i11));
                            fVar.f1723y.getClass();
                            ObjectAnimator a10 = i.a(eVar, F, w5.f.h(i12, i14, i13, i15));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a9, a10);
                            animatorSet.addListener(new c(eVar));
                            a8 = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            s6.a.I(viewGroup4, true);
                            fVar.o().a(new d(viewGroup4));
                        }
                        return a8;
                    }
                }
            }
        }
        return null;
    }

    @Override // c5.o
    public final String[] q() {
        return D;
    }
}
