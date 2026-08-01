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
public final class C0282b {

    /* renamed from: a, reason: collision with root package name */
    public final k f3383a = new k();

    /* renamed from: b, reason: collision with root package name */
    public final k f3384b = new k();

    public static C0282b a(Context context, int i) {
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

    public static C0282b b(ArrayList arrayList) {
        C0282b c0282b = new C0282b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0282b.f3384b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0281a.f3381b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0281a.f3382c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0281a.d;
            }
            C0283c c0283c = new C0283c();
            c0283c.d = 0;
            c0283c.f3388e = 1;
            c0283c.f3385a = startDelay;
            c0283c.f3386b = duration;
            c0283c.f3387c = interpolator;
            c0283c.d = objectAnimator.getRepeatCount();
            c0283c.f3388e = objectAnimator.getRepeatMode();
            c0282b.f3383a.put(propertyName, c0283c);
        }
        return c0282b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0282b) {
            return this.f3383a.equals(((C0282b) obj).f3383a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3383a.hashCode();
    }

    public final String toString() {
        return "\n" + C0282b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3383a + "}\n";
    }
}
