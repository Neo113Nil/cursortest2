package p0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import n.U0;

/* renamed from: p0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329e extends m {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f3819A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final U0 f3820B = new U0(PointF.class, "topLeft", 1);

    /* renamed from: C, reason: collision with root package name */
    public static final U0 f3821C = new U0(PointF.class, "bottomRight", 2);

    /* renamed from: D, reason: collision with root package name */
    public static final U0 f3822D = new U0(PointF.class, "bottomRight", 3);

    /* renamed from: E, reason: collision with root package name */
    public static final U0 f3823E = new U0(PointF.class, "topLeft", 4);

    /* renamed from: F, reason: collision with root package name */
    public static final U0 f3824F = new U0(PointF.class, "position", 5);

    public static void I(u uVar) {
        View view = uVar.f3872b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = uVar.f3871a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", uVar.f3872b.getParent());
    }

    @Override // p0.m
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // p0.m
    public final void g(u uVar) {
        I(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p0.m
    public final Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        int i;
        ObjectAnimator a2;
        if (uVar == null || uVar2 == null) {
            return null;
        }
        HashMap hashMap = uVar.f3871a;
        HashMap hashMap2 = uVar2.f3871a;
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
        View view = uVar2.f3872b;
        w.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.f3860v.getClass();
                a2 = h.a(view, f3824F, i.a(i2, i4, i3, i5));
            } else {
                C0328d c0328d = new C0328d(view);
                this.f3860v.getClass();
                ObjectAnimator a3 = h.a(c0328d, f3820B, i.a(i2, i4, i3, i5));
                this.f3860v.getClass();
                ObjectAnimator a4 = h.a(c0328d, f3821C, i.a(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a3, a4);
                animatorSet.addListener(new C0326b(c0328d));
                a2 = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.f3860v.getClass();
            a2 = h.a(view, f3822D, i.a(i6, i8, i7, i9));
        } else {
            this.f3860v.getClass();
            a2 = h.a(view, f3823E, i.a(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            H1.d.h0(viewGroup3, true);
            o().a(new C0327c(viewGroup3));
        }
        return a2;
    }

    @Override // p0.m
    public final String[] q() {
        return f3819A;
    }
}
