package u0;

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

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390b {

    /* renamed from: a, reason: collision with root package name */
    public final k f4373a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f4374b = new k();

    public static C0390b a(Context context, int i) {
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
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static C0390b b(ArrayList arrayList) {
        C0390b c0390b = new C0390b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0390b.f4374b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0389a.f4370b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0389a.f4371c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0389a.f4372d;
            }
            C0391c c0391c = new C0391c();
            c0391c.f4378d = 0;
            c0391c.e = 1;
            c0391c.f4375a = startDelay;
            c0391c.f4376b = duration;
            c0391c.f4377c = interpolator;
            c0391c.f4378d = objectAnimator.getRepeatCount();
            c0391c.e = objectAnimator.getRepeatMode();
            c0390b.f4373a.put(propertyName, c0391c);
        }
        return c0390b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0390b) {
            return this.f4373a.equals(((C0390b) obj).f4373a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4373a.hashCode();
    }

    public final String toString() {
        return "\n" + C0390b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4373a + "}\n";
    }
}
