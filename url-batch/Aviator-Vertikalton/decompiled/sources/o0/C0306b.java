package o0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import o.k;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3716a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3717b = new k();

    public static C0306b a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e2);
            return null;
        }
    }

    public static C0306b b(ArrayList arrayList) {
        C0306b c0306b = new C0306b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0306b.f3717b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0305a.f3713b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0305a.f3714c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0305a.f3715d;
            }
            C0307c c0307c = new C0307c();
            c0307c.f3721d = 0;
            c0307c.f3722e = 1;
            c0307c.f3718a = startDelay;
            c0307c.f3719b = duration;
            c0307c.f3720c = interpolator;
            c0307c.f3721d = objectAnimator.getRepeatCount();
            c0307c.f3722e = objectAnimator.getRepeatMode();
            c0306b.f3716a.put(propertyName, c0307c);
        }
        return c0306b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0306b) {
            return this.f3716a.equals(((C0306b) obj).f3716a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3716a.hashCode();
    }

    public final String toString() {
        return "\n" + C0306b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3716a + "}\n";
    }
}
