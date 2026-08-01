package p0;

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

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3458a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3459b = new k();

    public static C0279b a(Context context, int i) {
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

    public static C0279b b(ArrayList arrayList) {
        C0279b c0279b = new C0279b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0279b.f3459b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0278a.f3456b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0278a.f3457c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0278a.d;
            }
            C0280c c0280c = new C0280c();
            c0280c.d = 0;
            c0280c.f3463e = 1;
            c0280c.f3460a = startDelay;
            c0280c.f3461b = duration;
            c0280c.f3462c = interpolator;
            c0280c.d = objectAnimator.getRepeatCount();
            c0280c.f3463e = objectAnimator.getRepeatMode();
            c0279b.f3458a.put(propertyName, c0280c);
        }
        return c0279b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0279b) {
            return this.f3458a.equals(((C0279b) obj).f3458a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3458a.hashCode();
    }

    public final String toString() {
        return "\n" + C0279b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3458a + "}\n";
    }
}
