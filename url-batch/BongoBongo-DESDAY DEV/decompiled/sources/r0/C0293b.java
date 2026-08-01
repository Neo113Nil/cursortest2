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
import p.k;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3569a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3570b = new k();

    public static C0293b a(Context context, int i) {
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

    public static C0293b b(ArrayList arrayList) {
        C0293b c0293b = new C0293b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0293b.f3570b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0292a.f3567b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0292a.f3568c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0292a.d;
            }
            C0294c c0294c = new C0294c();
            c0294c.d = 0;
            c0294c.f3574e = 1;
            c0294c.f3571a = startDelay;
            c0294c.f3572b = duration;
            c0294c.f3573c = interpolator;
            c0294c.d = objectAnimator.getRepeatCount();
            c0294c.f3574e = objectAnimator.getRepeatMode();
            c0293b.f3569a.put(propertyName, c0294c);
        }
        return c0293b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0293b) {
            return this.f3569a.equals(((C0293b) obj).f3569a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3569a.hashCode();
    }

    public final String toString() {
        return "\n" + C0293b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3569a + "}\n";
    }
}
