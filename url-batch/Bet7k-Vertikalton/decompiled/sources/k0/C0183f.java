package k0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183f extends AbstractC0190m {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f2784A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final C0179b f2785B = new C0179b(PointF.class, "topLeft", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final C0179b f2786C = new C0179b(PointF.class, "bottomRight", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final C0179b f2787D = new C0179b(PointF.class, "bottomRight", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final C0179b f2788E = new C0179b(PointF.class, "topLeft", 3);
    public static final C0179b F = new C0179b(PointF.class, "position", 4);

    public static void I(C0198u c0198u) {
        View view = c0198u.f2836b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = c0198u.f2835a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", c0198u.f2836b.getParent());
    }

    @Override // k0.AbstractC0190m
    public final void d(C0198u c0198u) {
        I(c0198u);
    }

    @Override // k0.AbstractC0190m
    public final void g(C0198u c0198u) {
        I(c0198u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k0.AbstractC0190m
    public final Animator k(FrameLayout frameLayout, C0198u c0198u, C0198u c0198u2) {
        int i;
        ObjectAnimator a2;
        if (c0198u == null || c0198u2 == null) {
            return null;
        }
        HashMap hashMap = c0198u.f2835a;
        HashMap hashMap2 = c0198u2.f2835a;
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
        View view = c0198u2.f2836b;
        AbstractC0200w.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.f2824v.getClass();
                a2 = AbstractC0186i.a(view, F, H0.e.j(i2, i4, i3, i5));
            } else {
                C0182e c0182e = new C0182e(view);
                this.f2824v.getClass();
                ObjectAnimator a3 = AbstractC0186i.a(c0182e, f2785B, H0.e.j(i2, i4, i3, i5));
                this.f2824v.getClass();
                ObjectAnimator a4 = AbstractC0186i.a(c0182e, f2786C, H0.e.j(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a3, a4);
                animatorSet.addListener(new C0180c(c0182e));
                a2 = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.f2824v.getClass();
            a2 = AbstractC0186i.a(view, f2787D, H0.e.j(i6, i8, i7, i9));
        } else {
            this.f2824v.getClass();
            a2 = AbstractC0186i.a(view, f2788E, H0.e.j(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            i1.q.j(viewGroup3, true);
            o().a(new C0181d(viewGroup3));
        }
        return a2;
    }

    @Override // k0.AbstractC0190m
    public final String[] q() {
        return f2784A;
    }
}
