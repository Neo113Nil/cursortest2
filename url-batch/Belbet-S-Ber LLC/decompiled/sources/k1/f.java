package k1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends n {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b G = new b(PointF.class, "topLeft", 0);
    public static final b H = new b(PointF.class, "bottomRight", 1);
    public static final b I = new b(PointF.class, "bottomRight", 2);
    public static final b J = new b(PointF.class, "topLeft", 3);
    public static final b K = new b(PointF.class, "position", 4);

    public static void I(v vVar) {
        View view = vVar.f2377b;
        HashMap hashMap = vVar.f2376a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // k1.n
    public final void d(v vVar) {
        I(vVar);
    }

    @Override // k1.n
    public final void g(v vVar) {
        I(vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k1.n
    public final Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        int i;
        f fVar;
        ObjectAnimator a5;
        if (vVar != null) {
            HashMap hashMap = vVar.f2376a;
            if (vVar2 != null) {
                HashMap hashMap2 = vVar2.f2376a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = vVar2.f2377b;
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
                        x.a(view, i4, i6, i8, i10);
                        if (i16 != 2) {
                            fVar = this;
                            if (i4 == i5 && i6 == i7) {
                                fVar.A.getClass();
                                a5 = i.a(view, I, o2.f.h(i8, i10, i9, i11));
                            } else {
                                fVar.A.getClass();
                                a5 = i.a(view, J, o2.f.h(i4, i6, i5, i7));
                            }
                        } else if (i12 == i14 && i13 == i15) {
                            fVar = this;
                            fVar.A.getClass();
                            a5 = i.a(view, K, o2.f.h(i4, i6, i5, i7));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.A.getClass();
                            ObjectAnimator a6 = i.a(eVar, G, o2.f.h(i4, i6, i5, i7));
                            fVar.A.getClass();
                            ObjectAnimator a7 = i.a(eVar, H, o2.f.h(i8, i10, i9, i11));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a6, a7);
                            animatorSet.addListener(new c(eVar));
                            a5 = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            b4.l.h0(viewGroup4, true);
                            fVar.o().a(new d(viewGroup4));
                        }
                        return a5;
                    }
                }
            }
        }
        return null;
    }

    @Override // k1.n
    public final String[] q() {
        return F;
    }
}
