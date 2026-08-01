package y0;

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

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396b {

    /* renamed from: a, reason: collision with root package name */
    public final k f4573a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f4574b = new k();

    public static C0396b a(Context context, int i) {
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

    public static C0396b b(ArrayList arrayList) {
        C0396b c0396b = new C0396b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0396b.f4574b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0395a.f4571b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0395a.f4572c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0395a.d;
            }
            C0397c c0397c = new C0397c();
            c0397c.d = 0;
            c0397c.f4578e = 1;
            c0397c.f4575a = startDelay;
            c0397c.f4576b = duration;
            c0397c.f4577c = interpolator;
            c0397c.d = objectAnimator.getRepeatCount();
            c0397c.f4578e = objectAnimator.getRepeatMode();
            c0396b.f4573a.put(propertyName, c0397c);
        }
        return c0396b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0396b) {
            return this.f4573a.equals(((C0396b) obj).f4573a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4573a.hashCode();
    }

    public final String toString() {
        return "\n" + C0396b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4573a + "}\n";
    }
}
