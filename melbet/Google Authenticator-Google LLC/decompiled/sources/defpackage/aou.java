package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aou extends ape {
    private static final String[] v = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property w = new aom(PointF.class);
    private static final Property x = new aon(PointF.class);
    private static final Property y = new aoo(PointF.class);
    private static final Property z = new aop(PointF.class);
    private static final Property A = new aoq(PointF.class);

    private static final void e(apm apmVar) {
        View view = apmVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map map = apmVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", apmVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[RETURN] */
    @Override // defpackage.ape
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator a(ViewGroup viewGroup, apm apmVar, apm apmVar2) {
        int i;
        int i2;
        ObjectAnimator ofObject;
        if (apmVar == null || apmVar2 == null) {
            return null;
        }
        Map map = apmVar.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        Map map2 = apmVar2.a;
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = apmVar2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if (i11 != 0) {
            if (i12 == 0) {
                i12 = 0;
            }
            i = (i3 == i4 || i5 != i6) ? 1 : 0;
            if (i7 == i8 || i9 != i10) {
                i++;
            }
            if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i++;
            }
            i2 = i;
            if (i2 <= 0) {
                return null;
            }
            apq.b(view, i3, i5, i7, i9);
            if (i2 == 2) {
                float f = i6;
                float f2 = i4;
                float f3 = i5;
                float f4 = i3;
                if (i11 == i13 && i12 == i14) {
                    ofObject = ObjectAnimator.ofObject(view, (Property<View, V>) A, (TypeConverter) null, yl.f(f4, f3, f2, f));
                } else {
                    float f5 = i8;
                    aot aotVar = new aot(view);
                    ObjectAnimator ofObject2 = ObjectAnimator.ofObject(aotVar, (Property<aot, V>) w, (TypeConverter) null, yl.f(f4, f3, f2, f));
                    ObjectAnimator ofObject3 = ObjectAnimator.ofObject(aotVar, (Property<aot, V>) x, (TypeConverter) null, yl.f(i7, i9, f5, i10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofObject2, ofObject3);
                    animatorSet.addListener(new aor(aotVar));
                    ofObject = animatorSet;
                }
            } else if (i3 == i4 && i5 == i6) {
                ofObject = ObjectAnimator.ofObject(view, (Property<View, V>) y, (TypeConverter) null, yl.f(i7, i9, i8, i10));
            } else {
                ofObject = ObjectAnimator.ofObject(view, (Property<View, V>) z, (TypeConverter) null, yl.f(i3, i5, i4, i6));
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                apn.a(viewGroup4, true);
                i().x(new aos(viewGroup4));
            }
            return ofObject;
        }
        if (i13 != 0) {
            if (i14 == 0) {
                i14 = 0;
                i = 0;
            }
            if (i3 == i4) {
            }
            if (i7 == i8) {
            }
            i++;
        } else {
            i = 0;
        }
        if (rect3 != null) {
            i++;
            i2 = i;
            if (i2 <= 0) {
            }
        }
        i++;
        i2 = i;
        if (i2 <= 0) {
        }
    }

    @Override // defpackage.ape
    public final void b(apm apmVar) {
        e(apmVar);
    }

    @Override // defpackage.ape
    public final void c(apm apmVar) {
        e(apmVar);
    }

    @Override // defpackage.ape
    public final String[] d() {
        return v;
    }
}
