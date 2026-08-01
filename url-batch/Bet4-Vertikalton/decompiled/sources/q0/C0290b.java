package q0;

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

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3501a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3502b = new k();

    public static C0290b a(Context context, int i) {
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

    public static C0290b b(ArrayList arrayList) {
        C0290b c0290b = new C0290b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0290b.f3502b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0289a.f3499b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0289a.f3500c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0289a.d;
            }
            C0291c c0291c = new C0291c();
            c0291c.d = 0;
            c0291c.f3506e = 1;
            c0291c.f3503a = startDelay;
            c0291c.f3504b = duration;
            c0291c.f3505c = interpolator;
            c0291c.d = objectAnimator.getRepeatCount();
            c0291c.f3506e = objectAnimator.getRepeatMode();
            c0290b.f3501a.put(propertyName, c0291c);
        }
        return c0290b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0290b) {
            return this.f3501a.equals(((C0290b) obj).f3501a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3501a.hashCode();
    }

    public final String toString() {
        return "\n" + C0290b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3501a + "}\n";
    }
}
