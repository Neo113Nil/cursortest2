package r0;

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
import q.k;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3423a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3424b = new k();

    public static C0261b a(Context context, int i) {
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

    public static C0261b b(ArrayList arrayList) {
        C0261b c0261b = new C0261b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0261b.f3424b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0260a.f3421b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0260a.f3422c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0260a.d;
            }
            C0262c c0262c = new C0262c();
            c0262c.d = 0;
            c0262c.f3428e = 1;
            c0262c.f3425a = startDelay;
            c0262c.f3426b = duration;
            c0262c.f3427c = interpolator;
            c0262c.d = objectAnimator.getRepeatCount();
            c0262c.f3428e = objectAnimator.getRepeatMode();
            c0261b.f3423a.put(propertyName, c0262c);
        }
        return c0261b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0261b) {
            return this.f3423a.equals(((C0261b) obj).f3423a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3423a.hashCode();
    }

    public final String toString() {
        return "\n" + C0261b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3423a + "}\n";
    }
}
