package m0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h0.d0;
import java.util.HashMap;
import m.V0;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262e extends l {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f3255A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final V0 f3256B = new V0(PointF.class, "topLeft", 1);

    /* renamed from: C, reason: collision with root package name */
    public static final V0 f3257C = new V0(PointF.class, "bottomRight", 2);

    /* renamed from: D, reason: collision with root package name */
    public static final V0 f3258D = new V0(PointF.class, "bottomRight", 3);

    /* renamed from: E, reason: collision with root package name */
    public static final V0 f3259E = new V0(PointF.class, "topLeft", 4);

    /* renamed from: F, reason: collision with root package name */
    public static final V0 f3260F = new V0(PointF.class, "position", 5);

    public static void I(t tVar) {
        View view = tVar.f3309b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = tVar.f3308a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", tVar.f3309b.getParent());
    }

    @Override // m0.l
    public final void d(t tVar) {
        I(tVar);
    }

    @Override // m0.l
    public final void g(t tVar) {
        I(tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m0.l
    public final Animator k(FrameLayout frameLayout, t tVar, t tVar2) {
        int i;
        ObjectAnimator a2;
        if (tVar == null || tVar2 == null) {
            return null;
        }
        HashMap hashMap = tVar.f3308a;
        HashMap hashMap2 = tVar2.f3308a;
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
        View view = tVar2.f3309b;
        v.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.f3297v.getClass();
                a2 = h.a(view, f3260F, K0.e.h(i2, i4, i3, i5));
            } else {
                C0261d c0261d = new C0261d(view);
                this.f3297v.getClass();
                ObjectAnimator a3 = h.a(c0261d, f3256B, K0.e.h(i2, i4, i3, i5));
                this.f3297v.getClass();
                ObjectAnimator a4 = h.a(c0261d, f3257C, K0.e.h(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a3, a4);
                animatorSet.addListener(new C0259b(c0261d));
                a2 = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.f3297v.getClass();
            a2 = h.a(view, f3258D, K0.e.h(i6, i8, i7, i9));
        } else {
            this.f3297v.getClass();
            a2 = h.a(view, f3259E, K0.e.h(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            d0.q(viewGroup3, true);
            o().a(new C0260c(viewGroup3));
        }
        return a2;
    }

    @Override // m0.l
    public final String[] q() {
        return f3255A;
    }
}
