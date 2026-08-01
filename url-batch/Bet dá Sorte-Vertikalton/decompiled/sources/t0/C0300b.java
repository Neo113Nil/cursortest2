package t0;

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

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3825a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3826b = new k();

    public static C0300b a(Context context, int i) {
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

    public static C0300b b(ArrayList arrayList) {
        C0300b c0300b = new C0300b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0300b.f3826b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0299a.f3823b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0299a.f3824c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0299a.d;
            }
            C0301c c0301c = new C0301c();
            c0301c.d = 0;
            c0301c.f3830e = 1;
            c0301c.f3827a = startDelay;
            c0301c.f3828b = duration;
            c0301c.f3829c = interpolator;
            c0301c.d = objectAnimator.getRepeatCount();
            c0301c.f3830e = objectAnimator.getRepeatMode();
            c0300b.f3825a.put(propertyName, c0301c);
        }
        return c0300b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0300b) {
            return this.f3825a.equals(((C0300b) obj).f3825a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3825a.hashCode();
    }

    public final String toString() {
        return "\n" + C0300b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3825a + "}\n";
    }
}
