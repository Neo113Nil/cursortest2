package j0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;

/* renamed from: j0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183f extends m {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f2910A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final C0179b f2911B = new C0179b(PointF.class, "topLeft", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final C0179b f2912C = new C0179b(PointF.class, "bottomRight", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final C0179b f2913D = new C0179b(PointF.class, "bottomRight", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final C0179b f2914E = new C0179b(PointF.class, "topLeft", 3);
    public static final C0179b F = new C0179b(PointF.class, "position", 4);

    public static void I(u uVar) {
        View view = uVar.f2965b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = uVar.f2964a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", uVar.f2965b.getParent());
    }

    @Override // j0.m
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // j0.m
    public final void g(u uVar) {
        I(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j0.m
    public final Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        int i;
        ObjectAnimator a2;
        if (uVar == null || uVar2 == null) {
            return null;
        }
        HashMap hashMap = uVar.f2964a;
        HashMap hashMap2 = uVar2.f2964a;
        ViewGroup viewGroup = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup2 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup == null || viewGroup2 == null) {
            return null;
        }
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
        if (i <= 0) {
            return null;
        }
        View view = uVar2.f2965b;
        w.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.f2953v.getClass();
                a2 = i.a(view, F, H0.e.e(i2, i4, i3, i5));
            } else {
                C0182e c0182e = new C0182e(view);
                this.f2953v.getClass();
                ObjectAnimator a3 = i.a(c0182e, f2911B, H0.e.e(i2, i4, i3, i5));
                this.f2953v.getClass();
                ObjectAnimator a4 = i.a(c0182e, f2912C, H0.e.e(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a3, a4);
                animatorSet.addListener(new C0180c(c0182e));
                a2 = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.f2953v.getClass();
            a2 = i.a(view, f2913D, H0.e.e(i6, i8, i7, i9));
        } else {
            this.f2953v.getClass();
            a2 = i.a(view, f2914E, H0.e.e(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            i1.m.o(viewGroup3, true);
            o().a(new C0181d(viewGroup3));
        }
        return a2;
    }

    @Override // j0.m
    public final String[] q() {
        return f2910A;
    }
}
