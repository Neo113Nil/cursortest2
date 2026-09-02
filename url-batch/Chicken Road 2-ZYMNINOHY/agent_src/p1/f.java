package p1;

import E.H;
import a0.C0144j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.HashMap;
import k.C1211e0;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: A, reason: collision with root package name */
    public static final C1211e0 f14750A;
    public static final String[] v = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: w, reason: collision with root package name */
    public static final C1211e0 f14751w;

    /* renamed from: x, reason: collision with root package name */
    public static final C1211e0 f14752x;

    /* renamed from: y, reason: collision with root package name */
    public static final C1211e0 f14753y;
    public static final C1211e0 z;

    static {
        new C1345b(PointF.class, "boundsOrigin").f14740a = new Rect();
        f14751w = new C1211e0(PointF.class, "topLeft", 1);
        f14752x = new C1211e0(PointF.class, "bottomRight", 2);
        f14753y = new C1211e0(PointF.class, "bottomRight", 3);
        z = new C1211e0(PointF.class, "topLeft", 4);
        f14750A = new C1211e0(PointF.class, "position", 5);
    }

    public static void H(x xVar) {
        View view = xVar.f14805b;
        HashMap hashMap = xVar.f14804a;
        Field field = H.f375a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", xVar.f14805b.getParent());
    }

    @Override // p1.q
    public final void e(x xVar) {
        H(xVar);
    }

    @Override // p1.q
    public final void h(x xVar) {
        H(xVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p1.q
    public final Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        int i4;
        f fVar;
        ObjectAnimator ofObject;
        if (xVar != null) {
            HashMap hashMap = xVar.f14804a;
            if (xVar2 != null) {
                HashMap hashMap2 = xVar2.f14804a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = xVar2.f14805b;
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
                                fVar.f14790r.getClass();
                                ofObject = ObjectAnimator.ofObject(view, f14753y, (TypeConverter) null, C0144j.j(i9, i11, i10, i12));
                            } else {
                                fVar.f14790r.getClass();
                                ofObject = ObjectAnimator.ofObject(view, z, (TypeConverter) null, C0144j.j(i5, i7, i6, i8));
                            }
                        } else if (i13 == i15 && i14 == i16) {
                            fVar = this;
                            fVar.f14790r.getClass();
                            ofObject = ObjectAnimator.ofObject(view, f14750A, (TypeConverter) null, C0144j.j(i5, i7, i6, i8));
                        } else {
                            fVar = this;
                            C1348e c1348e = new C1348e();
                            c1348e.f14747e = view;
                            fVar.f14790r.getClass();
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(c1348e, f14751w, (TypeConverter) null, C0144j.j(i5, i7, i6, i8));
                            fVar.f14790r.getClass();
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(c1348e, f14752x, (TypeConverter) null, C0144j.j(i9, i11, i10, i12));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new C1346c(c1348e));
                            ofObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            O3.l.v(viewGroup4, true);
                            fVar.a(new C1347d(viewGroup4));
                        }
                        return ofObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // p1.q
    public final String[] q() {
        return v;
    }
}
