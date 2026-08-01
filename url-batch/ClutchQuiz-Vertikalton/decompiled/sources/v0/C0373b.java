package v0;

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

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3984a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3985b = new k();

    public static C0373b a(Context context, int i) {
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

    public static C0373b b(ArrayList arrayList) {
        C0373b c0373b = new C0373b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0373b.f3985b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0372a.f3982b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0372a.f3983c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0372a.d;
            }
            C0374c c0374c = new C0374c();
            c0374c.d = 0;
            c0374c.f3989e = 1;
            c0374c.f3986a = startDelay;
            c0374c.f3987b = duration;
            c0374c.f3988c = interpolator;
            c0374c.d = objectAnimator.getRepeatCount();
            c0374c.f3989e = objectAnimator.getRepeatMode();
            c0373b.f3984a.put(propertyName, c0374c);
        }
        return c0373b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0373b) {
            return this.f3984a.equals(((C0373b) obj).f3984a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3984a.hashCode();
    }

    public final String toString() {
        return "\n" + C0373b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3984a + "}\n";
    }
}
