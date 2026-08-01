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
public final class C0308b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3720a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3721b = new k();

    public static C0308b a(Context context, int i) {
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

    public static C0308b b(ArrayList arrayList) {
        C0308b c0308b = new C0308b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0308b.f3721b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0307a.f3717b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0307a.f3718c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0307a.f3719d;
            }
            C0309c c0309c = new C0309c();
            c0309c.f3725d = 0;
            c0309c.f3726e = 1;
            c0309c.f3722a = startDelay;
            c0309c.f3723b = duration;
            c0309c.f3724c = interpolator;
            c0309c.f3725d = objectAnimator.getRepeatCount();
            c0309c.f3726e = objectAnimator.getRepeatMode();
            c0308b.f3720a.put(propertyName, c0309c);
        }
        return c0308b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0308b) {
            return this.f3720a.equals(((C0308b) obj).f3720a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3720a.hashCode();
    }

    public final String toString() {
        return "\n" + C0308b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3720a + "}\n";
    }
}
